

import java.util.Scanner;
public class PorcentReprobads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acum, ind ;
		int promedio;
		int nota[] = new int[50];
		acum =0;
		int cont=0;
		promedio=0;
		Scanner objvalor = new Scanner (System.in);
		
		System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
		System.out.println("+.+.+.+.+.BIENVENIDOS+.+.+.+.+.+..+");
		System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
		for(ind=0; ind<50; ind++)
		{
			System.out.println("INGRESE NOTA POR FAVOR:  ");
			nota[ind]=objvalor.nextInt();
			cont= cont+nota[ind];			
		}
					for ( ind=0; ind<50; ind++)
					{
						if (nota[ind]>=1 & nota[ind]<70)
							acum=acum+1;
						promedio=((100 * acum)/50);
								
					}
					System.out.println("Porcentaje de Reprobados =" +promedio+ "%");
	}					
		}
		
		
		
