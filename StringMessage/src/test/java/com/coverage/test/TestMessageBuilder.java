package com.coverage.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coverage.demo.MessageBuilder;

public class TestMessageBuilder {

	@Test
	public void testNameMkyong() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Hello Venkat", obj.getMessage("Venkat"));

	}

	@Test
	public void testNameEmpty() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Please provide a name!", obj.getMessage(" "));

	}

	@Test
	public void testNameNull() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Please provide a name!", obj.getMessage(null));

	}

}
