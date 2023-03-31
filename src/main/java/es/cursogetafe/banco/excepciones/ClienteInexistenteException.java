package es.cursogetafe.banco.excepciones;

@SuppressWarnings("serial")
public class ClienteInexistenteException extends RuntimeException {

	public ClienteInexistenteException() {
		// TODO Auto-generated constructor stub
	}

	public ClienteInexistenteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ClienteInexistenteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ClienteInexistenteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ClienteInexistenteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
