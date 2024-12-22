/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ai_project2.ai_fruites;

/**
 *
 * @author pc
 */
import java.awt.Color;

 public class Fruit {

//    private double x;
//    private double y;
    private double Yactual;
    
  //  private int yPredect;
    //private int xPerdect;
    double colorr;
    private int Ydesired;
    private int classNum;
    private Color color;
     private double  sweetness;
     public int actual_classnum;
      private double normalizedColor;
    private double normalizedSweetness;

    // Constructor and other methods...

    
//    public Fruit(double x, double y, int Class) {
//        super();
//        this.x = x;
//        this.y = y;
//        this.Ydesired = Class;
//
//    }

//    public Fruit(double x, double y) {
//        super();
//        this.x = x;
//        this.y = y;
//
//    }

    public Fruit() {

    }
//
//    public void copy(Fruit p) {
//        this.x = p.getX();
//        this.y = p.getY();
//        this.xPerdect = p.getXPredect();
//        this.yPredect = p.getYPredect();
//        this.Yactual = p.getYActual();
//        this.color = p.getColor();
//        this.classNum = p.getClassNum();
//        this.Ydesired = p.getYDesired();
//    }

//    public String toString() {
//        return "point [x=" + x + ", y=" + y + "]  Class:" + Ydesired;
//    }
    public double getNormalizedColor() {
        return normalizedColor;
    }

    public double getNormalizedSweetness() {
        return normalizedSweetness;
    }
public int getactual_classnum() {
        return actual_classnum;
    }

    public void setactual_classnum(int actual_classnum) {
        this.actual_classnum = actual_classnum;
    }
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }

    public double getYActual() {
        return Yactual;
    }

    public void setYActual(double ya) {
        this.Yactual = ya;
    }

//    public int getXPredect() {
//        return xPerdect;
//    }
//
//    public void setXPredect(int xp) {
//        this.xPerdect = xp;
//    }
//
//    public int getYPredect() {
//        return yPredect;
//    }
//
//    public void setYPredect(int yp) {
//        this.yPredect = yp;
//    }

    public int getYDesired() {
        return Ydesired;
    }

//    public void setClass(int Class) {
//        this.Ydesired = Class;
//    }

//    public int getClassNum() {
//        return classNum;
//    }

    public void setYd(int lable) {
         this.Ydesired = lable;
    }

    public double getColor() {
        return colorr;
    }

    public void setColorr( double colorr) {
        this.colorr = colorr;
//        if(color==Color.YELLOW){
//            colorr=1;
//        }
//        else if(color==Color.ORANGE){
//            colorr=2;
//        }
//        else if(color==Color.RED){
//            colorr=3;
//        }
//        else{
//            colorr=4;
//        }
//        
    }
    public double getSweetness() {
        return sweetness;
    }

    public void setsweetness(double sweetness) {
        this.sweetness = sweetness;
    }

}


    

