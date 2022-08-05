
public class Revive extends Item {
	//constructor
	public Revive() {
		super();
		this.setDescription("Revive - brings your pokemon back to life with half hp");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		if(pokemon.getHP() <= 0) {
			pokemon.setHP(pokemon.getMaxHP() / 2);
			System.out.println("Pokemon has been revived!");
		} else { 
			System.out.println("Revive was not effective");
			throw new Error("Can only reivive pokemon that have fainted");
		}
	}

	@Override
	public String toString() {
		return "Revive [getDescription()=" + getDescription() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
		
}
