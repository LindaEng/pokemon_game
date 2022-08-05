public class Move {
	private String type;
	private Integer attack;
	
	public Move() {

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

	@Override
	public String toString() {
		return "Move [type=" + type + ", attack=" + attack + "]";
	}
}
