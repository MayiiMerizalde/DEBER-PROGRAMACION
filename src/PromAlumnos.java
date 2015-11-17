import java.util.Scanner;
public class PromAlumnos {

	public static void main(String[] args) 
	{
		Scanner obj= new Scanner (System.in);
		 int cantd=0;
		 int cont=0; 
		 float nota=0.0f;
		 float prom =0.0f;
		
			System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
			System.out.println("+.+.+.+.+.BIENVENIDOS+.+.+.+.+.+..+");
			System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
		
		System.out.println("Ingrese número de estudiantes:");
			cantd = obj.nextInt();
			
			while (cont < cantd)
			{
				System.out.print("Ingrese nota de estudiante:");
				nota += obj.nextFloat();
				
				cont++;
			}
				prom = (nota / cantd);
				
				System.out.println("");	
				System.out.println("EL PROMEDIO ES: "+prom+"");
	
		
				}
		}
