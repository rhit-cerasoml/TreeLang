package editor.ui;

import editor.model.StringStack;
import model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.CharacterIterator;

public class Surface extends JPanel {
    private Model model;
    public Surface(Model model){
        this.model = model;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(   RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

        //GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        //content.addAttribute(TextAttribute.FONT, font);

        //content.addAttribute(TextAttribute.BACKGROUND, Color.darkGray);

        //model.applyAttributes(content);

        //AttributedString content = new AttributedString(model.buildText());
        Font font = new Font("Segoe UI", Font.PLAIN, 106);

        //------------
        //StringStack.StringStackCharacterIterator iter = model.getStringStack().getIterator();
        //iter.setFont(font);
        //------------

        //TextLayout layout = new TextLayout(model.getStringStack().getIterator(), g2d.getFontRenderContext());

        //layout.draw(g2d, 0, g.getFontMetrics().getAscent());

//        char c;
//
//        while((c = iter.current()) != CharacterIterator.DONE){
//            System.out.print("[" + c + "]");
//            iter.next();
//        }
//        iter.first();
//        System.out.println();
//        while((c = iter.current()) != CharacterIterator.DONE){
//            System.out.print("[" + c + "]");
//            iter.next();
//        }
//        System.out.println();
//
//        int l = 0;
//        while(iter.hasNextLine()){
//            iter.nextLine();
//            l++;
//
//            while((c = iter.current()) != CharacterIterator.DONE){
//                //System.out.print("[" + c + "]");
//                iter.next();
//            }
//        }


        //------------------------------------------------------------
//        g2d.drawString(iter, 0, g.getFontMetrics(font).getAscent());
//        int l = 0;
//        while(iter.hasNextLine()){
//            iter.nextLine();
//            l++;
//            g2d.drawString(iter, 0, g.getFontMetrics(font).getAscent() + g.getFontMetrics(font).getHeight() * l);
//        }

    }


}
