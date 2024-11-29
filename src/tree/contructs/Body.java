package tree.contructs;

import editor.model.IStringStackElement;
import editor.model.StringStack;
import tree.DefaultNode;
import tree.INode;

import java.util.ArrayList;

public class Body extends DefaultNode implements INode {
    ArrayList<INode> contents = new ArrayList<>();

    @Override
    public IStringStackElement createStringStack() {
        StringStack ss = new StringStack();
        ss.add("{\n", this);
        for(INode n : contents){
            ss.add("\t", this);
            ss.add(n.createStringStack());
        }
        ss.add("}\n", this);
        return ss;
    }

    public void append(INode n){
        contents.add(n);
    }
}
