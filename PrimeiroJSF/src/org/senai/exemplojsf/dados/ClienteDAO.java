package org.senai.exemplojsf.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.senai.exemplojsf.dados.*;

public class ClienteDAO {
	
	public boolean inserir() {
		Connection conexao = new ConectarJDBC().getConectar();
		
		if(conexao != null) {
			String sql = "insert into cliente(" + 
					"nome_completo ," + 
					"email        ," + 
					"senha         ," + 
					
					"values (?," + 
					"		?," + 
					"		?," +  
					"			)";
			try {
				PreparedStatement prepararSQL = conexao.prepareStatement(sql);
				//prepararSQL.setString(1, nome);
				//prepararSQL.setString(2, email);
				//prepararSQL.setString(3, senha);
				 
				
				
				
				
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
