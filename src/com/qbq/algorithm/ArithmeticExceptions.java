/**
 * 
 */
package com.qbq.algorithm;

/**
 * @author Administrator
 *
 */
public class ArithmeticExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -676072712906881444L;

	/**
	 * 
	 */
	public ArithmeticExceptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ArithmeticExceptions(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ArithmeticExceptions(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
		System.out.println(cause.getCause());
	}

	/**
	 * @param message
	 */
	public ArithmeticExceptions(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ArithmeticExceptions(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
