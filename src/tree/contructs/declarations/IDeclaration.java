package tree.contructs.declarations;

import model.type.Type;
import tree.INode;

import java.awt.*;

public interface IDeclaration extends INode {

    Type resolveDeclaredType();
    Color getSymbolTypeColor();

}
