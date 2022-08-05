public class Move {
	private String type;
	private Integer attack;
	private String name;
	
	public Move() {
		this.name = "generic move";
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Move [type=" + type + ", attack=" + attack + "]";
	}
}
