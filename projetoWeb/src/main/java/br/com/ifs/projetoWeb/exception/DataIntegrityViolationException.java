package br.com.ifs.projetoWeb.exception;

public class DataIntegrityViolationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataIntegrityViolationException(Throwable cause) {
        super(cause);
    }

    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
