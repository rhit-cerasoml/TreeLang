package model;

import editor.model.TextCollection;
import model.type.Type;
import tree.INode;
import treemodel.Primitives;

import java.awt.*;
import java.text.AttributedString;
import java.util.ArrayList;

public class Model {
    ArrayList<Type> types = new ArrayList<>();
    Scope globalScope = new Scope();
    public Model(){
        Primitives.populatePrimitiveTypes(types);

    }

    private INode root;
    public void walkTree(INode root){
        this.root = root;
    }

    @Override
    public String toString(){
        return root.createText().toString();
    }

    public ArrayList<AttributedString> getContent(Font font){
        TextCollection textCollection = root.createText();
        textCollection.setFont(font);
        return textCollection.getAttributedStrings();
    }

}
