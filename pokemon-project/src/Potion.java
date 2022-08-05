
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

	public static void main(String[] args) {
		Potion testPotion = new Potion();
		Revive testRevive = new Revive();
		Pokemon test1Pokemon = new Pokemon();
		test1Pokemon.setHP(20);
		test1Pokemon.setMaxHP(50);
		
		testRevive.useItem(test1Pokemon);
		
		System.out.println(test1Pokemon.getHP());
		
		System.out.println(testRevive.getDescription());
	}
}


