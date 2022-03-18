package circlehittest_ir_2021_2022;

public abstract class CircleHitTest {

	/**
	 * @pre | circle != null && point != null
	 * 
	 * @post | !(circle.center().squareDistanceTo(point) <= circle.radius() * circle.radius()) || result == true
	 * @post | (circle.center().x() - circle.radius() <= point.x() &&
			 |	point.x() <= circle.center().x() + circle.radius() &&
			 |	circle.center().y() - circle.radius() <= point.y() &&
			 |	point.y() <= circle.center().y() + circle.radius()) || result == false
	 */
	public abstract boolean containsPoint(Circle circle, Point point);
	
}
