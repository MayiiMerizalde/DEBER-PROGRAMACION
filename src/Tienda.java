
import java.util.Scanner;
public class Tienda {
	static Scanner dato = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DESEA INGRESAR AL SISTEMA");
		String r=dato.nextLine();
		
		while(r.equalsIgnoreCase("SI")||r.equalsIgnoreCase ("si")){
			System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
			System.out.println("+.+.+.+.+.BIENVENIDOS+.+.+.+.+.+..+");
			System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
			String  []col = new String [3];
			
			String color;
			int cont;
			float valor, total;
		
			cont=0;
			for(cont=1; cont<=20; cont++)
				col[0]="amarillo";
			    col[1]="rojo";
			    col[2]="blanco";
			    
			    	Scanner objsc= new Scanner(System.in);
			    	Scanner obj= new Scanner(System.in);
			    		
			    	
				System.out.println("Ingrese el valor de su compra");
				valor= objsc.nextFloat();
				
				
				
				System.out.println("Ingrese color de bolita");
				color= obj.nextLine();

			
				if (color.equals(col[0]))
				{
					total= valor - (valor*0.25f);
					
					System.out.println("usted obtuvo el 25% ") ;
					System.out.println("su valor a cancelar es: " +total);
			}	
			
			   if (color.equals(col[1]))
			   {
				   total=valor-(valor*0.40f);	
				
					System.out.println("usted obtuvo el 40% ") ;	
					System.out.println("su valor a cancelar es: " +total);
			   }
			
			 if (color.equals(col[2]))
			 {			
					
					System.out.println("usted  no obtuvo descuento ") ;
			 System.out.println("su valor a cancelar es: " +valor);
			 }
		
			System.out.println("DESEA CONTINUAR EN EL SISTEMA");
			r=dato.nextLine();
			
		}
		System.out.println("Gracias por usar el sistema");
	}}
