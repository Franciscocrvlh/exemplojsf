package org.senai.exemplojsf.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.senai.exemplojsf.dados.*;
import org.senai.exemplojsf.modelos.Cliente;

public class ClienteDAO {
	
	public boolean incluir(Cliente objCliente) {
		Connection conexao = new ConectarJDBC().getConectar();
		
		if(conexao != null) {
			String sql = "insert into cliente(" + 
					"nome ," + 
					"email        ," + 
					"senha        ) " + 
					
					"values (?," + 
					"		?," + 
					"		?" +  
					"			)";
			try {
				PreparedStatement prepararSQL = conexao.prepareStatement(sql);
				prepararSQL.setString(1, objCliente.getNome());
				prepararSQL.setString(2, objCliente.getEmail());
				prepararSQL.setString(3, objCliente.getSenha());
				 
				
				
				
				
				prepararSQL.execute();
				prepararSQL.close();
				
				
				
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} 
		}
		return false;
	}

}
