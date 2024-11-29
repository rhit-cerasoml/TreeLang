package editor.ui;

import model.Model;

import javax.swing.*;
import java.awt.*;
import java.text.AttributedString;
import java.util.ArrayList;

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

        Font font = new Font("Segoe UI", Font.PLAIN, 106);
        ArrayList<AttributedString> content = model.getContent(font);

        int l = 0;
        for(AttributedString line : content){
            g2d.drawString(line.getIterator(), 0, g.getFontMetrics(font).getAscent() + g.getFontMetrics(font).getHeight() * l);
            l++;
        }

    }


}
