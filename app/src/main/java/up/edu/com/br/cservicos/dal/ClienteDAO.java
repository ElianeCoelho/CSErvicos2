package up.edu.com.br.cservicos.dal;

import android.content.Context;

import java.util.ArrayList;

import up.edu.com.br.cservicos.model.Cliente;

/**
 * Created by josle on 19/06/2017.
 */

public class ClienteDAO {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static long adicionarCliente(Cliente cliente, Context context){
        BancoDeDados banco = new BancoDeDados(context);
        return banco.adicionarCliente(cliente);
    }

    public static ArrayList<Cliente> retornarLista(){
        return clientes;
    }
}
