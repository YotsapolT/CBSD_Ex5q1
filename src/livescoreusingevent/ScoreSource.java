/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.ArrayList;

/**
 *
 * @author Tong
 */
public class ScoreSource {
    private String score;
    private ArrayList<ScoreListener> listeners;
    public ScoreSource(){
        listeners = new ArrayList<>();
    }
    
    public void setScoreLine(String score){
        this.score = score;
        fireScoreEvent(new ScoreEvent(this, this.score));
    }
    
    public String getScoreLine(){
        return score;
    }

    public void addSubscriber(Subscriber s){
        listeners.add(s);
    }
    
    public void removeSubcriber(Subscriber s){
        listeners.remove(s);
    }
    
    public void fireScoreEvent(ScoreEvent scoreEvent){
        listeners.forEach(listener -> {
            listener.scoreChange(scoreEvent);
        });
    }
}
