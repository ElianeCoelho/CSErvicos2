package up.edu.com.br.cservicos.dal;

import android.provider.BaseColumns;

/**
 * Created by josle on 19/06/2017.
 */

public class Contrato {

    private Contrato(){}

    public static class TabelaCliente implements BaseColumns{


        //Tabela Cliente
        public static final String NOME_DA_TABELA = "Clientes";
        //Colunas da tabela Cliente

        public static final String COLUNA_ID = "ClienteID";
        public static final String COLUNA_NOME_CLIENTE = "NomeCliente";
        public static final String COLUNA_RG_ClIENTE = "RgCliente";
        public static final String COLUNA_CPF_CLIENTE = "CpfCliente";
        public static final String COLUNA_TELEFONE_CLIENTE = "TelefoneCliente";
        public static final String COLUNA_ENDERECO_CLIENTE = "EnderecoCliente";
        public static final String COLUNA_CIDADE_ClIENTE = "CidadeCliente";
        public static final String COLUNA_ESTADO_CLIENTE = "EstadoCliente";


    }

    public static class TabelaServidor implements BaseColumns{

        //Tabela Servidor
        public static final  String NOME_DA_TABELA = "Servidores";

        //Colinas da Tabela Servisorres
        public static final String COLUNA_ID = "ServidorID";
        public static final String COLUNA_NOME_SERVIDOR = "NomeServidor";
        public static final String COLUNA_RG_SERVIDOR = "RgServidor";
        public static final String COLUNA_CPF_SERVIDOR = "CpfServidor";
        public static final String COLUNA_TELEFONE_SERVIDOR = "TelefoneServidor";
        public static final String COLUNA_ENDERECO_SERVIDOR = "EnderecoServidor";
        public static final String COLUNA_CIDADE_SERVIDOR = "CidadeServidor";
        public static final String COLUNA_ESTADO_SERVIDOR = "EstadoServidor";

    }

//    public static class TabelaContrato implements BaseColumns{
//
//
//    }
}
