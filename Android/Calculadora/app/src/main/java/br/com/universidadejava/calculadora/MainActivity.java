package br.com.universidadejava.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double total;
    private String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void adicionarNumero(View view) {
        String numero = ((Button) view).getText().toString();
        TextView resultado = ((TextView) findViewById(R.id.resultado));
        resultado.setText(resultado.getText() + numero);
    }

    public void operacao(View view) {
        operacao = ((TextView) view).getText().toString();
        total = Double.valueOf(((TextView) findViewById(R.id.resultado)).getText().toString().trim());
        ((TextView) findViewById(R.id.resultado)).setText("");
    }

    public void calcular(View view) {
        double valor = Double.valueOf(((TextView) findViewById(R.id.resultado)).getText().toString().trim());
        if("+".equals(operacao)) {
            total = total + valor;
        } else if("-".equals(operacao)) {
            total = total - valor;
        } else if("/".equals(operacao)) {
            total = total / valor;
        } else if("*".equals(operacao)) {
            total = total * valor;
        }
        ((TextView) findViewById(R.id.resultado)).setText(String.valueOf(total));
    }
}
