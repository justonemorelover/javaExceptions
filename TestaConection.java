package javaStack;

public class TestaConection { //UTILIZAÇÃO DO TRY,CATCH E FINALLY
	
	public static void main(String[] args) {
		
		Conection con1 = new Conection();
		
		try {
			con1.leDados();
			
		} catch (IllegalStateException ex) {
			String message = ex.getMessage();
			System.out.println("IllegalStateException " + message);
			ex.printStackTrace();	
			
		} finally {
			con1.fecha();
		}
	}
}
