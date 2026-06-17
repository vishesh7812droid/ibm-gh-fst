package gameActivity;

public class IncorrectInputException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public IncorrectInputException(String e) {
		this.message= e;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}