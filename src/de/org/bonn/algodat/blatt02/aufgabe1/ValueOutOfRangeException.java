package de.org.bonn.algodat.blatt02.aufgabe1;

public class ValueOutOfRangeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValueOutOfRangeException() {
		super();
	}

	public ValueOutOfRangeException(String text){
		super(text);
	}
}
