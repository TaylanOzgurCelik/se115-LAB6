
import  java.util.Random;
public class Arrrrayyy {

    
    public static void main(String[] args) {
        
    
        System.out.println("------------");
        System.out.println("----ROTATE----");
        System.out.println("------------");
        rotateHandler();
        System.out.println();
        System.out.println();

        System.out.println("------------");
        System.out.println("----PEAK----");
        System.out.println("------------");
        
        peakHandler();
        System.out.println();
        System.out.println();
        System.out.println("-------------");
        System.out.println("---WEATHER---");
        System.out.println("-------------");
        

        weatherhandler();
        


    }
    public static void rotateHandler(){
        int[] taylan  =  createRandomArray();
        printArray(taylan);
        int[] ntayla = rotateArray(taylan);
        printArray(ntayla);
    }
    public static void weatherhandler(){
        // 0 sunny   40
        // 1 cloudy  30
        // 2 rainy   20
        // 3 stormy  10
        Random rn = new Random();
        int aa=1000000;
        int[] olasılıklar={40,30,20,10};

        int sunnyCount=0;
        int cloudyCount=0;
        int rainyCount=0;
        int stormyCount=0;




        for (int i = 0; i < aa; i++) {
            
            int chosenProbability = rn.nextInt(100)+1;
            //System.out.print(chosenProbability);
            if (chosenProbability <= olasılıklar[0]) {
                
                sunnyCount++;
            }else if (chosenProbability <=olasılıklar[0]+olasılıklar[1] ) {
                
                cloudyCount++;
            }
            else if (chosenProbability <=olasılıklar[0]+olasılıklar[1]+olasılıklar[2]  ) {
                
                rainyCount++;
            }else{
               
                stormyCount++;

            }

        }


        float sunnyPercentage=(sunnyCount/(float)aa)*100f ;
        float cloudyPercentage=(cloudyCount/(float)aa)*100f ;
        float rainyPercentage=(rainyCount/(float)aa)*100f ;
        float stormyPercentage=(stormyCount/(float)aa)*100f ;
        
        System.out.println(sunnyCount);
        System.out.printf("Sunny percentage = %.2f",sunnyPercentage);
        System.out.println();
        
        System.out.println(cloudyCount);
        System.out.println();
        
        
        System.out.printf("Cloudy percentage = %.2f",cloudyPercentage);
        System.out.println();
        System.out.println(rainyCount);
        System.out.println();
        
        System.out.printf("Rainy percentage = %.2f",rainyPercentage);
        System.out.println();
        
        System.out.println(stormyCount);
        System.out.println();
        
        System.out.printf("Stormy percentage = %.2f",stormyPercentage);
    }

    public static void peakHandler(){
        Random rn = new Random();
        int[] arr=new int[30];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=rn.nextInt(1,101);

        }
        printArray(arr);
        int largestPeak=0;
        int peakCount=0;
        for (int i = 1; i < arr.length-1; i++) {
            
            if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
                peakCount++;
                System.out.println(arr[i]);
                if (arr[i]>largestPeak) {
                    largestPeak=arr[i];
                }
            }


        }
        System.out.println("Total peak count = "+peakCount);
        System.out.println("Largest peak value = "+largestPeak);
    }

    public static int[] createRandomArray(){
        
        Random rn = new Random();
        
        int size=rn.nextInt(11)+10;
        int[] rnArray=new int[size];

        for (int i = 0; i < rnArray.length; i++) {
            
            rnArray[i]=rn.nextInt(100);

        }


        return rnArray;
    }

    public static int[] rotateArray(int[] arr){


        int[] new_arr = new int[arr.length]; 

        // 1,2,3

        new_arr[0]=arr[arr.length-1];
        




        for (int i=0; i< arr.length-1 ; i++) {
            
            new_arr[i+1] = arr[i];

        }


        return new_arr;
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
