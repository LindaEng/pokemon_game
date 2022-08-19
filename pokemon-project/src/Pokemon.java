import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

public class Pokemon {

	private String name;
	private Integer HP;
	private Integer experience;
	private Integer attack;
	private Integer defense;
	private Integer speed;
	private Integer accuracy;
	private Integer specialAttack;
	private Integer specialDefense;
	private ArrayList<Move> moveSet = new ArrayList<Move>();
	private String ability;
	private Integer level;
	private String[] type;
	private Boolean isWild;
	private Integer maxHP;
	private Boolean isPoisoned;
	private Boolean isSleeping;
	private Boolean isParalyzed;
	
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAccuracy() {
		return accuracy;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public Integer getDefense() {
		return defense;
	}
	
	public Integer getExperience() {
		return experience;
	}
	
	public Integer getHP() {
		return HP;
	}
	
	public ArrayList<Move> getMoveSet() {
		return moveSet;
	}
	
//	public Move getMove(Move move) {
//		return moveSet.get(moveSet.indexOf(move));	
//	}
	
	public Move getMove() {
		Random rand = new Random();
		Integer upperLimit = this.moveSet.size();
		Integer randIdx = rand.nextInt(upperLimit);
		return this.moveSet.get(randIdx);
	}
	
	public Integer getSpecialAttack() {
		return specialAttack;
	}
	
	public Integer getSpecialDefense() {
		return specialDefense;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public Boolean getIsWild() {
		return isWild;
	}
	
	public Integer getMaxHP() {
		return maxHP;
	}
	
	public Boolean getIsPoisoned() {
		return isPoisoned;
	}
	
	public Boolean getIsSleeping() {
		return isSleeping;
	}
	
	public Boolean hasMove(Move move) {
		for(Move m : moveSet ) {
			if(m.getName() == move.getName()) {
				return true;
			}
		}
		return false;
	}

	
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}
	
	public void setIsWild(Boolean isWild) {
		this.isWild = isWild;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	
	public void setHP(Integer hP) {
		HP = hP;
	}
	
	public void setMove(Move move) {
//		if(this.moveSet.size() > 4) {
//			throw new Error("Cannot add more moves. Maximum moves is 4");
//		} else {
//			this.moveSet.add(move);
//			System.out.println(move.getName() + " has been added!");
//		}
		this.moveSet.add(move);
		System.out.println(move.getName() + " has been added!");
	}
	
	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}
	
	public void setSpecialDefense(Integer specialDefense) {
		this.specialDefense = specialDefense;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public void setIsParalyzed(Boolean isParalyzed) {
		this.isParalyzed = isParalyzed;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}
	
	public String getAbility() {
		return ability;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setType(String[] type) {
		this.type = type;
	}
	
	public String[] getType() {
		return type;
	}
	
	public void setMaxHP(Integer maxHP) {
		this.maxHP = maxHP;
	}

	public void setIsPoisoned(Boolean isPoisoned) {
		this.isPoisoned = isPoisoned;
	}
	
	public Boolean getIsParalyzed() {
		return isParalyzed;
	}
	
	public void setIsSleeping(Boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void useMove(Move move, Pokemon pokemon) {
		Integer attackDamage = move.getAttack();
		Integer enemyDefense = pokemon.getDefense();
		
		Integer trueDamage = Math.round((attackDamage)/(enemyDefense));
		
		System.out.println("OPPONENT STATS: " + pokemon.getHP());
		
		pokemon.setHP(pokemon.getHP() - trueDamage);
		System.out.println(trueDamage + " amount of damage to: " + pokemon.getName() + " HP now: " + pokemon.getHP());
	}
	

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", HP=" + HP + ", experience=" + experience + ", attack=" + attack
				+ ", defense=" + defense + ", speed=" + speed + ", accuracy=" + accuracy + ", specialAttack="
				+ specialAttack + ", specialDefense=" + specialDefense + ", moveSet=" + moveSet + ", ability=" + ability
				+ ", level=" + level + ", type=" + Arrays.toString(type) + ", isWild=" + isWild + ", maxHP=" + maxHP
				+ ", isPoisoned=" + isPoisoned + ", isSleeping=" + isSleeping + ", isParalyzed=" + isParalyzed
				+ ", getName()=" + getName() + ", getAccuracy()=" + getAccuracy() + ", getAttack()=" + getAttack()
				+ ", getDefense()=" + getDefense() + ", getExperience()=" + getExperience() + ", getHP()=" + getHP()
				+ ", getMoveSet()=" + getMoveSet() + ", getSpecialAttack()=" + getSpecialAttack()
				+ ", getSpecialDefense()=" + getSpecialDefense() + ", getSpeed()=" + getSpeed() + ", getIsWild()="
				+ getIsWild() + ", getMaxHP()=" + getMaxHP() + ", getIsPoisoned()=" + getIsPoisoned()
				+ ", getIsSleeping()=" + getIsSleeping() + ", getAbility()=" + getAbility() + ", getLevel()="
				+ getLevel() + ", getType()=" + Arrays.toString(getType()) + ", getIsParalyzed()=" + getIsParalyzed()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
