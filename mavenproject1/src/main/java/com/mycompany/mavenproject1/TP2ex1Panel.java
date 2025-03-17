/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Float;
import java.util.ArrayList;

/**
 *
 * @author frm4465a
 */
public class TP2ex1Panel extends javax.swing.JPanel {

    
       protected List<Line2D> redLineList = new ArrayList<>();
       protected List<Line2D> blueLineList = new ArrayList<>();
       protected Line2D temp;
       
    /**
     * Creates new form TP2ex1Panel
     */
    public TP2ex1Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            
            //affichage ligne noire temp
            g2d.setColor(Color.black);   
            if (temp != null){
                g2d.draw(temp);
            }
            
            
            //afficgae lignes rouges
            g2d.setColor(Color.red);
            for (Line2D l : redLineList) {
                g2d.draw(l);
            }
            
            //affichage lignes bleues
            g2d.setColor(Color.blue);
            for (Line2D l : blueLineList) {
                g2d.draw(l);
            }
        }
    
    
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        int x = evt.getX();
        int y = evt.getY();
        Line2D.Float line = new Line2D.Float(x,y,x,y);
        temp = line;
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        temp.setLine(temp.getX1(), temp.getY1(), (double)evt.getX(), (double)evt.getY());
            
        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (javax.swing.SwingUtilities.isLeftMouseButton(evt)) {
            redLineList.add(temp);
        }
        else {
            blueLineList.add(temp);
        }
        temp = null;
        repaint();
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables




}
