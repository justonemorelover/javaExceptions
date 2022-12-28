package javaStack;

public class TestaCheckedException {
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        metodo1();
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        try {
	        	metodo2();
	        } catch(MinhaCheckedException ex) {
	            String msg = ex.getMessage();
	            System.out.println("MinhaCheckedException" + msg);
	            ex.printStackTrace();
	        }
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() throws MinhaCheckedException {
	    	//"throws" sinaliza a possivel "exception" na execução do método;
	    	
	        System.out.println("Ini do metodo2");	        
	        throw new MinhaCheckedException("Segundo Teste");     
	    }
}