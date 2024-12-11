package tree.terminals.symbol;

import tree.contructs.declarations.IDeclaration;
import tree.contructs.declarations.VariableDeclaration;
import tree.terminals.value.IValue;

public interface ISymbol extends IValue {

    IDeclaration getDeclaration();
    void setDeclaration(IDeclaration declaration);

}
