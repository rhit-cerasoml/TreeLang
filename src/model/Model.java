package model;

import editor.model.TextCollection;
import model.type.Type;
import tree.INode;
import treemodel.Primitives;

import java.awt.*;
import java.text.AttributedString;
import java.util.ArrayList;

public class Model {
    private INode root;
    private ArrayList<Type> types = new ArrayList<>();
    public Model(INode root){
        Primitives.populatePrimitiveTypes(types);
        this.root = root;
    }

    public void lintWalk(){
        lintWalk(root);
    }

    public void lintWalk(INode node){

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
