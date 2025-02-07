package tree;

import editor.model.TextCollection;
import editor.model.TextNode;

import java.awt.*;

public abstract class DefaultNode implements INode {
    private static final INode ROOT = new DefaultNode(){
        @Override
        public boolean resolveMove(INode from, INode to) {
            return false;
        }

        @Override
        public void createText(TextCollection collection) {
            collection.addText("<Please open an issue, an editor error has occurred!>", Color.RED, ROOT);
        }
    };
    private INode parent = ROOT;

    @Override
    public TextCollection createText() {
        TextCollection collection = new TextCollection();
        createText(collection);
        return collection;
    }

    public boolean setParent(INode n){
        if(this.parent == ROOT || resolveMove(this.parent, n)) {
            this.parent = n;
            return true;
        }
        return false;
    }

    @Override
    public INode getParent() {
        return parent;
    }

    public boolean hasParent(){
        return parent == ROOT;
    }


}
