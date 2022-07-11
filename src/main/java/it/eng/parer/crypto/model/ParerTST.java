package it.eng.parer.crypto.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Snidero_L
 */
public class ParerTST implements Serializable {

    private static final long serialVersionUID = 3859455083214093431L;

    private byte[] encoded;
    private TimeStampInfo timeStampInfo;

    public byte[] getEncoded() {
        return encoded;
    }

    public void setEncoded(byte[] encoded) {
        this.encoded = encoded;
    }

    public TimeStampInfo getTimeStampInfo() {
        return timeStampInfo;
    }

    public void setTimeStampInfo(TimeStampInfo timeStampInfo) {
        this.timeStampInfo = timeStampInfo;
    }

    public TimeStampInfo create() {
        return new TimeStampInfo();
    }

    public class TimeStampInfo implements Serializable {

        private static final long serialVersionUID = -6590203073891307988L;

        private Date genTime;

        public Date getGenTime() {
            return genTime;
        }

        public void setGenTime(Date genTime) {
            this.genTime = genTime;
        }

    }

}
