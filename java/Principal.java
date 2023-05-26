package java;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{

		System.out.println("Lextura aaaa\n");
		ArchivoOT vxa = new ArchivoOT("Operadores.obj");
		ArchivoViaje vx = new ArchivoViaje("Viajes.obj");
		//JOSE MENU
		int op=0;
		int op1=0;
		try {
			do		
			{
				System.out.println("\n ");
				System.out.println(" MENU DE VIAJES ");
				System.out.println(" ==== ");
				System.out.println(" ");
				System.out.println("1. CREAR VIAJE ");
				System.out.println("2. MOSTRAR VIAJE ");
				System.out.println("3. ADICIONAR VIAJE ");
				System.out.println("4. MOSTRAR PAQUETE ");
				System.out.println("5. SELECCIONAR PAQUETE ");
				System.out.print("|| Insterte una opcion => ");
				op = Leer.datoInt();
				//SAUL SWITCH
				switch(op) {
							
					case 1:
						System.out.println();
						vx.crear();
						break;
					case 2:
						System.out.println();
						vx.listar();
						break;
					case 3:
						System.out.println();
						vx.adicionar();
						break;

					case 4:
						do
						{
							System.out.println("\n");
							System.out.println("\t\t   MENU BUSCAR ");
							System.out.println("\t1. LISTAR");
							System.out.println("\t2. BUSCAR POR NOMBRE");
							System.out.println("\t3. BUSCAR POR PRECIO");
							System.out.print("\t|| Insterte una opcion => ");
							op1 = Leer.datoInt();
							switch(op1){
								case 1:
									System.out.println("LISTAR");
									vxa.listar();
									break;
								case 2:
									System.out.println("\n Insterte el nombre a buscar:");
									System.out.print("Ingrese Departamento => ");
									vxa.buscNom(Leer.dato());
									break;
								case 3:
									System.out.println("\n Insterte el precio a buscar:");
									System.out.print("precio => ");
									vxa.buscPrecio(Leer.datoInt());	
									break;
									}
						}while(op1<3);
						break;
					case 5:
						System.out.print("Inserte codigo a buscar => ");
						vx.seleccionarPaq(Leer.dato(),vxa);
						break;
				}
			}while(op<5);
		}catch (Exception e) {System.out.println("error"+e);}
	}				
}
	