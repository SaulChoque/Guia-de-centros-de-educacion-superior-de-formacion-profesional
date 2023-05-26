package CodigoJava;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//CARRERAS NORMALES (SIN MENCIONES)
		CCCarreras c1=new CCCarreras();
		c1.adicionar(new Carrera("ElECTRICIDAD INDUSTRIAL", 0, 1)); 
		c1.adicionar(new Carrera("ElECTRONICA", 0, 2)); 

		CCCarreras c2=new CCCarreras();
		c2.adicionar(new Carrera("MECANICA", 0, 3)); 
		c2.adicionar(new Carrera("MECANICA", 0, 4)); 

		CCCarreras c3=new CCCarreras();
		c3.adicionar(new Carrera("ARTES", 0, 5)); 
		c3.adicionar(new Carrera("FORESTAL", 0, 6)); 

		CCCarreras c4=new CCCarreras();
		c4.adicionar(new Carrera("AGROPECUARIA", 0, 7)); 
		c4.adicionar(new Carrera("ElECTRICIDAD", 0, 8)); 

		CCCarreras c5=new CCCarreras();
		c5.adicionar(new Carrera("MECANICA", 0, 9)); 
		c5.adicionar(new Carrera("SECRETARIO", 0, 10)); 


		//CARRERAS CON MENCIONES
		CCCarreras cm1=new CCCarreras();
		cm1.adicionar(new CarreraMencion(null));
		//INSTITUTOS
		LDobleInstituto LDI=new LDobleInstituto();
		LDobleUniversidad LDU=new LDobleUniversidad();
		LDI.adicionar(new Instituto("ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 498/2010", 0, 1942, c1));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO PUERTO DE MEJILLONES", "La Paz", "Murillo", "El Alto", "", "", "FISCAL", "R.M. N° 814/09", 0, 1981, c2));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO DON BOSCO", "La Paz", "Murillo", "", "El Alto", "", "CONVENIO", "R.M. N° 029/11", 0, 1998, c3));
		LDI.adicionar(new Instituto("INSTITUTO SUPERIOR TECNOLOGICO AGROINDUSTRIAL CANAVIRI (ISTAIC)", "La Paz", "Caranavi", "Caranavi", "", "", "FISCAL", "R.M. N° 204/10", 0, 1989, c4));
		LDI.adicionar(new Instituto("INSITTUTO TECNICO COMERCIAL LA PAZ", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 066/2012", 0, 1977, c5));
		


		int op=0;
		int op1=0;
		try {
			do		
			{
				System.out.println("\n ");
				System.out.println(" CENTROS DE EDUCACION SUPERIOR ");
				System.out.println(" ==== ");
				System.out.println(" ");
				System.out.println("1. LEER");
				System.out.println("2. MOSTRAR");
				System.out.print("|| Insterte una opcion => ");
				op = Leer.datoInt();

				switch(op) {
					case 1:
						do
						{
							System.out.println("\n");
							System.out.println("\t\t   MENU LEER ");
							System.out.println("\t1. ADICIONAR UNIVERSIDAD");
							System.out.println("\t2. ADICIONAR INSTITUTO");
							System.out.print("\t|| Insterte una opcion => ");
							op1 = Leer.datoInt();
							switch(op1){
								case 1:
									System.out.println("ADICIONAR UNIVERSIDAD");
									LDU.leer();
								break;
								case 2:
									System.out.println("ADICIONAR INSTITUTO");
									LDI.leer();
								break;
							}
						}while(op1<2);
						break;
						case 2:
							do
							{
								System.out.println("\n");
								System.out.println("\t\t -- MENU LEER ");
								System.out.println("\t1. MOSTRAR UNIVERSIDAD");
								System.out.println("\t2. MOSTRAR INSTITUTO");
								System.out.print("\t|| Insterte una opcion => ");
								op1 = Leer.datoInt();
								switch(op1){
									case 1:
										System.out.println("MOSTRAR UNIVERSIDAD");
										LDU.mostrar();
									break;
									case 2:
										System.out.println("MOSTRAR INSTITUTO");
										LDI.mostrar();
									break;
								}
							}while(op1<2);
						break;
					}
			}while(op<5);
		}catch (Exception e) {System.out.println("error"+e);}
	}				
}
	