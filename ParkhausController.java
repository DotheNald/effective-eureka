public class ParkhausController {
	
	private final ParkhausModel model;

	public ParkhausController(ParkhausModel model){
		this.model = model;
	}

	public Auto einfahrt(){
		Auto auto = new Auto( Timer.global.now() );	//kennzeichen und abo muss uebergeben werden!
		model.add( auto );
		model.update();
		return auto;
	}

	public void ausfahrt( Auto auto ){
		auto.end( Timer.global.now() );
		model.update();
	}
}