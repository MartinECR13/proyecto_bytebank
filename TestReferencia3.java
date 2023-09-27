package proyecto_bytebank;

//Valores Null

public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta();
	
		//Que pasa si escribimos lo siguiente?
		//cuentaDeDiego.titular.nombre= "Diego";
		
		//Qué pasaria si en este momento lo imprimos en consola: 
		//System.out.println(cuentaDeDiego.titular.nombre);       //¿Nos dará un Exception?
		
		//Por que nos aparece un Exception?
		//Esto es porque el atributo del objeto Cuenta -->Cliente titular = null;
		//Y entonces al estar referenciando a null --> que null significa nada.
		//Pues no estamos referenciando ninguna instancia, verdad?
		//Y nadie da lo que no tiene;
		
		//Entonces, tenemos que inicializar ese atributo Cliente titular, del objeto Cuenta;
		//¿Como lo hacemos?, de la siguiente manera:
		
		Cliente clienteDiego = new Cliente(); //Aqui ya estamos inicializando una instacia del objeto Cliente;
		cuentaDeDiego.titular = clienteDiego; //Ahora si podemos referenciar el objeto Cuenta con el objeto Cliente;
		
		//Ahora imprimimos nuevamente cuentaDeDiego.titular.nombre
		System.out.println(cuentaDeDiego.titular.nombre);
		//Nos da null...:(
		//Tal vez porque no inicializamos el atributo nombre:
		cuentaDeDiego.titular.nombre = "Diego";
		System.out.println(cuentaDeDiego.titular.nombre);

		//Recuerda que si no inicializamos, los atributos se inicializaran por defecto:
		//al escribrir new Cuenta(); -->>JAVA inicializa cada atributo a su valor por defecto:
		//String = null;
		//int = 0;
		//double = 0.0;
		//Cliente = null;   Recuerda que String y Cliente son objetos;
		//Esto aplica solo en el caso en el que, en el objeto Cuenta; no hayamos definido los valores;
		

		
		
	
		
		
		
		
		
		
	}
	
	
}
