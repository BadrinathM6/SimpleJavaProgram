import java.util.Scanner;

public class Calculator {
  
  // Building a method to validate and convert the string into int 
  
  public static int validateAndConvertToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        } 
    }
    
  public static void main(String[] args) {
   
   // getting the input from the terminal using built-in class Scanner by calling it with the name of 'scanner' object 
    
    Scanner scanner = new Scanner(System.in);
    
   //printing and handling the error 
   
    System.out.println("Enter one number to perform these(+,-,*,/) : ");
    String input1 = scanner.nextLine();
    
    int number1 = validateAndConvertToInt(input1);
    if(number1 == Integer.MIN_VALUE){
      
      System.out.println(" ! Please enter only numbers");
    }
    
    
    System.out.println("Enter these operator(+,-,*,/) to perform the operation :" );
    String operatorInput = scanner.nextLine();
        
        if (operatorInput.isEmpty()) {
            System.out.println("Invalid operator! Please enter a valid operator");
            return;
        }
        char operator = operatorInput.charAt(0);
    
    
    System.out.println("Enter another number to perform these(+,-,*,/) :" );
    String input2 = scanner.nextLine();
    
    int number2 = validateAndConvertToInt(input2);
    if(number2 == Integer.MIN_VALUE){
      
      System.out.println(" ! Please enter only numbers"); 
    }
    
   
   // setting the operator to perform these operation !!
   
    int finalResult = 0;
    
    
    
    if(operator == '+'){
      
      finalResult = number1 + number2 ;
      System.out.println("Final result : " +finalResult);
    }
    
    else if(operator == '-'){
      
      finalResult = number1 - number2 ;
      System.out.println("Final result : "+finalResult);
    }
    
    else if(operator == '*'){
      
      finalResult = number1 * number2 ;
      System.out.println("Final result : "+finalResult);
    }
    
    else if(operator == '/'){
      
      finalResult = number1 / number2 ;
      System.out.println("Final result : "+finalResult);
    }
    
    
    else{
        
        System.out.println("invalid operator ! Please enter valid operator ");
    
    }
    
     scanner.close();
  }
  
  
}
