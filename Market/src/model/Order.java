package model;

import java.util.ArrayList;

public class Order {

	private int ID;
	private String nameClient;
	private String Date;
	private String payType;
	private ArrayList<ListProduct> listProducts;

	public Order() {
	}

	public Order(int iD, String nameClient, String date, String payType) {
		ID = iD;
		this.nameClient = nameClient;
		Date = date;
		this.payType = payType;
		listProducts = new ArrayList<>();
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public ArrayList<ListProduct> getTypeProducts() {
		return (ArrayList<ListProduct>) listProducts.clone();
	}
//
//	public boolean addProduct(int id, ListProduct list, String type) {
//
//	//	if (type.equalsIgnoreCase(type)) {
//			listProducts.add(list);
//			return true;
////		}
////		return false;
//	}

	public ListProduct comprobar(int id) {
		ListProduct product = new ListProduct();

		for (int i = 0; i < listProducts.size(); i++) {
			product = new ListProduct();

			if (listProducts.get(i).getProducts().get(i).getId() == id) {
				product = listProducts.get(i);
			}
		}

		return product;
	}

	public void mostrarLista() {

		for (int i = 0; i < 3; i++) {
			System.out.println(listProducts.get(i).getProducts().get(i).getId() + "--"
					+ listProducts.get(i).getProducts().get(i).getName() + "--"
					+ listProducts.get(i).getProducts().get(i).getUnitValue() + "--"
					+ listProducts.get(i).getProducts().get(i).getExistingQuantity());
		}
	}
}
