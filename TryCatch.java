package javaStack;

public class TryCatch {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");    
	        metodo1();     
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();	        
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");            
	            try{
	                int a = 1 / 0;
	            } catch(ArithmeticException ex) {
	                String msg = ex.getMessage();
		            System.out.println("ArithmeticException " + msg);
		            ex.printStackTrace();
	            }
	     }      
}

