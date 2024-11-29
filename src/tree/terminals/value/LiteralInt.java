package tree.terminals.value;

import editor.model.IStringStackElement;
import editor.model.StringStackTerminal;
import model.type.Type;
import tree.DefaultNode;
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
    public IStringStackElement createStringStack() {
        return new StringStackTerminal(this.toString(), Color.CYAN, this);
    }
}
