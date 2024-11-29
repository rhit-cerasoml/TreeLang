package editor.model;

import editor.EditorSettings;
import tree.INode;

import java.awt.*;

public class StringStackTerminal implements IStringStackElement {
    String text;
    Color c;
    INode accessor;
    public StringStackTerminal(String text, Color c, INode accessor){
        this.text = text.replace("\t", EditorSettings.SPACES_PER_INDENT);
        this.c = c;
        this.accessor = accessor;
    }
    public StringStackTerminal newPartitioned(String substr){
        return new StringStackTerminal(substr, c, accessor);
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void buildString(StringBuilder sb){
        sb.append(text);
    }
//    @Override
//    protected int applyAttributes(AttributedString content, int spanHead){
//        content.addAttribute(TextAttribute.FOREGROUND, c, spanHead, spanHead + text.length());
//        return spanHead + text.length();
//    }
}
