package proyecto_bytebank;

public class TestReferencia4 {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDeDiego = new Cuenta();
		
		//Aqui tenemos un objeto ciente:
		Cliente cliente   = new Cliente();
		//Aqui asignamos objeto cliente a titular:
		cuentaDeDiego.titular = cliente;
		
		//Este objeto cliente es accesible de las siguiente manera:
		cliente.documento = "23434234";
		//Y tambien es accesible de la siguiente manera:
		cuentaDeDiego.titular.documento = "454254352";
		
		//------------------------------
		//De que otra forma podemos anexar cliente al objeto cuenta?
		//Podemos hacer lo siguiente:
		
		Cuenta cuentaDeMartin = new Cuenta();
		//De esta forma inicializar de forma mas directa el objeto cliente:
		cuentaDeMartin.titular = new Cliente();
		
		//Ahora podria hacer lo siguiente:
		cuentaDeMartin.titular.nombre = "Martin";
		//Y podemos imprimirlo sin problema:
		
		
		System.out.println(cuentaDeMartin.titular.nombre);
		
		//---------------
		//Ahora avancemos mas--> ve a la clase Cuenta.java y observa
		//el atributo Cliente atributo;
		//ESta vez lo vamos a inicializar
		//Para que quede por defecto asi:
		//Cliente atributo = new Cliente()	;
		//Asi cuando inicialicemso una nueva instancia del objeto Cuenta:
		//PE Cuenta cuentaDePepe = new Cuenta();
		//Por defecto estaremos inicializando una nueva instancia del objeto Cliente;
		//Y por los tanto, no necesitaremos referenciarlo, como en los ejemplos anteriores;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
