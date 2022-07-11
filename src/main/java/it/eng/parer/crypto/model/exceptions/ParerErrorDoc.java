package it.eng.parer.crypto.model.exceptions;

import java.io.Serializable;

/**
 * Modello da utilizzare per documentare il messaggio di errore.
 *
 * @author Snidero_L
 */
public class ParerErrorDoc implements Serializable {

    private static final long serialVersionUID = 2311198531475208169L;

    private String link;
    private String code;
    private String summary;
    private String type;
    private String description;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
