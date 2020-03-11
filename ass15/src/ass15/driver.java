package ass15;



public class driver {

	public static void main(String[] args) {
		
		Circle[] circles= {
				new Cylinder(10),
				new Cylinder(12,10,"blue"),
				
		};
for (Circle c : circles) {
			
			c.printArea();
			((Cylinder) c).printvolume();
			System.out.println("_________________________");
	}
	}

}
