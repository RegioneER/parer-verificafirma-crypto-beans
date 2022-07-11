package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroUsoCertifCaContrMarca")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroUsoCertifCaContrMarca implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idUsoCertifCaContrMarca;
    private BigDecimal pgCertifCa;
    // private AroContrMarcaComp aroContrMarcaComp;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirCrl firCrl;

    public CryptoAroUsoCertifCaContrMarca() {
    }

    // public long getIdUsoCertifCaContrMarca() {
    // return this.idUsoCertifCaContrMarca;
    // }
    //
    // public void setIdUsoCertifCaContrMarca(long idUsoCertifCaContrMarca) {
    // this.idUsoCertifCaContrMarca = idUsoCertifCaContrMarca;
    // }
    public BigDecimal getPgCertifCa() {
        return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
        this.pgCertifCa = pgCertifCa;
    }

    // public AroContrMarcaComp getAroContrMarcaComp() {
    // return this.aroContrMarcaComp;
    // }
    //
    // public void setAroContrMarcaComp(AroContrMarcaComp aroContrMarcaComp) {
    // this.aroContrMarcaComp = aroContrMarcaComp;
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
