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
public class CryptoDataToValidateMetadata implements Serializable {

    private static final long serialVersionUID = 6857282680348085868L;

    private String uuid = UUID.randomUUID().toString();

    private CryptoProfiloVerifica profiloVerifica = CryptoProfiloVerifica.profiloDefault();

    @Valid
    @NotNull(message = "Le informazioni sul componente principale devono essere valorizzate correttamente")
    private CryptoDataToValidateMetadataFile componentePrincipale = new CryptoDataToValidateMetadataFile();

    private List<CryptoDataToValidateMetadataFile> sottoComponentiFirma = new ArrayList<>();

    private List<CryptoDataToValidateMetadataFile> sottoComponentiMarca = new ArrayList<>();

    @Valid
    @NotNull(message = "La data di riferimento deve essere valorizzata")
    @DataRiferimento(message = "La tipologia della data di riferimento deve essere valorizzata correttamente")
    private TipologiaDataRiferimento tipologiaDataRiferimento = TipologiaDataRiferimento.verificaDefault();

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

    public CryptoDataToValidateMetadataFile getComponentePrincipale() {
        return componentePrincipale;
    }

    public void setComponentePrincipale(CryptoDataToValidateMetadataFile componentePrincipale) {
        this.componentePrincipale = componentePrincipale;
    }

    public List<CryptoDataToValidateMetadataFile> getSottoComponentiFirma() {
        return sottoComponentiFirma;
    }

    public void setSottoComponentiFirma(List<CryptoDataToValidateMetadataFile> sottoComponentiFirma) {
        this.sottoComponentiFirma = sottoComponentiFirma;
    }

    public List<CryptoDataToValidateMetadataFile> getSottoComponentiMarca() {
        return sottoComponentiMarca;
    }

    public void setSottoComponentiMarca(List<CryptoDataToValidateMetadataFile> sottoComponentiMarca) {
        this.sottoComponentiMarca = sottoComponentiMarca;
    }

}
