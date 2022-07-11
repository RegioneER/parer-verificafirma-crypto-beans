package it.eng.parer.crypto.model.verifica;

//import it.eng.parer.entity.AroUsoCertifCaContrMarca;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroContrMarcaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroContrMarcaComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idContrMarcaComp;
    private String tiContr;
    private String dsMsgEsitoContrMarca;
    private String tiEsitoContrMarca;
    // private AroMarcaComp aroMarcaComp;
    private CryptoFirCrl firCrl;

    @XmlElementWrapper(name = "aroUsoCertifCaContrMarcas")
    @XmlElement(name = "aroUsoCertifCaContrMarca")
    private List<CryptoAroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas;

    public CryptoAroContrMarcaComp() {
    }

    // public long getIdContrMarcaComp() {
    // return this.idContrMarcaComp;
    // }
    //
    // public void setIdContrMarcaComp(long idContrMarcaComp) {
    // this.idContrMarcaComp = idContrMarcaComp;
    // }
    public String getDsMsgEsitoContrMarca() {
        return this.dsMsgEsitoContrMarca;
    }

    public void setDsMsgEsitoContrMarca(String dsMsgEsitoContrMarca) {
        this.dsMsgEsitoContrMarca = dsMsgEsitoContrMarca;
    }

    public String getTiContr() {
        return this.tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

    public String getTiEsitoContrMarca() {
        return this.tiEsitoContrMarca;
    }

    public void setTiEsitoContrMarca(String tiEsitoContrMarca) {
        this.tiEsitoContrMarca = tiEsitoContrMarca;
    }

    // public AroMarcaComp getAroMarcaComp() {
    // return this.aroMarcaComp;
    // }
    //
    // public void setAroMarcaComp(AroMarcaComp aroMarcaComp) {
    // this.aroMarcaComp = aroMarcaComp;
    // }
    //
    public CryptoFirCrl getFirCrl() {
        return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
        this.firCrl = firCrl;
    }

    public List<CryptoAroUsoCertifCaContrMarca> getAroUsoCertifCaContrMarcas() {
        return this.aroUsoCertifCaContrMarcas;
    }

    public void setAroUsoCertifCaContrMarcas(List<CryptoAroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas) {
        this.aroUsoCertifCaContrMarcas = aroUsoCertifCaContrMarcas;
    }

}
