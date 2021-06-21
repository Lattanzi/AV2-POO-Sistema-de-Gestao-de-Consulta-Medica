package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bo.Consulta;
import jdbc.*;

public class ConsultaDAO {
	
	public void create(Consulta consulta)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into consulta(codigo, fk_paciente_cpf, fk_tratamento_codigo , detalhes) values (?, ?, ?, ?)";
		
		try
		{
			stmt = banco.prepareStatement(sql);
			stmt.setString(1, consulta.getCodigo());
			stmt.setString(2, consulta.getPacienteCpf());
			stmt.setString(3, consulta.getTratamentoCodigo());
			stmt.setString(4, consulta.getDetalhes());
			stmt.executeUpdate();
			System.out.println("Consulta inserida com sucesso!");
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao inserir consulta: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void delete(Consulta consulta)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from consulta where codigo = ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);
			stmt.setString(1, consulta.getCodigo());
			stmt.executeUpdate();
			System.out.println("Consulta deletada com sucesso!");
			
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao deletar a consulta: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public void update(Consulta consulta)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update consulta set codigo=? , fk_paciente_cpf=? ,fk_tratamento_codigo=? , detalhes=? where codigo=?";
		
		try
		{
			stmt = banco.prepareStatement(sql);  
			stmt.setString(1, consulta.getCodigo());
			stmt.setString(2, consulta.getPacienteCpf());
			stmt.setString(3, consulta.getTratamentoCodigo());
			stmt.setString(4, consulta.getDetalhes());
			stmt.setString(5, consulta.getCodigo());
			stmt.executeUpdate();
			System.out.println("Consulta atualizada com sucesso!");	
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao atualizar a consulta: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		
	}
	
	public ResultSet read(Consulta consulta)
	{
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String nome;
		
		String sql = "select codigo, fk_paciente_cpf, fk_tratamento_codigo , detalhes from consulta where codigo like ?";
		
		try
		{
			stmt = banco.prepareStatement(sql);
			nome=("%" + consulta.getCodigo() + "%");
			stmt.setString(1, nome);
			System.out.println(stmt);
			ResultSet rs = stmt.executeQuery();
			
			return rs;		
			
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao tentar ler a consulta: 2"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(banco, stmt);
		}
		return null;
		
	}

}