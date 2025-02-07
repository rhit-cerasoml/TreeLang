package tree.contructs.expressions.operators;

import editor.model.TextCollection;
import tree.INode;
import tree.terminals.expression.IExpression;
import tree.terminals.type.ITypeProvider;

public abstract class ExpressionBinaryOperator implements INode, IExpression {
    protected IExpression LHS;
    protected IExpression RHS;

    @Override
    public void createText(TextCollection collection) {
        collection.addText("(", this);
        LHS.createText(collection);
        collection.addText(getOperatorText(), this);
        RHS.createText(collection);
        collection.addText(")", this);
    }

    abstract String getOperatorText();

    @Override
    public abstract ITypeProvider resolveType();

}
