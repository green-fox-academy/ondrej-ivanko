package aircraftcarrrier;

public class Main {
	public static void main(String[] args) {

		Aircraft fighter1 = new F35();
		Aircraft fighter2 = new F35();
		Aircraft fighter3 = new F35();
		Aircraft fighter4 = new F16();
		Aircraft fighter5 = new F16();

		Aircraft fighter6 = new F16();
		Aircraft fighter7 = new F16();
		Aircraft fighter8 = new F35();
		Aircraft fighter9 = new F16();
		Aircraft fighter10 = new F16();

		Carrier yamamotoBattlecruiser = new Carrier(250, 4500);
		Carrier ussFranklin = new Carrier(200, 6000);

		yamamotoBattlecruiser.add(fighter1);
		yamamotoBattlecruiser.add(fighter2);
		yamamotoBattlecruiser.add(fighter3);
		yamamotoBattlecruiser.add(fighter4);
		yamamotoBattlecruiser.add(fighter5);

		ussFranklin.add(fighter6);
		ussFranklin.add(fighter7);
		ussFranklin.add(fighter8);
		ussFranklin.add(fighter9);
		ussFranklin.add(fighter10);


		yamamotoBattlecruiser.fill();
		ussFranklin.fill();

		System.out.println("1 ==========================");

		yamamotoBattlecruiser.fight(ussFranklin);

		yamamotoBattlecruiser.fill();

		yamamotoBattlecruiser.getStatus();

		System.out.println("2 ==========================");

		ussFranklin.fight(yamamotoBattlecruiser);

		ussFranklin.fill();

		ussFranklin.getStatus();

		System.out.println("3 ==========================");

		yamamotoBattlecruiser.fight(ussFranklin);

		yamamotoBattlecruiser.fill();

		yamamotoBattlecruiser.getStatus();

		System.out.println("4 ==========================");

		ussFranklin.fight(yamamotoBattlecruiser);

		ussFranklin.fill();

		ussFranklin.getStatus();

		System.out.println("5 ==========================");

		yamamotoBattlecruiser.fight(ussFranklin);

		yamamotoBattlecruiser.fill();

		yamamotoBattlecruiser.getStatus();

		System.out.println("6 ==========================");

		ussFranklin.fight(yamamotoBattlecruiser);
	}
}
