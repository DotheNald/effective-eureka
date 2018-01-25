public class Tagesview implements Viewable {

	private final int tag;
	private Model model;

	public Tagesview(int tag){
		this.tag = tag;
	}

	public void setModel(Model model){
		this.model = model;
	}

	@Override
	public void update() {
		System.out.println("Tageseinnahmen: " + einnahmen() );
	}

	public int einnahmen() {
		return this.model
				.stream()
				.filter(a->a.tag()==this.tag)
				.mapToInt(a->a.parkdauer()*ParkhausModel.Parkgebuehr)
				.sum();
	}
}