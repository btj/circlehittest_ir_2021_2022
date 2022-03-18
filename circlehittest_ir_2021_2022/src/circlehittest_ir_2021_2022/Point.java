package circlehittest_ir_2021_2022;

public record Point(int x, int y) {
	public int squareDistanceTo(Point other) {
		return (x() - other.x()) * (x() - other.x()) + (y() - other.y()) * (y() - other.y());
	}
}