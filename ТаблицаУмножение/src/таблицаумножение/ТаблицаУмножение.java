/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package таблицаумножение;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Home
 */

public class ТаблицаУмножение {
    


    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m"; //Цвета
public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    int RightAnswer = 0;
    int FalseAnswer = 0;
    Random random=new Random();    
    while(FalseAnswer !=5){
       int RandomNumber1=random.nextInt(10);
       int RandomNumber2=random.nextInt(10);
        System.out.print(RandomNumber1+"*"+RandomNumber2+"=");  
        int  answer = in.nextInt(); 
            FalseAnswer++;
     if(answer == RandomNumber1*RandomNumber2){
         System.out.println(ANSI_GREEN+"Ответ правильный"+ANSI_RESET);
         RightAnswer++;
    }else{
            System.out.println(ANSI_RED +"Неправильно. Ещё раз"+ ANSI_RESET);
            }
    
        }
    switch(RightAnswer){
        case 5:
          System.out.println("Молодец Оценка:"+RightAnswer);
                  System.out.println("Конец работы");
          break;
    
        case 4:
              System.out.println("Учи ещё пока оценка:"+RightAnswer);
                      System.out.println("Конец работы");
          break;

        case 3:
              System.out.println("Учи ещё пока оценка:"+RightAnswer);
                      System.out.println("Конец работы");
          break;

        case 2:
                  System.out.println("Учи ещё пока оценка:"+RightAnswer);
                          System.out.println("Конец работы");
          break;

        case 1:
                  System.out.println("Учи ещё пока оценка:"+RightAnswer);
                          System.out.println("Конец работы");
          break;
          case 0:
                  System.out.println("Исключён");
                          System.out.println("Конец работы");
          break;

    }
    }
  }

