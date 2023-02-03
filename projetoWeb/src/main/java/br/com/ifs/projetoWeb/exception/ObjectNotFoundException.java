package br.com.ifs.projetoWeb.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(Throwable cause) {
        super(cause);
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }
}

