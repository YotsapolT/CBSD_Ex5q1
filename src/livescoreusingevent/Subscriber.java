/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.EventListener;

/**
 *
 * @author Tong
 */
public class Subscriber implements EventListener{
    
    public void scoreChange(ScoreEvent evt){
        System.out.println("live result: " + evt.getScore());    
    }
}
