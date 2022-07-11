package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CryptoFirCrl implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idCrl;
    private Date dtIniCrl;
    private Date dtScadCrl;
    private BigDecimal niSerialCrl;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirFilePerFirma firFilePerFirma;
    private String linkCRL;

    private String subjectKeyID;
    private String subjectDN;
    private String uniqueId;

    public CryptoFirCrl() {
    }

    // public long getIdCrl() {
    // return this.idCrl;
    // }
    //
    // public void setIdCrl(long idCrl) {
    // this.idCrl = idCrl;
    // }
    public Date getDtIniCrl() {
        return this.dtIniCrl;
    }

    public void setDtIniCrl(Date dtIniCrl) {
        this.dtIniCrl = dtIniCrl;
    }

    public Date getDtScadCrl() {
        return this.dtScadCrl;
    }

    public void setDtScadCrl(Date dtScadCrl) {
        this.dtScadCrl = dtScadCrl;
    }

    public BigDecimal getNiSerialCrl() {
        return this.niSerialCrl;
    }

    public void setNiSerialCrl(BigDecimal niSerialCrl) {
        this.niSerialCrl = niSerialCrl;
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

    public String getLinkCRL() {
        return linkCRL;
    }

    public void setLinkCRL(String linkCRL) {
        this.linkCRL = linkCRL;
    }

    public String getSubjectKeyID() {
        return subjectKeyID;
    }

    public void setSubjectKeyID(String subjectKeyID) {
        this.subjectKeyID = subjectKeyID;
    }

    public String getSubjectDN() {
        return subjectDN;
    }

    public void setSubjectDN(String subjectDN) {
        this.subjectDN = subjectDN;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
