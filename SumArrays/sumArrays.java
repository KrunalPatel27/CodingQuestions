
public long sumArrays(int[] arr){
	int length = arr.length;
        long sum = 0;
        
        if((length % 2) ==0){
        int multiplier = (length/2) * ((length/2) +1);
        int counter = 1; 
        int powerInt =1;
            for(int i=(length/2) -1; i>=0; i--){
               // System.out.println(i);
                sum += arr[i] * multiplier;
                sum += arr[i+counter] * multiplier;
                counter+=2;
                multiplier = multiplier - ((int)Math.pow(2,powerInt++)); 
            }         
        }

        else{
            int multiplier = ((length/2) +1) * ((length/2) +1);
            int powerInt = 0;
            int counter = 2;
			int powerCheck =0;
            sum = arr[(length/2)] * multiplier;
            for(int i = (length/2) -1; i >=0; i--){
                 //System.out.println(i);
                multiplier = multiplier - ((int)Math.pow(2, powerInt++) + powerCheck);
                sum+= arr[i] * multiplier;
                sum+= arr[i + counter] * multiplier;
                counter += 2;
                powerCheck =1;
            }  
        }
        return sum;

}