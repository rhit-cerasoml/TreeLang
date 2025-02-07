package tree.terminals.symbol;

import tree.contructs.expressions.ExpressionVariableDeclaration;
import tree.terminals.expression.IExpression;

public interface ISymbol extends IExpression {

    ExpressionVariableDeclaration getDeclaration();
    void setDeclaration(ExpressionVariableDeclaration declaration);

}
