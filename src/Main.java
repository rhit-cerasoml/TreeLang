import editor.model.TextCollection;
import editor.ui.Surface;
import model.Model;
import tree.contructs.declarations.TypeDeclaration;
import tree.terminals.value.LiteralInt;
import tree.terminals.symbol.Symbol;
import tree.contructs.Assignment;
import tree.contructs.bodies.Body;
import tree.contructs.declarations.VariableDeclaration;
import treemodel.Primitives;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        Body b2 = new Body();
        TypeDeclaration typedef = new TypeDeclaration();
        typedef.setName(new Symbol("testClass"));
        body.append(typedef);
        VariableDeclaration dec = new VariableDeclaration();
        Symbol i = new Symbol("int");
        i.setDeclaration(Primitives.PRIMITIVE_INT_SOURCE);
        Symbol s = new Symbol("x");
        body.append(dec);
        dec.setType(i);
        dec.setSymbol(s);
        LiteralInt lit = new LiteralInt(5);
        Assignment a = new Assignment();
        a.setLHS(s);
        a.setRHS(lit);
        body.append(a);
        body.append(b2);
        TextCollection test = body.createText();
        System.out.println(test);

        Model model = new Model(body);
        model.lintWalk();

        JFrame frame = new JFrame("Editor");
        frame.add(new Surface(model));
        frame.setSize(620, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
