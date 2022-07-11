package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroUsoCertifCaContrComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroUsoCertifCaContrComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idUsoCertifCaContrComp;
    private BigDecimal pgCertifCa;
    // private AroContrFirmaComp aroContrFirmaComp;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirCrl firCrl;

    public CryptoAroUsoCertifCaContrComp() {
    }

    // public long getIdUsoCertifCaContrComp() {
    // return this.idUsoCertifCaContrComp;
    // }
    //
    // public void setIdUsoCertifCaContrComp(long idUsoCertifCaContrComp) {
    // this.idUsoCertifCaContrComp = idUsoCertifCaContrComp;
    // }

    public BigDecimal getPgCertifCa() {
        return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
        this.pgCertifCa = pgCertifCa;
    }

    // public AroContrFirmaComp getAroContrFirmaComp() {
    // return this.aroContrFirmaComp;
    // }
    //
    // public void setAroContrFirmaComp(AroContrFirmaComp aroContrFirmaComp) {
    // this.aroContrFirmaComp = aroContrFirmaComp;
    // }

    public CryptoFirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(CryptoFirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

    public CryptoFirCrl getFirCrl() {
        return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
        this.firCrl = firCrl;
    }

}
