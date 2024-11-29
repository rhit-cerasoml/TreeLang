package tree;

import editor.model.StringStack;

import java.text.AttributedString;

public interface INode {

    StringStack createStringStack();
    INode getParent();
    boolean hasParent();

}
