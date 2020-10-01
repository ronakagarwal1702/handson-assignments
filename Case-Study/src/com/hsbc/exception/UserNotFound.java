package com.hsbc.exception;

public class UserNotFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserNotFound()
	{
		super("User not found");
	}
	public UserNotFound(String msg)
	{
		super(msg);
	}

}
