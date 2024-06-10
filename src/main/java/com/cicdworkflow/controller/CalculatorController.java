package com.cicdworkflow.controller;

import com.cicdworkflow.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CalculatorController {
	
	private final CalculatorService calculatorService;
	
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return calculatorService.add(a, b);
	}
	
}
