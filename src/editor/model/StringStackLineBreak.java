package editor.model;

public class StringStackLineBreak implements IStringStackElement{
    @Override
    public void buildString(StringBuilder sb) {
        sb.append('\n');
    }
}
