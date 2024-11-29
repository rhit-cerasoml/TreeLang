import editor.ui.Surface;
import model.Model;
import tree.terminals.value.LiteralInt;
import tree.terminals.symbol.Symbol;
import tree.contructs.Assignment;
import tree.contructs.Body;
import tree.contructs.Declaration;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        Declaration dec = new Declaration();
        Symbol i = new Symbol("int");
        Symbol s = new Symbol("x");
        body.append(dec);
        dec.setType(i);
        dec.setSymbol(s);
        LiteralInt lit = new LiteralInt(5);
        Assignment a = new Assignment();
        a.setLHS(s);
        a.setRHS(lit);
        body.append(a);
        System.out.println(body.createStringStack());

        Model model = new Model();
        model.walkTree(body);

        JFrame frame = new JFrame("Editor");
        frame.add(new Surface(model));
        frame.setSize(620, 190);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}