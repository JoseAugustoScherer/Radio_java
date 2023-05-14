package Entity;

/**
 *
 * @author José Augusto Scherer
 */
public class Radio {
    
    private boolean isOn;
    private boolean am;
    private boolean fm;
    private boolean decreaseVol;
    private boolean increaseVol;

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isAm() {
        return am;
    }

    public void setAm(boolean am) {
        this.am = am;
    }

    public boolean isFm() {
        return fm;
    }

    public void setFm(boolean fm) {
        this.fm = fm;
    }

    public boolean isDecreaseVol() {
        return decreaseVol;
    }

    public void setDecreaseVol(boolean decreaseVol) {
        this.decreaseVol = decreaseVol;
    }

    public boolean isIncreaseVol() {
        return increaseVol;
    }

    public void setIncreaseVol(boolean increaseVol) {
        this.increaseVol = increaseVol;
    }
    
    
}
