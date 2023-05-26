package CodigoJava;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

		Stack<String> m1=new Stack<String>();
		m1.add("Desarrollo de software");
		m1.add("Ingenieria sistemas");
		Stack<String> m2=new Stack<String>();
		m2.add("medico guardia");
		m2.add("enfermeria");
		Stack<String> m3=new Stack<String>();
		m3.add("licenciatura mecanica");
		m3.add("mecanico");
		Stack<String> m4=new Stack<String>();
		m4.add("a");
		m4.add("b");
		Stack<String> m5=new Stack<String>();
		m5.add("c");
		m5.add("d");
		m4.add("e");
		Stack<String> m6=new Stack<String>();
		m6.add("f");
		m6.add("g");

		//CARRERAS CON MENCIONES
		CCCarreras cm1=new CCCarreras();
		cm1.adicionar(new CarreraMencion("CARR1", 1991, 11, m1));
		cm1.adicionar(new CarreraMencion("CARR2", 1992, 22, m2));
		CCCarreras cm2=new CCCarreras();
		cm2.adicionar(new CarreraMencion("CARR3", 1993, 33, m3));
		cm2.adicionar(new CarreraMencion("CARR4", 1994, 44, m4));
		CCCarreras cm3=new CCCarreras();
		cm3.adicionar(new CarreraMencion("CARR5", 1995, 55, m5));
		cm3.adicionar(new CarreraMencion("CARR6", 1996, 66, m6));
		
		//Queues carreras ids
		Queue<Integer> carr1=new LinkedList<Integer>();
		carr1.add(11);
		Queue<Integer> carr2=new LinkedList<Integer>();
		carr2.add(22);
		Queue<Integer> carr3=new LinkedList<Integer>();
		carr3.add(33);
		Queue<Integer> carr4=new LinkedList<Integer>();
		carr4.add(44);
		Queue<Integer> carr5=new LinkedList<Integer>();
		carr5.add(55);
		Queue<Integer> carr6=new LinkedList<Integer>();
		carr6.add(66);
		
		//FACULTADES

		LDobleFacultad f1=new LDobleFacultad();
		f1.adicionar(new Facultad("FAC1", carr1));
		f1.adicionar(new Facultad("FAC2", carr2));
		LDobleFacultad f2=new LDobleFacultad();
		f2.adicionar(new Facultad("FAC3", carr3));
		f2.adicionar(new Facultad("FAC4", carr4));
		LDobleFacultad f3=new LDobleFacultad();
		f3.adicionar(new Facultad("FAC5", carr5));
		f3.adicionar(new Facultad("FAC6", carr6));

		//UNIVERSIDADES
		LDobleUniversidad LDU=new LDobleUniversidad();
		LDU.adicionar(new Universidad("UMSA", "La Paz", "Murillo", "La Paz", "A", "B", "PUBLICA", "C", 0, 0, f1, cm1));
		LDU.adicionar(new Universidad("UCB ", "La Paz", "Murillo", "La Paz", "A", "B", "PRIVADA", "C", 0, 0, f2, cm2));
		LDU.adicionar(new Universidad("UNIL", "La Paz", "Murillo", "La Paz", "A", "B", "PRIVADA", "C", 0, 0, f3, cm3));
		//INSTITUTOS
		LDobleInstituto LDI=new LDobleInstituto();
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
								System.out.println("\t\t -- MENU MOSTRAR ");
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
	