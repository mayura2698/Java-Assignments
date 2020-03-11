package ass15;

import java.util.logging.Logger;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cylinder extends Circle {
	Logger logger = Logger.getLogger(Circle.class.getName());
	double height ;

	public void info() {
		logger.info("classname: ex1");

	}

	
	public void printvolume() {
		double volume = ( Math.PI * super.radius *radius* height) ;
		logger.info("volume of cylinder " + volume + "sq.units");

	}

	public Cylinder(double radius) {
		super.radius = radius;
	}

	public Cylinder() {
		
	}

	public Cylinder(double height,double radius, String colour) {
		super(radius, colour);
		this.height=height;
	}
	public Cylinder(double height,double radius) {
		super(radius);
		this.height=height;
	}
}
