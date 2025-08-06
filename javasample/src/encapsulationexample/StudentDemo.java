package encapsulationexample;
//import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s =new Scanner(System.in);
		Student s =new Student();
		
		s.setSid(101);
		s.setSname("raja");
		s.setAvg(89.5f);
		System.out.println(s);
		
//		System.out.println("Student id:"+s.getsid());
//		System.out.println("Student Name:"+s.getsname());
//		System.out.println("Student average:"+s.getsavg());
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("raja");
		s1.setAvg(89.5f);
		System.out.println(s1);

	}

}
