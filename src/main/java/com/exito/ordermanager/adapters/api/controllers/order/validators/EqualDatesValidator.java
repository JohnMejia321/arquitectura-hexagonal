package com.exito.ordermanager.adapters.api.controllers.order.validators;

import java.util.stream.Stream;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.expression.spel.standard.SpelExpressionParser;


//TODO Simpler way to do it http://dolszewski.com/java/multiple-field-validation/
public class EqualDatesValidator implements ConstraintValidator<EqualDates, Object> {
	private static final SpelExpressionParser PARSER = new SpelExpressionParser();
	private String fieldsString;

	@Override
	public void initialize(EqualDates constraintAnnotation) {
		fieldsString = constraintAnnotation.fields();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		String[] dateFields = fieldsString.split(",");
		String firstDate = (String) PARSER.parseExpression(dateFields[0]).getValue(value);
		try {
			long equalDates = Stream.of(dateFields).map(date -> PARSER.parseExpression(date).getValue(value))
					.filter(date -> date.equals(firstDate)).count();
			return equalDates == dateFields.length;
		} catch (NullPointerException e) {
			return false;
		}
	}
}
