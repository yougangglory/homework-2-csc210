import java.util.Random;

public class Grades{

   private static int [] array1 = new int[]{1,50,48,75,65,85,2,98,99,64,7,0,58,98,99,100};
   
    
   
   //sorting counting array and sorted array

   public static int[] countingSort( ){
      int [] array2= new int [getMaxScore()+1];
        for( int i=0;i<array1.length;i++) {
          array2[array1[i]]= array2[array1[i]]+1;
        }
       return(array2);
    }

    public static int[] sortedScores(){
      int h=0;
      int index = countingSort().length;
      int [] sorted_array= new int [addAll(countingSort())]; 
        for( int i=(index-1);i>0;i--) {
            if((countingSort()[i]) >0 ){
              int count = countingSort()[i];
                while(count>0){
                  sorted_array[h++]=i;
                  count=count-1;
                }
            }
        }
      return sorted_array;
     
    }

    public static int getRank(int id){
         
        if((countingSort()[array1[id]]) > 1 ){
          int rank =(indexOf(sortedScores(), array1[id]))+1;
          int b= (countingSort()[array1[id]])-1;
          System.out.println("("+rank+","+ (rank+b)+")");

        }
        else{    
            System.out.println(((indexOf(sortedScores(), array1[id]))+1));
        }
        return (indexOf(sortedScores(), array1[id]))+1;
        
     }

    //help functions
    
    // print an array
    public static void forstring(int arrayinput[]){
        for( int i=0;i<arrayinput.length;i++) {
           System.out.print(" "+ arrayinput[i] + ",") ;
        }
    }

    public static int addAll(int [] array ){
        int sum=0;
           for(int item : array){
              sum = sum+item;
           }
        return(sum);
    }

    public static int indexOf(int [] array, int b){
        for(int i=0;i<array.length;i++){
            if( b == array[i]){
             return i;
            }
        }
      return -1;
    }

    public static boolean isElement(int [] array, int b) {
        for(int i=0;i<array.length;i++){
            if( b == array[i]){
             return true;
            }
        }
        return false;
    }
    public static int  findMin(int [] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if( min > array[i]){
             min=array[i];
            }
        }
      return min;
    }
    public static int  findMax(int [] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if( max < array[i]){
             max=array[i];
            }
        }
      return max;
    }
    
    public static int maximum_id(){
        return array1.length-1;
    }

    //new functions
    public static int getScore(int id){
       return array1[id];
    }

    public static boolean perfectScoreQ(){
      return isElement(array1, 100);
    }

    public static boolean bottomScoreQ(){
        return isElement(array1, 0);
    }

    public static int getMaxScore(){
     return findMax(array1);
    }

    public static int nrMaxScores(){
        return countingSort()[getMaxScore()];
    }

    public static int getMinScore(){
       return findMin(array1);
    }

    public static int nrMinScores(){
     return countingSort()[getMinScore()];
    }

}
