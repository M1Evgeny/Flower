package by.htp.flowers.model;

public class Flower {
	public String title;
	public Petal[] petal;

	public Flower() {
	}

	public Flower(String title) {
		this.title = title;

	}

	public void bloom(int petalCount, Bud bud) {
		bud.growPetals(petalCount);
	}

	public void littleFade(Bud bud) {
		bud.loseSomePetals();
	}

	public void totalFaid(Bud bud) {
		bud.losePetals();
	}

	public int getPetalsCount(Petal[] petals) {
		int count = 0;
		for (Petal petal : petals) {
			if (petal != null) {
				count++;
			}
		}
		return count;
	}
}
