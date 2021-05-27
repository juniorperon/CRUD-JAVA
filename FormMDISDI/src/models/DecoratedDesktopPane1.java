/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entity.jpa.CategoriaProduto;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Moreno
 */
public class DecoratedDesktopPane1 extends JDesktopPane{
    private Image img;
    
    public DecoratedDesktopPane1(){
        img = new ImageIcon(this.getClass().getResource("/img/back.jpg")).getImage();
    }
    public DecoratedDesktopPane1(String caminhoImagem){
        img = new ImageIcon(this.getClass().getResource(caminhoImagem)).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);
        if (img != null) {
            Dimension dimension = this.getSize();
            int x = (int) (dimension.getWidth() - img.getWidth(this)) / 2;
            int y = (int) (dimension.getHeight() - img.getHeight(this)) / 2;

            g.drawImage(img, x, y, img.getWidth(this), img.getHeight(this), this);
        } else {
            g.drawString("Imagem nao encontrada", 50, 50);
        }
    }

    public void add(CategoriaProduto categProd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
