package by.htp.flowers.runner;

import by.htp.flowers.model.Bud;
import by.htp.flowers.model.Flower;
import by.htp.flowers.model.Gardener;

public class Runner {

	public static void main(String[] args) {
		Bud bud = new Bud("small", "green");
		Flower fl = new Flower("Rose");
		Gardener gardener = new Gardener("Mike");
		gardener.informAboutFlower(fl, bud);
		fl.bloom(3, bud);
		gardener.informAboutFlower(fl, bud);
		fl.littleFade(bud);
		gardener.informAboutFlower(fl, bud);
		fl.totalFaid(bud);
		gardener.informAboutFlower(fl, bud);
	}

}
