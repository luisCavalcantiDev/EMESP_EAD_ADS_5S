package valet.capitulo5.livro.valet;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> carros = new ArrayList();
    private ArrayAdapter<String> adapter;
    private DateFormat df = null;
    private DateFormat hf = null;

    private AlertDialog dialog;
    private String carroSaida = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        df = android.text.format.DateFormat.getDateFormat(getApplicationContext());
        hf = android.text.format.DateFormat.getTimeFormat(getApplicationContext());
        ListView lista = (ListView) findViewById(R.id.lista);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carros);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                carroSaida = carros.get(position);
                dialog = confirmarSaida();
                dialog.show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (Activity.RESULT_OK == resultCode) {
            String modelo = data.getStringExtra("modelo");
            String placa = data.getStringExtra("placa");
            Date agora = new Date();
            carros.add(modelo + " - " + placa + "\nEntrada: " + df.format(agora) + "" + hf.format(agora));
            adapter.notifyDataSetChanged();
        }
    }

    public void novo(MenuItem item){
        Intent intent = new Intent(getBaseContext(),ValetActivity.class);
        startActivityForResult(intent,2);
    }

    public AlertDialog confirmarSaida() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.saida);
        builder.setMessage(carroSaida);
        builder.setPositiveButton(getString(R.string.sim), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                carros.remove(carroSaida);
                adapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(getString(R.string.nao), null);
        return builder.create();
    }
}
