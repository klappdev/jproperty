# jproperty
This is simple Java library which emulate properties.

Developers which create classes and want to use members instance class 
in another classes need use setters and getters.

```Java
   public class Point {
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

    public class Point {
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

Also developers could override own setter, getter for members class.

```Java
   import org.kl.property.Property;
   import org.kl.property.Getter;
   import org.kl.property.Setter;

   public class Data {
	public Property<Integer> id = Property.of(0)
					      .set(value -> value * 2)
					      .get(value -> value * 2);
	public Getter<String> name = Getter.of("no_name")
	                                   .get(value -> value.uppercase());
	public Setter<Integer> age = Setter.of(1)
	                                   .set(value -> {
	                                   	if (value < 1) return 1;
	                                   	return value;  
	                                   });
		
	public Data() {}		
    }	    
```

For effectively work with primitive types, developers could use property specializations.</br>
Also to verify the correctness of input and output data,could use preconditions and postconditions.

```Java

   public class User {
	public Getter<String> name = Getter.of("no_name")
					      .pre(value -> !value.isEmpty());
					      .post(value -> value.length() > 10);
	                                   .get(value -> value.uppercase());
	public IntSetter age = IntSetter.of(1)
					      .pre(value -> value > 0);
					      .post(value -> value > 5 && value < 15);	
	                                   .set(value -> {
	                                   	if (value < 1) return 1;
	                                   	return value;  
	                                   });
		
	public Data() {}		
    }	    
```

 
Requirements: Java 8 <br/>
