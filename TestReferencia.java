package proyecto_bytebank;

public class TestReferencia {
	
	public static void main(String[] args) {
		//VAmos a crear 2 instancias del objeto Cuenta:
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		
		Cuenta segundaCuenta = primeraCuenta;
		
		//Ahora viene la gran pregunta...si yo hago lo siguiente:
	    segundaCuenta.saldo = 100;
	    //¿¿Se verá afectado el saldo de primeraCuenta???
	    System.out.println("El saldo de mi primer cuenta es: " + primeraCuenta.saldo);
	    System.out.println("El saldo de mi segunda cuenta es: " + segundaCuenta.saldo);
	    
	   //En consola:
	    //El saldo de mi primer cuenta es: 100.0
	    //El saldo de mi segunda cuenta es: 100.0
	    
	    //Como puedes darte cuenta si se vio afectado:
	    //Porque?? porque ambos objetos estan apuntando a la misma direccion en memoria;
	    //En este ejemplo solo creamos un registro en memoria:
	    //		Cuenta primeraCuenta = new Cuenta();
	    //Y nuestra segundaCuenta hace referencia a nuestra primerCuenta; por tanto, ambas referencian a la misma direccion en memmoria;
	    //      		Cuenta segundaCuenta = primeraCuenta;
	    
	    //Entonces cualquier modificacion, se vera reflejada en ambas:
	    System.out.println();
	    segundaCuenta.saldo += 400;
	    System.out.println("El nuevo saldo de mi primeraCuenta es: " + segundaCuenta.saldo);
	    
	    System.out.println();
	    //Como saber el ID de mi instancia?
	    System.out.println("El ID de la ubicacion en memoria de mi primeraCuenta es: " + primeraCuenta);
	    System.out.println("El ID de la ubicacion en memoria de mi segundaCuenta es: " + segundaCuenta);
	    
	    //Ahora reservaremos un espacio en memoria independiente a cada instancia:
	    
	    Cuenta terceraCuenta = new Cuenta(); 
	    Cuenta cuartaCuenta = new Cuenta(); 
	 
	    
	    //Verificamos el ID de cada espacio en memoria:
	    System.out.println();
	    
	    System.out.println("ID terceraCuenta" + terceraCuenta);
	    System.out.println("ID cuartaCuenta" + cuartaCuenta);
	    
	    //Para que qeude mas claro:
	    System.out.println();
	    
	    if (primeraCuenta == segundaCuenta) {
	    	System.out.println("Son el MISMO objeto/instancia");
	    }
	    
	    System.out.println();
	    
	     if (terceraCuenta != cuartaCuenta ) {
	    	 System.out.println("Son Objetos/instancias DIFERENTES");
	     }
	     
	     //En consola:
	     //Son el MISMO objeto/instancia
	     //Son Objetos/instancias DIFERENTES
	    
	    




	    

	    
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
