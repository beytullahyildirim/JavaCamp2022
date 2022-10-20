package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product){  
		//sadece ve sadece db erisim kodları buraya yazılır...SQL
		System.out.println("Hibernate ile veritabına eklendi");
	}
}
