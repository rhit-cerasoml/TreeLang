package tree;

import editor.model.IStringStackElement;
import editor.model.StringStackTerminal;

import java.awt.*;

public abstract class DefaultNode implements INode {
    private static final INode ROOT = new DefaultNode() {
        @Override
        public IStringStackElement createStringStack() {
            return new StringStackTerminal("If you're seeing this please submit an issue report", Color.RED, this);
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
