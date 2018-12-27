package com.bbp;

import java.util.concurrent.*;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Truck truck = new Truck();
		Car car = new Car();

		System.out.println(truck.getModel());
		System.out.println(car.getModel());
	}
}