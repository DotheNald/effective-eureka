public class Stunde {

	private final int time;

	public Stunde(int stundenzahl){
		this.time = stundenzahl;
	}

	public int tag(){
		return 1 + this.time / 24;
	}

	public int woche(){
		return 1 + this.time / ( 24 * 7 );
	}

	public int jahr(){
		return 1 + this.time / ( 24 * 7 * 365 );
	}

	public int minus(Stunde other){
		return this.time - other.time;
	}

	@Override
	public String toString(){
		return "S("+time+")";
	}
}