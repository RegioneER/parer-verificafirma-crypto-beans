package it.eng.parer.crypto.model.verifica.input.validation;

import it.eng.parer.crypto.model.CryptoEnums;
import it.eng.parer.crypto.model.verifica.input.TipologiaDataRiferimento;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validatore per la data di riferimento. Le uniche configurazioni possibili sono quelle definite qui:
 * <ul>
 * <li>Verifica alla <b>data di firma</b> vedi {@link TipologiaDataRiferimento#verificaAllaDataDiFirma() }, in cui deve
 * essere specificato {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_FIRMA} e {@link TipologiaDataRiferimento#useSigningDate} deve essere a
 * <em>true</em>;</li>
 * <li>Verifica ad una <b>data specifica</b> vedi {@link TipologiaDataRiferimento#verificaAllaDataSpecifica(long) }, in
 * cui deve essere specificato {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#RIF_TEMP_VERS}, {@link TipologiaDataRiferimento#useSigningDate} deve essere a
 * <em>false</em> e {@link TipologiaDataRiferimento#dataRiferimento } deve essere valorizzato;</li>
 * <li>Verifica alla <b>data di versamento</b> vedi {@link TipologiaDataRiferimento#verificaDataVersamento(long) }, in
 * cui deve essere specificato {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_VERS}, {@link TipologiaDataRiferimento#useSigningDate} deve essere a
 * <em>false</em> e {@link TipologiaDataRiferimento#dataRiferimento } deve essere valorizzato;</li>
 * <li>Verifica <b>predefinita</b> vedi {@link TipologiaDataRiferimento#verificaDefault() }, in cui deve essere
 * specificato {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_VERS} e {@link TipologiaDataRiferimento#useSigningDate} deve essere a
 * <em>false</em>.</li>
 * </ul>
 *
 * @author Snidero_L
 */
public class DataRiferimentoValidator implements ConstraintValidator<DataRiferimento, TipologiaDataRiferimento> {

    @Override
    public boolean isValid(TipologiaDataRiferimento t, ConstraintValidatorContext cvc) {

        if (t == null || t.getReferenceDateType() == null) {
            return false;
        }

        // verifica alla data di firma
        if (CryptoEnums.TipoRifTemporale.DATA_FIRMA.equals(t.getReferenceDateType()) && t.isUseSigningDate()) {
            return true;
        }
        // verifica alla data specifica
        if (CryptoEnums.TipoRifTemporale.RIF_TEMP_VERS.equals(t.getReferenceDateType()) && !t.isUseSigningDate()
                && t.getDataRiferimento() > 0) {
            return true;
        }
        // verifica alla data di versamento
        if (CryptoEnums.TipoRifTemporale.DATA_VERS.equals(t.getReferenceDateType()) && !t.isUseSigningDate()
                && t.getDataRiferimento() > 0) {
            return true;
        }
        // default
        if (CryptoEnums.TipoRifTemporale.DATA_VERS.equals(t.getReferenceDateType()) && !t.isUseSigningDate()) {
            return true;
        }

        return false;
    }
}
