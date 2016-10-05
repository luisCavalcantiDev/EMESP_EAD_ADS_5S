package minhastarefas.capitulo4.livro.minhastarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view){
        EditText txtLogin = (EditText)findViewById(R.id.txtLogin);
        EditText txtSenha = (EditText)findViewById(R.id.txtSenha);

        if("admin".equals(txtLogin.getText().toString()) && "123".equals(txtSenha.getText().toString())){
            //chamar tela de tarefas
            startActivity(new Intent(this,TarefaActivity.class));
        }else{
            Toast.makeText(this,"Login ou senha inválida", Toast.LENGTH_SHORT).show();
        }
    }
}
