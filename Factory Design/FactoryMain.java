import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;
import com.phone.IOS;

public class FactoryMain{
	public static void main(String args[]){
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj= osf.getInstance("Open");
		obj.spec();
	}
}
