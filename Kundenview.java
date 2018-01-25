
public class Kundenview implements Viewable{
	
	private final String kennzeichen;
	private Model model;

	public Kundenview(String kennzeichen){
		this.kennzeichen=kennzeichen;
	}
	
	@Override
	public void setModel(Model model) {
		this.model=model;
		
	}

	@Override
	public void update() {
		System.out.println("Parkkosten: " +parkkosten());
		
	}
	
	public int parkkosten(){
		return this.model
				.stream()
				.filter(a->a.kennzeichen().equalsIgnoreCase(kennzeichen))
				.mapToInt(a->a.parkdauer()*ParkhausModel.Parkgebuehr)
				.sum();
	}

}
