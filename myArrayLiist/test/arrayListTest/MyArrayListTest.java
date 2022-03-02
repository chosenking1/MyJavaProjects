package arrayListTest;
import arrayList.MyArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class MyArrayListTest {
    MyArrayList myList;

    @BeforeEach
    public void objectMake(){
        myList = new MyArrayList();
    }

    @Test
    public void itemCanBeAddedInArray(){
        myList.addString("added");

        assertArrayEquals(new String []{"added", null}, myList.getMyArray());
    }

    @Test
    public void arrayCanBeIncreased(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ball");
        assertEquals(4,myList.arrayLength());
    }

    @Test
    public void howManyContent(){
        myList.addString("added");
        myList.addString("ball");
        assertEquals(2,myList.size());
    }

    @Test
    public void extraItemCanBeAdded(){
    myList.addString("added");
    myList.addString("ball");
    myList.addString("ebi");
    myList.addString("joke");
    assertArrayEquals(new String []{"added","ball", "ebi", "joke"}, myList.getMyArray());
    }

    @Test
    public void capacityCanBeGotten(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ebi");
        myList.addString("joke");
        myList.addString("joke");
        assertEquals(16,myList.arrayLength());
    }

    @Test
    public void itemCanBeRemovedByIndex(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ebi");
        myList.addString("joke");
        myList.remove(1);
        assertArrayEquals(new String []{"added","ebi", "joke", null}, myList.getMyArray());

    }
    @Test
    public void itemCanBeRemovedByName(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ebi");
        myList.addString("joke");
        myList.remove("ebi");
        assertArrayEquals(new String []{"added","ball", "joke", null}, myList.getMyArray());

    }
    @Test
    public void itemCanBeGottenByIndex(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ebi");
        myList.addString("joke");
        myList.locator(2);
        assertEquals("ebi",myList.locator(2));

    }
    @Test
    public void canAddItemByIndex(){
        myList.addString("added");
        myList.addString("ball");
        myList.addString("ebi");

        myList.addString("moyo",2);
        assertArrayEquals(new String[]{"added","ball", "moyo", "ebi"},myList.getMyArray());
    }
}
