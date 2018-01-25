import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Die Parkhaus-Fachlogik besteht aus der Verwaltung
//aller Parkplätze, Autos und Tickets.

public class ParkhausModel implements Model {

	public static int Parkgebuehr = 1; // 1 Euro pro Stunde
	private Viewable[] views;
	private List<Auto> autos;

	public ParkhausModel( Viewable[] views ){
		this.views = views;
		autos = new ArrayList<Auto>();
	}

	public void update(){
		for (Viewable view: views){
			view.update();
		}
	}

	public void add(Auto auto){
		autos.add(auto);
	}

	public Stream<Auto> stream(){
		return autos.stream();
	}
}