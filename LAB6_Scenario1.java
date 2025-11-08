public class LAB6_Scenario1 {



    public static void main(String[] args) {
        int[]stdID=new int[20];
        for(int i=0;i<stdID.length;i++){
            stdID[i]=1000+i;
            
        
        }   

        printArray(stdID);
        printArray(function(stdID, 42));



    }

    public static int[] function(int[] old_array,int size){
        int[] newstdID=new int[size];
        for(int x=0;x< old_array.length;x++){
            newstdID[x]=old_array[x];
        }
        return newstdID;
    }
    
    public static void printArray(int [] arr){

        System.out.print("{");
        for (int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
            if (i!=(arr.length-1)) {              
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }


}