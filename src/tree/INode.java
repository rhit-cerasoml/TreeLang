package tree;

import editor.model.IStringStackElement;

public interface INode {

    IStringStackElement createStringStack();
    INode getParent();
    boolean hasParent();

}
