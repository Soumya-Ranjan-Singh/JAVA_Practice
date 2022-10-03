//This program is to find the frequency of each element in the array.

package day3Problems;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[]{10,20,10,80,50,20,20,30,60};
		int[] temp = new int[array.length];
		int visited=-1;
		int n = array.length;
		
		for (int i = 0; i < n; i++)
		{
			int count = 1;
			for (int j = i+1; j < n; j++)
			{
				if (array[i] == array[j])
				{
					count++;
					temp[j] = visited;
				}
				
			}
			if (temp[i] != visited)
				temp[i] = count;
			
		}
		System.out.println("---------------------");  
        System.out.println(" Element | Frequency ");  
        System.out.println("---------------------"); 
        for(int i = 0; i < temp.length; i++){  
            if(temp[i] != visited)  
                System.out.println("    " + array[i] + "    |    " + temp[i]);  
        }  
        System.out.println("---------------------");
        
	}

}
