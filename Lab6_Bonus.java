import java.util.Random;

public class Lab6_Bonus {
    
    public static void main(String[] args) {
        
        int bestStudent=-1;
        int bestQuiznote=-1;
        int quizN=-1;

        System.out.println("Student no starts from zero for indexing purposes");
        int[][] arr = new int[5][4];
        Random rn= new Random();
        for (int i = 0; i < arr.length; i++) { // 5 öğrenci için döner
            System.out.print("\nStudent "+(i)+" : ");
            for (int j = 0; j < arr[i].length; j++) { // 4 quiz için dönüyor


                int not=rn.nextInt(101);
                arr[i][j]=not;

                if (not>bestQuiznote) {
                    bestQuiznote=not;
                    bestStudent=i;
                    quizN=j;

                }else if (not==bestQuiznote) {
                    if (bestStudent==i) {
                        
                        if (quizN<j) { // REDUNDANT CHECK, WONT BE TRUE
                            quizN=j;
                        }

                    }else if(i<bestStudent){ 
                        bestStudent=i;
                        quizN=j;
                    }
                }
                
                System.out.printf("%d",arr[i][j]);
                if (j!=arr[i].length-1) {
                    System.out.print(",");
                    
                }


            }
        }

        System.out.println("\nPlease note that base student index starts from zero ");
        System.out.println("\nPlease note that quiz index starts from zero ");
        System.out.println("This means location may be from (0,0) to (4,3)");
        System.out.println("Best student = "+bestStudent);
        System.out.println("Best quiz note = "+bestQuiznote);
        System.out.println("Location ("+bestStudent+","+quizN+")");




    }
}
