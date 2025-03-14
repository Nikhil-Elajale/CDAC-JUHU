import java.util.Scanner;


public class as2{
	
	public static void main(String[] args){
		
		
		
		//Q1 & Q5 A) Swap using temporaly variable 
		// int a= 5;
		// int b=10;
		
		// int temp = a;
		// a=b;
		// b=temp;
		
		// System.out.println("Value : " + a + "Value :" + b );
		
		//B)Bitwise swap
		
		// a= a^b;
		// b=a^b;
		// a=a^b;
		
		// System.out.println("Value a : "+ a +"  "  +  "Value b:"+b);
		
		// operator swap
		// a = a+b;
		// b= a-b;
		// a=a-b;
		
		// System.out.println("VALUE a : "+a  +"Value b: "+b);
		
		
		//Q2 Even odd using bitwise trick unit place binary 1 is odd and if zero then it is even
		
		
		// int num =12;
		// if((num & 1)== 0){
			// System.out.println(num + " isEven");
		// }
		// else{
			// System.out.println(num + "is Odd");
		// }
		
		//Q3 sum of digit using modulus and divison operator
		
		// Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // int num = scanner.nextInt(); 
        
        // int sum = 0;
        // int originalNum = num;

        
        // while (num != 0) {
            // sum = sum + num % 10; 
            // num =num/10;   
			
			 // System.out.println(sum);
		// }
		
		
		//Q4
		
		// int n = 15;
		
		// if(n<0){
			// n = -n;
		// }
		
		// while(n>3){
			// n = (n & 3) + (n >> 2);
		// }
		
		// if(n==0 || n==3)
			// System.out.println("Division by 3");
		// else
			// System.out.println("Not division by 3");
	
		
		//Relational and  Logical operator
		//Q6
		
		
		// System.out.print("Enter first number: ");
        // int a = scanner.nextInt();
        // System.out.print("Enter second number: ");
        // int b = scanner.nextInt();
        // System.out.print("Enter third number: ");
        // int c = scanner.nextInt();

        // int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        
        // System.out.println("The largest number is: " + largest);
		
		
		//Q7 Leap Year or not
		
		// Scanner scanner = new Scanner(System.in);
        
        
        // System.out.print("Enter a year: ");
        // int year = scanner.nextInt();
        
        // boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
        // if (isLeap) {
            // System.out.println(year + " is a leap year.");
        // } else {
            // System.out.println(year + " is not a leap year.");
        // }
		
		
		
		//Q8 TAke three boolean values
		
		// Scanner scanner = new Scanner(System.in);
        
        
        // System.out.print("Enter first boolean value: ");
        // boolean a = scanner.nextBoolean();
        
        // System.out.print("Enter second boolean value : ");
        // boolean b = scanner.nextBoolean();
        
        // System.out.print("Enter third boolean value: ");
        // boolean c = scanner.nextBoolean();
        
        
        // boolean result = (a && b) || (b && c) || (a && c);
        // System.out.println("At least two inputs are true: " + result);
		
		
		//Q9specific range (20 to 50) 
		
		 // Scanner scanner = new Scanner(System.in);
         // System.out.print("Enter a number: ");
         // int num = scanner.nextInt();
        
		// System.out.println("Number is within range (20 to 50): " + (num >= 20 && num <= 50));
		
		
		//Q10 Owel or constant
		
		// Scanner scanner = new Scanner(System.in);
        
		// System.out.print("Enter a character: ");
        // char ch = scanner.next().toLowerCase().charAt(0);
        
        
        // String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
		// System.out.println("The character is a: " + result);
		
		
		
		
		
		
		
		//Bitwise Operators
		
		//Q11 given number is 2 power
		
		// Scanner scanner = new Scanner(System.in);
         
		// System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        
        // boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        // System.out.println(num + " is a power of 2: " + isPowerOfTwo);
		
		
		//Q12 Number is divisible by 8
		
		// Scanner scanner = new Scanner(System.in);
        
        
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        
        
        // if (num % 8 == 0) {
            // System.out.println("Number is a multiple of 8");
        // } else {
            // System.out.println("Number is not a multiple of 8");
        // }
		
		
		//Q13 Abosulte- means The absolute value of a number is its
		// distance from zero on the number line, 
		// regardless of direction. It is always non-negative
		//Not able to solve
		
		
		//Q14  
		
		// Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter an integer: ");
        // int num = scanner.nextInt();
        // int count = 0;
        // while (num > 0) {
            // num = num & (num - 1); // Removes the rightmost set bit
            // count++;
        // }
        
       
        // System.out.println("Number of set bits: " + count);
		
		
		//Q15 
		
		
		
		
		//Ternary Operator
		
		//Q16 determines whether a given number is  positive, negative, or zero
		
		
		// Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        // String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        // System.out.println("The number is " + result);
		
		//Q17 not able to solve
		
		//Q18 Pass or fail by using ternary
		
		// Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter student percentage: ");
        // double percentage = scanner.nextDouble();
        
        
        // String result = (percentage >= 40) ? "Pass" : "Fail";
        // System.out.println("The student has " + result);
		
		//Q19 check whether uppercase or lowercase or not a letter
		
		// Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a character: ");
        // char ch = scanner.next().charAt(0);
        
        // String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                        // (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        
        // System.out.println("The character is: " + result);
		
		
		//Q20 Return abosulte value using ternary
		
		// Scanner scanner = new Scanner(System.in); 
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        // int absValue = (num < 0) ? -num : num;         
        
       
        // System.out.println("The absolute value is: " + absValue);
        
		
// Example 1: num = 22
// Step-by-Step Execution:
// num = 22
// Condition check: 22 < 0 → false
// Since the condition is false, absValue = num, so absValue = 22



//MISCELLENEOUS Operator Questions


	  //21 Write a program that  increments a number without using  +  or  ++  operators. 
// Hint  : Use bitwise  - (~x) 


			// Scanner scanner = new Scanner(System.in);
			// System.out.println("Enter a number");
			// int num = scanner.nextInt();
			
			// int incValue = -~num;
			// System.out.println("Incremented value " + incValue);
			
			
			
			//22   Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input 
//and prints the result using only  switch-case 

		// Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter first number: ");
        // int num1 = scanner.nextInt();
        
        // System.out.print("Enter an operator (+, -, *, /): ");
        // char operator = scanner.next().charAt(0);
        
        // System.out.print("Enter second number: ");
        // int num2 = scanner.nextInt();
        
        // scanner.close();
        
        // int result;
        
        // switch (operator) {
            // case '+':
                // result = num1 + num2;
                // break;
            // case '-':
                // result = num1 - num2;
                // break;
            // case '*':
                // result = num1 * num2;
                // break;
            // case '/':
                // if (num2 != 0) {
                    // result = num1 / num2;
                // } else {
                    // System.out.println("Error: Division by zero is not allowed.");
                    // return;
                // }
                // break;
            // default:
                // System.out.println("Error: Invalid operator.");
                // return;
        // }
        
        // System.out.println("Result: " + result);
		
		
		
		//Q23 Given a number, find whether it is  odd or even  using the  &  bitwise operator and print 
//the result without using  if-else  refer question 2


		//Q24   Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
//(  &  )  and  for  loop. 
				
				
		// for (int i = 1; i <= 100; i++) {
            // if ((i & 1) == 0) {
                // System.out.print(i + " ");
            // }
        // }
		
		
		
		//Q25  Implement a program that reverses an  integer number  without using string 
				//conversion (  StringBuilder  or  toCharArray  ). 
				//Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 
				
		// Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter an integer: ");
        // int num = scanner.nextInt();
        
        
        // int rev = 0;
        // while (num != 0) {
            // rev = rev * 10 + num % 10;
            // num /= 10;
        // }
        
        // System.out.println("Reversed number: " + rev);
		
		
		
		
				
				
				

		
		
		
		
		
		
	}
}