package tree.terminals.value;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import treemodel.Primitives;

import java.awt.*;

public class IncompleteValue extends DefaultNode implements IValue {
    @Override
    public void createText(TextCollection collection) {
        collection.addText("", Color.RED, this);
    }

    @Override
    public Type resolveType() {
        return Primitives.PRIMITIVE_UNRESOLVED;
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        return true;
    }
}
