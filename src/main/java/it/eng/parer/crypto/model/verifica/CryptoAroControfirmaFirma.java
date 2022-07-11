package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroControFirmaFiglio")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroControfirmaFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idControfirmaFirma;
    private CryptoAroFirmaComp aroFirmaFiglio;
    // private CryptoAroFirmaComp aroFirmaPadre;

    public CryptoAroControfirmaFirma() {
    }

    // public long getIdControfirmaFirma() {
    // return this.idControfirmaFirma;
    // }
    //
    // public void setIdControfirmaFirma(long idControfirmaFirma) {
    // this.idControfirmaFirma = idControfirmaFirma;
    // }
    public CryptoAroFirmaComp getAroFirmaFiglio() {
        return this.aroFirmaFiglio;
    }

    public void setAroFirmaFiglio(CryptoAroFirmaComp aroFirmaFiglio) {
        this.aroFirmaFiglio = aroFirmaFiglio;
    }

    // public CryptoAroFirmaComp getAroFirmaPadre() {
    // return this.aroFirmaPadre;
    // }
    //
    // public void setAroFirmaPadre(CryptoAroFirmaComp aroFirmaPadre) {
    // this.aroFirmaPadre = aroFirmaPadre;
    // }
}
