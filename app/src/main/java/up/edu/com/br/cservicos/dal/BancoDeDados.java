package up.edu.com.br.cservicos.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import up.edu.com.br.cservicos.model.Cliente;
import up.edu.com.br.cservicos.model.Servidor;

/**
 * Created by josle on 19/06/2017.
 */

public class BancoDeDados extends SQLiteOpenHelper {

    public static final int VERSAO_DO_BANCO = 1;
    public static final  String NOME_DO_BANCO = "SCervicos.db";

    public  static final String TIPO_TEXT = " TEXT";
    public static final String TIPO_INTEIRO = " INTEGER";
    public  static final String VIRGULA = ", ";

    //Tabelas

    //Tabela Cliente
    public static final String CRIAR_TABELA_CLIENTE_SQL =
            "CREATE TABLE IF NOT EXISTS " + Contrato.TabelaCliente.NOME_DA_TABELA + " ( "+
                    Contrato.TabelaCliente.COLUNA_ID + TIPO_INTEIRO + " PRIMARY KEY AUTOINCREMENT" + VIRGULA+
                    Contrato.TabelaCliente.COLUNA_NOME_CLIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_RG_ClIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_CPF_CLIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_TELEFONE_CLIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_ENDERECO_CLIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_CIDADE_ClIENTE + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaCliente.COLUNA_ESTADO_CLIENTE +TIPO_TEXT + ") ";

    //Tabela Servidor

    public  static final String CRIAR_TABELA_SERVIDOR_SQL =
            "CREATE TABLE IF NOT EXISTS" + Contrato.TabelaServidor.NOME_DA_TABELA + " ( " +
                    Contrato.TabelaServidor.COLUNA_ID + TIPO_INTEIRO + " PRIMARY KEY AUTOINCREMENT" + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_NOME_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_RG_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_CPF_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_TELEFONE_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_ENDERECO_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_CIDADE_SERVIDOR + TIPO_TEXT + VIRGULA +
                    Contrato.TabelaServidor.COLUNA_ESTADO_SERVIDOR + TIPO_TEXT + ") ";



    //DELETE DE TABELAS
    public  static  final String DELETAR_TABELA_CLIENTE_SQL =
            "DELETE TABLE IF EXISTS " + Contrato.TabelaCliente.NOME_DA_TABELA;

    public static final String DELETAR_TABELA_SERVIDOR_SQL =
            "DELETE TABLE IF EXISTS " + Contrato.TabelaServidor.NOME_DA_TABELA;



    public BancoDeDados (Context context){
        super(context, NOME_DO_BANCO, null, VERSAO_DO_BANCO);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CRIAR_TABELA_CLIENTE_SQL);
        Log.v("CRIAR_TAB_CLIENTE_SQL", CRIAR_TABELA_CLIENTE_SQL);
        sqLiteDatabase.execSQL(CRIAR_TABELA_SERVIDOR_SQL);
        Log.v("CRIAR_TAB_SERVIDOR_SQL", CRIAR_TABELA_SERVIDOR_SQL );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(DELETAR_TABELA_CLIENTE_SQL);
        Log.v("DEL_TABELA_CLIENTE_SQL", DELETAR_TABELA_CLIENTE_SQL);
        sqLiteDatabase.execSQL(DELETAR_TABELA_SERVIDOR_SQL);
        Log.v("DEL_TABELA_SERVIDOR_SQL", DELETAR_TABELA_SERVIDOR_SQL);

    }

    //METODO ADICIONAR CLIENTE
    public long adicionarCliente(Cliente cliente) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Contrato.TabelaCliente.COLUNA_NOME_CLIENTE, cliente.getNomeCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_RG_ClIENTE, cliente.getRgCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_CPF_CLIENTE, cliente.getCprCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_TELEFONE_CLIENTE, cliente.getTelefoneCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_ENDERECO_CLIENTE, cliente.getEnderecoCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_CIDADE_ClIENTE, cliente.getCidadeCliente());
        contentValues.put(Contrato.TabelaCliente.COLUNA_ESTADO_CLIENTE, cliente.getEstadoCliente());

        return db.insert(Contrato.TabelaCliente.NOME_DA_TABELA, null, contentValues);

    }

    //METODO ADICIONAR SERVIDOR
    public long adicionarServidor(Servidor servidor){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(Contrato.TabelaServidor.COLUNA_NOME_SERVIDOR, servidor.getNomeServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_RG_SERVIDOR, servidor.getRgServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_CPF_SERVIDOR, servidor.getCpfServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_TELEFONE_SERVIDOR, servidor.getTelefoneServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_ENDERECO_SERVIDOR, servidor.getEnderecoServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_CIDADE_SERVIDOR, servidor.getCidadeServidor());
        contentValues.put(Contrato.TabelaServidor.COLUNA_ESTADO_SERVIDOR, servidor.getEstadoServidor());

        return db.insert(Contrato.TabelaServidor.NOME_DA_TABELA, null, contentValues);
    }
}

