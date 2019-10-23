/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mystuff;

/**
 *
 * @author zacharylineman
 */

import java.applet.Applet;
import java.awt.*;
        
public class drawings extends Applet {

    public void paint (Graphics page) {
        setBackground(Color.cyan);
        
        page.setColor(Color.blue);
        //page.fill3DRect(100, 100, 100, 100, true);
        page.fillRect(0, 175, 300, 50);
        
    }
    
}
