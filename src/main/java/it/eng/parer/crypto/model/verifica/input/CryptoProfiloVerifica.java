package it.eng.parer.crypto.model.verifica.input;

import java.io.Serializable;

/**
 * Profilo di verifica: Configurando questo è oggetto è possibile applicare dei "bypass" alla verifica delle firme.
 * Attualemente i controlli che possono essere saltati sono:
 * <ul>
 * <li>controllo crittografico</li>
 * <li>controllo catena trusted</li>
 * <li>controllo certificato</li>
 * <li>controllo CRL</li>
 * </ul>
 *
 * @author Snidero_L
 */
public class CryptoProfiloVerifica implements Serializable {

    private static final long serialVersionUID = -1338399317911956692L;

    private boolean controlloCrittograficoAbilitato = true;
    private boolean controlloCatenaTrustAbilitato = true;
    private boolean controlloCertificatoAbilitato = true;
    private boolean controlloCrlAbilitato = true;

    public static CryptoProfiloVerifica profiloDefault() {
        return new CryptoProfiloVerifica();
    }

    public boolean isControlloCrittograficoAbilitato() {
        return controlloCrittograficoAbilitato;
    }

    public CryptoProfiloVerifica setControlloCrittograficoAbilitato(boolean controlloCrittograficoAbilitato) {
        this.controlloCrittograficoAbilitato = controlloCrittograficoAbilitato;
        return this;
    }

    public boolean isControlloCatenaTrustAbilitato() {
        return controlloCatenaTrustAbilitato;
    }

    public CryptoProfiloVerifica setControlloCatenaTrustAbilitato(boolean controlloCatenaTrustAbilitato) {
        this.controlloCatenaTrustAbilitato = controlloCatenaTrustAbilitato;
        return this;
    }

    public boolean isControlloCertificatoAbilitato() {
        return controlloCertificatoAbilitato;
    }

    public CryptoProfiloVerifica setControlloCertificatoAbilitato(boolean controlloCertificatoAbilitato) {
        this.controlloCertificatoAbilitato = controlloCertificatoAbilitato;
        return this;
    }

    public boolean isControlloCrlAbilitato() {
        return controlloCrlAbilitato;
    }

    public CryptoProfiloVerifica setControlloCrlAbilitato(boolean controlloCrlAbilitato) {
        this.controlloCrlAbilitato = controlloCrlAbilitato;
        return this;
    }

    @Override
    public String toString() {
        return "CryptoProfiloVerifica{" + "controlloCrittograficoAbilitato=" + controlloCrittograficoAbilitato
                + ", controlloCatenaTrustAbilitato=" + controlloCatenaTrustAbilitato
                + ", controlloCertificatoAbilitato=" + controlloCertificatoAbilitato + ", controlloCrlAbilitato="
                + controlloCrlAbilitato + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.controlloCrittograficoAbilitato ? 1 : 0);
        hash = 89 * hash + (this.controlloCatenaTrustAbilitato ? 1 : 0);
        hash = 89 * hash + (this.controlloCertificatoAbilitato ? 1 : 0);
        hash = 89 * hash + (this.controlloCrlAbilitato ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CryptoProfiloVerifica other = (CryptoProfiloVerifica) obj;
        if (this.controlloCrittograficoAbilitato != other.controlloCrittograficoAbilitato) {
            return false;
        }
        if (this.controlloCatenaTrustAbilitato != other.controlloCatenaTrustAbilitato) {
            return false;
        }
        if (this.controlloCertificatoAbilitato != other.controlloCertificatoAbilitato) {
            return false;
        }
        if (this.controlloCrlAbilitato != other.controlloCrlAbilitato) {
            return false;
        }
        return true;
    }

}
