import java.rmi.*;
public class Client{
	public static void main (String[] args) throws Exception{
		AddI obj = (AddI) Naming.lookup("ADD");
		int n = obj.add(2,3);
		System.out.println("Addition:"+n);
	}
}