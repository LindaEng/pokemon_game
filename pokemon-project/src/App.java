import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class App {
	public static void main(String[] args) {

		//create a pokemon
//		Pokemon testPokemon = new Pokemon();
//		Tackle testTackle = new Tackle();
//		Absorb testAbsorb = new Absorb();
//		FireSpin testFireSpin = new FireSpin();
//		
//		//set moves
//		testPokemon.setMove(testTackle);
//		testPokemon.setMove(testAbsorb);
//		testPokemon.setMove(testFireSpin);
//		
//		//try out the getters + setters
//		testPokemon.getMoveSet();
//		System.out.println(testPokemon.getMove(testFireSpin).getName());
		
		//testing Arena
		Trainer elvis = new Trainer("Elvis");
		Trainer linda = new Trainer("Linda");		
		Trainer trainer3 = new Trainer("Betsy");
		Trainer trainer4 = new Trainer("Dan");
		
		//creating pokemons - 
		Pokemon charmander = new Pokemon("charmander");
		Pokemon pikachu = new Pokemon("pikachu");
		Pokemon ditto = new Pokemon("ditto");
		Pokemon mewtwo = new Pokemon("mewtwo");
		Pokemon machamp = new Pokemon("machamp");
		Pokemon bulbasaur = new Pokemon("bulbasaur");
		Pokemon nidoking = new Pokemon("Nidoking");
		Pokemon gengar = new Pokemon("Gengar");
		Pokemon alakazam = new Pokemon("Alakazam");
		Pokemon skeptile = new Pokemon("Skeptile");
		Pokemon empoleon = new Pokemon("Empoleon");
		Pokemon greninja = new Pokemon("Greninja");
		
		ArrayList<Pokemon> elvisMons = new ArrayList<>();
		ArrayList<Pokemon> lindaMons = new ArrayList<>();
		
		elvisMons.add(greninja);
		elvisMons.add(gengar);
		elvisMons.add(nidoking);
		elvisMons.add(skeptile);
		elvisMons.add(empoleon);
		elvisMons.add(alakazam);
		
		lindaMons.add(charmander);
		lindaMons.add(pikachu);
		lindaMons.add(ditto);
		lindaMons.add(mewtwo);
		lindaMons.add(machamp);
		lindaMons.add(bulbasaur);
		
		elvis.setPokemons(elvisMons);
		linda.setPokemons(lindaMons);
		
		Tackle testTackle = new Tackle();
		Absorb testAbsorb = new Absorb();
		FireSpin testFireSpin = new FireSpin();
		
		for (Iterator iterator = lindaMons.iterator(); iterator.hasNext();) {
			Pokemon pokemon = (Pokemon) iterator.next();
			Random rand = new Random();
			Integer upperBound = 60;
			Integer lowerBound = 30;
			Integer difference = upperBound - lowerBound + 1;
			Integer randomDiff = rand.nextInt() % difference;
			Integer randomNum = lowerBound + randomDiff;
			
			pokemon.setHP(randomNum);
			pokemon.setDefense(randomNum);
			
			pokemon.setMove(testTackle);
			pokemon.setMove(testAbsorb);
			pokemon.setMove(testFireSpin);
			
			
		}
		
		for (Iterator iterator = elvisMons.iterator(); iterator.hasNext();) {
			Pokemon pokemon = (Pokemon) iterator.next();
			Random rand = new Random();
			Integer upperBound = 60;
			Integer lowerBound = 30;
			Integer difference = upperBound - lowerBound + 1;
			Integer randomDiff = rand.nextInt() % difference;
			Integer randomNum = lowerBound + randomDiff;
			
			pokemon.setHP(randomNum);
			pokemon.setDefense(randomNum);
			
			pokemon.setMove(testTackle);
			pokemon.setMove(testAbsorb);
			pokemon.setMove(testFireSpin);
		}
		
//		System.out.println(linda.getPokemons());
//		for (Iterator iterator = lindaMons.iterator(); iterator.hasNext();) {
//			Pokemon pokemon = (Pokemon) iterator.next();
//			System.out.println(pokemon.getName());
//		}
		
		
		
		Arena battleArena = new Arena(elvis, linda);
		
		
		battleArena.battle();
		
		
		
		
		
	}
}
