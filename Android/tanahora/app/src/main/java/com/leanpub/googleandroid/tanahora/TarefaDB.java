package com.leanpub.googleandroid.tanahora;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rafaelsakurai on 01/10/15.
 */
public class TarefaDB extends SQLiteOpenHelper {

    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public TarefaDB(Context context) {
        super(context, "TarefaDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Tarefa (_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, inicio TEXT, fim TEXT, categoria TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Tarefa salvar(Tarefa tarefa) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("nome", tarefa.getNome());
            values.put("inicio", df.format(tarefa.getInicio()));
            values.put("fim", df.format(tarefa.getFim()));
            values.put("categoria", tarefa.getCategoria());

            if (tarefa.getId() == null) {
                long id = db.insert("Tarefa", null, values);
                tarefa.setId(id);
            } else {
                String[] where = new String[]{String.valueOf(tarefa.getId())};
                db.update("Tarefa", values, "_id = ?", where);
            }
        } finally {
            db.close();
        }

        return tarefa;
    }

    public Tarefa consultarTarefaPorId(Long id) {
        Tarefa tarefa = new Tarefa();

        SQLiteDatabase db = getReadableDatabase();
        try {
            Cursor cursor = db.rawQuery("SELECT _id, nome, inicio, fim, categoria FROM Tarefa where _id = ?",
                    new String[]{id.toString()});
            cursor.moveToFirst();

            tarefa.setId(cursor.getLong(0));
            tarefa.setNome(cursor.getString(1));
            tarefa.setInicio(df.parse(cursor.getString(2)));
            tarefa.setFim(df.parse(cursor.getString(3)));
            tarefa.setCategoria(cursor.getString(4));

            cursor.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return tarefa;
    }

    public List<Tarefa> consultarTarefas() {
        List<Tarefa> lista = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        try {
            Cursor cursor = db.rawQuery("SELECT _id, nome, inicio, fim, categoria FROM Tarefa", null);
            cursor.moveToFirst();

            for (int i = 0; i < cursor.getCount(); i++) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(cursor.getLong(0));
                tarefa.setNome(cursor.getString(1));
                tarefa.setInicio(df.parse(cursor.getString(2)));
                tarefa.setFim(df.parse(cursor.getString(3)));
                tarefa.setCategoria(cursor.getString(4));
                lista.add(tarefa);
                cursor.moveToNext();
            }
            cursor.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return lista;
    }

    public List<Tarefa> consultarTarefasPorPeriodo(Date inicio, Date fim) {
        List<Tarefa> lista = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        try {
            Cursor cursor = db.rawQuery("SELECT _id, nome, inicio, fim, categoria FROM Tarefa where inicio >= ? AND fim <= ?",
                    new String[]{df.format(inicio), df.format(fim)});
            cursor.moveToFirst();

            for (int i = 0; i < cursor.getCount(); i++) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(cursor.getLong(0));
                tarefa.setNome(cursor.getString(1));
                tarefa.setInicio(df.parse(cursor.getString(2)));
                tarefa.setFim(df.parse(cursor.getString(3)));
                tarefa.setCategoria(cursor.getString(4));
                lista.add(tarefa);
                cursor.moveToNext();
            }
            cursor.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return lista;
    }
}
