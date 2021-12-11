package view;

import java.util.Scanner;

import model.ListProduct;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		ListProduct listado = new ListProduct();
		int op = 0;

		do {

			System.out.println("Menu de Opciones");

			System.out.println("1. Registrar Productos");
			System.out.println("2. Ver productos registrados");
			System.out.println("3. Facturar:");
			System.out.println("4. ver Factura:");
			System.out.print("Digite La Opcion deseada: ");
			op = sc.nextInt();

			switch (op) {

			case 1:

				
				boolean bdn = true;
				int close = 0;
				int id = 0;
				String name = "";
				int unitValue = 0;
				int existQuantity = 0;
				int idCategory = 0;
				String category = "";

				while (bdn == true) {
					
					
					System.out.println("Digite el Id de la categoria: ");

					while (bdn == true) {
						System.out.print("Digite la opcion  segun corresponda:" + "\n" 
								+ "1. Viveres" + "\n"
								+ "2. Licores" + "\n" 
								+ "3. Aseo" + "\n" 
								+ "4. Frutas"+ "\n"
								+ "=>");
						idCategory = sc.nextInt();
						if (idCategory <= 4) {
							bdn = false;
						} else {
							bdn = true;
						}

					}
					System.out.print("Digite el identificador del producto: ");
					id = sc.nextInt();
					System.out.print("Digite el nombre del producto: ");
					name = sc.next();
					System.out.print("Digite el valor unitario del producto: ");
					unitValue = sc.nextInt();
					System.out.print("Digite la cantidad total exixtente  del producto: ");
					existQuantity = sc.nextInt();	
					
					listado.addProduct(listado.new Product(idCategory, listado.category(idCategory),id, name, unitValue, existQuantity));
					

					System.out.println("Desea agregar un nuevo producto digite 1" + "\n" + 
									   "salir digite cualquier teclas");
					close = sc.nextInt();

					if (close == 1) {
						bdn = true;
					} else {
						bdn = false;
					}

				}
				System.out.println("+------------------------------------------------------+");
				System.out.println("|                      Tienda                          |");
				System.out.println("+------------------------------------------------------+");
				System.out.println("|Categoria |Id     |"+"Nombre      |"+"Valor unit |"+"Existencia|");
				System.out.println("+------------------------------------------------------+"); 
				for (int i = 0; i < listado.getProducts().size(); i++) {
					
					
					System.out.printf("|%-10s|%-7d|%-12s|%-11d|%-10d| \n",
							
							listado.getProducts().get(i).getCategory(),
							listado.getProducts().get(i).getId(),
							listado.getProducts().get(i).getName(), 
							listado.getProducts().get(i).getUnitValue(),
							listado.getProducts().get(i).getExistingQuantity());
					
				}
				
				System.out.println("+------------------------------------------------------+");

				break;
			case 3:

				//Order order = new Order();
				// order.mostrarLista();
				String date = "";
				int idProduct = 0;

				System.out.println("Digite la cedula de la persona");
				id = sc.nextInt();
				//order.setID(id);

				System.out.println("Digite el nombre de la persona");
				name = sc.next();
				//order.setNameClient(name);
				
				System.out.println("Digite la cedula del la persona");
				date = sc.next();
				//order.setDate(date);

				while (bdn = true) {

					System.out.println("Digite el Id del producto");
					idProduct = sc.nextInt();

					System.out.println("Desea agregar un nuevo producto digite 1" + "\n" + "Desea Facturar digite 2");

					close = sc.nextInt();

					if (close == 1) {
						bdn = true;
					} else {
						bdn = false;
					}
				}

				System.out.println("_____________________");

				break;

			case 2:
				
				

				break;
			case 4:

				break;

			default:
			}
		} while (op > 0 && op <= 2);

	}

}
