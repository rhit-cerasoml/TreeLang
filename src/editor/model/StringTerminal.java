package editor.model;

import tree.INode;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class StringTerminal extends StringStack {
    String text;
    Color c;
    INode accessor;
    public StringTerminal(String text, Color c, INode accessor){
        this.text = text.replace("\t", "    ");
        this.c = c;
        this.accessor = accessor;
    }
    @Override
    public void buildString(StringBuilder sb){
        sb.append(text);
    }
    @Override
    protected int applyAttributes(AttributedString content, int spanHead){
        content.addAttribute(TextAttribute.FOREGROUND, c, spanHead, spanHead + text.length());
        return spanHead + text.length();
    }
}
