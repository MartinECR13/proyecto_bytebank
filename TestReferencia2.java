package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "456746773636";
		diego.telefono = "45345345345";
		
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia= 1;
		
		//¿Cómo creamos la relacion entre la instancia cuentaDeDiego y diego?
		//Tenemos que crear una referencia -- > "Ve a objeto Cuenta, para ver como le hacemos->busca el atributo -->Cliente titular;"
		
		//objeto Cuenta->cuentaDeDiego--referencia--objeto Cliente->diego   ;
 		cuentaDeDiego.titular = diego;
 		
 		//Ahora, atraves de la referencia al titular; tenemos acceso a todos los atributos del objeto Cliente:
 		
 		System.out.println(cuentaDeDiego.titular.nombre);
 		System.out.println(cuentaDeDiego.titular.documento);
 		
 		//Vamos a imprimir los ID de las direcciones en memoria
 		System.out.println();
 		
 		System.out.println("Esta es la referencia del objeto cuentaDeDiego: " + cuentaDeDiego);
 		System.out.println("Esta es la referencia de cuentaDeDiego.titular: " + cuentaDeDiego.titular);
 		System.out.println("Esta es la referencia del objeto diego: " + diego);



 		
		
		
		
		
		
	}

}
	
	

