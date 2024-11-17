package wordcounter;

import org.Exercises.wordcounter.WordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest
{
    @Test
    public void countTotalWords()
    {
        // Arrange
        WordCounter wordCounter = new WordCounter("data/hhgttg.txt", true);

        // Act
        var result = wordCounter.countTotalWords();

        // Assert
        assertEquals(1853, result);
    }

    @Test
    public void countWordOccurrences()
    {
        // Arrange
        WordCounter wordCounter = new WordCounter("something something something, darkside, something something,,, something complete!", false);

        // Act
        var result = wordCounter.countWordOccurrences();

        // Assert
        assertEquals(6, result.get("something"));
        assertEquals(1, result.get("darkside"));
        assertEquals(1, result.get("complete"));
    }
    @Test
    public void countWordOccurrencesFile()
    {
        // Arrange
        WordCounter wordCounter = new WordCounter("data/hhgttg.txt", true);

        // Act
        var result = wordCounter.countWordOccurrences();

        // Assert
        assertEquals(19, result.get("snow"));
        assertEquals(13, result.get("all"));
        assertEquals(11, result.get("universe"));
    }
}
