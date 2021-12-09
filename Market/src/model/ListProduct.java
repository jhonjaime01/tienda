package model;

import java.util.ArrayList;

public class ListProduct {
	private ArrayList<Product> products;
	
	

	public ListProduct() {
		products= new ArrayList<>();
	}

	public ArrayList<Product> getProducts() {
		return (ArrayList<Product>) products.clone();
	}

	public boolean addProduct(int idProduct, Product product) {
		
		if (searchID(idProduct)!=0) {
			products.add(product);
			return true;
		}
		return false;
	}

	private int searchID(int idProduct) {
		
		for (int i = 0; i <products.size(); i++) {
			if (idProduct!=products.get(i).getId()) {
				return idProduct;
			}
		}
		
		return 0;
	}

}