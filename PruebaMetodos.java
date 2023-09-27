package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		Cuenta cuentaDeXimena = new Cuenta();
		
		
		//Aqui incrementamos 300 a mi saldo:
		miCuenta.saldo = 300;
		
		
		
		//Aqui tambien incrementamos (200) a nuestro saldo, solo que ahora es mas chido, pues utilizamos un metodo especifico para ello --> depositar();
		//En la siguiente linea --> fijate la sintaxis para llamar un metodo:
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		//Depositamos en la cuenta de Ximena:
		cuentaDeXimena.depositar(1000);
		
		
		//Aqui retiraremos de miCuenta;
		//Llamamos al metodo retirar:
		
		//Retiramos 100, recuerda que tenemos 300
		miCuenta.retirar(100);
		System.out.println();
		//Intentamos retirar 500, que pasara??---> fijate en la consola;
		miCuenta.retirar(500);
		
		//Ahora vamos a "tranferir" de la cuenta de Jimena a miCuenta:
		//Al referenciar al objeto miCuenta, tenemos acceso a la informacion contenida dentro de ella;
		System.out.println();
		cuentaDeXimena.transferir(400, miCuenta);
		System.out.println();
		System.out.println("Checando el saldo de miCuenta, despues de la transferencia de Ximena: " + miCuenta.saldo);
		
		
		//**Vamos a ver la utilidad de metodos que retornan valor:
		System.out.println();
		if (cuentaDeXimena.transferir(100, miCuenta)) {   //Porque consigo poner todo ese metodo en la sentencia if?
    			System.out.println("Transferencia exitosa");//La sentecia if recibe True || False;
    			                                            //En este caso el metodo transferir "retorna" True;
    			                                            //Por eso funciona la sentencia if;
		}
		
		System.out.println();
		//Tambien lo podemos expresar de la siguiente manera:
		
		boolean puedeTransferir = cuentaDeXimena.transferir(300, miCuenta);
		System.out.println();
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No es posible transferir");
		}
		
		
		
		
		
		
	}

}
