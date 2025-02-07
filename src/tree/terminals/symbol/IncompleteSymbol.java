package tree.terminals.symbol;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.expressions.ExpressionVariableDeclaration;
import tree.terminals.type.ITypeProvider;

import java.awt.*;

public class IncompleteSymbol extends DefaultNode implements ISymbol {

    @Override
    public void createText(TextCollection collection) {
        collection.addText("", Color.RED, this);
    }

    @Override
    public boolean resolveMove(INode from, INode to) {
        return true;
    }

    @Override
    public ITypeProvider resolveType() {
        return null;
    }

    ExpressionVariableDeclaration declaration;
    @Override
    public ExpressionVariableDeclaration getDeclaration() {
        return declaration;
    }

    @Override
    public void setDeclaration(ExpressionVariableDeclaration declaration) {
        this.declaration = declaration;
    }
}
