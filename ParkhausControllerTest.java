import static org.junit.Assert.*;

import org.junit.*;

public class ParkhausControllerTest {

	ParkhausController pc;
	Tagesview tagesView;
	Wochenview wochenView;
	ParkhausModel model;

	@Before
	public void setup(){
		tagesView = new Tagesview(2); // zweiter Tag
		wochenView = new Wochenview(1); // erste Woche

		model = new ParkhausModel(
				new Viewable[]{tagesView, wochenView});
				tagesView.setModel(model);
				wochenView.setModel(model);
				pc = new ParkhausController(model);
}
	
	@Test
	public void testSzenario1() throws Exception {
		assertEquals( 0, tagesView.einnahmen() );
		assertEquals( 0, wochenView.einnahmen() );
		pc.einfahrt();
		Timer.global.plus(28);
		Auto a = pc.einfahrt();
		Timer.global.plus(3);
		Auto b = pc.einfahrt();
		Timer.global.plus(10);
		pc.ausfahrt(a);
		assertEquals( 13, tagesView.einnahmen() );
		assertEquals( 13, wochenView.einnahmen() );
		Timer.global.plus(2);
		pc.ausfahrt(b);
		assertEquals( 25, tagesView.einnahmen() );
		assertEquals( 25, wochenView.einnahmen() );
	}
	
	//ab hier meins
	@Test
	public void testSzenario2() throws Exception{
		//Kundenview testen
	}
}