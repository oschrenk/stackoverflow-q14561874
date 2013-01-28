Target = Packages.com.acme.rhino.Target;

function evaluate() {
	var t = Target();
	t.addModifier("foobar", 1);
	return t;
}