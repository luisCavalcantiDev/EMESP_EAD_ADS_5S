package com.leanpub.googleandroid.tanahora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TarefaDB db;
    private List<Tarefa> lista;
    private TarefaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new TarefaDB(this);
        carregarLista();

        ListView list = (ListView) findViewById(R.id.lista);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putLong("id", lista.get(position).getId());
                Intent i = new Intent(getBaseContext(), TarefaActivity.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        carregarLista();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void carregarLista() {
        lista = db.consultarTarefas();

        ListView list = (ListView) findViewById(R.id.lista);
        adapter = new TarefaAdapter(this, 0, lista);
        list.setAdapter(adapter);
    }

    public void novo(MenuItem item) {
        startActivity(new Intent(this, TarefaActivity.class));
    }

}
