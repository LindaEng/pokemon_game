
public class SuperPotion extends Potion {

	public SuperPotion() {
		super();
		this.description = "This item will restore 50 HP when used on a Pokemon";
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	@Override
	public void useItem(Pokemon pokemon) {
		if(pokemon.getHP() > 0 && pokemon.getHP() < pokemon.getMaxHP()) {
			if(pokemon.getHP() + 50 > pokemon.getMaxHP()) {
				pokemon.setHP(pokemon.getMaxHP());
			}else {
				pokemon.setHP(pokemon.getHP() + 50);
			}	
		}
	}
	
	
}
