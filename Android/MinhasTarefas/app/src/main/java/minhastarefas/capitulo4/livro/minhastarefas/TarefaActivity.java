package minhastarefas.capitulo4.livro.minhastarefas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by luis.pereira on 05/10/2016.
 */

public class TarefaActivity extends Activity {

    private List<String>tarefas;
    private ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarefa);

        tarefas = new ArrayList<String>();
        ListView lista = (ListView)findViewById(R.id.listTarefas);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarefas);
        lista.setAdapter(adapter);

        //TODO: continuar pg. 50
    }
}
