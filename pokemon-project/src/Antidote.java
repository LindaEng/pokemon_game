
public class Antidote extends Item {
	
	public Antidote() {
		super();
		this.setDescription("Removes Poison Status from your Pokemon");

				
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		if(pokemon.getIsPoisoned()) {
			pokemon.setIsPoisoned(false);
		}else {
			throw new Error("Can only use on pokemon that are poisoned");
		}
	}
	
	
	//Please add the To String Method for this class on your end (I don't have the data I need here)
	
}
