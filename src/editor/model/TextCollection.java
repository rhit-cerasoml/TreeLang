package editor.model;

import editor.EditorSettings;
import tree.INode;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.ArrayList;

public class TextCollection {
    private ArrayList<ArrayList<TextNode>> contents = new ArrayList<>();
    private Font font;
    public TextCollection(){
        contents.add(new ArrayList<>());
    }

    public void setFont(Font font){
        this.font = font;
    }

    public void addText(INode source){
        source.createText(this);
    }
    public void addText(String s, INode accessor){
        addText(s, EditorSettings.DEFAULT_TEXT_COLOR, accessor);
    }
    public void addText(String s, Color c, INode accessor){
        if(s.length() == 0){
            return;
        }
        String[] lines = s.split("\n", -1);
        addSingleLineText(lines[0], c, accessor);
        for(int i = 1; i < lines.length; i++){
            contents.add(new ArrayList<>());
            addSingleLineText(lines[i], c, accessor);
        }
    }
    private void addSingleLineText(String s, Color c, INode accessor){
        if(s.length() == 0){
            return;
        }
        contents.get(contents.size() - 1).add(new TextNode(s.replace("\t", EditorSettings.SPACES_PER_INDENT), c, accessor));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(ArrayList<TextNode> line : contents) {
            buildLineString(sb, line);
            sb.append('\n');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public ArrayList<AttributedString> getAttributedStrings(){
        ArrayList<AttributedString> astrings = new ArrayList<>();
        for(ArrayList<TextNode> line : contents){
            if(!line.isEmpty()) {
                astrings.add(getAttributedString(line));
            }
        }
        return astrings;
    }

    private AttributedString getAttributedString(ArrayList<TextNode> source){
        AttributedString astring = new AttributedString(getLineString(source));
        if(font != null){
            astring.addAttribute(TextAttribute.FONT, font);
        }
        int c = 0;
        for(TextNode node : source){
            c = node.attribute(astring, c);
        }
        return astring;
    }

    private static String getLineString(ArrayList<TextNode> line){
        StringBuilder sb = new StringBuilder();
        buildLineString(sb, line);
        return sb.toString();
    }

    private static void buildLineString(StringBuilder sb, ArrayList<TextNode> line){
        for (TextNode node : line) {
            node.buildString(sb);
        }
    }
}
