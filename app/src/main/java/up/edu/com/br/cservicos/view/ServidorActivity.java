package up.edu.com.br.cservicos.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import up.edu.com.br.cservicos.R;
import up.edu.com.br.cservicos.dal.BancoDeDados;
import up.edu.com.br.cservicos.dal.ClienteDAO;
import up.edu.com.br.cservicos.dal.ServidorDAO;
import up.edu.com.br.cservicos.model.Cliente;
import up.edu.com.br.cservicos.model.Servidor;

public class ServidorActivity extends AppCompatActivity {

    EditText edtNomeServidor, edtRgServidor, edtCpfServidor, edtTelefoneServidor, edtEnderecoServidor, edtCidadeServidor,
    edtEstadoServidor;

    Button btnCadastrarServidor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        String sql = BancoDeDados.CRIAR_TABELA_SERVIDOR_SQL;
        Log.v("SQL", sql);

        edtNomeServidor = (EditText) findViewById(R.id.edtNomeServidor);
        edtRgServidor = (EditText) findViewById(R.id.edtRgServidor);
        edtCpfServidor = (EditText) findViewById(R.id.edtCpfServidor);
        edtTelefoneServidor = (EditText) findViewById(R.id.edtTelefoneServidor);
        edtEnderecoServidor = (EditText) findViewById(R.id.edtEnderecoServidor);
        edtCidadeServidor = (EditText) findViewById(R.id.edtCidadeServidor);
        edtEstadoServidor = (EditText) findViewById(R.id.edtEstadoServidor);


        btnCadastrarServidor = (Button) findViewById(R.id.btnCadastrarServidor);

        String nomeServidor = getIntent().getStringExtra("NomeServidor");
        String rgServidor = getIntent().getStringExtra("RgServidor");
        String cpfServidor = getIntent().getStringExtra("CpfServidor");
        String telefoneServidor = getIntent().getStringExtra("TelefoneServidor");
        String enderecoServidor = getIntent().getStringExtra("EnderecoServidor");
        String cidadeServidor = getIntent().getStringExtra("CidadeServidor");
        String estadoServidor = getIntent().getStringExtra("EstadoServidor");


        if(cpfServidor != null){
            edtNomeServidor.setText(nomeServidor);
            edtRgServidor.setText(rgServidor);
            edtCpfServidor.setText(cpfServidor);
            edtTelefoneServidor.setText(telefoneServidor);
            edtEnderecoServidor.setText(enderecoServidor);
            edtCidadeServidor.setText(cidadeServidor);
            edtEstadoServidor.setText(estadoServidor);
        }

    }

    public void btnCadastrarServidorClick(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(ServidorActivity.this);
        builder.setTitle("Lista Servidor");

        if (!edtCpfServidor.getText().toString().equals("")){
            Servidor servidor = new Servidor();
             servidor.setNomeServidor(edtNomeServidor.getText().toString());
             servidor.setRgServidor(edtRgServidor.getText().toString());
             servidor.setCpfServidor(edtCpfServidor.getText().toString());
             servidor.setTelefoneServidor(edtTelefoneServidor.getText().toString());
             servidor.setEnderecoServidor(edtEnderecoServidor.getText().toString());
             servidor.setCidadeServidor(edtCidadeServidor.getText().toString());
             servidor.setEstadoServidor(edtEstadoServidor.getText().toString());


            long id = ServidorDAO.adicionarServidor(servidor, ServidorActivity.this);
            if (id != -1){
                builder.setMessage("Cadastro Realizado!\nID" + id);
                edtNomeServidor.setText("");
                edtRgServidor.setText("");
                edtCpfServidor.setText("");
                edtTelefoneServidor.setText("");
                edtEnderecoServidor.setText("");
                edtCidadeServidor.setText("");
                edtEstadoServidor.setText("");

            }else{
                builder.setMessage("Erro ao Cadastrar!\nId" + id);
            }


        }else{
            builder.setMessage("Favor preencher os campos!");
        }

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertaDialog = builder.create();
        alertaDialog.show();

    }
}
