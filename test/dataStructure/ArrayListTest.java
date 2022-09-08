package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list ;
    @BeforeEach
    public void setup(){
        list = new ArrayList ();
    }

    @Test
    public void newListIsEmptyTest(){
        List list = new ArrayList ();
        assertTrue ( list.isEmpty () );
    }

    @Test
    public void addItemListIsNotEmptyTest(){
        List list = new ArrayList ();
        list.add ("GString");
        assertFalse ( list.isEmpty ( ) );
        assertEquals ( 1, list.size () );
    }

    @Test
    public void addItemListIsNotEmpty_SizeIsOneTest(){
        List list = new ArrayList ();
        list.add("Phone");
        assertFalse ( list.isEmpty () );
        assertEquals ( 1, list.size());
    }

    @Test
    public void addItemGetItemByIndex(){
        list.add ( "Glass" );
        String savedItem = list.get ( 0);
        assertEquals ( "Glass", savedItem );
    }

    @Test
    public void addTestaddTwoItemsGetTwoItemIndex(){
        list.add("Case");
        list.add("Fan");
        assertEquals ("Case", list.get ( 0 )  );
        assertEquals ( "Fan", list.get(1) );
    }

    @Test
    public void  addTwoItemsRemoveOneSizeIsOneTest(){
        list.add("Key");
        list.add("Car");
        list.remove ( 1 );
        assertEquals ( 1, list.size () );
        String deleteItem = list.get ( 1 );
        assertNull ( deleteItem );
    }

    @Test
    public void addTwoItemsRemoveOneFindbyIndex(){
        list.add("Bag");
        list.add("Shoe");
    }

}