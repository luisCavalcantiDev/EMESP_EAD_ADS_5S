package com.leanpub.googleandroid.tanahora;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rafaelsakurai on 01/10/15.
 */
public class TarefaAdapter extends ArrayAdapter<Tarefa> {

    private Context context;
    private List<Tarefa> tarefas;

    public TarefaAdapter(Context context, int resource, List<Tarefa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.tarefas = objects;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View linha = inflater.inflate(R.layout.tarefa, parent, false);
        TextView tempo = (TextView) linha.findViewById(R.id.tempo);
        TextView nome = (TextView) linha.findViewById(R.id.nome);
        TextView categoria = (TextView) linha.findViewById(R.id.categoria);

        Tarefa p = tarefas.get(position);

        long time = (p.getFim().getTime() - p.getInicio().getTime()) / 1000 / 60;
        long minutos = time % 60;
        long horas = time / 60;

        tempo.setText((horas < 10 ? "0" + horas : horas) + ":" + (minutos < 10 ? "0" + minutos : minutos));
        nome.setText(p.getNome());
        categoria.setText(p.getCategoria());

        return linha;
    }


}
