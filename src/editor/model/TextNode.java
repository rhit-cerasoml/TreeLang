package editor.model;

import tree.INode;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class TextNode {
    private String text;
    private Color color;
    private INode accessor;
    public TextNode(String text, Color color, INode accessor){
        this.text = text;
        this.color = color;
        this.accessor = accessor;
    }

    @Override
    public String toString() {
        return text;
    }

    public void buildString(StringBuilder sb){
        sb.append(text);
    }

    public int attribute(AttributedString astring, int c) {
        astring.addAttribute(TextAttribute.FOREGROUND, color, c, c + text.length());
        return c + text.length();
    }
}
