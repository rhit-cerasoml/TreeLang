import editor.model.TextCollection;
import editor.ui.Surface;
import model.Model;
import tree.contructs.expressions.ExpressionVariableDeclaration;
import tree.contructs.expressions.literals.ExpressionLiteralInt;
import tree.terminals.symbol.Symbol;
import tree.contructs.expressions.ExpressionAssignment;
import tree.contructs.bodies.Body;
import tree.terminals.type.ITypeProvider;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        //TypeDeclaration typedef = new TypeDeclaration();
        //typedef.setName(new Symbol("testClass"));
        //body.append(typedef);
        ExpressionVariableDeclaration dec = new ExpressionVariableDeclaration() {
            @Override
            public ITypeProvider resolveDeclaredType() {
                return null;
            }

            @Override
            public Color getSymbolTypeColor() {
                return null;
            }
        };
        //i.setDeclaration(Primitives.PRIMITIVE_INT_SOURCE);
        Symbol s = new Symbol("x");
        //body.append(dec);
        //dec.setType(i);
        //dec.setSymbol(s);
        ExpressionLiteralInt lit = new ExpressionLiteralInt(5);
        ExpressionAssignment a = new ExpressionAssignment();
        a.setLHS(s);
        a.setRHS(lit);
        body.append(a);
        TextCollection test = body.createText();
        System.out.println(test);

        Model model = new Model(body);

        JFrame frame = new JFrame("Editor");
        frame.add(new Surface(model));
        frame.setSize(620, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
