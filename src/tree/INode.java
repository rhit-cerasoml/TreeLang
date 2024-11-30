package tree;

import editor.model.TextCollection;

public interface INode {

    TextCollection createText();
    void createText(TextCollection collection);
    INode getParent();
    boolean hasParent();
    

}
