package tree;

import editor.model.StringStack;
import editor.model.StringTerminal;

import java.awt.*;

public abstract class DefaultNode implements INode {
    private static final INode ROOT = new DefaultNode() {
        @Override
        public StringStack createStringStack() {
            return new StringTerminal("If you're seeing this please submit an issue report", Color.RED, this);
        }
    };
    INode parent = ROOT;

    @Override
    public INode getParent() {
        return parent;
    }

    public boolean hasParent(){
        return parent == ROOT;
    }
}
