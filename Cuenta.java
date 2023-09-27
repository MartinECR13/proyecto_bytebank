package proyecto_bytebank;

//*Estando en cualquier instancia podemos retornar a este objeto con el shortcut: ctrl + clickEnMetodo/clickEnCuenta;
//entidad/objeto Cuenta{

//ATRIBUTOS:

//saldo
//agencia
//numero
//titular


//METODOS:

//Depositar
//Retirar
//Transferir

//}



public class Cuenta {
	
	//Atributos o campos del objeto Cuenta:
	double saldo;
	int agencia;
	int  numero;
	
	//Con el siguiente atributo, "vamos a referenciar objeto Cuenta con objeto Cliente";
	Cliente titular;
	//Ahora fijate lo vamos a inicializar por defecto:
	//Cliente titular = new Cliente;
	
	//Con esta accion, una vez instanciado un nuevo objeto Cuenta;
	//Por defecto, estaremos instanciando un nuevo objeto Cliente;
	//Y nos ahorraremos estar referenciando como en los ejemplos: TestReferencia 1,2,3,4;
	
	//Abrire un proyecto JAVA, con los nuevos cambios. Para que quede mas claro.
	
	//Metodos:
	
	//Hay metodos con parametros : depositar(parametro)  -->recuerda dar nombre significativos a las variables,metodos y parametros;
	//Y metodos sin parametros:  depositar() 
	//En JAVA tenemos metodos que retornan valor y los que no retornan valor
	
	
	//Para este ejemplo usaremos un metodo que "no retorna" valor-->void:
	//por convencion en JAVA, el nombre de los metodos empiezan con minuscula;
	//public --> es un modificador de acceso;
	
	 public void depositar(double valor){
		 //Para no confundirnos, podemos utilizar this.atributo/campoDelObjetoCuenta ; 
		 //this. es una referencia que apunta al objeto-> en este caso al objeto Cuenta;
		this.saldo = this.saldo + valor;
		//A JAVA le decimos:
		//Al saldo de "este" objetoCuenta le vas a aumentar el saldo de "este" objetoCuenta que ya existe mas el valor/parametro;
	    //OJO:
		//No podemos hacer esto --> this.valor ; por que valor no es un campo del objeto Cuenta, 
		//valor es un parametro del metodo depositar;
	 }
	 
	 
	 //Segundo Metodo--retirar()-
	 
	 //Ahora nuestro metodo nos "retornara" algo:
	 //"Exit" o "Error" -->>  por tanto haremos un booleano-->boolean:
	 
	 public boolean retirar(double valor){
		 //Si this.saldo >= al valor que deseo retirar, entonces;
		 if(this.saldo >= valor) {
			 System.out.println("Saldo suficiente :)");
			 //this.saldo = this.saldo -valor;
			 this.saldo -= valor;
			 System.out.println("Su saldo actual es: " + this.saldo);
			 //return --> palabra reservada para retornar valor;
			 return true;  //Con return con return cortamos este metodo y salimos de  la ejecucion de éste.
		 }else {
			 System.out.println("Saldo insuficiente :(" );
			 System.out.println("Usted quizo retirar: " + valor + " pero, su saldo es de: " + this.saldo );
			 return false; 
		 }
	 }
	  
	 //Tercer metodo---- transferir ----
	 //Para transferir, necesitamos saber a quien transferir(Cuenta cuenta) y cuanto vamos a transferir (double valor);
	 
	 public boolean transferir(double valor, Cuenta cuenta){
		 
		 if (this.saldo >= valor) {
			 //this.saldo = this.saldo - valor;
			 this.saldo -= valor;
//Puede ser asi-> cuenta.saldo = cuenta.saldo + valor; pero, mejor con nuestro metodo depositar();
			 cuenta.depositar(valor);
			 System.out.println("Su saldo actual es de: " + this.saldo);
			 System.out.println("Su transferencia fue exitosa");
			 return true;
			 
		 }//else
			 System.out.println("Tranferencia NO exitosa, saldo insufiente :(");
			 return false;
		 
		 
	 }
	 
	 
	 
	 
	

}
