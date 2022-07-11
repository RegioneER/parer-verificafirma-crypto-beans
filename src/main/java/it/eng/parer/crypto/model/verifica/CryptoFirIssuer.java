package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.util.List;

/**
 * The persistent class for the FIR_ISSUER database table.
 *
 */
public class CryptoFirIssuer implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dlDnIssuerCertifCa;
    private String dlDnSubjectCertifCa;
    private List<CryptoFirCertifCa> firCertifCas;

    public CryptoFirIssuer() {
        // Non fare nulla viene costruito automaticamente.
    }

    public String getDlDnIssuerCertifCa() {
        return this.dlDnIssuerCertifCa;
    }

    public void setDlDnIssuerCertifCa(String dlDnIssuerCertifCa) {
        this.dlDnIssuerCertifCa = dlDnIssuerCertifCa;
    }

    public String getDlDnSubjectCertifCa() {
        return dlDnSubjectCertifCa;
    }

    public void setDlDnSubjectCertifCa(String dlDnSubjectCertifCa) {
        this.dlDnSubjectCertifCa = dlDnSubjectCertifCa;
    }

    public List<CryptoFirCertifCa> getFirCertifCas() {
        return this.firCertifCas;
    }

    public void setFirCertifCas(List<CryptoFirCertifCa> firCertifCas) {
        this.firCertifCas = firCertifCas;
    }

}
