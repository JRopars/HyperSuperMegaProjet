package fr.proxybanque.tools;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import fr.proxybanque.model.Client;

public class ClientValidator implements Validator {

	/**
	 * validation de l'instance de l'objet Client
	 */
	public boolean supports(Class<?> clazz) {
		
		return Client.class.isAssignableFrom(clazz);
		
	}

	/**
	 * implémentation de la logique de validation
	 */
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nom", "This field is required !");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prenom", "This field is required !");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "adresse", "This field is required !");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codeP", "This field is required !");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ville", "This field is required !");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephone", "This field is required !");
	
	}

}
