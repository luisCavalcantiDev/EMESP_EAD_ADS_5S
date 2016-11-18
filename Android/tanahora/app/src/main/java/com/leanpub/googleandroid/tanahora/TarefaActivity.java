package com.leanpub.googleandroid.tanahora;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by rafaelsakurai on 28/09/15.
 */
public class TarefaActivity extends AppCompatActivity {

    private DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat hf = new SimpleDateFormat("HH:mm");
    private Long tarefaId;
    private TarefaDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa);

        db = new TarefaDB(this);

        if (getIntent().getExtras() != null) {
            tarefaId = getIntent().getExtras().getLong("id");
        }

        Calendar inicio = Calendar.getInstance();
        Calendar fim = Calendar.getInstance();
        if (tarefaId == null) {
            fim.set(Calendar.HOUR_OF_DAY, fim.get(Calendar.HOUR_OF_DAY) + 1);
        } else {
            TarefaDB db = new TarefaDB(this);
            Tarefa tarefa = db.consultarTarefaPorId(tarefaId);
            ((EditText) findViewById(R.id.nome)).setText(tarefa.getNome());
            inicio.setTime(tarefa.getInicio());
            fim.setTime(tarefa.getFim());
            int pos = 0;
            String[] categorias = getResources().getStringArray(R.array.categorias);
            for (int i = 0; i < categorias.length; i++) {
                String s = categorias[i];
                if (s.equals(tarefa.getCategoria())) {
                    pos = i;
                    break;
                }
            }
            ((Spinner) findViewById(R.id.categoria)).setSelection(pos);
        }

        adicionarDatePicker((EditText) findViewById(R.id.dataInicio), inicio);
        adicionarDatePicker((EditText) findViewById(R.id.dataFim), fim);

        adicionarTimePicker((EditText) findViewById(R.id.horaInicio), inicio);
        adicionarTimePicker((EditText) findViewById(R.id.horaFim), fim);
    }

    private void adicionarDatePicker(final EditText edit, final Calendar date) {
        edit.setText(df.format(date.getTime()));

        final DatePickerDialog.OnDateSetListener dpd = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.set(Calendar.YEAR, year);
                date.set(Calendar.MONTH, monthOfYear);
                date.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                edit.setText(df.format(date.getTime()));
            }
        };

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(TarefaActivity.this, dpd, date.get(Calendar.YEAR), date.get(Calendar.MONTH),
                        date.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void adicionarTimePicker(final EditText edit, final Calendar date) {
        edit.setText(hf.format(date.getTime()));

        final TimePickerDialog.OnTimeSetListener tpd = new TimePickerDialog.OnTimeSetListener(){
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                date.set(Calendar.HOUR_OF_DAY, hourOfDay);
                date.set(Calendar.MINUTE, minute);
                edit.setText(hf.format(date.getTime()));
            }
        };

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(TarefaActivity.this, tpd, date.get(Calendar.HOUR_OF_DAY), date.get(Calendar.MINUTE), true).show();
            }
        });
    }

    public void salvar(View view) {
        Date inicio;
        Date fim;
        try{
            inicio = dhf.parse(((EditText) findViewById(R.id.dataInicio)).getText().toString() + " " + ((EditText) findViewById(R.id.horaInicio)).getText().toString());
            fim = dhf.parse(((EditText) findViewById(R.id.dataFim)).getText().toString() + " " + ((EditText) findViewById(R.id.horaFim)).getText().toString());
        } catch(Exception e) {
            inicio = new Date();
            fim = new Date();
        }
        Tarefa tarefa = new Tarefa();
        tarefa.setId(tarefaId);
        tarefa.setNome(((EditText) findViewById(R.id.nome)).getText().toString());
        tarefa.setInicio(inicio);
        tarefa.setFim(fim);
        tarefa.setCategoria((String) ((Spinner) findViewById(R.id.categoria)).getSelectedItem());

        db.salvar(tarefa);

        finish();
    }
}
