package circlehittest_ir_2021_2022;

public class PreciseCircleHitTest extends CircleHitTest {
	
	/**
	 * @throws IllegalArgumentException | circle == null
	 * @throws IllegalArgumentException | point == null
	 * 
	 * @post | result == (circle.center().squareDistanceTo(point) <= circle.radius() * circle.radius())
	 */
	@Override
	public boolean containsPoint(Circle circle, Point point) {
		if (circle == null)
			throw new IllegalArgumentException();
		if (point == null)
			throw new IllegalArgumentException();
		
		return circle.center().squareDistanceTo(point) <= circle.radius() * circle.radius();
	}

}
