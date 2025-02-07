package tree.terminals.expression;

import tree.INode;
import tree.terminals.type.ITypeProvider;

public interface IExpression extends INode {
    ITypeProvider resolveType();
}
