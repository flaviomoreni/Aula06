
public class MinValue {

	public static void main(String[] args) {
		int valores[] = { 37, -61, 5, 33, 100, 34, 1, 76, 66, 44, 12, 80, 11, 101,  72, 16, 3, 5, 94, 49, 7, 75, 32,
				79 };

		int min = valores[0];
        for(int i = 0; i < valores.length; i++)
        {
            if(min > valores[i])
            {
            	min = valores[i];
            }
        }
        
        System.out.println("Menor: " + min); 
	}

}
