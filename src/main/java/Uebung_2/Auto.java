package Uebung_2;

public class Auto {
    private String marke;
    private String modell;
    private int baujahr;

    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.motorStatus = false; // Motor ist ausgeschaltet
    }

    public void start() {
        if (motorStatus) {
            System.out.println("Das " + marke + " " + modell + " läuft bereits!");
        } else {
            motorStatus = true;
            System.out.println("Das " + marke + " " + modell + " startet");
        }
    }

    public void stop() {
        if (!motorStatus) {
            System.out.println("Das " + marke + " " + modell + " ist bereits aus!");
        } else {
            motorStatus = false;
            System.out.println("Das " + marke + " " + modell + " hält an!");
        }
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public boolean isMotorStatus() {
        return motorStatus;
    }

    private boolean motorStatus;

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void setMotorStatus(boolean motorStatus) {
        this.motorStatus = motorStatus;
    }

    public boolean getMotorStatus() {
        return motorStatus;
    }
}
