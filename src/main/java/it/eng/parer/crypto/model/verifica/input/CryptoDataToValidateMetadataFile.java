package it.eng.parer.crypto.model.verifica.input;

import java.io.Serializable;
import java.util.UUID;
import javax.validation.constraints.NotNull;

/**
 * Metadati riferiti ai file caricati.
 *
 * @author Snidero_L
 */
public class CryptoDataToValidateMetadataFile implements Serializable {

    private static final long serialVersionUID = 2073062626291367247L;

    @NotNull(message = "Indicare l'identificativo del file")
    private String id;
    private String tipoHash;
    private String hash;
    private long size;

    public CryptoDataToValidateMetadataFile() {
        this.id = "componente-" + UUID.randomUUID().toString();
    }

    public CryptoDataToValidateMetadataFile(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public CryptoDataToValidateMetadataFile setId(String id) {
        this.id = id;
        return this;
    }

    public String getTipoHash() {
        return tipoHash;
    }

    public CryptoDataToValidateMetadataFile setTipoHash(String tipoHash) {
        this.tipoHash = tipoHash;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public CryptoDataToValidateMetadataFile setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public long getSize() {
        return size;
    }

    public CryptoDataToValidateMetadataFile setSize(long size) {
        this.size = size;
        return this;
    }

}
