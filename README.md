# jproperty
This is simple Java library which emulate properties.

Developers which create classes and want to use member instance classes 
in another classes need use setters and getters.

```Java
    class Point {
		private int x;
		private int y;
		
		public Point() {}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		// equals, hashcode, toString
    }
	
	public void using() {
		Point point = new Point();
		point.setX(5);
		point.setY(5);
		
		System.out.println("Point: " + point.getX() + " " + point.getY());
	}
``` 

Using this library developers can write more simple and without many lines code.

```Java
	import org.kl.property.Property;

    class Point {
		public Property<Integer> x = Property.of(0);
		public Property<Integer> y = Property.of(0);
		
		public Point() {}		
    }
	
	
	public void using() {
		Point point = new Point();
		point.x.set(5);
		point.y.set(5);
		
		System.out.println("Point: " + point.x.get() + " " + point.y.get());
	}
```

Requirements: Java 8 <br/>
