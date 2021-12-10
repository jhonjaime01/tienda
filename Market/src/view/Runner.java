//package view;
//
//import java.util.Scanner;
//
//import model.Product;
//import model.ListProduct;
//import model.Order;
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int op = 0;
//
//		do {
//
//			System.out.println("Menu de Opciones");
//
//			System.out.println("1. Registrar Productos");
//			System.out.println("2. Facturar:");
//			System.out.print("Digite La Opcion deseada: ");
//			op = sc.nextInt();
//
//			switch (op) {
//
//			case 1:
//
//				boolean bdn = true;
//				int close = 0;
//				int id = 0;
//				String name = "";
//				int unitValue = 0;
//				int existQuantity = 0;
//
//				while (bdn == true) {
//					ListProduct li = new ListProduct();
//
//					System.out.print("Digite el identificador del producto: ");
//					id = sc.nextInt();
//					System.out.print("Digite el nombre del producto: ");
//					name = sc.next();
//					System.out.print("Digite el valor unitario del producto: ");
//					unitValue = sc.nextInt();
//					System.out.print("Digite la cantidad total exixtente  del producto: ");
//					existQuantity = sc.nextInt();
//
//					li.addProduct(id, new Product(id, name, unitValue, existQuantity));
//
//					System.out.println("Desea agregar un nuevo producto digite 1" + "\n" + "salir digite 2");
//					close = sc.nextInt();
//
//					if (close == 1) {
//						bdn = true;
//					} else {
//						bdn = false;
//					}
//
//				}
//				System.out.println();
//
//				break;
//			case 2:
//
//				Order order = new Order();
//				// order.mostrarLista();
//				String date = "";
//				int idProduct = 0;
//
//				System.out.println("Digite la cedula de la persona");
//				id = sc.nextInt();
//				order.setID(id);
//
//				System.out.println("Digite el nombre de la persona");
//				name = sc.next();
//				order.setNameClient(name);
//
//				System.out.println("Digite la cedula del la persona");
//				date = sc.next();
//				order.setDate(date);
//
//				while (bdn = true) {
//
//					System.out.println("Digite el Id del producto");
//					idProduct = sc.nextInt();
//
//					System.out.println("Desea agregar un nuevo producto digite 1" + "\n" + "Desea Facturar digite 2");
//
//					close = sc.nextInt();
//
//					if (close == 1) {
//						bdn = true;
//					} else {
//						bdn = false;
//					}
//				}
//
//				System.out.println("_____________________");
//
//				break;
//
//			default:
//				break;
//			}
//		} while (op > 0 && op <= 2);
//
//	}
//
//}
