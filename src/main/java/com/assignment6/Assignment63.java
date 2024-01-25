package com.assignment6;

class Assignment63{

    public static void main(String[] args){
        TrafficLight obj1 = new TrafficLight("red", 100);
        System.out.println("The color is: " +obj1.getColor());
        obj1.setColor("green");
        System.out.println("The color after using set method is: " +obj1.getColor());
        System.out.println("The duration is: " +obj1.getDuration());
        obj1.setDuration(200);
        System.out.println("The duration after using set method is: " +obj1.getDuration());
        obj1.checkColorDuration();

    }
}
class TrafficLight{
   private String color;
   private int duration;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int newDuration){
        duration = newDuration;
    }

    public void checkColorDuration(){
        if(color.equals("red")){
            System.out.println("The color is red");
            System.out.println("The duration for red is: " +duration);
        }
        else{
            System.out.println("The color is green");
            System.out.println("The duration for green is: " +duration);
        }
    }

}
