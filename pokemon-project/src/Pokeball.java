import java.util.ArrayList;

public class Pokeball extends Item{

	//Properties: 
	private Pokemon pokemon;
	private ArrayList<String> colors;
	private Double catchRatio;
	private String name;
	private Boolean hasPokemon;
	
	
	//Constructor (Initializes Default Values)
	public Pokeball() {
		colors.add("Red");
		colors.add("White");
		catchRatio = .65;
		name = "Pokeball";
		hasPokemon = false;
	}
	
	
	public Pokeball(Pokemon pokemon) {
		colors.add("Red");
		colors.add("White");
		catchRatio = .65;
		name = "Pokeball";
		hasPokemon = false;
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
	

	public void checkColors() {
		for(String color : colors) {
			System.out.println(color);
		}
	}
 
	
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
	

	public void retrieve(Pokemon pokemon) {
		if(!this.hasPokemon) {
			this.setPokemon(pokemon);
			this.setHasPokemon(true);
		}else {
			throw new Error("Your pokeball already has a pokemon: " + this.getPokemon().toString());
		}
	}
	

	public void release() {
		if(this.hasPokemon) {
			this.setHasPokemon(false);
			this.setPokemon(null);
		}else {
			throw new Error("Your pokeball doesn't have a pokemon to release, it's currently: " + this.getPokemon());
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
