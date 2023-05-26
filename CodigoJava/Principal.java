package CodigoJava;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{



		
		//INSTITUTOS
		LDobleInstituto LDI=new LDobleInstituto();
		LDobleUniversidad LDU=new LDobleUniversidad();
		LDI.adicionar(new Instituto("ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 498/2010", 0, 1942, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO PUERTO DE MEJILLONES", "La Paz", "Murillo", "El Alto", "", "", "FISCAL", "R.M. N° 814/09", 0, 1981, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO DON BOSCO", "La Paz", "Murillo", "", "El Alto", "", "CONVENIO", "R.M. N° 029/11", 0, 1998, null));
		LDI.adicionar(new Instituto("INSTITUTO SUPERIOR TECNOLOGICO AGROINDUSTRIAL CANAVIRI (ISTAIC)", "La Paz", "Caranavi", "Caranavi", "", "", "FISCAL", "R.M. N° 204/10", 0, 1989, null));
		LDI.adicionar(new Instituto("INSITTUTO TECNICO COMERCIAL LA PAZ", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 066/2012", 0, 1977, null));
		LDI.adicionar(new Instituto("CENTRO DE FORMACION PROFESIONAL BRASIL-BOLIVIA", "La Paz", "Murillo", "El Alto", "", "", "FISCAL", "R.M. N° 486/10", 0, 2009, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO AYACUCHO", "La Paz", "", "Murillo", "La Paz", "", "FISCAL", "R.M. N° 298/2011", 0, 1981, null));
		LDI.adicionar(new Instituto("INSTITUTO COMERCIAL SUPERIOR DE LA NACION INCOS", "La Paz", "Murillo", "El Alto", "", "", "FISCAL", "R.M. N° 297/11", 0, 2001, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNICO PRODUCTIVO ALTERNATIVO BOLIVIA MAR", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 773/13", 0, 2009, null));
		LDI.adicionar(new Instituto("INSTITUTO COMERCIAL SUPERIOR DE LA NACION Tte Armando de Palacios", "La Paz", "La Paz", "", "", "", "FISCAL", "R.M. N° 841/2013", 0, 1944, null));
		LDI.adicionar(new Instituto("INSTITUTO SUPERIOR DE EDUCACION COMERCIAL AMERICANO", "La Paz", "Murillo", "La Paz", "", "", "CONVENIO", "R.M. N° 369/2013", 0, 1994, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO MARCELO QUIROGA SANTACRUZ", "La Paz", "Murillo", "", "La Paz", "", "FISCAL", "R.M. N° 039/2013", 0, 1986, null));
		LDI.adicionar(new Instituto("INSTITUTO SUPERIOR DE ELECTRONICA INFORMATICA Y TELECOMUNICACIONES SANTO TORIBIO DE MOGROVEJO", "La Paz", "Murillo", "El Alto", "", "", "", "R.M. N° 308/12", 0, 1999, null));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO JACHA OMASUYOS", "La Paz", "Omasuyos", "", "", "", "FISCAL", "R.M. N° 486/12", 0, 2012, null));


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
	