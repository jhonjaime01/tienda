//package model;
//
//import java.util.ArrayList;
//
//public class Order {
//
//	private ArrayList<ListProduct> listproduct;
//
//	public Order() {
//		listproduct = new ArrayList<>();
//	}
//
//	public ArrayList<ListProduct> getProduct() {
//		return (ArrayList<ListProduct>) listproduct.clone();
//	}
//
//	public boolean addStant(ListProduct list) {
//
//		if (getID(list.getIdType()) != list.getIdType()) {
//			listproduct.add(list);
//			return true;
//		}
//		return false;
//	}
//
//	private int getID(int id) {
//
//		for (int i = 0; i < listproduct.size(); i++) {
//			int temp = id;
//			for (int j = 0; j < listproduct.size(); j++) {
//				if (temp == listproduct.get(j).getIdType()) {
//					return id;
//				}
//			}
//		}
//
//		return 0;
//	}
//}
