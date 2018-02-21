
public class Iterations {

	public static void main(String[] args) {
		
		/*int num = 5;
		int i = 1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println("=========While Loop========");
		int num = 5;
		int i = 100;
		
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("==========================");
		
		System.out.println("=========Do While Loop========");
		num = 7;
		i = 100;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		System.out.println("==========================");
		System.out.println("=========For Loop========");
		
		num = 9;
		//for(int nm=8,j=1;j<=10;j++){
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("==========================");
	}

}
