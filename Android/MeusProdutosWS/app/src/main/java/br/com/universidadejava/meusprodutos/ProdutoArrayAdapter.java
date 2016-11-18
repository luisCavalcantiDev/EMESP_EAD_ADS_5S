package br.com.universidadejava.meusprodutos;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProdutoArrayAdapter extends ArrayAdapter<Produto> {

    private Context context;
    private List<Produto> produtos;

    public ProdutoArrayAdapter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
        this.context = context;
        this.produtos = objects;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View linha = inflater.inflate(R.layout.produto, parent, false);
        TextView nome = (TextView) linha.findViewById(R.id.nome);
        TextView preco = (TextView) linha.findViewById(R.id.preco);
        ImageView imagem = (ImageView) linha.findViewById(R.id.imagem);

        EditText qtd = (EditText) linha.findViewById(R.id.quantidade);
        qtd.addTextChangedListener(new TextWatcher() {
            Produto p = produtos.get(position);

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    p.setQuantidade(Integer.valueOf(s.toString()));
                } catch (NumberFormatException nfe) {
                    p.setQuantidade(0);
                }
                atualizar(((TextView) parent.getRootView().findViewById(R.id.valorTotal)), produtos);
            }
        });

        Produto p = produtos.get(position);
        nome.setText(p.getNome());
        preco.setText("R$: " + p.getPreco());
        byte[] byteArray =  Base64.decode(p.getImagem(), Base64.DEFAULT) ;
        imagem.setImageBitmap(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));

        return linha;
    }

    public void atualizar(TextView valorTotal, List<Produto> produtos) {
        double total = 0;

        for(Produto p : produtos) {
            total += p.getPrecoTotal();
        }

        valorTotal.setText("R$" + total);
    }
}
