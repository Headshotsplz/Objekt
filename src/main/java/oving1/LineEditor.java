package oving1;

public class LineEditor {
    
    private String text;
    private int insertionIndex;

    public void left(){
        if (insertionIndex == 0) {
            throw new IllegalArgumentException("Cannot go more left");
        }
        insertionIndex--;
    }
    public void right(){
        if (insertionIndex > text.length()) {
            throw new IllegalArgumentException("cannot go more right");
        }
        insertionIndex++;
    }
    public void insertString(String s){



    }
    
    public void deleteLeft(){
        if (insertionIndex > 0) {
            text.deleteCharAt(insertionIndex - 1);
            insertionIndex--;
        }
    }
    public void deleteRight(){

    }
    public String getText(){
        return text;

    }
    public void setText(String text){
        this.text = text;

    }
    public int getInsertionIndexteksten(){
        return insertionIndex;
    }
    public void setInsertionIndex(int insertionIndex){
        this.insertionIndex = insertionIndex;

    }
}
