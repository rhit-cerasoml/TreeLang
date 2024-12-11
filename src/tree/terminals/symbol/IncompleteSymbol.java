package tree.terminals.symbol;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.declarations.IDeclaration;
import tree.contructs.declarations.VariableDeclaration;
import treemodel.Primitives;

import java.awt.*;

public class IncompleteSymbol extends DefaultNode implements ISymbol {

    @Override
    public void createText(TextCollection collection) {
        collection.addText("", Color.RED, this);
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        return true;
    }

    @Override
    public Type resolveType() {
        return Primitives.PRIMITIVE_UNRESOLVED;
    }


    IDeclaration declaration;
    @Override
    public IDeclaration getDeclaration() {
        return declaration;
    }

    @Override
    public void setDeclaration(IDeclaration declaration) {
        this.declaration = declaration;
    }
}
