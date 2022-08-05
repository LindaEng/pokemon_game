public class Tackle extends Move {
	public Tackle() {
		super();
		this.setType("normal");
		this.setAttack(40);
	}

	@Override
	public String toString() {
		return "Tackle [getType()=" + getType() + ", getAttack()=" + getAttack() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
