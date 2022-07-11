package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "firFilePerFirma")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoFirFilePerFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idFilePerFirma;
    @XmlTransient
    private byte[] blFilePerFirma;
    private String nmFileDownload;
    private String tiFilePerFirma;
    // private FirCertifCa firCertifCa;
    // private FirCertifFirmatario firCertifFirmatario;
    // private FirCrl firCrl;

    public CryptoFirFilePerFirma() {
    }

    // public long getIdFilePerFirma() {
    // return this.idFilePerFirma;
    // }
    //
    // public void setIdFilePerFirma(long idFilePerFirma) {
    // this.idFilePerFirma = idFilePerFirma;
    // }
    public byte[] getBlFilePerFirma() {
        return this.blFilePerFirma;
    }

    public void setBlFilePerFirma(byte[] blFilePerFirma) {
        this.blFilePerFirma = blFilePerFirma;
    }

    public String getNmFileDownload() {
        return this.nmFileDownload;
    }

    public void setNmFileDownload(String nmFileDownload) {
        this.nmFileDownload = nmFileDownload;
    }

    public String getTiFilePerFirma() {
        return this.tiFilePerFirma;
    }

    public void setTiFilePerFirma(String tiFilePerFirma) {
        this.tiFilePerFirma = tiFilePerFirma;
    }

    // public FirCertifCa getFirCertifCa() {
    // return this.firCertifCa;
    // }
    //
    // public void setFirCertifCa(FirCertifCa firCertifCa) {
    // this.firCertifCa = firCertifCa;
    // }
    // public FirCertifFirmatario getFirCertifFirmatario() {
    // return this.firCertifFirmatario;
    // }
    //
    // public void setFirCertifFirmatario(FirCertifFirmatario firCertifFirmatario) {
    // this.firCertifFirmatario = firCertifFirmatario;
    // }
    // public FirCrl getFirCrl() {
    // return this.firCrl;
    // }
    //
    // public void setFirCrl(FirCrl firCrl) {
    // this.firCrl = firCrl;
    // }
}
