package com.example.composition;

public class AirConditioner {
    private String numberReference;
    private String model;
    private int power;
    private int noisLevel;

    public AirConditioner(String numberReference, String model, int power, int noisLevel){
        this.numberReference = numberReference;
        this.model = model;
        this.power = power;
        this.noisLevel = noisLevel;
    }
    public String getNumberReference(){
        return numberReference;
    }
    public void setNumberReference(String numberReference){
        this.numberReference = numberReference;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getNoisLevel(){
        return noisLevel;
    }
    public void setNoisLevel(int noisLevel){
        this.noisLevel = noisLevel;
    }
    public String toString(){
        return numberReference;
    }

}
