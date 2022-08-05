
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
		if(pokemon.getIsParalyzed()) {
			pokemon.setIsParalyzed(false);
		}else {
			throw new Error("Can only use on pokemon that are paralyzed");
		}
	}

	@Override
	public String toString() {
		return "ParalyzeHeal [getDescription()=" + getDescription() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
		
	//Please add the To String Method for this class on your end (I don't have the data I need here)
	
}
