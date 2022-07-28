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
	//Retrieve Pokemon
	//Release Pokemon
	
	
	
}
