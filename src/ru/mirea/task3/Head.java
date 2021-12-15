package ru.mirea.task3;

public class Head {
    private String eyes_color;
    private int eyes, mouse, nose, ear;
    public void setEyes(int eyes){
        this.eyes = eyes;
    }
    public int getEyes(){
        return eyes;
    }
    public void setEar(int ear){
        this.ear = ear;
    }
    public int getEar(){
        return ear;
    }
    public void setMouse(int mouse){
        this.mouse = mouse;
    }
    public int getMouse(){
        return mouse;
    }
    public void setNose(int nose){
        this.nose = nose;
    }
    public int getNose(){
        return nose;
    }
    public void setEyes_color(String  eyes_color){
        this.eyes_color = eyes_color;
    }
    public String getEyes_color(){
        return eyes_color;
    }

}