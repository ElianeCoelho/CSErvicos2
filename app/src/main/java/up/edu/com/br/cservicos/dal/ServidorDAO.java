package up.edu.com.br.cservicos.dal;

import android.content.Context;

import java.util.ArrayList;

import up.edu.com.br.cservicos.model.Servidor;

/**
 * Created by josle on 19/06/2017.
 */

public class ServidorDAO {

    private static ArrayList<Servidor> servidores = new ArrayList<Servidor>();

    public static long adicionarServidor(Servidor servidor, Context context){
        BancoDeDados banco = new BancoDeDados(context);
        return banco.adicionarServidor(servidor);
    }

    public static ArrayList<Servidor> retornarLista(){
        return servidores;
    }
}
