import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertedIndexTest {

    @Test
    void searchAll()
    {
        InvertedIndex index = new InvertedIndex();

        File f = new File("TextFiles");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));


        index.buildIndex(files);

        List<File> expected = new ArrayList<>();
        expected.add(new File("TextFiles/File1.txt"));
        expected.add(new File("TextFiles/File2.txt"));
        expected.add(new File("TextFiles/File3.txt"));

        List<File> actual = index.search("Trees");

        assertEquals(expected, actual);
    }

    @Test
    void searchOne()
    {
        InvertedIndex index = new InvertedIndex();

        File f = new File("TextFiles");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));


        index.buildIndex(files);

        List<File> expected = new ArrayList<>();
        expected.add(new File("TextFiles/File1.txt"));

        List<File> actual = index.search("Ireland");

        assertEquals(expected, actual);
    }

    @Test
    void searchNone()
    {
        InvertedIndex index = new InvertedIndex();

        File f = new File("TextFiles");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));


        index.buildIndex(files);

        List<File> expected = null;

        List<File> actual = index.search("Nothing");

        assertEquals(expected, actual);
    }
}