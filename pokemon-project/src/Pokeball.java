import java.util.ArrayList;

public class Pokeball {
	
	//Properties: 
	private Pokemon pokemon;
	private ArrayList<String> colors;
	private Double catchRatio;
	private String name;
	private Boolean hasPokemon;
	
	//Constructor (Initializes Default Values)
	public Pokeball() {
		this.colors.add("Red");
		this.colors.add("White");
		this.catchRatio = .65;
		this.name = "Pokeball";
		this.hasPokemon = false;
		this.pokemon = null;
	}
	
	//In case the pokemon comes pre-packaged into the pokeball
	public Pokeball(Pokemon pokemon) {
		this.colors.add("Red");
		this.colors.add("White");
		this.catchRatio = .65;
		this.name = "Pokeball";
		this.hasPokemon = false;
		this.pokemon = pokemon;
	}
	
	//Getters and Setters
	public Pokemon getPokemon() {
		return this.pokemon;
	}
	
	public ArrayList<String> getColors(){
		return this.colors;
	}
	
	public double getCatchRatio() {
		return catchRatio;
	}
	
	public String getName() {
		return name;
	}
	
	public Boolean getHasPokemon() {
		return hasPokemon;
	}
	
	// Prints each color as opposed to returning an arraylist of the colors. 
	public void checkColors() {
		for(String color : colors) {
			System.out.println(color);
		}
	}
	// End of Prints each color as opposed to returning an arraylist of the colors. 
	
	public void setCatchRatio(double catchRatio) {
		this.catchRatio = catchRatio;
	}
	
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void setHasPokemon(Boolean hasPokemon) {
		this.hasPokemon = hasPokemon;
	}
	
	// Methods
	//Catch Wild Pokemon
		//In order to catch a pokemon, the pokeball needs to be thrown at a Pokemon
	//A TRAINER THROWS A POKEBALL SO WE WILL WAIT FOR THE TRAINER TO COMPLETE THIS CLASS
//	public void throwPokeball(Trainer trainer) {
//		if(Trainer.hasPokeball()) {
//			Trainer.setNumPokeball(getNumPokeball() - 1);
//		}
//	}
	//Retrieve Pokemon
	public void retrieve(Pokemon pokemon) {
		if(!this.hasPokemon) {
			this.setPokemon(pokemon);
			this.setHasPokemon(true);
		}else {
			throw new Error("Your pokeball already has a pokemon: " + this.getPokemon().toString());
		}
	}
	
	//Release Pokemon
	public void release() {
		if(this.hasPokemon) {
			this.setHasPokemon(false);
			this.setPokemon(null);
		}else {
			throw new Error("Your pokeball doesn't have a pokemon to release, it's currently: " + this.getPokemon());;
		}
	}

	@Override
	public String toString() {
		return "Pokeball [pokemon=" + pokemon + ", colors=" + colors + ", catchRatio=" + catchRatio + ", name=" + name
				+ ", hasPokemon=" + hasPokemon + ", getPokemon()=" + getPokemon() + ", getColors()=" + getColors()
				+ ", getCatchRatio()=" + getCatchRatio() + ", getName()=" + getName() + ", getHasPokemon()="
				+ getHasPokemon() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}
