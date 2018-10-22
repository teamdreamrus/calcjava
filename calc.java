import java.util.*;

class calc{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Enter act(+,-,*,/): ");
        String str1 = scan.next();

        switch(str1){
            case "+": 
                System.out.println("Resault: "+ (a + b));
                break;
                
            case "-":
                System.out.println("Resault: "+ (a - b));
                break;
                
            case "/":
            
                System.out.println("Resault: "+ (a / b));
                break;
                
            case "*":
                System.out.println("Resault: "+ (a - b));
                break;
                
            default: 
                System.out.println("what you enter????");
                break;
                
        }
        return; 

    }
}
/*import java.util.*;

class calc{
	public static void main(String[] arg){
		double res;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();		
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter operation: ");
		String op = scan.next();
		switch(op){
			case "+":
				res = a + b;
				break;
			case "-":
				res = a - b;
				break;
			case "*":
				res = a * b;
				break;
			case "/":
				res = a / b;
				break;
			default:
				System.out.println("Operation is not correct");
				return;		
		}
		System.out.println("Result = " + res);
	}
}*/