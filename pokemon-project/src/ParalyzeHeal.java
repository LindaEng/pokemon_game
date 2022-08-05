
public class ParalyzeHeal extends Item {
	
	public ParalyzeHeal() {
		super();
		this.setDescription("Removes Paralysis Status from your Pokemon");
				
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		if(pokemon.getIsParalyzed() == true) {
			pokemon.setIsParalyzed(false);
		}else {
			throw new Error("Can only use on pokemon that are paralyzed");
		}
	}
	
	
	//Please add the To String Method for this class on your end (I don't have the data I need here)
}
