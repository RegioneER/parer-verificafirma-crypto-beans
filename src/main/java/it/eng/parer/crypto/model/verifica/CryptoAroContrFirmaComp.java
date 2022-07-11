package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroContrFirmaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroContrFirmaComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idContrFirmaComp;
    private String tiContr;
    private String dsMsgEsitoContrFirma;
    private String tiEsitoContrFirma;
    private String mimeType;
    // private AroFirmaComp aroFirmaComp;
    private CryptoFirCrl firCrl;

    @XmlElementWrapper(name = "aroUsoCertifCaContrComps")
    @XmlElement(name = "aroUsoCertifCaContrComp")
    private List<CryptoAroUsoCertifCaContrComp> aroUsoCertifCaContrComps;

    public CryptoAroContrFirmaComp() {
    }

    // public long getIdContrFirmaComp() {
    // return this.idContrFirmaComp;
    // }
    //
    // public void setIdContrFirmaComp(long idContrFirmaComp) {
    // this.idContrFirmaComp = idContrFirmaComp;
    // }
    public String getDsMsgEsitoContrFirma() {
        return this.dsMsgEsitoContrFirma;
    }

    public void setDsMsgEsitoContrFirma(String dsMsgEsitoContrFirma) {
        this.dsMsgEsitoContrFirma = dsMsgEsitoContrFirma;
    }

    public String getTiContr() {
        return this.tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

    public String getTiEsitoContrFirma() {
        return this.tiEsitoContrFirma;
    }

    public void setTiEsitoContrFirma(String tiEsitoContrFirma) {
        this.tiEsitoContrFirma = tiEsitoContrFirma;
    }

    // public AroFirmaComp getAroFirmaComp() {
    // return this.aroFirmaComp;
    // }
    //
    // public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
    // this.aroFirmaComp = aroFirmaComp;
    // }
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public CryptoFirCrl getFirCrl() {
        return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
        this.firCrl = firCrl;
    }

    public List<CryptoAroUsoCertifCaContrComp> getAroUsoCertifCaContrComps() {
        return this.aroUsoCertifCaContrComps;
    }

    public void setAroUsoCertifCaContrComps(List<CryptoAroUsoCertifCaContrComp> aroUsoCertifCaContrComps) {
        this.aroUsoCertifCaContrComps = aroUsoCertifCaContrComps;
    }

}
