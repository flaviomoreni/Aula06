
public class MaxValue {

	public static void main(String[] args) {
		
		int valores[] = { 37, 61, 5, 33, 100, 34, 1, 76, 66, 44, 12, 80, 11, 31, 72, 16, 3, 5, 94, 49, 7, 75, 32,
				79 };

		int max = valores[0];
        for(int i = 0; i < valores.length; i++)
        {
            if(max < valores[i])
            {
                max = valores[i];
            }
        }
        
        System.out.println("Maior:"+max);
		
	}

}
