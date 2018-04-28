package org.study.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit1 {

	String message = "Robert Miller";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
