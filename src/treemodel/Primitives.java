package treemodel;

import model.type.PrimitiveType;
import model.type.Type;
import tree.contructs.declarations.LanguageTypeDeclaration;

import java.util.ArrayList;

public class Primitives {
    public static final Type PRIMITIVE_UNRESOLVED = new PrimitiveType("unresolved");
    public static final LanguageTypeDeclaration PRIMITIVE_UNRESOLVED_SOURCE = new LanguageTypeDeclaration(PRIMITIVE_UNRESOLVED);
    public static final Type PRIMITIVE_VOID = new PrimitiveType("void");
    public static final LanguageTypeDeclaration PRIMITIVE_VOID_SOURCE = new LanguageTypeDeclaration(PRIMITIVE_VOID);
    public static final Type PRIMITIVE_INT = new PrimitiveType("int");
    public static final LanguageTypeDeclaration PRIMITIVE_INT_SOURCE = new LanguageTypeDeclaration(PRIMITIVE_INT);
    public static final Type PRIMITIVE_CLASS = new PrimitiveType("class");
    public static final LanguageTypeDeclaration PRIMITIVE_CLASS_SOURCE = new LanguageTypeDeclaration(PRIMITIVE_CLASS);

    public static void populatePrimitiveTypes(ArrayList<Type> types){
        types.add(PRIMITIVE_UNRESOLVED);
        types.add(PRIMITIVE_VOID);
        types.add(PRIMITIVE_INT);
        types.add(PRIMITIVE_CLASS);
    }


}
