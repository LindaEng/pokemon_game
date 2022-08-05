
public class Absorb extends Move{
	public Absorb() {
		super();
		this.setType("normal");
		this.setAttack(40);
	}
	
	@Override
	public String toString() {
		return "Absorb [getType()=" + getType() + ", getAttack()=" + getAttack() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
