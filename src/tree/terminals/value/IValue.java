package tree.terminals.value;

import model.type.Type;
import tree.INode;

public interface IValue extends INode {
    Type resolveType();
}
