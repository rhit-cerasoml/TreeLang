package model;

import editor.model.IStringStackElement;
import editor.model.StringStack;
import model.type.Type;
import tree.INode;
import treemodel.Primitives;

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

    public String buildText(){
        return root.createStringStack().toString();
    }
//
//    public void applyAttributes(AttributedString content){
//        root.createStringStack().applyAttributes(content);
//    }

    public IStringStackElement getStringStack(){
        return root.createStringStack();
    }
}
