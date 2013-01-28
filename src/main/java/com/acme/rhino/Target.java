package com.acme.rhino;

import java.util.LinkedList;
import java.util.List;

import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

public class Target extends ScriptableObject {

	private static final long serialVersionUID = 1L;

	public List<Modifier> modifiers;

	@JSConstructor
	public Target() {
		modifiers = new LinkedList<>();
	}

	@JSFunction
	public void addModifier(final String message, final int value) {
		modifiers.add(new Modifier(message, value));
	}

	public int getValue() {
		int sum = 0;
		for (final Modifier modifier : modifiers) {
			sum += modifier.getValue();
		}
		return sum;
	}

	@Override
	public String getClassName() {
		return "Target";
	}

}
