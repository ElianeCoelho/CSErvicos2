package up.edu.com.br.cservicos.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import up.edu.com.br.cservicos.R;

public class MainActivity extends AppCompatActivity {

    Button btnCadastroCliente, btnCadastroServidor, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCadastroCliente = (Button) findViewById(R.id.btnCadastroCliente);
        btnCadastroServidor = (Button) findViewById(R.id.btnCadastroServidor);
    }

    public void btnLoginClick(View view) {
    }

    public void btnCadastroClienteClick(View view) {

        Intent intent = new Intent(MainActivity.this, CadastroClienteActivity.class);
        //Forma de passar de uma tela para outra
        startActivity(intent); // criar a intenção vai de uma activiti para outra
    }

    public void btnCadastroServidorClick(View view) {

        Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
        startActivity(intent);
    }
}
