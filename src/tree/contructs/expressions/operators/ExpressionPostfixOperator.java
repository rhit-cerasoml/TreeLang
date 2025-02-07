package tree.contructs.expressions.operators;

import editor.model.TextCollection;
import tree.INode;
import tree.terminals.expression.IExpression;
import tree.terminals.type.ITypeProvider;

public abstract class ExpressionPostfixOperator implements INode, IExpression {
    protected IExpression LHS;

    @Override
    public void createText(TextCollection collection) {
        collection.addText("(", this);
        LHS.createText(collection);
        collection.addText(getOperatorText(), this);
        collection.addText(")", this);
    }

    abstract String getOperatorText();

    @Override
    public abstract ITypeProvider resolveType();

}

