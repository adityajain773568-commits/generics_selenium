package generics1.demo;

public class App {

	public static void main(String[] args) {

		Aquarium<GoldFish> aquarium = new Aquarium<>(new GoldFish(), new GoldFish());
		GoldFish fish1 = aquarium.getFish1();
		GoldFish fish2 = aquarium.getFish2();
		System.out.println(fish1 + "  " + fish2);
		fish1.swim();
		fish2.swim();
		Aquarium<StarFish> aquarium2 = new Aquarium<>(new StarFish(), new StarFish());
		StarFish starFish1 = aquarium2.getFish1();
		StarFish starFish2 = aquarium2.getFish2();
		System.out.println(starFish1 + "   " + starFish2);
		
//		Aquarium aquarium3 = new Aquarium(new StarFish(), new Shark());
//		StarFish starFish = (StarFish)aquarium2.getFish1();
//		Shark shark1 = (Shark)aquarium2.getFish2();
//		System.out.println(starFish1 + "   " + starFish2);
	}
}
