package tree.terminals.symbol;

import editor.model.IStringStackElement;
import editor.model.StringStackTerminal;
import tree.DefaultNode;

import java.awt.*;

public class IncompleteSymbol extends DefaultNode implements ISymbol {

    @Override
    public IStringStackElement createStringStack() {
        return new StringStackTerminal("", Color.RED, this);
    }
}
