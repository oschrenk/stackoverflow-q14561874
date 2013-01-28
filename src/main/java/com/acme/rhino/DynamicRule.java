package com.acme.rhino;

import java.io.File;
import java.io.IOException;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptableObject;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class DynamicRule {

	private final ScriptableObject scope;
	private final Context context;

	public static DynamicRule build(final String script) {

		final Context context = Context.enter();
		try {
			final ScriptableObject scope = context.initStandardObjects();
			context.evaluateString(scope, script, "script", 1, null);
			return new DynamicRule(context, scope);

		} finally {
			Context.exit();
		}

	}

	public static DynamicRule build(final File file) throws IOException {
		return build(Files.toString(file, Charsets.UTF_8));
	}

	protected DynamicRule(final Context context, final ScriptableObject scope) {
		this.context = context;
		this.scope = scope;
	}

	public Target evaluate() {
		final Function evaluate = (Function) scope.get("evaluate", scope);
		return (Target) Context.jsToJava(evaluate.call(context, scope, scope,
				new Object[] {}), Target.class);
	}
}
