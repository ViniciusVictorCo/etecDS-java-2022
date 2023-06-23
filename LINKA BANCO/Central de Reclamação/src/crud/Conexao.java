package crud;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {

	//gerencia conexao com banco de dados
	private Connection connection = null;
	
	//gerencia xonsultas com banco de dados
	private Statement statement = null;
	
	//armazena informa��es vinda do select
	private ResultSet resultset = null;
	
	public void conectar() {
		// 1 Java data base connection
		// 2 servidor
		// 3 nome da tabela
		String servidor = "jdbc:mysql://localhost:3306/reclameaqui";
		
		// login e senha
		String usuario = "root";
		String senha = "";
		
		//driver ultilizado para conexao
		String driver = "";
		
		//execu��o
		try {
			
			//faz conexao com banco de dados
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			
			//cria o ambiente para executar codigos dentro do banco de dados
			this.statement = this.connection.createStatement();
		}catch (Exception e){
			System.out.println("Erro: " +e.getMessage());
		}
		
	}
	
	public void inserirReclamacao (String apelido, String reclamacao) {
	try{
		//guarda dentro da variavel query, o codigo que vai ser executado
		String query = "insert into tb_reclamacao"
				+ "(apelidoCliente, reclamacaoCliente)"
				+ "VALUES ('"+ apelido +"','"+ reclamacao +"')";
		//executa o codigo no sql
		this.statement.executeUpdate(query);
	} catch (Exception e){
		System.out.println("Erro: "+ e.getMessage());
		
	}
		
	}
	
	public ResultSet listarReclamacao () {
	
	try {
		String query = "select * from tb_reclamacao";
		
		this.resultset = this.statement.executeQuery(query);
	} catch (Exception e){
		System.out.println("Erro: "+ e.getMessage());
		
	}
		return resultset;
	}
	
	public void deletarJogador (String id) {
		try {
			String query = "delete from tb_reclamacao where idCliente = '"+ id +"';";
			System.out.println(this.statement.executeUpdate(query));
		} catch (Exception e){
			System.out.println("Erro: "+ e.getMessage());
			
		}
	}
	
	public void atualizarContato (String id,String apelido, String reclamacao) {
	try {
		String query  = "update tb_reclamacao set apelidoCliente ='"+apelido+"', reclamacaoCliente ='"+reclamacao+"' " + "where idCliente ='"+id+"'";
		
		System.out.println(this.statement.executeUpdate(query));
		
	} catch (Exception e){
		System.out.println("Erro: "+ e.getMessage());
			}
		}
		
	
}
