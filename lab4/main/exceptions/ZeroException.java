package main.exceptions;

public class ZeroException extends RuntimeException {
	public ZeroException() {
		super("Нельзя же так детей пугать! Они не умеют делить на 0!");
	}
}
