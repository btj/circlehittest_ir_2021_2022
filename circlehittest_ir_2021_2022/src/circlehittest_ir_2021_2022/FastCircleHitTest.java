package circlehittest_ir_2021_2022;

public class FastCircleHitTest extends CircleHitTest {
	
	/**
	 * @pre | circle != null && point != null
	 * 
	 * @post | result == (circle.center().x() - circle.radius() <= point.x() &&
			 |	point.x() <= circle.center().x() + circle.radius() &&
			 |	circle.center().y() - circle.radius() <= point.y() &&
			 |	point.y() <= circle.center().y() + circle.radius())
	 */
	@Override
	public boolean containsPoint(Circle circle, Point point) {
		return circle.center().x() - circle.radius() <= point.x() &&
				point.x() <= circle.center().x() + circle.radius() &&
				circle.center().y() - circle.radius() <= point.y() &&
				point.y() <= circle.center().y() + circle.radius();
	}

}
