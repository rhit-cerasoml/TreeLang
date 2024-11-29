package tree.terminals.symbol;

import editor.model.StringStack;
import editor.model.StringTerminal;
import tree.DefaultNode;

import java.awt.*;

public class IncompleteSymbol extends DefaultNode implements ISymbol {

    @Override
    public StringStack createStringStack() {
        return new StringTerminal("", Color.RED, this);
    }
}
