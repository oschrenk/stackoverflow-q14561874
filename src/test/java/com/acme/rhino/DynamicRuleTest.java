package com.acme.rhino;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class DynamicRuleTest {

	@Test
	public void evaluate() throws IOException {
		final File file = new File(this.getClass()
				.getResource("/rule.evaluate.target.js").getFile());
		final DynamicRule rule = DynamicRule.build(file);

		assertEquals(1, rule.evaluate().getValue());
	}

}
