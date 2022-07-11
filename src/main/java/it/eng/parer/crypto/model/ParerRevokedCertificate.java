package it.eng.parer.crypto.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Snidero_L
 */
public class ParerRevokedCertificate implements Serializable {

    private static final long serialVersionUID = -6359738353141877449L;

    private BigInteger serialNumber;
    private Date revocationDate;

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getRevocationDate() {
        return revocationDate;
    }

    public void setRevocationDate(Date revocationDate) {
        this.revocationDate = revocationDate;
    }

}
