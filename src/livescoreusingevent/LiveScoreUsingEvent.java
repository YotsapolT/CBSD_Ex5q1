/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author Tong
 */
public class LiveScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        scoreSource.addSubscriber(sub1);
        scoreSource.addSubscriber(sub2);
        System.out.print("Enter Score ");
        Scanner in = new Scanner(System.in);
        while(true){
            String scoreLine = in.nextLine();
            if (scoreLine.equals("")){
                break;
            }
            scoreSource.setScoreLine(scoreLine);
        }
        in.close();
    }
    
}
