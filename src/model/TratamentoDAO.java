package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bo.Tratamento;
import jdbc.*;

public class TratamentoDAO {
	
	public void create(Tratamento tratamento)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into tratamento(codigo, tipo, preco) values (?, ?, ?)";
		
		try
		{
			stmt = banco.prepareStatement(sql);
			stmt.setString(1, tratamento.getCodigo());
			stmt.setString(2, tratamento.getTipo());
			stmt.setString(3, (tratamento.getPreco()+""));
			stmt.executeUpdate();
			System.out.println("Tratamento inserido com sucesso!");
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao inserir tratamento: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void delete(Tratamento tratamento)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from tratamento where codigo = ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			stmt.setString(1, tratamento.getCodigo());
			stmt.executeUpdate();
			System.out.println("Tratamento deletado com sucesso!");
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao deletar tratamento: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void update(Tratamento tratamento)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update tratamento set codigo=? , tipo=? , preco=? where codigo=?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			stmt.setString(1, tratamento.getCodigo());
			stmt.setString(2, tratamento.getTipo());
			stmt.setString(3, (""+tratamento.getPreco()));
			stmt.setString(4, tratamento.getCodigo());
			stmt.executeUpdate();
			System.out.println("Tratamento atualizado com sucesso!");
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao atualizar tratamento: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public ResultSet read(Tratamento tratamento)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String tipo;
		
		String sql = "select tipo,preco,codigo from tratamento where tipo like ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			tipo=("%" + tratamento.getTipo() + "%");
			stmt.setString(1, tipo); 
			System.out.println(stmt);
			ResultSet rs = stmt.executeQuery();
			
			return rs;
				
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao ler tratamento: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		return null;
		
	}

}