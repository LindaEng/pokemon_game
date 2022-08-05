
public class Potion extends Item {
	
	//constructor
	public Potion() {
		super();
		this.setDescription("Potion - HEALS 20 HP");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		pokemon.setHP(pokemon.getHP() + 20);
	}

	@Override
	public String toString() {
		return "Potion [getDescription()=" + getDescription() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}


