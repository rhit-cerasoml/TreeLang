import editor.model.TextCollection;
import editor.ui.Surface;
import model.Model;
import model.type.primitives.Primitives;
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
        ExpressionVariableDeclaration dec = new ExpressionVariableDeclaration(Primitives.PRIMITIVE_INT, "x");
        ExpressionLiteralInt lit = new ExpressionLiteralInt(5);
        ExpressionAssignment a = new ExpressionAssignment();
        a.setLHS(dec.getSymbol());
        a.setRHS(lit);
        body.append(dec);
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
