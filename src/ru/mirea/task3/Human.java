package ru.mirea.task3;

public class Human {
    public static void main(String arg[]){
        Head ob1 = new Head();
        Hand ob2 = new Hand();
        Leg ob3 =  new Leg();
        ob1.setEyes(2);
        ob1.setEyes_color("black");
        ob2.setHand_length(85);
        ob2.setFingers1(10);
        ob3.setLeg_length(120);
        System.out.println( "глаза: " + ob1.getEyes());
        System.out.println( "свет глаз: "+ob1.getEyes_color());
        System.out.println( "длина рук в см: "+ob2.getHand_length());
        System.out.println( "длина ног в см: "+ob3.getLeg_length());
    }
}
