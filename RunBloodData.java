import java.util.Scanner;
public class RunBloodData {
	String input1;
	String input2;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter bloodtype of the patient: " );
		String input1 = sc.nextLine();

		
		System.out.print("Enter rhesus factor of the patient(+ or -): " );
		String input2 = sc.nextLine();
		BloodData bd = new BloodData();
	
		if(input1.isEmpty()){
			if(input2.isEmpty()){
				bd.display();
			}else{
				System.out.print("Invalid");
			}
		
		
		}else if(input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
			bd.setBloodData(input1);
			bd.setRhFactor(input2);
			bd.display();
			}else{
				System.out.print("Invalid");
			}
		}
	}
}