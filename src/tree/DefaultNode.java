package tree;

import editor.model.TextCollection;

import java.awt.*;

public abstract class DefaultNode implements INode {
    private static final INode ROOT = new DefaultNode(){
        @Override
        public void createText(TextCollection collection) {
            collection.addText("<Please open an issue, an editor error has occurred!>", Color.RED, ROOT);
        }
    };
    INode parent = ROOT;

    @Override
    public TextCollection createText() {
        TextCollection collection = new TextCollection();
        createText(collection);
        return collection;
    }

    @Override
    public INode getParent() {
        return parent;
    }

    public boolean hasParent(){
        return parent == ROOT;
    }


}
