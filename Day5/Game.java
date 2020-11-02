package com.sagar;

public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();
    String[] questionsdata={"Which is not a programming language?","Which is not a feature of java?",
            "which is not character of marvel","who developed java language"};
    String[] options1={"Javascript","Platform independent","shaktiman","denis richie"};
    String[] options2={"Java","Object oriented","Thor","james gosling"};
    String[] options3={"ASCII","Highlevel","Hulk","gudo van rossom"};
    String[] options4={"Python","static","Iron man","breden eich"};
    int[] answers={3,4,1,2};

    public void initGame(){
        //created five object
        for(int i=0;i<4;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<4;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correct_ans=answers[i];
        }

    }
    public void play(){
        player.getDetails();
        for(int i=0;i<4;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Well played gamer");
                player.score=player.score+5;
            }
            else{
                System.out.println("Sorry better luck next time");
                player.score= player.score-5;
            }
        }
        System.out.println(player.name+ " Your score is :"+player.score);

    }
}
