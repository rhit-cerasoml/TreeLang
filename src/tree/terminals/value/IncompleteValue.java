package tree.terminals.value;

import editor.model.IStringStackElement;
import editor.model.StringStackTerminal;
import model.type.Type;
import tree.DefaultNode;
import treemodel.Primitives;

import java.awt.*;

public class IncompleteValue extends DefaultNode implements IValue {
    @Override
    public IStringStackElement createStringStack() {
        return new StringStackTerminal("", Color.RED, this);
    }

    @Override
    public Type resolveType() {
        return Primitives.PRIMITIVE_UNRESOLVED;
    }
}
