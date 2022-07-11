package it.eng.parer.crypto.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Timestamp token (per generare i TSD)
 * 
 * @author Snidero_L
 */
public class ParerTSD implements Serializable {

    private static final long serialVersionUID = 4787341160336442803L;

    private ParerTST[] timeStampTokens;

    private byte[] encoded;

    public byte[] getEncoded() {
        return encoded;
    }

    public void setEncoded(byte[] encoded) {
        this.encoded = encoded;
    }

    public ParerTST[] getTimeStampTokens() {
        return timeStampTokens;
    }

    public void setTimeStampTokens(ParerTST[] timeStampTokens) {
        this.timeStampTokens = timeStampTokens;
    }

    public void addTimeStampToken(ParerTST timeStampToken) {
        if (timeStampTokens == null) {
            timeStampTokens = new ParerTST[] { timeStampToken };
            return;
        }

        List<ParerTST> asList = Arrays.asList(timeStampTokens);
        asList.add(timeStampToken);
        timeStampTokens = asList.toArray(new ParerTST[] {});
    }

}
