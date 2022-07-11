package it.eng.parer.crypto.model.verifica;

//import it.eng.parer.entity.FirUrlDistribCrl;
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "firCertifCa")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoFirCertifCa implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idCertifCa;

    @XmlElementWrapper(name = "firUrlDistribCrls")
    @XmlElement(name = "firUrlDistribCrl")
    private List<CryptoFirUrlDistribCrl> firUrlDistribCrls;
    private Date dtFinValCertifCa;
    private Date dtIniValCertifCa;
    private BigDecimal niSerialCertifCa;
    private CryptoFirIssuer firIssuer;
    // private List<CryptoFirCertifFirmatario> firCertifFirmatarios;
    // private List<CryptoFirCrl> firCrls;
    private CryptoFirFilePerFirma firFilePerFirma;
    private String dsSubjectKeyId;

    public CryptoFirCertifCa() {
    }
    // public long getIdCertifCa() {
    // return this.idCertifCa;
    // }
    //
    // public void setIdCertifCa(long idCertifCa) {
    // this.idCertifCa = idCertifCa;
    // }

    public Date getDtFinValCertifCa() {
        return this.dtFinValCertifCa;
    }

    public void setDtFinValCertifCa(Date dtFinValCertifCa) {
        this.dtFinValCertifCa = dtFinValCertifCa;
    }

    public Date getDtIniValCertifCa() {
        return this.dtIniValCertifCa;
    }

    public void setDtIniValCertifCa(Date dtIniValCertifCa) {
        this.dtIniValCertifCa = dtIniValCertifCa;
    }

    public BigDecimal getNiSerialCertifCa() {
        return this.niSerialCertifCa;
    }

    public void setNiSerialCertifCa(BigDecimal niSerialCertifCa) {
        this.niSerialCertifCa = niSerialCertifCa;
    }

    public String getDsSubjectKeyId() {
        return dsSubjectKeyId;
    }

    public void setDsSubjectKeyId(String dsSubjectKeyId) {
        this.dsSubjectKeyId = dsSubjectKeyId;
    }

    public CryptoFirIssuer getFirIssuer() {
        return this.firIssuer;
    }

    public void setFirIssuer(CryptoFirIssuer firIssuer) {
        this.firIssuer = firIssuer;
    }
    // public List<CryptoFirCertifFirmatario> getFirCertifFirmatarios() {
    // return this.firCertifFirmatarios;
    // }
    //
    // public void setFirCertifFirmatarios(List<CryptoFirCertifFirmatario> firCertifFirmatarios) {
    // this.firCertifFirmatarios = firCertifFirmatarios;
    // }

    // bi-directional many-to-one association to FirCrl
    // public List<CryptoFirCrl> getFirCrls() {
    // return this.firCrls;
    // }
    //
    // public void setFirCrls(List<CryptoFirCrl> firCrls) {
    // this.firCrls = firCrls;
    // }
    public CryptoFirFilePerFirma getFirFilePerFirma() {
        return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(CryptoFirFilePerFirma firFilePerFirma) {
        this.firFilePerFirma = firFilePerFirma;
    }

    public List<CryptoFirUrlDistribCrl> getFirUrlDistribCrls() {
        return this.firUrlDistribCrls;
    }

    public void setFirUrlDistribCrls(List<CryptoFirUrlDistribCrl> firUrlDistribCrls) {
        this.firUrlDistribCrls = firUrlDistribCrls;
    }

}
