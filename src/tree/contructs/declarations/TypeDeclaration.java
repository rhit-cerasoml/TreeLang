package tree.contructs.declarations;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.bodies.Body;

import java.awt.*;

public class TypeDeclaration extends DefaultNode implements IDeclaration {

    Body body;

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: move type declaration");
        return false;
    }

    @Override
    public void createText(TextCollection collection) {
        collection.addText("class", Color.CYAN, this);
    }

    @Override
    public Type resolveDeclaredType() {
        return null;
    }
}
