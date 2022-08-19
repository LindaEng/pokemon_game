import java.util.ArrayList;
import java.util.Random;

public class Trainer {
	
	private ArrayList<Pokemon> pokemons;
	private Bag bag;
	private ArrayList<Badge> badges;
	private Integer size;
	private String name;
	
	
	public Trainer() {
		this.pokemons = new ArrayList<Pokemon>();
		this.bag = new Bag();
		this.badges = new ArrayList<Badge>();
		this.size = 0;
		this.name = "";
	}
	
	public Trainer(String name) {
		this.pokemons = new ArrayList<Pokemon>();
		this.bag = new Bag();
		this.badges = new ArrayList<Badge>();
		this.size = 0;
		this.name = name;
	}
	
	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public Bag getBag() {
		return bag;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}

	public ArrayList<Badge> getBadges() {
		return badges;
	}

	public void setBadges(ArrayList<Badge> badges) {
		this.badges = badges;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	
	public Pokemon choosePokemon() {
		Random rand = new Random();
		int upperBound = this.getPokemons().size();
		System.out.println("UPPER BOUND: " + upperBound);
		int int_random = rand.nextInt(upperBound);
		
		return pokemons.get(int_random);
	}
	

	@Override
	public String toString() {
		return "Trainer [pokemons=" + pokemons + ", bag=" + bag + ", badges=" + badges + ", size=" + size
				+ ", getPokemons()=" + getPokemons() + ", getBag()=" + getBag() + ", getBadges()=" + getBadges()
				+ ", getSize()=" + getSize() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
