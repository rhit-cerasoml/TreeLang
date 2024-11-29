package tree.contructs;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;

import java.util.ArrayList;

public class Body extends DefaultNode implements INode {
    ArrayList<INode> contents = new ArrayList<>();

    @Override
    public void createText(TextCollection collection) {
        collection.addText("{\n", this);
        for(INode n : contents){
            collection.addText("\t", this);
            collection.addText(n);
        }
        collection.addText("}\n", this);
    }

    public void append(INode n){
        contents.add(n);
    }
}
