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
@Constraint(validatedBy = DateFormatValidator.class)
@Documented
public @interface DateFormat {

	String message() default "Wrong date format.";
	String format() default  "dd/MM/yyyy";
	

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}