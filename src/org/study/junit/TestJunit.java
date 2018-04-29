package org.study.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {

	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		Assert.assertEquals("Junit is working fine", str);
	}
}
