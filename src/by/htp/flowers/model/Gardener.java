package by.htp.flowers.model;

public class Gardener {
	public String name;

	public Gardener(String name) {
		this.name = name;
	}

	public void informAboutFlower(Flower flower, Bud bud) {
		if (flower != null) {
			System.out.println("Flower title: " + flower.title);
			System.out.println("Bud color: " + bud.color);
			System.out.println("Bud size: " + bud.size);

			if (bud.petal != null) {
				petalInfo(bud.petal, flower);
			}
		}
	}

	public void petalInfo(Petal[] petals, Flower fl) {
		System.out.println("Flower petal: " + fl.getPetalsCount(petals));
		System.out.println("=====Info about petals=====");

		for (Petal pt : petals) {
			if (pt != null) {
				System.out.println("petal size: " + pt.size);
				System.out.println("petal shape: " + pt.shape);
				System.out.println("petal color: " + pt.color);
				System.out.println("________________________");
			}
		}
	}
}
