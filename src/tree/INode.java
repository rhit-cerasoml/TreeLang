package tree;

import editor.model.TextCollection;
import editor.model.TextNode;

public interface INode {

    TextCollection createText();
    void createText(TextCollection collection);

    boolean setParent(INode n);
    INode getParent();
    boolean hasParent();


    boolean resolveMove(INode from, INode to);
}
