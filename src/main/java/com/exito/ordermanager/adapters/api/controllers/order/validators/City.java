package com.exito.ordermanager.adapters.api.controllers.order.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CityValidator.class)
@Documented
public @interface City {

	String message() default "City is not allowed.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}