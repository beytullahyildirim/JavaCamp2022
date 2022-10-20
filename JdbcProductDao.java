package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product){  
		//sadece ve sadece db erisim kodları buraya yazılır...SQL
		System.out.println("JDBC ile veritabına eklendi");
	}
}
  
//Hibernate