package br.com.universidadejava.meusprodutos;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

/**
 * Created by rafaelsakurai on 18/09/15.
 */
public class ProdutoActivity extends AppCompatActivity {

    private ProdutoService service = new ProdutoService();
    private Bitmap bmp;
    private String nome;
    private double preco;
    private String imagemURI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }

    public void salvar(View view) {
        nome = ((EditText) findViewById(R.id.nome)).getText().toString();
        preco = Double.valueOf(((EditText) findViewById(R.id.preco)).getText().toString());

        new EnviarMeusProdutosTask().execute();
    }

    private String converterImagem() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        return Base64.encodeToString(stream.toByteArray(), Base64.NO_WRAP);
    }

    public void obterImagem(View view) {
        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            imagemURI = data.getDataString();

            Uri uri = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
            Cursor cursor = getContentResolver().query(uri,filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView imageView = (ImageView) findViewById(R.id.imagem);
            imageView.setImageURI(uri);

            bmp = BitmapFactory.decodeFile(picturePath);
        }
    }

    private class EnviarMeusProdutosTask extends AsyncTask<String, Void, Void> {
        private ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            dialog = new ProgressDialog(ProdutoActivity.this);
            dialog.show();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            ((EditText) findViewById(R.id.nome)).setText("");
            ((ImageView) findViewById(R.id.imagem)).setImageURI(null);
            ((EditText) findViewById(R.id.preco)).setText("");
            imagemURI = "";
            dialog.dismiss();
        }

        @Override
        protected Void doInBackground(String... params) {
            service.post(new Produto(nome, converterImagem(), preco));
            return null;
        }
    }
}
