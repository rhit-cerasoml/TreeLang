package tree.contructs.expressions;

import tree.terminals.type.ITypeProvider;

import java.awt.*;

public abstract class ExpressionVariableDeclaration {

    public abstract ITypeProvider resolveDeclaredType();
    public abstract Color getSymbolTypeColor();
}
