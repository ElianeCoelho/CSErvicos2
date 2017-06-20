package up.edu.com.br.cservicos.model;

import java.io.Serializable;

/**
 * Created by josle on 19/06/2017.
 */

public class Servidor implements Serializable {

    private String nomeServidor;
    private String rgServidor;
    private String cpfServidor;
    private String telefoneServidor;
    private String enderecoServidor;
    private String cidadeServidor;
    private String estadoServidor;
    private String categoriaServidor;

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getRgServidor() {
        return rgServidor;
    }

    public void setRgServidor(String rgServidor) {
        this.rgServidor = rgServidor;
    }

    public String getCpfServidor() {
        return cpfServidor;
    }

    public void setCpfServidor(String cpfServidor) {
        this.cpfServidor = cpfServidor;
    }

    public String getTelefoneServidor() {
        return telefoneServidor;
    }

    public void setTelefoneServidor(String telefoneServidor) {
        this.telefoneServidor = telefoneServidor;
    }

    public String getEnderecoServidor() {
        return enderecoServidor;
    }

    public void setEnderecoServidor(String enderecoServidor) {
        this.enderecoServidor = enderecoServidor;
    }

    public String getCidadeServidor() {
        return cidadeServidor;
    }

    public void setCidadeServidor(String cidadeServidor) {
        this.cidadeServidor = cidadeServidor;
    }

    public String getEstadoServidor() {
        return estadoServidor;
    }

    public void setEstadoServidor(String estadoServidor) {
        this.estadoServidor = estadoServidor;
    }

    public String getCategoriaServidor() {
        return categoriaServidor;
    }

    public void setCategoriaServidor(String categoriaServidor) {
        this.categoriaServidor = categoriaServidor;
    }
}
