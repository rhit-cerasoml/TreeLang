package tree.terminals.symbol;

import tree.contructs.declarations.VariableDeclaration;
import tree.terminals.value.IValue;

public interface ISymbol extends IValue {

    VariableDeclaration getDeclaration();

}
