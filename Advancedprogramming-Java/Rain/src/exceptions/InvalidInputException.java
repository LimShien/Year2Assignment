package exceptions;

public class InvalidInputException extends Exception {

	/**
	 * this exception is thrown when a invalid value is being entered 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}


}
