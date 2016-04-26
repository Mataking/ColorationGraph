package Gui;

import Gui.GrapheGui.SommetGui;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Coloration extends JFrame implements MouseListener {
    private static final Coloration coloration = new Coloration();
    private GrapheGui graphe;
    
    @Override
    public void mouseClicked(MouseEvent e){
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                SommetGui s=graphe.new SommetGui(graphe.size()+1,e.getPoint().x,e.getPoint().y);
                graphe.ajouterSommet(s);
                coloration.getContentPane().add(s.dessine());
                break;
            case MouseEvent.BUTTON2:
                break;
            case MouseEvent.BUTTON3:
                graphe.colorier();
                graphe.dessine();
                break;
            default:
                break;
        }
    }
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
  
  public static void main(String s[]) {
    coloration.setResizable(false);
    coloration.addWindowListener(
    new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
    );
    coloration.getContentPane().addMouseListener(coloration);
    coloration.setSize(new Dimension(600, 600));
    coloration.show();
    coloration.graphe=new GrapheGui(coloration.getGraphics(),coloration);
  }
}