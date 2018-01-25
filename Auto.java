public class Auto {
	//vorgegeben
	private final Stunde start;
	private Stunde end;
	
	//eigenkreation
	private final String kennzeichen;
	private Abo abo;//to Do
	
	public Auto(Stunde start, String kennzeichen, Abo abo){	//kennzeichen muss uebergeben werden!
		this.start = start;
		this.kennzeichen=kennzeichen;
		this.abo=abo;
	}
	
	String kennzeichen(){
		return this.kennzeichen;
	}
	
	
/*	
//nicht meins
	public Auto(Stunde start){	//kennzeichen muss uebergeben werden!
		this.start = start;
	}
*/
	void end(Stunde ende){
		this.end = ende;
	}

	int tag(){
		if (this.end == null) return 0;
		return this.end.tag();
	}

	int woche(){
		if (this.end == null) return 0;
		return this.end.woche();
	}

	int parkdauer(){
		if (this.end == null) return 0;
		return end.minus(start);
	}

	@Override
	public String toString(){
		return "Auto[" + woche() + "," + tag() +"]("+start+","+end+")";
	}
}