package javaStack;

// --- METODO CLOSE AUTOMATIZADO ORIUNDO DA CLASSE AUTO CLOSEABLE --- \\

public class TestaConexao {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao() ){
		    conexao.leDados();
		    
		} catch(IllegalStateException ex){
			
		    System.out.println("Erro de conexão");
		}
	}
}