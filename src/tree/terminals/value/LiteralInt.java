package tree.terminals.value;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import treemodel.Primitives;

import java.awt.*;

public class LiteralInt extends DefaultNode implements IValue {
    private int value;
    public LiteralInt(int value){
        this.value = value;
    }
    @Override
    public Type resolveType() {
        return Primitives.PRIMITIVE_INT;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public void createText(TextCollection collection) {
        collection.addText(this.toString(), Color.CYAN, this);
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        return true;
    }
}
