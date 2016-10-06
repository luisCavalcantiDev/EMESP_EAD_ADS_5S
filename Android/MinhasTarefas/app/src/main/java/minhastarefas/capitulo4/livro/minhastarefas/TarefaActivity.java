package minhastarefas.capitulo4.livro.minhastarefas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis.pereira on 05/10/2016.
 */

public class TarefaActivity extends Activity {

    private List<String> tarefas;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarefa);

        tarefas = new ArrayList<String>();
        ListView lista = (ListView)findViewById(R.id.listTarefas);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tarefas);
        lista.setAdapter(adapter);
    }

    public void adicionarTarefas(View view){
        EditText txtTarefa = (EditText)findViewById(R.id.txtTarefa);
        if(txtTarefa.getText().length() > 0){
            this.tarefas.add(txtTarefa.getText().toString());
            adapter.notifyDataSetChanged();
            txtTarefa.setText("");
        }else{
            Toast.makeText(this, "Campo tarefa vazio", Toast.LENGTH_SHORT).show();
        }
    }
}
