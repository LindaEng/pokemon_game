import java.util.Set;

public class Pokemon {

	
	private Integer HP;
	private Integer experience;
	private Integer attack;
	private Integer defense;
	private Integer speed;
	private Integer accuracy;
	private Integer specialAttack;
	private Integer specialDefense;
	private String[] moveSet;
	private String ability;
	private Integer level;
	private String[] type;
	private Boolean isWild;
	private Boolean isPoisoned;
	private Boolean isParalyzed;
	private Boolean isSleeping;
	
	
	public Pokemon() {
		
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
	
	public String[] getMoveSet() {
		return moveSet;
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
	
	public void setMoveSet(String[] moveSet) {
		this.moveSet = moveSet;
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
	
	public void setIsPoisoned(Boolean isPoisoned) {
		this.isPoisoned = isPoisoned;
	}
	
	public Boolean getIsPoisoned() {
		return isPoisoned;
	}
	
	public void setIsParalyzed(Boolean isParalyzed) {
		this.isParalyzed = isParalyzed;
	}
	
	public Boolean getIsParalyzed() {
		return isParalyzed;
	}
	
	public Boolean getIsSleeping() {
		return isSleeping;
	}
	
	public void setIsSleeping(Boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

}
