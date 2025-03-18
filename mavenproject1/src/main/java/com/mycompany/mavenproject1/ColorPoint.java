/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;

/**
 *
 * @author Aymeric
 */
public class ColorPoint {
    protected int size;
    protected Color color;
    protected int x,y;
    
    
    ColorPoint(int size, Color color, int x, int y) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    @Override
        public String toString(){
            return "size= " + this.size + ", x= " + this.x + ", y= " + this.y + ", color= " + this.color;
        }
}
