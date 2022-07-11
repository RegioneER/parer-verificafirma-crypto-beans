package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "firUrlDistribCrl")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoFirUrlDistribCrl implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idUrlDistribCrl;
    private String dlUrlDistribCrl;
    private BigDecimal niOrdUrlDistribCrl;
    // private FirCertifCa firCertifCa;

    public CryptoFirUrlDistribCrl() {
    }

    // public long getIdUrlDistribCrl() {
    // return this.idUrlDistribCrl;
    // }
    //
    // public void setIdUrlDistribCrl(long idUrlDistribCrl) {
    // this.idUrlDistribCrl = idUrlDistribCrl;
    // }
    public String getDlUrlDistribCrl() {
        return this.dlUrlDistribCrl;
    }

    public void setDlUrlDistribCrl(String dlUrlDistribCrl) {
        this.dlUrlDistribCrl = dlUrlDistribCrl;
    }

    public BigDecimal getNiOrdUrlDistribCrl() {
        return this.niOrdUrlDistribCrl;
    }

    public void setNiOrdUrlDistribCrl(BigDecimal niOrdUrlDistribCrl) {
        this.niOrdUrlDistribCrl = niOrdUrlDistribCrl;
    }

    // public FirCertifCa getFirCertifCa() {
    // return this.firCertifCa;
    // }
    //
    // public void setFirCertifCa(FirCertifCa firCertifCa) {
    // this.firCertifCa = firCertifCa;
    // }
}
