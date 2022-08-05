
public class FireSpin extends Move{
	public FireSpin() {
		super();
		this.setType("Fire");
		this.setAttack(50);
	}

	@Override
	public String toString() {
		return "FireSpin [getType()=" + getType() + ", getAttack()=" + getAttack() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
