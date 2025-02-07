package tree.terminals.expression;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.type.ITypeProvider;

import java.awt.*;

public class IncompleteExpression extends DefaultNode implements IExpression {
    @Override
    public void createText(TextCollection collection) {
        collection.addText("", Color.RED, this);
    }

    @Override
    public ITypeProvider resolveType() {
        return null;
    }

    @Override
    public boolean resolveMove(INode from, INode to) {
        return true;
    }
}
