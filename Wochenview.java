public class Wochenview implements Viewable {

	private final int woche;
	private Model model;

	public Wochenview(int woche){
		this.woche = woche;
	}

	public void setModel(Model model){
		this.model = model;
	}

	@Override
	public void update() {
		System.out.println("Wocheneinnahmen: " + einnahmen() );
	}

	public int einnahmen() {
		return this.model
				.stream()
				.filter(a->a.woche()==this.woche)
				.mapToInt(a->a.parkdauer()*ParkhausModel.Parkgebuehr)
				.sum();
	}
}