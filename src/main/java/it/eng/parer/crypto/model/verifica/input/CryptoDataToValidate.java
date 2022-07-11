package it.eng.parer.crypto.model.verifica.input;

import it.eng.parer.crypto.model.verifica.input.validation.DataRiferimento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Modello per effettuare la validazione di una firma.
 *
 * @author Snidero_L
 */
public class CryptoDataToValidate implements Serializable {

    private static final long serialVersionUID = 6857282680348085868L;

    @Valid
    @NotNull(message = "Il documento principale deve essere valorizzato")
    private CryptoDocumentoVersato contenuto;

    private String uuid = UUID.randomUUID().toString();

    private List<CryptoDocumentoVersato> sottoComponentiFirma = new ArrayList<>();

    private List<CryptoDocumentoVersato> sottoComponentiMarca = new ArrayList<>();

    private CryptoProfiloVerifica profiloVerifica = CryptoProfiloVerifica.profiloDefault();

    @Valid
    @NotNull(message = "La data di riferimento deve essere valorizzata")
    @DataRiferimento(message = "La tipologia della data di riferimento deve essere valorizzata correttamente")
    private TipologiaDataRiferimento tipologiaDataRiferimento = TipologiaDataRiferimento.verificaDefault();

    public CryptoDocumentoVersato getContenuto() {
        return contenuto;
    }

    public void setContenuto(CryptoDocumentoVersato contenuto) {
        this.contenuto = contenuto;
    }

    public List<CryptoDocumentoVersato> getSottoComponentiFirma() {
        return sottoComponentiFirma;
    }

    public void setSottoComponentiFirma(List<CryptoDocumentoVersato> sottoComponentiFirma) {
        this.sottoComponentiFirma = sottoComponentiFirma;
    }

    public List<CryptoDocumentoVersato> getSottoComponentiMarca() {
        return sottoComponentiMarca;
    }

    public void setSottoComponentiMarca(List<CryptoDocumentoVersato> sottoComponentiMarca) {
        this.sottoComponentiMarca = sottoComponentiMarca;
    }

    public boolean addSottoComponenteFirma(CryptoDocumentoVersato sottoComponenteFirma) {
        return this.sottoComponentiFirma.add(sottoComponenteFirma);
    }

    public boolean addSottoComponenteMarca(CryptoDocumentoVersato sottoComponenteMarca) {
        return this.sottoComponentiMarca.add(sottoComponenteMarca);
    }

    public CryptoProfiloVerifica getProfiloVerifica() {
        return profiloVerifica;
    }

    public void setProfiloVerifica(CryptoProfiloVerifica profiloVerifica) {
        this.profiloVerifica = profiloVerifica;
    }

    public void setTipologiaDataRiferimento(TipologiaDataRiferimento tipologiaDataRiferimento) {
        this.tipologiaDataRiferimento = tipologiaDataRiferimento;
    }

    public TipologiaDataRiferimento getTipologiaDataRiferimento() {
        return tipologiaDataRiferimento;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
