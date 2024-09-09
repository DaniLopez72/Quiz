package com.example.quiz;

import android.content.Intent;

import java.util.Random;

public class QuizGame {
    static public Quiz[] quiz=
            {
               new Quiz("¿Cuál es el animal terrestre más grande?",
                       new String[]{"Elefante africano","Ballena azul","Jirafa","Cocodrilo"},
                       "Elefante africano"),
                    new Quiz("¿Cuál es el resultado de sumar 5 + 7?",
                            new String[]{"10","11","12","13"},
                            "12"),
                    new Quiz("¿Cuántos lados tiene un triángulo?",
                            new String[]{"3","4","5","6"},
                            "3"),
                    new Quiz("¿Cuál es el planeta más cercano al sol?",
                            new String[]{"Marte","Venus","Mercurio","Tierra"},
                            "Mercurio"),
                    new Quiz("¿Cuál es el resultado de restar 15 - 7?",
                            new String[]{"8","9","10","4"},
                            "8"),
                    new Quiz("¿Cuál es la capital de España?",
                            new String[]{"Berlín","Londres","Madrid","París"},
                            "Madrid"),
                    new Quiz("¿Cuál es el océano más grande del mundo?",
                            new String[]{"Atlántico","Pacífico","Índico","Ártico"},
                            "Pacífico"),
                    new Quiz("¿Cuál es el país más grande por área territorial?",
                            new String[]{"Canadá","Rusia","China","Estados Unidos"},
                            "Rusia"),
                    new Quiz("¿Cuántos días tiene el mes de febrero en un año bisiesto?",
                            new String[]{"28","29","30","31"},
                            "29"),
                    new Quiz("¿Cuál es el resultado de multiplicar 9 por 6?",
                            new String[]{"48","36","54","63"},
                            "54"),
            };
    static public int score;
    static public int total;
    static public int current;
    static public String answer;
    static public int[] shuffles;
    static public void InitGame(){
        score=0;
        current=0;
        answer="";
        total= quiz.length;
        shuffles=new int[total];

        for (int i=0;i<total;i++){
            shuffles[i]=i;
        }
        for (int i=0;i<total;i++){
            int temp=shuffles[i];
            Random random =new Random();
            int num=random.nextInt(total);
            shuffles[i]=shuffles[num];
            shuffles[num]=temp;
        }

    }
    static public Quiz GetCurrentQuiz(){
        return quiz[shuffles[current]];
    }
    static public boolean CheckAnswer(){
        if (answer== quiz[shuffles[current]].correct){
            score++;
        }
        current++;
        if (current>=total){

            return true;
        }
        else return false;
    }

}
