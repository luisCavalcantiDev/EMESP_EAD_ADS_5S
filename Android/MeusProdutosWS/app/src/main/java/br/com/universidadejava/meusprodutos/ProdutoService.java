package br.com.universidadejava.meusprodutos;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rafaelsakurai on 17/09/15.
 */
public class ProdutoService {
    private static final String URL = "https://openws.herokuapp.com/meusprodutos";
    private static final String API_KEY = "?apiKey=";

    public List<Produto> getAll() {
        List<Produto> produtos = new ArrayList();
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL + API_KEY);
            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(in);
            String resultado = s.useDelimiter("\\A").next();

            Gson gson = new Gson();
            produtos = gson.fromJson(resultado, new TypeToken<List<Produto>>(){}.getType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
        return produtos;
    }

    public void post(Produto produto) {
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL + API_KEY);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Accept", "application/json");

            OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
            Writer w = new BufferedWriter(new OutputStreamWriter(out));

            Gson gson = new Gson();
            String json = gson.toJson(produto);

            w.write(json);
            w.close();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(in);
            String conteudo = s.nextLine();
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
    }

    public void delete(String id) {
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL + "/" + id + API_KEY);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("DELETE");

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
    }
}
