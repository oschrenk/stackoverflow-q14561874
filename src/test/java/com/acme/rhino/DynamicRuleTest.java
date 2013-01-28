package com.acme.rhino;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.google.common.collect.Maps;

public class DynamicRuleTest {

	private static final String TARGET = "/rule.evaluate.target.js";

	@Test
	public void evaluate() throws IOException {
		final DynamicRule rule = DynamicRule.build(getFile(TARGET));

		final HashMap<String, String> valueMap = Maps
				.<String, String> newHashMap();
		valueMap.put("foo", "true");
		valueMap.put("bar", "false");
		assertEquals(1, rule.evaluate(valueMap).getValue());

		valueMap.put("foo", "false");
		valueMap.put("bar", "true");
		assertEquals(2, rule.evaluate(valueMap).getValue());

		valueMap.put("foo", "false");
		valueMap.put("bar", "false");
		assertEquals(2, rule.evaluate(valueMap).getValue());
	}

	protected File getFile(final String s) {
		return new File(this.getClass().getResource(s).getFile());
	}

}
