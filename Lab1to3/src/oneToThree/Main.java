package oneToThree;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte snum = 100;
        short sh = 2026;
        int num;
        long big = 8000000000L;
        float few = 99.5f;
        double n1, n2;
        char grade = 'A';
        boolean isTrue;
        String name;
        
        System.out.print("Enter name:");
        name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        num = sc.nextInt();
        
        System.out.print("Enter 1st num: ");
        n1 = sc.nextDouble();
        
        System.out.print("Enter 2nd num: ");
        n2 = sc.nextDouble();
        
        if(num > n1+n2) {
        	isTrue = true;
        }else {
        	isTrue = false;
        }
        
        
        
        
	}

}
