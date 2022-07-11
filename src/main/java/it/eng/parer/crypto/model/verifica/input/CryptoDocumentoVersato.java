package it.eng.parer.crypto.model.verifica.input;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Snidero_L
 */
public class CryptoDocumentoVersato implements Serializable {

    private static final long serialVersionUID = 583386965032180586L;
    @NotNull(message = "Necessario indicare il nome del componente versato")
    private String nome;

    private byte[] contenuto;

    public CryptoDocumentoVersato() {
        this.nome = "default";
    }

    public CryptoDocumentoVersato(String nome, byte[] contenuto) {
        this.nome = nome;
        this.contenuto = contenuto;
    }

    public String getNome() {
        return nome;
    }

    public CryptoDocumentoVersato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public byte[] getContenuto() {
        return contenuto;
    }

    public CryptoDocumentoVersato setContenuto(byte[] contenuto) {
        this.contenuto = contenuto;
        return this;
    }

}
