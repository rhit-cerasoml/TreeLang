package tree.contructs.declarations;

import editor.model.TextCollection;
import model.type.Type;
import tree.INode;

import java.awt.*;

public class LanguageTypeDeclaration implements IDeclaration {
    private Type type;
    public LanguageTypeDeclaration(Type type){
        this.type = type;
    }
    @Override
    public TextCollection createText() {
        return null;
    }

    @Override
    public void createText(TextCollection collection) {

    }

    @Override
    public boolean setParent(INode n) {
        return false;
    }

    @Override
    public INode getParent() {
        return null;
    }

    @Override
    public boolean hasParent() {
        return false;
    }

    @Override
    public Type resolveDeclaredType() {
        return type;
    }

    @Override
    public Color getSymbolTypeColor() {
        if(type.isValueType()){
            return Color.orange;
        }
        if(type.isFunctionType()){
            return Color.green;
        }
        if(type.isClassType()){
            return Color.pink;
        }
        return Color.red;
    }
}
