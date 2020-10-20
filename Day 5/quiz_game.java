// Make the complete quiz application on your own.

// ------------------------------------------------------------------------------------------------

package quiz_game;

public class quiz_game {
    
    question[] questions=new question[3];
    player player=new player();

    String[] questionsdata={"PYTHON was created by _____?","JAVA was created by _____?","PHP was created by _____?"};
    String[] options1={"Ross Ihaka","Ross Ihaka","Ross Ihaka"};
    String[] options2={"James Gosling","James Gosling","James Gosling"};
    String[] options3={"Guido Van Rassum","Guido Van Rassum","Guido Van Rassum"};
    String[] options4={"Rasmus Lerdorf","Rasmus Lerdorf","Rasmus Lerdorf"};
    int[] answers={3,2,4};


    public void initGame() {

        for(int i=0;i<3;i++) {
            questions[i]=new question();
        }


        for(int i=0;i<3;i++) { 
            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }
        
    }
    
    public void play() {

          player.getDetails();
          
          for(int i=0;i<3;i++) {
              boolean status=questions[i].askQuestion();
              if(status==true) {
                  System.out.println("WOW! It's Correct Answer...!");
                  player.score=player.score+5;
              }
              else {
                  System.out.println("OOPS! It's Wrong Answer...!");
                  player.score=player.score-5;
              }
              
          }

        System.out.println(player.name+" Your Score is : "+player.score);

    }
    
}