package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bo.Paciente;
import jdbc.*;

public class PacienteDAO {
	
	public void create(Paciente paciente)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into paciente(cpf, nome, email) values (?, ?, ?)";
		
		try
		{
			stmt = banco.prepareStatement(sql);
			stmt.setString(1, paciente.getCpf());
			stmt.setString(2, paciente.getNome());
			stmt.setString(3, paciente.getEmail());
			stmt.executeUpdate();
			System.out.println("Paciente inserido com sucesso!");	
			
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao inserir paciente: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void delete(Paciente paciente)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from paciente where cpf = ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			stmt.setString(1, paciente.getCpf()); 
			stmt.executeUpdate();
			System.out.println("Paciente deletado com sucesso!");
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao deletar paciente: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void update(Paciente paciente)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update paciente set cpf=? , nome=?, email=? where cpf=?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			stmt.setString(1, paciente.getCpf()); 
			stmt.setString(2, paciente.getNome());
			stmt.setString(3, paciente.getEmail());
			stmt.setString(4, paciente.getCpf());
			stmt.executeUpdate();
			System.out.println("Paciente atualizado com sucesso!");
				
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao atualizar paciente: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public ResultSet read(Paciente paciente)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String nome;
		
		String sql = "select cpf,nome,email from paciente where nome like ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			nome=("%" + paciente.getNome() + "%");
			stmt.setString(1, nome); 
			System.out.println(stmt);
			ResultSet rs = stmt.executeQuery();
			
			return rs;			
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao ler paciente: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		return null;
		
	}

}