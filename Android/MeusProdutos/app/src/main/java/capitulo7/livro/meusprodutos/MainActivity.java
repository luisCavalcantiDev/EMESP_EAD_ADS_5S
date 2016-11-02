package capitulo7.livro.meusprodutos;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ProdutoService service = new ProdutoService();
    private ProdutoArrayAdapter adapter;

    private void carregarDados() {
        new CarregarMeusProdutosTask().execute();
        ((TextView) findViewById(R.id.valorTotal)).setText("R$0.0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregarDados();
    }

    @Override
    protected void onResume() {
        super.onResume();

        carregarDados();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menuNovoProduto) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void novoProduto(MenuItem item) {
        startActivity(new Intent(this, ProdutoActivity.class));
    }


    private class CarregarMeusProdutosTask extends AsyncTask<String, Void, List<Produto>> {
        private ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            dialog = new ProgressDialog(MainActivity.this);
            dialog.show();
        }

        @Override
        protected void onPostExecute(List<Produto> produtos) {
            if (produtos != null) {
                adapter = new ProdutoArrayAdapter(getBaseContext(), 0, produtos);
                ((ListView) findViewById(R.id.produtos)).setAdapter(adapter);
            }
            dialog.dismiss();
        }

        @Override
        protected List<Produto> doInBackground(String... params) {
            return service.getAll();
        }
    }
}

