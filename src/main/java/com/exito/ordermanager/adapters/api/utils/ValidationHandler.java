package com.exito.ordermanager.adapters.api.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = "";
			try {
				fieldName = ((FieldError) error).getField();
			} catch (ClassCastException e) {
				// System.out.println(((org.springframework.validation.ObjectError)
				// error).toString());
				fieldName = "generalErrors";
			}
			String message = error.getDefaultMessage();
			if (!errors.containsKey(fieldName)) {
				errors.put(fieldName, message);
			}

		});
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
}