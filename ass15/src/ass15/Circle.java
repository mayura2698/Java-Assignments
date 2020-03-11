package ass15;

import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Circle {
	Logger logger = Logger.getLogger(Circle.class.getName());
	double radius;
	String colour;

	public void info() {
		logger.info("classname: ex1");

	}

	public void printArea() {
		double area = 2 * radius * radius;
		logger.info("area of circle " + area + "sq.units");

	}
	

	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}
	
	public Circle(double radius) {
		
		this.radius = radius;
		
	}
	public Circle() {
		super();
	}

}
