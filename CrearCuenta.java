package proyecto_bytebank;

//new...es una palabra reservada-->nos ayuda a crear en memoria un espacio nuevo para una nueva instancia;
//al escribrir new Cuenta(); -->>JAVA inicializa cada atributo a su valor por defecto:
		//String = null;
		//int = 0;
		//double = 0.0;
//Esto aplica solo en el caso en el que, en el objeto Cuenta; no hayamos definido los valores;


public class CrearCuenta {
	public static void main(String[] args) {
		// vamos a acceder al objeto Cuenta y guardar valores dentro de sus atributos:
		//Para ello vamos a guardar nuestro objeto Cuenta en una varible:
		
		//Cuando se trata de datos que contienen un solo tipo de dato puede compilar ...int agencia;
		//Pero, en el caso de un objeto cuando representa la agruapcion de uno o mas datos....new Cuenta();
		
		Cuenta primeraCuenta = new Cuenta();  //Esto es una instancia del Objeto Cuenta; puede haber "n" cantidad; cada una con sus valores;
		//mas adelante en polimorfismos veremos las ventajas de la sintaxis utilizada;
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
	    //Sera que puedo llamar un atributo que no esta definido en mi objeto Cuenta?
		//primeraCuenta.pais = "Peru"; --->>> no se puede, primero necesitamos crear el atributo;
		
		
		//Vamos a crear una nueva instancia;
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		System.out.println();
		
		//Solo para salir de dudas:
		//Saldo de mi primera instancia:
		System.out.println("El saldo de mi primera cuenta es: " + primeraCuenta.saldo);
		//Saldo de mi segunda instancia:
		System.out.println("El saldo de mi segunda cuenta es: " + segundaCuenta.saldo);
		
		//------------Vayamos a mas profundidad-------------
		
		//Cuenta primeraCuenta -->>>es una variable que hace referencia al valor  "="  newCuenta(); --ie a un nuevo espacio en memoria;
		//Cada objeto crea un ID alfanumerico en la memoria, PE:
		// VAriable = ID342ASDF;
		//Por tanto, en JAVA la variable no guarda un dato, si no, la "referencia" a un espacio de memoria;
		
		//Ve a la clase Testeferencia, para entender mejor el concepto antes mencionado.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
