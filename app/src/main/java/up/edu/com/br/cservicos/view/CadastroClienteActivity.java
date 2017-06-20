package up.edu.com.br.cservicos.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import up.edu.com.br.cservicos.R;
import up.edu.com.br.cservicos.dal.BancoDeDados;
import up.edu.com.br.cservicos.dal.ClienteDAO;
import up.edu.com.br.cservicos.model.Cliente;

public class CadastroClienteActivity extends AppCompatActivity {

    EditText edtNomeCliente, edtRgCliente, edtCpfCliente, edtTelefoneCliente, edtEnderecoCliente, edtCidadeCliente, edtEstadoCliente;
    Button btnCadastrarCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        String sql = BancoDeDados.CRIAR_TABELA_CLIENTE_SQL;
        Log.v("SQL", sql);

        edtNomeCliente = (EditText) findViewById(R.id.edtNomeCliente);
        edtRgCliente =(EditText) findViewById(R.id.edtRgCliente);
        edtCpfCliente = (EditText) findViewById(R.id.edtCpfCliente);
        edtTelefoneCliente = (EditText) findViewById(R.id.edtTelefoneCliente);
        edtEnderecoCliente = (EditText) findViewById(R.id.edtEnderecoCliente);
        edtCidadeCliente = (EditText) findViewById(R.id.edtCidadeCliente);
        edtEstadoCliente = (EditText) findViewById(R.id.edtEstadoCliente);

        btnCadastrarCliente = (Button) findViewById(R.id.btnCadastroCliente);

        String nomeCliente = getIntent().getStringExtra("NomeCliente");
        String rgCliente = getIntent().getStringExtra("RgCliente");
        String cpfCliente = getIntent().getStringExtra("CpfCliente");
        String telefoneCliente = getIntent().getStringExtra("TelefoneCliente");
        String enderecoCliente = getIntent().getStringExtra("EnderecoCliente");
        String cidadeCliente = getIntent().getStringExtra("CidadeCliente");
        String estadoCliente = getIntent().getStringExtra("EstadoCliente");


        if(cpfCliente != null){
            edtNomeCliente.setText(nomeCliente);
            edtRgCliente.setText(rgCliente);
            edtCpfCliente.setText(cpfCliente);
            edtTelefoneCliente.setText(telefoneCliente);
            edtEnderecoCliente.setText(enderecoCliente);
            edtCidadeCliente.setText(cidadeCliente);
            edtEstadoCliente.setText(estadoCliente);
        }

    }

    public void btnCadastrarClienteClick(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(CadastroClienteActivity.this);
        builder.setTitle("Lista Cliente");

        if (!edtCpfCliente.getText().toString().equals("")){
            Cliente cliente = new Cliente();
            cliente.setNomeCliente(edtNomeCliente.getText().toString());
            cliente.setRgCliente(edtRgCliente.getText().toString());
            cliente.setCprCliente(edtCpfCliente.getText().toString());
            cliente.setTelefoneCliente(edtTelefoneCliente.getText().toString());
            cliente.setEnderecoCliente(edtEnderecoCliente.getText().toString());
            cliente.setCidadeCliente(edtCidadeCliente.getText().toString());
            cliente.setEstadoCliente(edtEstadoCliente.getText().toString());

            long id = ClienteDAO.adicionarCliente(cliente, CadastroClienteActivity.this);
            if (id != -1){
                builder.setMessage("Cadastro Realizado!\nID" + id);
                edtNomeCliente.setText("");
                edtRgCliente.setText("");
                edtCpfCliente.setText("");
                edtTelefoneCliente.setText("");
                edtEnderecoCliente.setText("");
                edtCidadeCliente.setText("");
                edtEstadoCliente.setText("");

            }else{
                builder.setMessage("Erro ao Cadastrar!\nId" + id);
            }


        }else{
            builder.setMessage("Favor preencher os campos!");
        }


        builder.setPositiveButton("OK ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertaDialog = builder.create();
        alertaDialog.show();


    }
}
