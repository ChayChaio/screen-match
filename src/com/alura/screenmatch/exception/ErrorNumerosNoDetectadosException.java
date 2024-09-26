package com.alura.screenmatch.exception;

public class ErrorNumerosNoDetectadosException extends RuntimeException {
    private String mensaje;

    public ErrorNumerosNoDetectadosException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMessage() {
        return this.mensaje;
    }
}
