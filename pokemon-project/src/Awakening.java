
public class Awakening extends Item {
	public Awakening() {
		super();

		this.setDescription("Removes Sleep Status from your Pokemon");			
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		if(pokemon.getIsSleeping()) {
			pokemon.setIsSleeping(false);
		}else {
			throw new Error("Can only use on pokemon that are asleep");
		}
	}
	
	
	//Please add the To String Method for this class on your end (I don't have the data I need here)
}
