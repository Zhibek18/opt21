package opt21.kakimzhanova.except.exception;

public class InfiniteException extends Exception{
	public InfiniteException(){
	}
	public InfiniteException(String message, Throwable exception){
		super(message, exception);
	}
	public InfiniteException(String message){
		super(message);
	}
	public InfiniteException(Throwable exception){
		super(exception);
	}
}