package it.eng.parer.crypto.model.exceptions;

import java.util.List;

/**
 * Errori gestiti dell'applicazione. Sono classificati nell'enum {@link ExceptionType} e specificati nell'enum
 * {@link ErrorCode}.
 *
 * @author Snidero_L
 */
public interface ParerError {

    /**
     * Ambito dell'eccezione, sostanzialmente uno per <i>service</i> implementato.
     */
    public enum ExceptionType {
        PARAMETER_VALIDATION, GENERIC, NOT_FOUND, CA, CERTIFICATE, CRL, TIME, SIGNATURE_VERIFICATION
    };

    /**
     * Codici di errore specifici che vanno a dettagliare l'{@link ExceptionType}.
     */
    public enum ErrorCode {
        RESOURCE_NOT_FOUND("not-found-exception", ExceptionType.NOT_FOUND), //
        VALIDATION_ERROR("validation-exception", ExceptionType.PARAMETER_VALIDATION), //
        GENERIC_ERROR("unhandled-exception", ExceptionType.GENERIC), //
        CRL_NOT_FOUND("crl-not-found-exception", ExceptionType.NOT_FOUND), //
        CRL_CRYPTO_STORAGE("crl-cryptostorage-exception", ExceptionType.CRL), //
        CRL_EXCEPTION("crl-exception", ExceptionType.CRL), //
        CRL_IO("crl-io-exception", ExceptionType.CRL), //
        TSP_EXCEPTION("tsp-exception", ExceptionType.TIME), //
        TSP_IO("tsp-io-exception", ExceptionType.TIME), //
        TSP_PROVIDER_ERROR("tsp-provider-exception", ExceptionType.TIME), //
        TSD_NOT_FOUND("tsd-not-found-exception", ExceptionType.NOT_FOUND), //
        TSD_PROVIDER_ERROR("tsd-provider-exception", ExceptionType.TIME), //
        CERT_IO("cert-io-exception", ExceptionType.CERTIFICATE), //
        CERT_EXCEPTION("cert-exception", ExceptionType.CERTIFICATE), //
        CERT_PROVIDER_ERROR("cert-provider-exception", ExceptionType.CERTIFICATE), //
        SIGNATURE_VERIFICATION_IO("signature-io-exception", ExceptionType.SIGNATURE_VERIFICATION), //
        SIGNATURE_WRONG_PARAMETER("signature-wrong-parameters", ExceptionType.SIGNATURE_VERIFICATION);

        ErrorCode(String urlFriendly, ExceptionType type) {
            this.urlFriendly = urlFriendly;
            this.type = type;
        }

        private String urlFriendly;
        private ExceptionType type;

        /**
         * Restituisce la versione "web friendly" per il codice di errore.
         *
         * @return la string "web friendly" del codice.
         */
        public String urlFriendly() {
            return urlFriendly;
        }

        public ExceptionType exceptionType() {
            return type;
        }

        /**
         * Restituisce l'{@link ErrorCode} corrispondente alla stringa in input.
         *
         * @param urlFriendly
         *            stringa in input del codice "web friendly".
         * 
         * @return transcodifica di {@link ErrorCode} a partire dalla stringa in input
         * 
         * @throws IllegalArgumentException
         *             nel caso in cui la stringa non sia riconosciuta
         */
        public static ErrorCode fromUrlFriendly(String urlFriendly) {
            for (ErrorCode errorCode : values()) {
                if (errorCode.urlFriendly().equals(urlFriendly)) {
                    return errorCode;
                }
            }
            throw new IllegalArgumentException("Impossibile trovare un codice di errore per la stringa " + urlFriendly);
        }

    };

    public String getMessage();

    public List<String> getDetails();

    public ErrorCode getCode();

    public String getMoreInfo();
}
