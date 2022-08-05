
public class App {
	public static void main(String[] args) {

		//create a pokemon
		Pokemon testPokemon = new Pokemon();
		Tackle testTackle = new Tackle();
		Absorb testAbsorb = new Absorb();
		FireSpin testFireSpin = new FireSpin();
		
		//set moves
		testPokemon.setMove(testTackle);
		testPokemon.setMove(testAbsorb);
		testPokemon.setMove(testFireSpin);
		
		//try out the getters + setters
		testPokemon.getMoveSet();
		System.out.println(testPokemon.getMove(testFireSpin).getName());
	}
}
