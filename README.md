# README #

This is project that tries to be a minimal amount of code to show my problems with the following stack trace

	org.mozilla.javascript.EcmaError: TypeError: Cannot find default value for object.
	at org.mozilla.javascript.ScriptRuntime.constructError(ScriptRuntime.java:3687)
	at org.mozilla.javascript.ScriptRuntime.constructError(ScriptRuntime.java:3665)
	at org.mozilla.javascript.ScriptRuntime.typeError(ScriptRuntime.java:3693)
	at org.mozilla.javascript.ScriptRuntime.typeError1(ScriptRuntime.java:3705)
	at org.mozilla.javascript.ScriptableObject.getDefaultValue(ScriptableObject.java:976)
	at org.mozilla.javascript.ScriptableObject.getDefaultValue(ScriptableObject.java:895)
	at org.mozilla.javascript.ScriptRuntime.toString(ScriptRuntime.java:761)
	at org.mozilla.javascript.ScriptRuntime.notFunctionError(ScriptRuntime.java:3774)
	at org.mozilla.javascript.ScriptRuntime.getPropFunctionAndThisHelper(ScriptRuntime.java:2269)
	at org.mozilla.javascript.ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.java:2251)
	at org.mozilla.javascript.optimizer.OptRuntime.callProp0(OptRuntime.java:83)
	at org.mozilla.javascript.gen.script_5._c_evaluate_1(script:6)
	at org.mozilla.javascript.gen.script_5.call(script)
	at org.mozilla.javascript.ContextFactory.doTopCall(ContextFactory.java:394)
	at org.mozilla.javascript.ScriptRuntime.doTopCall(ScriptRuntime.java:3091)
	at org.mozilla.javascript.gen.script_5.call(script)

I get when trying to call a `@JSFunction` annotated function from within JavaScript.