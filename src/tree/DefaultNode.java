package tree;

import editor.model.TextCollection;
import editor.model.TextNode;

import java.awt.*;

public abstract class DefaultNode implements INode {
    private static final INode ROOT = new DefaultNode(){
        @Override
        protected boolean resolveMove(INode from, INode to) {
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

    public void setParent(INode n){
        if(this.parent == ROOT || resolveMove(this.parent, n)) {
            this.parent = n;
        }
    }

    protected abstract boolean resolveMove(INode from, INode to);

    @Override
    public INode getParent() {
        return parent;
    }

    public boolean hasParent(){
        return parent == ROOT;
    }


}
