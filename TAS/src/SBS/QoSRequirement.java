package SBS;

public class QoSRequirement {
    public double timeRE = 15;
    public double reliabilityRE = 0.5;

    public double getTimeRE() {
        return timeRE;
    }

    public void setTimeRE(double timeRE) {
        this.timeRE = timeRE;
    }

    public double getReliabilityRE() {
        return reliabilityRE;
    }

    public void setReliabilityRE(double reliabilityRE) {
        this.reliabilityRE = reliabilityRE;
    }

    void applyQoSRequirement() {

    }

}
