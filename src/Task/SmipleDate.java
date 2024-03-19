package Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SmipleDate {
  public static void main(String[]args) throws ParseException{
	  SimpleDateFormat datef=new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	  String d1="24/12/2023 12:22:36";
	  String d2="26/12/2023 12:22:36";
	  Date a=datef.parse(d1);
	  Date b=datef.parse(d2);
	  if(a.after(b)) {
		  System.out.println("after"+a);
	  }
	  else if(a.before(b)) {
		  System.out.println("before"+b);
	  }
	  else
	  {
		  System.out.println("same");
		  
	  }
  }
}
