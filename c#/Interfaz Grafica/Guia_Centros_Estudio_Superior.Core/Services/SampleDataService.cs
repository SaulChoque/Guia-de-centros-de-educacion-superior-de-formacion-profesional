using Guia_Centros_Estudio_Superior.Core.Contracts.Services;
using Guia_Centros_Estudio_Superior.Core.Models;

namespace Guia_Centros_Estudio_Superior.Core.Services;

// This class holds sample data used by some generated pages to show how they can be used.
// TODO: The following classes have been created to display sample data. Delete these files once your app is using real data.
// 1. Contracts/Services/ISampleDataService.cs
// 2. Services/SampleDataService.cs
// 3. Models/SampleCompany.cs
// 4. Models/SampleOrder.cs
// 5. Models/SampleOrderDetail.cs
public class SampleDataService : ISampleDataService
{
    private List<InstitucionEducacion> _allInstituciones;
    private List<Universidad> _allUniversidades;
    private List<Instituto> _allInstitutos;

    public SampleDataService()
    {
    }

/*  //CONVERTIR LDOBLE A IEnumerable
    private static IEnumerable<SampleOrder> AllFacultades()
    {
        // The following is order summary data
        var universidades = AllUniversidades();
        return universidades.SelectMany(c => c.Facultades);
    }
*/

	//METODOS CONVERSION LISTAS --> IEnumerable


    //METODO QUE DEVUELVE TODAS LAS INSTITUCIONES

    

    private static IEnumerable<InstitucionEducacion> AllInstituciones(){
        IEnumerable<InstitucionEducacion> res = new List<InstitucionEducacion>();

        IEnumerable<InstitucionEducacion> universidades = AllUniversidades();
        IEnumerable<InstitucionEducacion> institutos = AllInstitutos();

		//revisar luego
		res=universidades.Concat(institutos);
        return res;
    }

    private static IEnumerable<Instituto> AllInstitutos()
    {
        //CARRERAS NORMALES (SIN MENCIONES)-
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
		m1.Append("Desarrollo de software");
		m1.Append("Ingenieria sistemas");
		Stack<String> m2=new Stack<String>();
		m2.Append("medico guardia");
		m2.Append("enfermeria");
		Stack<String> m3=new Stack<String>();
		m3.Append("licenciatura mecanica");
		m3.Append("mecanico");
		Stack<String> m4=new Stack<String>();
		m4.Append("a");
		m4.Append("b");
		Stack<String> m5=new Stack<String>();
		m5.Append("c");
		m5.Append("d");
		m4.Append("e");
		Stack<String> m6=new Stack<String>();
		m6.Append("f");
		m6.Append("g");

		//Queues carreras ids
		Queue<int> carr1=new Queue<int>();
		carr1.Append(11);
		Queue<int> carr2=new Queue<int>();
		carr2.Append(22);
		Queue<int> carr3=new Queue<int>();
		carr3.Append(33);
		Queue<int> carr4=new Queue<int>();
		carr4.Append(44);
		Queue<int> carr5=new Queue<int>();
		carr5.Append(55);
		Queue<int> carr6=new Queue<int>();
		carr6.Append(66);
		
		//FOTOS 
		List<string> fotosI1=new List<string>();
		List<string> fotosI2=new List<string>();
		List<string> fotosI3=new List<string>();
		List<string> fotosI4=new List<string>();
		List<string> fotosI5=new List<string>();

		fotosI1.Add("/Assets/images/institutos/EISPDM/EISPDM_logo.png");
		fotosI1.Add("/Assets/images/institutos/EISPDM/EISPDM1.png");
		fotosI1.Add("/Assets/images/institutos/EISPDM/EISPDM2.jpg");

		fotosI2.Add("/Assets/images/institutos/ITPM/ITPM_logo.jpg");
		fotosI2.Add("/Assets/images/institutos/ITPM/ITPM1.jpg");
		fotosI2.Add("/Assets/images/institutos/ITPM/ITPM2.jpg");

		fotosI3.Add("/Assets/images/institutos/ITDB/ITDB_logo.png");
		fotosI3.Add("/Assets/images/institutos/ITDB/ITDB1.png");
		fotosI3.Add("/Assets/images/institutos/ITDB/ITDB2.jpg");

		fotosI4.Add("/Assets/images/institutos/ISTAC/ISTAC_logo.png");
		fotosI4.Add("/Assets/images/institutos/ISTAC/ISTAC1.jpg");
		fotosI4.Add("/Assets/images/institutos/ISTAC/ISTAC2.jpg");

		fotosI5.Add("/Assets/images/institutos/ITCLP/ITCLP_logo.jpg");
		fotosI5.Add("/Assets/images/institutos/ITCLP/ITCLP1.jpg");
		fotosI5.Add("/Assets/images/institutos/ITCLP/ITCLP2.jpg");



		//INSTITUTOS
		LDobleInstituto LDI=new LDobleInstituto();
		LDI.adicionar(new Instituto("ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 498/2010", 0, 1942, c1, fotosI1));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO PUERTO DE MEJILLONES", "La Paz", "Murillo", "El Alto", "", "", "FISCAL", "R.M. N° 814/09", 0, 1981, c2, fotosI2));
		LDI.adicionar(new Instituto("INSTITUTO TECNOLOGICO DON BOSCO", "La Paz", "Murillo", "El Alto", "A", "B", "CONVENIO", "R.M. N° 029/11", 0, 1998, c3, fotosI3));
		LDI.adicionar(new Instituto("INSTITUTO SUPERIOR TECNOLOGICO AGROINDUSTRIAL CANAVIRI", "La Paz", "Caranavi", "Caranavi", "", "", "FISCAL", "R.M. N° 204/10", 0, 1989, c4, fotosI4));
		LDI.adicionar(new Instituto("INSITTUTO TECNICO COMERCIAL LA PAZ", "La Paz", "Murillo", "La Paz", "", "", "FISCAL", "R.M. N° 066/2012", 0, 1977, c5, fotosI5));
        
		

        //RETORNANDO LISTA INSTITUTOS
        return LDI.toList();
    }
    private static IEnumerable<Universidad> AllUniversidades()
    {
        //CARRERAS NORMALES (SIN MENCIONES)-
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
		m1.Append("Desarrollo de software");
		m1.Append("Ingenieria sistemas");
		Stack<String> m2=new Stack<String>();
		m2.Append("medico guardia");
		m2.Append("enfermeria");
		Stack<String> m3=new Stack<String>();
		m3.Append("licenciatura mecanica");
		m3.Append("mecanico");
		Stack<String> m4=new Stack<String>();
		m4.Append("a");
		m4.Append("b");
		Stack<String> m5=new Stack<String>();
		m5.Append("c");
		m5.Append("d");
		m4.Append("e");
		Stack<String> m6=new Stack<String>();
		m6.Append("f");
		m6.Append("g");

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
	
		Queue<int> carr1=new Queue<int>();
		carr1.Append(11);
		Queue<int> carr2=new Queue<int>();
		carr2.Append(22);
		Queue<int> carr3=new Queue<int>();
		carr3.Append(33);
		Queue<int> carr4=new Queue<int>();
		carr4.Append(44);
		Queue<int> carr5=new Queue<int>();
		carr5.Append(55);
		Queue<int> carr6=new Queue<int>();
		carr6.Append(66);
		
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

        //FOTOS
        List<string> fotosI1 = new List<string>();
        List<string> fotosI2 = new List<string>();
        List<string> fotosI3 = new List<string>();

		fotosI1.Add("/Assets/images/universidades/UMSA/UMSA_logo.jpg");
		fotosI1.Add("/Assets/images/universidades/UMSA/UMSA1.jpg");
		fotosI1.Add("/Assets/images/universidades/UMSA/UMSA2.jpg");

		fotosI2.Add("/Assets/images/universidades/UCB/UCB_logo.png");
		fotosI2.Add("/Assets/images/universidades/UCB/UCB1.jpg");
		fotosI2.Add("/Assets/images/universidades/UCB/UCB2.jpg");

		fotosI3.Add("/Assets/images/universidades/UPEA/UPEA_logo.png");
		fotosI3.Add("/Assets/images/universidades/UPEA/UPEA1.jpg");
		fotosI3.Add("/Assets/images/universidades/UPEA/UPEA2.jpg");

        //UNIVERSIDADES
        LDobleUniversidad LDU=new LDobleUniversidad();
		LDU.adicionar(new Universidad("UNIVERSIDAD MAYOR SAN ANDRES", "La Paz", "Murillo", "La Paz", "A", "B", "PUBLICA", "C", 0, 0, f1, cm1, fotosI1));
		LDU.adicionar(new Universidad("UNIVERSIDAD CATOLICA BOLIVIANA", "La Paz", "Murillo", "La Paz", "A", "B", "PRIVADA", "C", 0, 0, f2, cm2, fotosI2));
		LDU.adicionar(new Universidad("UNIVERSIDAD PUBLICA EL ALTO", "La Paz", "Murillo", "La Paz", "A", "B", "PRIVADA", "C", 0, 0, f3, cm3, fotosI3));   


		//7,9 recurs
		//

        //RETORNANDO LISTA UNIVERSIDADES
		return LDU.toList();
    }

    public async Task<IEnumerable<InstitucionEducacion>> GetContentGridDataAsync()
    {
        _allInstituciones ??= new List<InstitucionEducacion>(AllInstituciones());

        await Task.CompletedTask;
        return _allInstituciones;
    }

    public async Task<IEnumerable<Instituto>> GetContentGridDataInstitutoAsync()
    {
        _allInstitutos ??= new List<Instituto>(AllInstitutos());

        await Task.CompletedTask;
        return _allInstitutos;
    }

    public async Task<IEnumerable<Universidad>> GetContentGridDataUniversidadAsync()
    {
        _allUniversidades ??= new List<Universidad>(AllUniversidades());

        await Task.CompletedTask;
        return _allUniversidades;
    }


    public async Task<IEnumerable<InstitucionEducacion>> GetGridDataAsync()
    {
        _allInstituciones ??= new List<InstitucionEducacion>(AllInstituciones());

        await Task.CompletedTask;
        return _allInstituciones;
    }
    public async Task<IEnumerable<Instituto>> GetGridDataInstitutoAsync()
    {
        _allInstitutos ??= new List<Instituto>(AllInstitutos());

        await Task.CompletedTask;
        return _allInstitutos;
    }
    public async Task<IEnumerable<Universidad>> GetGridDataUniversidadAsync()
    {
        _allUniversidades ??= new List<Universidad>(AllUniversidades());

        await Task.CompletedTask;
        return _allUniversidades;
    }

    public async Task<IEnumerable<InstitucionEducacion>> GetListDetailsDataAsync()
    {
        _allInstituciones ??= new List<InstitucionEducacion>(AllInstituciones());

        await Task.CompletedTask;
        return _allInstituciones;
    }
}
