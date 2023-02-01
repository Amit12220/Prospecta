package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EntryException.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(EntryException e,WebRequest w)
	{
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		
		err.setMessage(e.getMessage());
		err.setDetails(w.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> mainexceptionHandler(Exception e,WebRequest w)
	{
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		
		err.setMessage(e.getMessage());
		err.setDetails(w.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.NOT_FOUND);
	}

}
