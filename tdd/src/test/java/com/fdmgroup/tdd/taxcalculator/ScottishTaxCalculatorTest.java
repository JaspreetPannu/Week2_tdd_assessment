package com.fdmgroup.tdd.taxcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScottishTaxCalculatorTest {
	
	@Test
	
	public void test_ReturnTax0ForIncome10000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 10000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(0, result, 0.00);
	}
	
	
	
	@Test
	public void test_ReturnTax19ForIncome12000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 12000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(19, result, 0.00);
	}
	
	@Test
	public void test_ReturnTax20ForIncome20000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 20000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(20, result, 0.00);
	}
	
	@Test
	public void test_ReturnTax21ForIncome40000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 40000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(21, result, 0.00);
	}
	
	@Test
	public void test_ReturnTax41ForIncome100000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 100000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(41, result, 0.00);
	}
	
	@Test
	public void test_ReturnTax46ForIncome200000(){
		
		TaxCalculationService scotishCalculator = new ScottishTaxCalculator();
		double income = 200000.05;
		double result = scotishCalculator.getTaxRate(income);
		assertEquals(46, result, 0.00);
	}
	
}
	


