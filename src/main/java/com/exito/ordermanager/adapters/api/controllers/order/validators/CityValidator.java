package com.exito.ordermanager.adapters.api.controllers.order.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CityValidator implements ConstraintValidator<City, String> {

	List<String> cities = Arrays.asList("Medellin", "Sabaneta", "El Santuario", "Rionegro");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		return cities.contains(value);

	}
}