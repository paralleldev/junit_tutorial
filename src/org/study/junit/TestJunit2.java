package org.study.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}
