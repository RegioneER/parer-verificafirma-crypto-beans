package it.eng.parer.crypto.model.verifica.input.validation;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Validatore custom per la Tipologia data di riferimento.
 *
 * @author Snidero_L
 */
@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = DataRiferimentoValidator.class)
@Documented
public @interface DataRiferimento {

    String message() default "Invalid password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
