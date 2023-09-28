package utils;

import net.serenitybdd.screenplay.actors.OnStage;
import tasks.ChangeCurrency;

public class Sleep {
    public Sleep(int time) {
        this.time = time;
    }

    public int time;
    public void sleepFor(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){
        }
    }
}
