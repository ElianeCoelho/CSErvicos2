package up.edu.com.br.cservicos.model;

import java.io.Serializable;

/**
 * Created by josle on 19/06/2017.
 */

public class Cliente implements Serializable {

    private String nomeCliente;
    private String rgCliente;
    private String cprCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String cidadeCliente;
    private String estadoCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getCprCliente() {
        return cprCliente;
    }

    public void setCprCliente(String cprCliente) {
        this.cprCliente = cprCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
}
