package com.exito.ordermanager.adapters.api.controllers.order.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateFormatValidator implements ConstraintValidator<DateFormat, String> {

	private String dateFormat;

	@Override
	public void initialize(DateFormat constraintAnnotation) {
		dateFormat = constraintAnnotation.format();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {	

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormat);
		simpleDateFormat.setLenient(false);
		try {
			simpleDateFormat.parse(value);
		} catch (ParseException | NullPointerException e) {
			return false;
		}
		return true;

	}
}