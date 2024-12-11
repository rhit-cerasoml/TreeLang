package tree.contructs.declarations;

import model.type.Type;
import tree.INode;

public interface IDeclaration extends INode {

    Type resolveDeclaredType();

}
