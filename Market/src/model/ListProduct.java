package model;

import java.util.ArrayList;
import java.util.Iterator;

public class ListProduct {

	private int idType;
	private String type;
	private ArrayList<Product> products;

	public ListProduct(int idType, String type) {
		this.idType=idType;
		this.type=type;
		products = new ArrayList<>();
	}
	
	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Product> getProducts() {
		return (ArrayList<Product>) products.clone();
	}
	
	public boolean addProduct(Product product) {

	
		if (getID(product.getId())!=product.getId()) {
			products.add(product);
			return true;
		}
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

	public class Product {

		private int id;
		private String name;
		private int unitValue;
		private int existingQuantity;

		public Product(int id, String name, int unitValue, int existingQuantity) {
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

	}
}