/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.util;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author lordz
 */
public class UtilityFunctions {
    
    
    public static void disableCopy(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control C"), "none");
    }
    
    public static void disablePaste(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
    }
    
    public static void disableCP(JComponent component){
        disableCopy(component);
        disablePaste(component);
    }
    
    public static void closeForm(JFrame frame){
        int closeApp = JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                    if(closeApp == JOptionPane.YES_OPTION) {
                            frame.dispose();
                        } 
    }
    
    
}
