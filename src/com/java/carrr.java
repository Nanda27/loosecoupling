package com.java;

public class carrr {
private String[] carnames;
private enginee[] engines;
public String[] getCarnames() {
	return carnames;
}
public void setCarnames(String[] carnames) {
	this.carnames = carnames;
}
public enginee[] getEngines() {
	return engines;
}
public void setEngines(enginee[] engines) {
	this.engines = engines;
}
public void displaycarnames() {
	for(String s:carnames) {
		System.out.println(s);
	}
	
		}
public void displayenginenames() {
	for(enginee e:engines) {
		System.out.println(e.getModelyear());

	}
}
}
