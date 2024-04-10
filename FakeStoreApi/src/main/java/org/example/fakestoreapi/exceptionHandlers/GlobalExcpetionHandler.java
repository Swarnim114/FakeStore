package org.example.fakestoreapi.exceptionHandlers;

import org.example.fakestoreapi.dtos.ExceptionsDto;
import org.example.fakestoreapi.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExcpetionHandler {
    @ControllerAdvice
    public class GlobalExceptionHandler {
        @ExceptionHandler(ArithmeticException.class)
        public ResponseEntity<ExceptionsDto> handleArithmeticException() {
            ExceptionsDto dto = new ExceptionsDto();
            dto.setMessage("Umm you have stumbled across an error");
            dto.setSolution("ArithmeticException");
            ResponseEntity<ExceptionsDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
            return response;
        }

        @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
        public ResponseEntity<ExceptionsDto> handleArrayIndexOutOfBoundsException() {
            ExceptionsDto dto = new ExceptionsDto();
            dto.setMessage("Umm you have stumbled across an error");
            dto.setSolution("ArrayIndexOutOfBoundsException");
            ResponseEntity<ExceptionsDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
            return response;
        }


        @ExceptionHandler(ProductNotFoundException.class)
        public ResponseEntity<ExceptionsDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
            ExceptionsDto dto = new ExceptionsDto();
            dto.setMessage("Invalid productId " + productNotFoundException.getId() + " passed");
            dto.setSolution("ProductNotFoundException caught");
            ResponseEntity<ExceptionsDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
            return response;
        }

    }
}
