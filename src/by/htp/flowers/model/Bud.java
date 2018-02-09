package by.htp.flowers.model;

public class Bud {
	public String size;
	public String color;
	public Petal[] petal;

	public Bud(String size, String color) {
		this.size = size;
		this.color = color;
	}

	public void growPetals(int petalCount) {
		this.size = "large";
		if (petalCount > 0) {
			petal = new Petal[petalCount];
			for (int i = 0; i < petalCount; i++) {
				petal[i] = new Petal(4, "oval", "white");
			}
		}
	}

	public void losePetals() {
		this.size = "small";
		this.color = "black";
		for (int i = 0; i < this.petal.length; i++) {
			if (this.petal[i] != null) {
				this.petal[i] = null;
			}
		}
	}

	public void loseSomePetals() {
		this.size = "medium";
		this.color = "brown";
		changePetalsColor("orange");
		for (int i = 0; i < this.petal.length; i += 3) {
			this.petal[i] = null;
		}
	}

	public void changePetalsColor(String color) {
		for (int i = 0; i < this.petal.length; i++) {
			if (petal[i] != null) {
				this.petal[i].color = color;
			}
		}
	}
}
