package Entity;

/**
 *
 * @author José Augusto Scherer
 */
public class Radio {
    
    boolean isOn;
    boolean station;
    boolean frenquency;
    boolean maxVOl;
    boolean minVol;
    
    
    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isStation() {
        return station;
    }

    public void setStation(boolean station) {
        this.station = station;
    }

    public boolean isFrenquency() {
        return frenquency;
    }

    public void setFrenquency(boolean frenquency) {
        this.frenquency = frenquency;
    }

    public boolean isMaxVOl() {
        return maxVOl;
    }

    public void setMaxVOl(boolean maxVOl) {
        this.maxVOl = maxVOl;
    }

    public boolean isMinVol() {
        return minVol;
    }

    public void setMinVol(boolean minVol) {
        this.minVol = minVol;
    } 
}