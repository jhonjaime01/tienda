package model;

import java.util.ArrayList;

public class ListProduct {

	private ArrayList<Product> products;
	
	
	public ListProduct() {
		products = new ArrayList<>();
	}

	public ArrayList<Product> getProducts() {
		return (ArrayList<Product>) products.clone();
	}
	
	public boolean addProduct(Product product) {

		if (getID(product.getId())!=product.getId()) {
			products.add(product);
			System.out.println("Producto Agregado");
			return true;
		}
		System.out.println();
		return false;
	}
	
	
	private int getID(int id) {

		for (int i = 0; i < products.size(); i++) {
			int temp = id;
			for (int j = 0; j < products.size(); j++) {
				if (temp == products.get(j).getId()) {
					return id;
				}
			}
		}
		
		return 0;
	}
	
	public String category(int num) {
		
		String category = null;
		if (num == 1) {
			category = "Viveres";
		} else if (num == 2) {
			category = "Licores";
		} else if (num == 3) {
			category = "Aseo";
		} else{
			category = "Frutas";
		}

		return category;
	}

	public class Product {

		private int id;
		private String name;
		private int unitValue;
		private int existingQuantity;
		private int idCategory;
		private String Category;

		public Product(int idCategory, String category,int id, String name, int unitValue, int existingQuantity) {
			this.idCategory= idCategory;
			this.Category=category;			
			this.id = id;
			this.name = name;
			this.unitValue = unitValue;
			this.existingQuantity = existingQuantity;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUnitValue() {
			return unitValue;
		}

		public void setUnitValue(int unitValue) {
			this.unitValue = unitValue;
		}

		public int getExistingQuantity() {
			return existingQuantity;
		}

		public void setExistingQuantity(int existingQuantity) {
			this.existingQuantity = existingQuantity;
		}

		public int getIdCategory() {
			return idCategory;
		}

		public void setIdCategory(int idCategory) {
			this.idCategory = idCategory;
		}

		public String getCategory() {
			return Category;
		}

		public void setCategory(String category) {
			Category = category;
		}
		
	

	}
}