package editor.ui;

import editor.EditorSettings;
import model.Model;

import javax.swing.*;
import java.awt.*;
import java.text.AttributedString;
import java.util.ArrayList;

public class Surface extends JPanel {
    private Model model;
    public Surface(Model model){
        this.model = model;
        setBackground(EditorSettings.BACKGROUND_COLOR);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(   RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Segoe UI", Font.PLAIN, 16);
        ArrayList<AttributedString> content = model.getContent(font);

        int l = 0;
        for(AttributedString line : content){
            g2d.drawString(line.getIterator(), 0, g.getFontMetrics(font).getAscent() + g.getFontMetrics(font).getHeight() * l);
            l++;
        }

    }


}
