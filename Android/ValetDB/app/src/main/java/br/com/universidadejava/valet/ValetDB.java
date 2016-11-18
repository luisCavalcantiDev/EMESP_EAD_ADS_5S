package br.com.universidadejava.valet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rafaelsakurai on 30/08/15.
 */
public class ValetDB extends SQLiteOpenHelper {

    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public ValetDB(Context context) {
        super(context, "Valet", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("ValetDB", "onCreate");
        db.execSQL("CREATE TABLE Valet (_id integer primary key autoincrement, modelo text, placa text, entrada text, saida text, valor REAL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Valet salvarValet(Valet valet) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("modelo", valet.getModelo());
            values.put("placa", valet.getPlaca());
            values.put("entrada", df.format(valet.getEntrada()));

            if (valet.getId() == null) {
                long id = db.insert("Valet", null, values);
                valet.setId(id);
            } else {
                values.put("saida", df.format(valet.getSaida()));
                values.put("valor", valet.getPreco());
                String[] where = new String[]{String.valueOf(valet.getId())};
                db.update("Valet", values, "_id = ?", where);
            }
        } finally {
            db.close();
        }

        return valet;
    }

    public List<Valet> consultarVeiculosValet() {
        Log.d("ValetDB", "consultarTodos");
        List<Valet> lista = new ArrayList();

        SQLiteDatabase db = getReadableDatabase();
        try {
            Cursor cursor = db.rawQuery("SELECT _id, modelo, placa, entrada FROM Valet where saida is null", null);
            cursor.moveToFirst();

            for (int i = 0; i < cursor.getCount(); i++) {
                Valet valet = new Valet();
                valet.setId(cursor.getLong(0));
                valet.setModelo(cursor.getString(1));
                valet.setPlaca(cursor.getString(2));
                valet.setEntrada(df.parse(cursor.getString(3)));
                lista.add(valet);
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
