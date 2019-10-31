import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeMapTest {

    @Test
    void keySetEmpty() {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        Set<String> expected = new TreeSet();
        Set<String> actual = bstMap.keySet();

        assertEquals(expected, actual);
    }

    @Test
    void keySetOneValue()
    {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        bstMap.put("Jack", "0871231231");

        Set<String> expected = new TreeSet();
        expected.add("Jack");

        Set<String> actual = bstMap.keySet();

        assertEquals(expected, actual);
    }

    @Test
    void keySetManyValues()
    {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        bstMap.put("Jack", "0871231231");
        bstMap.put("Jill", "0877654321");
        bstMap.put("Bob", "0871234567");
        bstMap.put("Rob", "0851212121");
        bstMap.put("Phil", "0871231231");
        bstMap.put("Jimmy", "0877654321");
        bstMap.put("Will", "0871234567");
        bstMap.put("Ryan", "0851212121");

        Set<String> expected = new TreeSet();
        expected.add("Jack");
        expected.add("Jill");
        expected.add("Bob");
        expected.add("Rob");
        expected.add("Phil");
        expected.add("Jimmy");
        expected.add("Will");
        expected.add("Ryan");

        Set<String> actual = bstMap.keySet();

        assertEquals(expected, actual);
    }

    @Test
    void heightEmpty()
    {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        int expected = 0;
        int actual = bstMap.height();

        assertEquals(expected, actual);
    }

    @Test
    void heightFull()
    {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        bstMap.put("Jack", "0871231231");
        bstMap.put("Jill", "0877654321");
        bstMap.put("Bob", "0871234567");
        bstMap.put("Rob", "0851212121");
        bstMap.put("Phil", "0871231231");
        bstMap.put("Jimmy", "0877654321");
        bstMap.put("Will", "0871234567");
        bstMap.put("Ryan", "0851212121");

        int expected = 5;
        int actual = bstMap.height();

        assertEquals(expected, actual);
    }
}