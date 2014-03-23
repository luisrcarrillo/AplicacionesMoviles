import java.io.IOException;
import java.util.Scanner;
public class hello {
	
	public native int Sumar(int operando1, int operando2) ;
	public native int Restar(int operando1, int operando2) ;
	public native int Multiplicar(int operando1, int operando2) ;
	public native int Dividir(int operando1, int operando2) ;
	public static void main (String args[]) {
		hello h = new hello () ;

		int resultado =0;
		int operando1,operando2;
		int operador;
		System.out.println("Calculadora en consola\n ");
		System.out.println("Introducir uno a uno\n ");
		System.out.println("operando operador operando\n ");
		System.out.println("operador operando (primer operando sera el resultado anterior)\n ");
		System.out.println("despues de > introducir exit para salir \n ");
		Scanner scanner;
        	System.out.println("");
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("> ");

			String input = scanner.nextLine();
			if(!input.equals("exit")){
				if(!isInteger(input)){
					operador =comprobarOperador(input);					
					operando1=resultado;
					operando2 = scanner.nextInt();
					}
				else{
					operando1 = Integer.parseInt(input);					
					input = scanner.nextLine();
					operador = comprobarOperador(input);					
					operando2 = scanner.nextInt();
				}
				switch(operador){
					case 1: resultado=h.Sumar(operando1,operando2);
						break;
					case 2: resultado=h.Restar(operando1,operando2);
						break;
					case 3: resultado=h.Multiplicar(operando1,operando2);
						break;
					case 4: resultado=h.Dividir(operando1,operando2);
						break;
					default: System.out.println("operador incorrecto");
				     		break;
					}
				System.out.println("= " +resultado);
				
			}
			else{break;}
		}
		 
	}
	static {
		System.loadLibrary ( "hello" ) ;
	}

	public static boolean isInteger(String s) {
    		try { 
       		 Integer.parseInt(s); 
   		 } catch(NumberFormatException e) { 
        	return false; 
   	 }
    	// only got here if we didn't return false
    	return true;
	}

	public static int comprobarOperador(String input){
		//System.out.println("comprobar"+input);
		if(input.equals("+")){return 1;}
		else if(input.equals("-")){return 2;}
		else if(input.equals("*")){return 3;}	
		else if(input.equals("/")){return 4;}
		else{return 0;}	
	}	
}
