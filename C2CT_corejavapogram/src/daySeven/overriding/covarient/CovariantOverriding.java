package daySeven.overriding.covarient;
class Color {
	protected Color getColor() {
		return new Color();
	}
}

// Subclass with covariant return
class Red extends Color {
	@Override
	public Red getColor() {
		return new Red();
	}
}

public class CovariantOverriding {
	public static void main(String[] args) {
		Color c1 = new Color();
		Color c2 = c1.getColor();
		System.out.println("Color: " + c2);

		Red r1 = new Red();
		Red r2 = r1.getColor();
		System.out.println("Red: " + r2);
	}
}