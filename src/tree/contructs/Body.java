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
        collection.pushIndent();
        for(INode n : contents){
            collection.addText(n);
        }
        collection.popIndent();
        collection.addText("}\n", this);
    }

    public void append(INode n){
        contents.add(n);
        n.setParent(this);
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: Body move");
        return false;
    }
}
