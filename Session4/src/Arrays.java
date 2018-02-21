
public class Arrays {

	public static void main(String[] args) {
		
		// Implicit Way
		int[] a1 = {10,20,30,40,50};
		int a2[] = {10,20,30,40,50};
		
		// Explicit Way
		int[] a3 = new int[]{10,20,30,40,50};
		int a4[] = new int[]{10,20,30,40,50};
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);
		
		int[] a5 = new int[5];
		a5[3] = 100;
		
		for(int elm : a5){
			System.out.println(elm);
		}
		
		int i,j;
		i = 10;
		j = 20;
		
		int[] a6,a7;
		a6 = new int[10];
		a7 = new int[]{1,2,3,4,5};
		
		int a8[],a9[];
		a8 = new int[10];
		a9 = new int[20];
		
		int[] popPunjab = {1256,1234,54322,6721,4324,1278};
		int[] popHaryana = {54322,6721,4324,1278};
		int[] popKarnataka = {54322,6721,4324,1278,1234,5432,8754,123,567};
		int sum = 0;
		for(int elm : popPunjab){
			sum = sum + elm;
		}
		
		System.out.println("Total Population of Punjab is "+sum);
		
		int[][] popCountry = {
								{1256,1234,54322,6721,4324,1278},
								{54322,6721,4324,1278},
								{54322,6721,4324,1278,1234,5432,8754,123,567}
							 };
		
		System.out.println("******************");
		System.out.println(popPunjab);
		System.out.println(popCountry);
		System.out.println("******************");
		System.out.println(popPunjab.length);
		System.out.println(popCountry.length);
		System.out.println("******************");
		System.out.println(popCountry[0]);
		System.out.println(popCountry[0].length);
		System.out.println("******************");
		System.out.println(popCountry[0][3]);
		System.out.println("******************");
		
		sum = 0;
		
		for(int p=0;p<popCountry.length;p++){
			for(int q=0;q<popCountry[p].length;q++){
				System.out.print(popCountry[p][q]+"  ");
				
				sum = sum+popCountry[p][q];
				
			}
			System.out.println();
		}
		
		System.out.println("Population of Country is: "+sum);
		
		
		int[][][] popWorld = {
								 {
									{1256,1234,54322,6721,4324,1278},
									{54322,6721,4324,1278},
									{54322,6721,4324,1278,1234,5432,8754,123,567}
								 },
								 {
										{1256,1234,54322,6721,4324,1278},
										{54322,6721,4324,1278},
										{54322,6721,4324,1278,1234,5432,8754,123,567}
								}
							 };
		
		System.out.println("******************");
		System.out.println(popWorld.length);
		System.out.println("******************");
		System.out.println(popWorld[0].length);
		System.out.println("******************");
		System.out.println(popWorld[0][0].length);
	
	}

}
