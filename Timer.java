public class Timer {

	public static final Timer global = new Timer();
	private int time;

	protected Timer(){
		this.time = 0;
	}

	public void plus(int delta){
		this.time += delta;
	}

	public Stunde now(){
		return new Stunde( this.time );
	}
}