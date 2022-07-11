package it.eng.parer.crypto.model.verifica.input;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * Classe di comodità per poter passare un documento indicando solamente il percorso su filesystem locale. ATTENZIONE in
 * questo caso server e client devono essere sullo stesso host.
 *
 * @author Snidero_L
 */
public class CryptoDocumentoVersatoExt extends CryptoDocumentoVersato {

    private static final long serialVersionUID = 6492819204616324881L;

    private URI contentAbsolutePath;

    public CryptoDocumentoVersatoExt() {

    }

    public CryptoDocumentoVersatoExt(URI contentAbsolutePath) {
        this.contentAbsolutePath = contentAbsolutePath;
    }

    public CryptoDocumentoVersatoExt setContentAbsolutePath(URI contentAbsolutePath) {
        this.contentAbsolutePath = contentAbsolutePath;
        return this;
    }

    public URI getContentAbsolutePath() {
        return contentAbsolutePath;
    }

    @Override
    public byte[] getContenuto() {
        return readContenuto(contentAbsolutePath);
    }

    private static byte[] readContenuto(URI filePath) {
        Objects.requireNonNull(filePath, "FilePath non può essere vuoto");

        byte[] result = null;
        try {
            result = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException ex) {
            throw new IllegalArgumentException("Errore durante la lettura dell'URI [" + filePath.toASCIIString() + "]",
                    ex);
        }
        return result;
    }

}
