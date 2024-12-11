package treemodel;

import model.type.PrimitiveType;
import model.type.Type;

import java.util.ArrayList;

public class Primitives {
    public static final Type PRIMITIVE_UNRESOLVED = new PrimitiveType("unresolved");
    public static final Type PRIMITIVE_VOID = new PrimitiveType("void");
    public static final Type PRIMITIVE_INT = new PrimitiveType("int");
    public static final Type PRIMITIVE_CLASS = new PrimitiveType("class");

    public static void populatePrimitiveTypes(ArrayList<Type> types){
        types.add(PRIMITIVE_UNRESOLVED);
        types.add(PRIMITIVE_VOID);
        types.add(PRIMITIVE_INT);
    }
}
