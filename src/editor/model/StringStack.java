package editor.model;

import editor.EditorSettings;
import tree.INode;

import java.util.*;

public class StringStack implements IStringStackElement {

    private ArrayList<IStringStackElement> list = new ArrayList<>();

    public void add(IStringStackElement element){
        if(element instanceof StringStackTerminal){
            addTerminal((StringStackTerminal) element);
        }else{
            list.add(element);
        }
    }

    private void addTerminal(StringStackTerminal element){
        String[] partitions = element.text.split("\n", -1);
        if(partitions.length == 1){
            list.add(element);
            return;
        }
        if(partitions.length == 0){
            list.add(new StringStackLineBreak());
            return;
        }
        if(partitions[0].length() > 0) {
            list.add(element.newPartitioned(partitions[0]));
        }
        for(int i = 1; i < partitions.length; i++){
            list.add(new StringStackLineBreak());
            if(partitions[i].length() > 0) {
                list.add(element.newPartitioned(partitions[i]));
            }
        }
    }

    public void add(String s, INode accessor){
        addTerminal(new StringStackTerminal(s, EditorSettings.DEFAULT_TEXT_COLOR, accessor));
    }

    public void buildString(StringBuilder sb){
        for(IStringStackElement ss : list){
            ss.buildString(sb);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(sb);
        return sb.toString();
    }

//    public void applyAttributes(AttributedString content) {
//        applyAttributes(content, 0);
//    }
//
//    protected int applyAttributes(AttributedString content, int spanHead) {
//        for(StringStack ss : list){
//            spanHead = ss.applyAttributes(content, spanHead);
//        }
//        return spanHead;
//    }
//
//    public StringStackCharacterIterator getIterator() {
//        return new StringStackCharacterIterator(this);
//    }
//
//    public class StringStackCharacterIterator implements AttributedCharacterIterator {
//        private Stack<StringStack> startOfLineSnapshot;
//        private StringTerminal terminalSnapshot;
//        private int terminalIndexSnapshot;
//        private Stack<StringStack> unvisited;
//        private StringStack root;
//        private String[] lines;
//        private StringTerminal currentTerminal = null;
//        private int currentIndexInTerminal = -1;
//        private int globalIndex = 0;
//        private int currentEndIndex;
//        private Font font;
//        private int currentStartIndex = 0;
//        private int currentLine = 0;
//        private Map<Attribute, Object> defaultAttributes;
//        public StringStackCharacterIterator(StringStack ss){
//            defaultAttributes = new HashMap<>();
//            unvisited = new Stack<>();
//            root = ss;
//            lines = ss.toString().split("\n");
//            currentEndIndex = lines[currentLine].length();
//            unvisited.push(ss);
//            advanceToNextTerminal();
//            terminalSnapshot = currentTerminal;
//            terminalIndexSnapshot = currentIndexInTerminal;
//            startOfLineSnapshot = (Stack<StringStack>) unvisited.clone();
//        }
//
//        public void setFont(Font f){
//            this.font = f;
//            defaultAttributes.put(TextAttribute.FONT, font);
//        }
//
//        private void advanceToNextTerminal() {
//            currentTerminal = null;
//            currentIndexInTerminal = -1;
//
//            while (!unvisited.isEmpty()) {
//                StringStack next = unvisited.pop();
//                if (next instanceof StringTerminal) {
//                    currentTerminal = (StringTerminal) next;
//                    currentIndexInTerminal = 0;
//                    return;
//                } else {
//                    for(int i = next.list.size() - 1; i >= 0; i--) {
//                        unvisited.push(next.list.get(i));
//                    }
//                }
//            }
//        }
//
//        public boolean hasNextLine(){
//            return currentLine < lines.length - 1;
//        }
//
//        public void nextLine(){
//            currentStartIndex += lines[currentLine].length();
//            currentLine++;
//            currentEndIndex = currentStartIndex + lines[currentLine].length();
//            next();
//            startOfLineSnapshot = (Stack<StringStack>) unvisited.clone();
//            terminalSnapshot = currentTerminal;
//            terminalIndexSnapshot = currentIndexInTerminal;
//        }
//
//        @Override
//        public char first() {
//            reset();
//            return current();
//        }
//
//        private void reset() {
//            unvisited = (Stack<StringStack>) startOfLineSnapshot.clone();
//            currentTerminal = terminalSnapshot;
//            currentIndexInTerminal = terminalIndexSnapshot;
//            globalIndex = currentStartIndex;
//            //advanceToNextTerminal();
//        }
//
//        @Override
//        public char last() {
//            throw new UnsupportedOperationException("last() is not supported for this iterator.");
//        }
//
//        @Override
//        public char current() {
//            if (currentTerminal == null || currentIndexInTerminal == -1 || currentTerminal.text.charAt(currentIndexInTerminal) == '\n') {
//                return CharacterIterator.DONE;
//            }
//            return currentTerminal.text.charAt(currentIndexInTerminal);
//        }
//
//        @Override
//        public char next() {
//            if (currentTerminal == null || currentIndexInTerminal == -1) {
//                return CharacterIterator.DONE;
//            }
//
//            currentIndexInTerminal++;
//            globalIndex++;
//            if (currentIndexInTerminal >= currentTerminal.text.length()) {
//                advanceToNextTerminal();
//            }
//
//            return current();
//        }
//
//        @Override
//        public char previous() {
//            throw new UnsupportedOperationException("previous() is not supported for this iterator.");
//        }
//
//        @Override
//        public char setIndex(int position) {
//            System.out.println(globalIndex + " -> " + position);
//            if(position < globalIndex){
//                throw new UnsupportedOperationException("setIndex() cannot reduce the position of the iterator");
//            }
//            while(position > globalIndex){
//                next();
//            }
//            return current();
//
//        }
//
//        @Override
//        public int getBeginIndex() {
//            return currentStartIndex;
//        }
//
//        @Override
//        public int getEndIndex() {
//            return currentEndIndex;
//        }
//
//        @Override
//        public int getIndex() {
//            return globalIndex;
//        }
//
//        @Override
//        public Object clone() {
//            throw new UnsupportedOperationException("clone() is not supported for this iterator.");
//        }
//
//        @Override
//        public Map<Attribute, Object> getAttributes() {
//            return currentTerminal != null ? computeAttributes(currentTerminal) : defaultAttributes;
//        }
//
//        @Override
//        public Object getAttribute(Attribute attribute) {
//            return getAttributes().get(attribute);
//        }
//
//        @Override
//        public Set<Attribute> getAllAttributeKeys() {
//            return currentTerminal != null ? computeAttributes(currentTerminal).keySet() : Collections.emptySet();
//        }
//
//        @Override
//        public int getRunStart() {
//            return globalIndex - (currentIndexInTerminal);
//        }
//
//        @Override
//        public int getRunLimit() {
//            return globalIndex - (currentIndexInTerminal) + (currentTerminal != null ? currentTerminal.text.length() : 0);
//        }
//
//        @Override
//        public int getRunStart(Attribute attribute) {
//            return getRunStart();
//        }
//
//        @Override
//        public int getRunStart(Set<? extends Attribute> attributes) {
//            return getRunStart();
//        }
//
//        @Override
//        public int getRunLimit(Attribute attribute) {
//            return getRunLimit();
//        }
//
//        @Override
//        public int getRunLimit(Set<? extends Attribute> attributes) {
//            return getRunLimit();
//        }
//
//        private Map<Attribute, Object> computeAttributes(StringTerminal terminal) {
//            Map<Attribute, Object> attributes = new HashMap<>();
//            attributes.put(TextAttribute.FOREGROUND, terminal.c);
//            attributes.put(TextAttribute.BACKGROUND, Color.darkGray);
//            attributes.put(TextAttribute.FONT, font);
//            return attributes;
//        }
//    }
}
