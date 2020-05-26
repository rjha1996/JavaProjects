import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	private double price;
	private String color;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Product(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(10.0,"Red"));
		list.add(new Product(30.0,"Blue"));
		list.add(new Product(20.0,"Red"));
		
		//Compute average price products which has color as red
		
		String compute = list.stream().filter(p -> p.getColor().equalsIgnoreCase("Red"))
				.mapToDouble(map -> map.getPrice())
				.average()
				.toString();
				System.out.println("Average no "+ compute);
				
				//IntSummaryStatistics compute= list.stream().filter(p -> p.equals("Red"))
												
					
		
	}

}
