package com.curso.v8;

public class Division extends OperacionAbs {
	
	int x;
	int y;
	
	public Division(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x/y;
	}

	@Override
	public String toString() {
		return "Division [x=" + x + ", y=" + y + "]";
	}
}
