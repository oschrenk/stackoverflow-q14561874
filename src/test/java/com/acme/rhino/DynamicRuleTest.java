package com.acme.rhino;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class DynamicRuleTest {

	private static final String TARGET = "/rule.evaluate.target.js";

	protected File getFile(final String s) {
		return new File(this.getClass().getResource(s).getFile());
	}

	@Test
	public void evaluate() throws IOException {
		final DynamicRule rule = DynamicRule.build(getFile(TARGET));
		assertEquals(3, rule.evaluate().getValue());
	}

}
