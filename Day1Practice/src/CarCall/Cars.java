package CarCall;
import com.car.General.Seden;
public class Cars {
 public static void main(String[] args) {
	 Seden Car1=new Seden('A',32415,4500000);
	 System.out.println("car name "+Car1.getCarName() );
	 System.out.println("car modelno "+ Car1.getModelNo());
	 System.out.println(Car1.getPrice());
	 Car1.setCarName('q');
	 System.out.println("car new  name:"+Car1.getCarName());
	 Car1.setPrice(58400000);
	 System.out.println(Car1.getPrice());
	 
	 
	 
	 
	 
	 
	 
 }
 
}
