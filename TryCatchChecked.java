package javaStack;

public class TryCatchChecked { //EXCEÇÕES DO TIPO "CHECKED"
	
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        
	        try{
	            metodo1();
	        } catch(Exception ex) {
	            String msg = ex.getMessage();
	            System.out.println("ArithmeticException " + msg);
	            ex.printStackTrace();
	        }
	        
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() throws MinhaCheckedException{
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() throws MinhaCheckedException{
	        System.out.println("Ini do metodo2");
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	            
	            throw new MinhaCheckedException("Checked Exception Test");
	        }
	        
	        System.out.println("Fim do metodo2");        
	    }
}

