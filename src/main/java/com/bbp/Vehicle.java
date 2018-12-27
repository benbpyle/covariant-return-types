package com.bbp;

public abstract class Vehicle {
	abstract Fuel getFuel();

	String getModel() {
		return String.format("I'm a %s and I use %s", this.getClass(), getFuel().getClass());
	}
}
