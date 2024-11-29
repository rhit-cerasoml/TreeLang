package tree.terminals.symbol;

import editor.model.TextCollection;
import tree.DefaultNode;

import java.awt.*;

public class Symbol extends DefaultNode implements ISymbol {
    String name;
    public Symbol(String name){
        this.name = name;
    }

    @Override

    public void createText(TextCollection collection) {
        collection.addText(name, Color.green, this);
    }
}
