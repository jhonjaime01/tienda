package view;

import model.ListProduct;

public class Ruunp1 {

	public static void main(String[] args) {
		
		ListProduct listado;
		ListProduct.Product p;
		
		listado = new ListProduct(1, "Cereales");
		
		
		p = listado.new Product(2101,"Arroz", 1500, 5);
		listado.addProduct(p);
		
		p = listado.new Product(2102, "Frijol", 1000, 15);
		listado.addProduct(p);
		
		p = listado.new Product(2104, "Alverja", 2500, 8);
		listado.addProduct(p);
		
		p = listado.new Product(2101, "lenteja", 800, 6);
		listado.addProduct(p);
		
		p = listado.new Product(10, "len", 800, 6);
		listado.addProduct(p);
		
		p = listado.new Product(0, "len", 800, 6);
		listado.addProduct(p);
		p = listado.new Product(0, "lent", 800, 6);
		listado.addProduct(p);
	
		
		
		
		
		
		
//		ListProduct.Product p = listado.new Product(2101, "Arroz", 1500, 5);
//		ListProduct.Product product2 = listado.new Product(2102, "Frijol", 1000, 15);
//		ListProduct.Product product3 = listado.new Product(2101, "Alverja", 2500, 8);
//		ListProduct.Product product4 = listado.new Product(2104, "lenteja", 800, 6);
//		
//		listado.addProduct(product1);
//		listado.addProduct(product2);
//		listado.addProduct(product3);
//		listado.addProduct(product4);
		
		
		System.out.println("+-------------------------------------------+");
		 System.out.printf("|No. %-3d| subclase: %-24s|\n",listado.getIdType(),listado.getType());
		System.out.println("+-------------------------------------------+");
		System.out.println("|Id     |"+"Nombre      |"+"Valor unit |"+"Existencia|");
		System.out.println("+-------------------------------------------+");
		for (int i = 0; i < listado.getProducts().size(); i++) {	
			System.out.printf("|%-7d|%-12s|%-11d|%-10d| \n",
					
					listado.getProducts().get(i).getId(),
					listado.getProducts().get(i).getName(), 
					listado.getProducts().get(i).getUnitValue(),
					listado.getProducts().get(i).getExistingQuantity());
			
		}
		System.out.println("+-------------------------------------------+");
	}

}
