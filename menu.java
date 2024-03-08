/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;
import javax.swing.*;
import java.awt.*;
        
/**
 *
 * @author sujit
 */
public class menu {
    public static void main(String args[])
    {
        JFrame f;
        f = new JFrame("Choice demo");
        f.setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);
        f.setSize(400,250);
        f.setLayout(new FlowLayout());
        Menu colors=new Menu ("Colors");
        colors.add("Red");
        colors.add("Green");
        Menu shapes = new Menu ("courses");
        Menu twoD= new Menu ("IT");
        Menu threeD = new Menu ("Management");
        twoD.add("BCA");
        twoD.add("CSIT");
        threeD.add("BBA");
        threeD.add("BBM");
        MenuBar lst=new MenuBar();
        shapes.add(twoD);
        shapes.add(threeD);
        lst.add(shapes);
        lst.add(colors);
        f.setMenuBar(lst);
        f.setVisbible(true);
    }
    
}
