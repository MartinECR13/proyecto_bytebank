package proyecto_bytebank;

//new...es una palabra reservada-->nos ayuda a crear en memoria un espacio nuevo para una nueva instancia;
//Cuando se trata de datos que contienen un solo tipo de dato puede compilar ...int agencia;
//Pero, en el caso de un objeto cuando representa la agruapcion de uno o mas datos....new Cuenta();

public class CrearCuenta {
	public static void main(String[] args) {
		// vamos a acceder al objeto Cuenta y guardar valores dentro de sus atributos:
		//Para ello vamos a guardar nuestro objeto Cuenta en una varible:
		
		Cuenta primeraCuenta = new Cuenta();  //Esto es una instancia del Objeto Cuenta; puede haber "n" cantidad; cada una con sus valores;
		//mas adelante en polimorfismos veremos las ventajas de la sintaxis utilizada;
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
	//  Sera que puedo llamar un atributo que no esta definido en mi objeto Cuenta?
		//primeraCuenta.pais = "Peru"; --->>> no se puede, primero necesitamos crear el atributo;
		
		
		//Vamos a crear una nueva instancia;
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
