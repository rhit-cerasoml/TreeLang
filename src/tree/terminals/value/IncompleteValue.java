package tree.terminals.value;

import editor.model.StringStack;
import editor.model.StringTerminal;
import model.type.Type;
import tree.DefaultNode;
import treemodel.Primitives;

import java.awt.*;

public class IncompleteValue extends DefaultNode implements IValue {
    @Override
    public StringStack createStringStack() {
        return new StringTerminal("", Color.RED, this);
    }

    @Override
    public Type resolveType() {
        return Primitives.PRIMITIVE_UNRESOLVED;
    }
}
