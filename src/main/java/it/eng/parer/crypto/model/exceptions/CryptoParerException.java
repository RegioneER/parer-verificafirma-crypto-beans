package it.eng.parer.crypto.model.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Snidero_L
 */
public class CryptoParerException extends RuntimeException implements ParerError {

    private static final long serialVersionUID = 4519678514935682591L;

    private String message;

    private List<String> details = new ArrayList<String>();

    private ErrorCode code = ErrorCode.GENERIC_ERROR;

    private String moreInfo;

    // Costrutture a 0 parametri altrimenti come deserializzo?
    public CryptoParerException() {

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public List<String> getDetails() {
        return details;
    }

    public void addDetail(String detail) {
        if (details == null) {
            details = new ArrayList<>();
        }
        details.add(detail);
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    @Override
    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

    @Override
    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public CryptoParerException withMoreInfo(String moreInfo) {
        setMoreInfo(moreInfo);
        return this;
    }

    public CryptoParerException withCode(ErrorCode code) {
        setCode(code);
        return this;
    }

    public CryptoParerException withMessage(String message) {
        setMessage(message);
        return this;
    }

    public CryptoParerException withDetail(String message) {
        addDetail(message);
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "message=" + message + " - details="
                + details.stream().map(Object::toString).collect(Collectors.joining(",")) + " - code=" + code
                + " - moreInfo=" + moreInfo;
    }

}
