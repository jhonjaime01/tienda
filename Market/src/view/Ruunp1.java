//package view;
//
//import model.ListProduct;
//import model.Order;
//import model.ListProduct.Product;
//
//public class Ruunp1 {
//
//	public static void main(String[] args) {
//
//		ListProduct listado;
//		ListProduct.Product p;
//
//		listado = new ListProduct(1, "abc");
//		p = listado.new Product(0, null, 0, 0);
//
//		System.out.println("+-------------------------------------------+");
//		System.out.printf("|No. %-3d| subclase: %-24s|\n", listado.getIdType(), listado.getType());
//		System.out.println("+-------------------------------------------+");
//		System.out.println("|Id     |" + "Nombre      |" + "Valor unit |" + "Existencia|");
//		System.out.println("+-------------------------------------------+");
//		for (int i = 0; i < listado.getProducts().size(); i++) {
//			System.out.printf("|%-7d|%-12s|%-11d|%-10d| \n",
//
//					listado.getProducts().get(i).getId(), listado.getProducts().get(i).getName(),
//					listado.getProducts().get(i).getUnitValue(), listado.getProducts().get(i).getExistingQuantity());
//
//		}
//		System.out.println("+-------------------------------------------+");
//	}
//
//}
