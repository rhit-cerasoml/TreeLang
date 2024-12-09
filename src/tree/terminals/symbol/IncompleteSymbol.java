package tree.terminals.symbol;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;

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
}
