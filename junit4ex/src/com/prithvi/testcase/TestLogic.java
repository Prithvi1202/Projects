package com.prithvi.testcase;



import static org.junit.Assert.*;

import org.junit.Test;

import com.prithvi.logic.Calculation;

public class TestLogic {
	@Test
	public void testfindMax(){
		assertEquals(8, Calculation.findMax(new int[]{1,2,4,8,3,4}));
		assertEquals(-1, Calculation.findMax(new int[]{-12,-2,-1,-14}));
	}
}
