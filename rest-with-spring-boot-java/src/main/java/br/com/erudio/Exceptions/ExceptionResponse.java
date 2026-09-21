package br.com.erudio.Exceptions;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message , String details) {

}
