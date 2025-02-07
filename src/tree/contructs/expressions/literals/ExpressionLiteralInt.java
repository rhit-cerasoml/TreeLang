package tree.contructs.expressions.literals;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.expression.IExpression;
import tree.terminals.type.ITypeProvider;

import java.awt.*;

public class ExpressionLiteralInt extends DefaultNode implements IExpression {
    private int value;
    public ExpressionLiteralInt(int value){
        this.value = value;
    }
    @Override
    public ITypeProvider resolveType() {
        return null;
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
    public boolean resolveMove(INode from, INode to) {
        return true;
    }
}
