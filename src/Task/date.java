package Task;
import java.util.Date;
import java.text.SimpleDateFormat;
public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleDateFormat formatt=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date date=new Date();
System.out.println(formatt.format(date));
SimpleDateFormat format2=new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
System.out.println(format2.format(date));
System.out.println(date.getTime());
System.out.println(date.before(date));
System.out.println(date.after(date));
	}

}