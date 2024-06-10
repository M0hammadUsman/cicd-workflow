package com.cicdworkflow.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
	
	private final CalculatorService calculatorService = new CalculatorService();
	
	@Test
	void add() {
		var result = calculatorService.add(5, 10);
		assertEquals(15, result, "Add test should pass!");
	}
	
}
