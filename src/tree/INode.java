package tree;

import editor.model.TextCollection;
import editor.model.TextNode;

public interface INode {

    TextCollection createText();
    void createText(TextCollection collection);

    void setParent(INode n);
    INode getParent();
    boolean hasParent();
    

}
