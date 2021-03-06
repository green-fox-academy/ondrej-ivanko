package com.frontend.app.model;

public class Doubling {

	Integer received;
	Integer result;


	public Doubling(Integer received) {
		this.received = received;
		this.result = doubleIt(received);
	}

	public Integer getReceived() {
		return received;
	}

	public void setReceived(Integer received) {
		this.received = received;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public int doubleIt(int num) {
		return num *2;
	}
}
