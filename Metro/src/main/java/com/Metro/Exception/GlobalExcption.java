package com.Metro.Exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExcption extends RuntimeException {

	public GlobalExcption(String message) {
		super(message);
	}
}
