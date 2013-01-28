Target = Packages.com.acme.rhino.Target;

function evaluate() {
	var t = Target();
	t.addModifier("foo", 1);
	t.addModifier("bar", 2);
		
	return t;
}