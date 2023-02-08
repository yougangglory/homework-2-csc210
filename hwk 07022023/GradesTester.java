public class GradesTester{

    public  static void test_countingSort(){
        System.out.println("==========Testing countingSort==========");
        System.out.println("\n");
        System.out.println("the counting sorted array is : ");
        Grades.forstring(Grades.countingSort());
        System.out.println("\n");
        System.out.println("==========Done testing countingSort ==========");
        
    }
    public  static void test_sortedScores(){
        System.out.println("==========Testing sortedScores==========");
        System.out.println("\n");
        System.out.println("the sorted array in decreasing is : ");
        Grades.forstring(Grades.sortedScores());
        System.out.println("\n");
        System.out.println("==========Done testing sortedScores ==========");
        
    }

    public static void test_getRank(int id){
        System.out.println("==========Testing getRank==========");
        System.out.println("\n");
        System.out.print("Your rank is : ");
        Grades.getRank(id);
        System.out.println("\n");
        System.out.println("==========Done testing getRank ==========");

    }

    public  static void test_getScore(int id){
        System.out.println("==========Testing getScore==========");
        System.out.println("\n");
        System.out.println("Your score is : "+ Grades.getScore(id));
        System.out.println("\n");
        System.out.println("==========Done testing getScore ==========");
        
    }
    public static void test_perfectScoreQ(){
        System.out.println("==========Testing perfectScoreQ==========");
        System.out.println("\n");
        System.out.println("Did someone get a perfect score: "+ Grades.perfectScoreQ());
        System.out.println("\n");
        System.out.println("==========Done testing perfectScoreQ ==========");

    }
    public static void test_bottomScoreQ(){
        System.out.println("==========Testing bottomScoreQ==========");
        System.out.println("\n");
        System.out.println("Did someone get a bottom score: "+ Grades.bottomScoreQ());
        System.out.println("\n");
        System.out.println("==========Done testing bottomScoreQ ==========");

    }
    public static void test_getMaxScore(){
        System.out.println("==========Testing getMaxScore==========");
        System.out.println("\n");
        System.out.println("The max score is : "+ Grades.getMaxScore());
        System.out.println("\n");
        System.out.println("==========Done testing getMaxScore ==========");

    }
    public static void test_nrMaxScores(){
        System.out.println("==========Testing nrMaxScores==========");
        System.out.println("\n");
        System.out.println("The number of students with the maximum score is : "+ Grades.nrMaxScores());
        System.out.println("\n");
        System.out.println("==========Done testing nrMaxScores ==========");

    }
    public static void test_getMinScore(){
        System.out.println("==========Testing getMinScore==========");
        System.out.println("\n");
        System.out.println("The minimum score is "+ Grades.getMinScore());
        System.out.println("\n");
        System.out.println("==========Done testing getMinScore ==========");

    }
    public static void test_nrMinScores(){
        System.out.println("==========Testing nrMinScores==========");
        System.out.println("\n");
        System.out.println("The number of students with the minimum score is : "+ Grades.nrMinScores());
        System.out.println("\n");
        System.out.println("==========Done testing nrMinScores ==========");

    }
    


    public static void main(String[] args) {
        

        System.out.println("*==========++BEGINNING++==========*\n");
           test_countingSort();
           System.out.println("\n");
           test_sortedScores();
           System.out.println("\n");
           test_getRank(3);
           System.out.println("\n");
           test_getScore(4);
           System.out.println("\n");
           test_perfectScoreQ();
           System.out.println("\n");
           test_bottomScoreQ();
           System.out.println("\n");
           test_getMinScore();
           System.out.println("\n");
           test_nrMinScores();
           System.out.println("\n");
           test_getMaxScore();
           System.out.println("\n");
           test_nrMaxScores();
           System.out.println("\n");
           
    System.out.println("*==========++END OF TESTERS++==========*\n");
           

          
          
    }


}