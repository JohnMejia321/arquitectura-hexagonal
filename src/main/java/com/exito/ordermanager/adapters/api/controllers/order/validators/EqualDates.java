package com.exito.ordermanager.adapters.api.controllers.order.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { EqualDatesValidator.class })
public @interface EqualDates {

	String message() default "Wrong date format.";
	String fields();

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
