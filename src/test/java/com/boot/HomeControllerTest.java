package com.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boot.controller.HomeController;


public class HomeControllerTest {
	
	@Test
	public void testHomeController() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals("Das Boot ist zehr schon", result);
	}
}
