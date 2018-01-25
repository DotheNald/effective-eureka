import java.util.stream.Stream;

public interface Model {

	Stream<Auto> stream();
	void update();
}