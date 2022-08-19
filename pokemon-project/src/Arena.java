import java.util.ArrayList;
import java.util.Random;

public class Arena implements Battle {
	private ArrayList<Trainer> trainers = new ArrayList<Trainer>();
	private ArrayList<Pokemon> ActivePokemons = new ArrayList<Pokemon>(); 
	
	public Arena() {
		
	}
	
	public Arena(Trainer trainer1, Trainer trainer2) {
		this.trainers.add(trainer1);
		this.trainers.add(trainer2);
	}

	public ArrayList<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(ArrayList<Trainer> trainers) {
		this.trainers = trainers;
	}

	public ArrayList<Pokemon> getActivePokemons() {
		return ActivePokemons;
	}

	public void setActivePokemons(ArrayList<Pokemon> activePokemons) {
		ActivePokemons = activePokemons;
	}
	
	
	public void battle() {
		
		System.out.println("Battle is starting");
		Trainer firstTrainer = firstTurn();
		Integer firstTrainerIdx = this.trainers.indexOf(firstTrainer);
		Integer secondTrainerIdx = ((firstTrainerIdx == 0) ? 1 :  0);
		Trainer secondTrainer = this.trainers.get(secondTrainerIdx);
		
		System.out.println("This is the first trainer: " + firstTrainer.getName());
		System.out.println("This is the Second trainer: " + secondTrainer.getName());
		
		
		Pokemon firstPokemon = firstTrainer.choosePokemon();
		Pokemon secondPokemon = secondTrainer.choosePokemon();
		
		System.out.println("First pokemon name: " + firstPokemon.getName());
		System.out.println("Second pokemon name: " + secondPokemon.getName());
		
		
		//refactor idea - battle configuration ^^ move this logic to another function
		while(firstPokemon.getHP() >= 0  && secondPokemon.getHP() >= 0) {
			// We want the first Poekmon move
			Move firstPokemonMove = firstPokemon.getMove();
			System.out.println(firstPokemon.getName() + " used " + firstPokemonMove.getName());
			firstPokemon.useMove(firstPokemonMove, secondPokemon);
			
			Move secondPokemonMove = secondPokemon.getMove();
			System.out.println(secondPokemon.getName() + " used " + secondPokemonMove.getName());
			secondPokemon.useMove(secondPokemonMove, firstPokemon);
			
		}
		if(firstPokemon.getHP() <= 0) {
			System.out.println("Winner is " + secondTrainer.getName() + " and " + secondPokemon.getName());
		} 
		if(secondPokemon.getHP() <= 0) {
			System.out.println("Winner is " + firstTrainer.getName() + " and " + firstPokemon.getName());
		} 
		
		
	}
	
	public Trainer firstTurn() {
		Random rand = new Random();
		int upperBound = 2;
		int int_random = rand.nextInt(upperBound);
		
		return trainers.get(int_random);
	}
	


	@Override
	public String toString() {
		return "Arena [trainers=" + trainers + ", ActivePokemons=" + ActivePokemons + ", getTrainers()=" + getTrainers()
				+ ", getActivePokemons()=" + getActivePokemons() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
