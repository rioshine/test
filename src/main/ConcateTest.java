package main;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calculator.Calculator;

public class ConcateTest {

	@Test
	public void test() {
		Calculator a = new Calculator();
		int result = a.add(10, 10);
		Assert.assertEquals(20, result);
	}

}
