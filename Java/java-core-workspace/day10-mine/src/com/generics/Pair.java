package com.generics;

public class Pair<T, U> {
	private T ref1;
	private U ref2;
	
	public Pair(T ref1, U ref2) {
		this.ref1 = ref1;
		this.ref2 = ref2;
	}
	
	public Pair() {

	}
	
	//getters, setters
	public void setRef1(T ref1) {
		this.ref1 = ref1;
	}
	
	public T getRef1() {
		return ref1;
	}

	public U getRef2() {
		return ref2;
	}

	public void setRef2(U ref2) {
		this.ref2 = ref2;
	}
	
	
}
