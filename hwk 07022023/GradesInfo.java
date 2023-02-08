import java.util.Scanner;

public class GradesInfo{
    public static void option(){
     System.out.println(" *******These are your options to navigate your score*********");
     System.out.println("          *Type the integer 0 if you want to quit* ");
     System.out.println("        *Type the integer 1 if you want to get your score*");
     System.out.println("        *Type the integer 2 if you want to get your rank*");
     System.out.println("     *Type the integer 3 to see if anyone got a perfect score*");
     System.out.println("      *Type the integer 4 to see if anyone got a bottom score*");
     System.out.println("             *Type the integer 5 to see the maximum score*");
     System.out.println(" *Type the integer 6 to see how many student received a maximum score*");
     System.out.println("         *Type the integer 7 to see the minimum score* ");
     System.out.println(" *Type the integer 8 to see how many student received a minimum score*");
     System.out.println(" *Type the integer 9 to see a sorted list of all the scores in class*");
     System.out.println("*********Type the integer 10 to see back the options you have*********");
    }

    public static void main(String[] args) {
     Scanner user_input= new Scanner(System.in);
     System.out.println("Hello student! What is your ID? ");
     Integer id= user_input.nextInt();
     if(id > Grades.maximum_id()){
        System.out.println("Your ID is not correct. Type ''the correct ID NOW ''. You will not have a second chance");
        Integer id2= user_input.nextInt();
        id=id2;
     }
     option();
     boolean still_playing= true;
     int user_response = 0;
        do{
         user_response=user_input.nextInt();
            if(user_response==10){ 
                option();
            }
            else if(user_response==1){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("Your score is : "+ Grades.getScore(id));
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==2){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.print("Your rank is ");
                Grades.getRank(id);
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==3){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("Someone received a perfect score: "+ Grades.perfectScoreQ());
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==4){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("Someone received a bottom score: "+ Grades.bottomScoreQ());
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==5){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("The max score is "+ Grades.getMaxScore());
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
           else if(user_response==6){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("The number of students with the maximum score is "+ Grades.nrMaxScores());
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==7){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("The minimum score is "+ Grades.getMinScore());
                System.out.println(" >>>>>>>>>>>>>>>>>");
            }
            else if(user_response==8){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("The number of students with the minimum score is "+ Grades.nrMinScores());
                System.out.println(" >>>>>>>>>>>>>>>>>"); 
            }
            else if(user_response==9){
                System.out.println(" >>>>>>>>>>>>>>>>>");
                System.out.println("the sorted list of all scores in a decreasing order is : ");
                Grades.forstring(Grades.sortedScores());
                System.out.println("\n");
                System.out.println(" >>>>>>>>>>>>>>>>>"); 
            }
            else if(user_response==0){
                still_playing= false;
                System.out.println(" >>>>>>>>> DONE ! Goodbye!!!>>>>>>>>");
                
            }
            else{
                System.out.println("I don't know the input that you entered! Please follow the instructions.");
            }

        }
     while(still_playing);
     user_input.close();

    }

}