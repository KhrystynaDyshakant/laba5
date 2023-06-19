package ua.lviv.iot.algo.part1.lab1;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    @Test
    public void testRemove() {
        TextProcessor textProcessor = new TextProcessor("Computer science", "s");
        assertEquals("science", textProcessor.getStringOfWordsFromText());
    }
    @Test
    public void testTextIsSameWords(){
        TextProcessor textProcessor = new TextProcessor("hello hello","h");
        assertEquals("hello",textProcessor.getStringOfWordsFromText());
    }
    @Test
    public void testTextIsEmpty(){
        TextProcessor textProcessor = new TextProcessor("","s");
        assertEquals("",textProcessor.getStringOfWordsFromText());
    }

    @Test
    public void testNoNeededLettersInWords() {
        TextProcessor textProcessor = new TextProcessor("here no words", "t");
        assertEquals("", textProcessor.getStringOfWordsFromText());
    }
}
