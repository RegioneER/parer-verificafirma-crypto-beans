package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CryptoFirCertifFirmatario implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idCertifFirmatario;
    private Date dtFinValCertifFirmatario;
    private Date dtIniValCertifFirmatario;
    private BigDecimal niSerialCertifFirmatario;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirFilePerFirma firFilePerFirma;

    public CryptoFirCertifFirmatario() {
    }

    // public long getIdCertifFirmatario() {
    // return this.idCertifFirmatario;
    // }
    //
    // public void setIdCertifFirmatario(long idCertifFirmatario) {
    // this.idCertifFirmatario = idCertifFirmatario;
    // }

    public Date getDtFinValCertifFirmatario() {
        return this.dtFinValCertifFirmatario;
    }

    public void setDtFinValCertifFirmatario(Date dtFinValCertifFirmatario) {
        this.dtFinValCertifFirmatario = dtFinValCertifFirmatario;
    }

    public Date getDtIniValCertifFirmatario() {
        return this.dtIniValCertifFirmatario;
    }

    public void setDtIniValCertifFirmatario(Date dtIniValCertifFirmatario) {
        this.dtIniValCertifFirmatario = dtIniValCertifFirmatario;
    }

    public BigDecimal getNiSerialCertifFirmatario() {
        return this.niSerialCertifFirmatario;
    }

    public void setNiSerialCertifFirmatario(BigDecimal niSerialCertifFirmatario) {
        this.niSerialCertifFirmatario = niSerialCertifFirmatario;
    }

    public CryptoFirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(CryptoFirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

    public CryptoFirFilePerFirma getFirFilePerFirma() {
        return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(CryptoFirFilePerFirma firFilePerFirma) {
        this.firFilePerFirma = firFilePerFirma;
    }

}
