package za.ac.cput.projectone;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

/**
 * Unit test for simple CollectionListSetMap.
 * Ryan Petersen 217027806
 * 3G
 * Chapter 2 Assignment Question 1
 */
public class CollectionListSetMapTest
{
    ColletionListSetMap colletionListSetMap;
    @Test
    public void testList()
    {

        colletionListSetMap =  new ColletionListSetMap();
        List<Integer> actualList  = colletionListSetMap.getList();
        List<Integer> expectedList = Arrays.asList(7,12,22);

        Set<String> actualSet = colletionListSetMap.getSet();
        Set<String> expectedSet = new HashSet<String>();
        expectedSet.add("Riyaad");
        expectedSet.add("Luke");
        expectedSet.add("David");
        TreeSet sort = new TreeSet(expectedSet);

        Map<String,String> actualMap = colletionListSetMap.getMap();
        Map expectedMap = new HashMap();
        expectedMap.put("Cape Town", "South Africa");
        expectedMap.put("Luanda", "Angola");
        expectedMap.put("Yaounde", "Cameroon");

        //ListTest
        assertThat(actualList,is(expectedList));
        assertThat(actualList,hasItems(7));
        assertThat(actualList,hasItems(12));
        assertThat(actualList,hasItems(22));

        //SetTest
        assertThat(actualSet,is(expectedSet));
        assertThat(actualSet,hasItems("Riyaad"));

        //MapTest
        assertThat(actualMap,is(expectedMap));
        assertThat(actualMap.size(),is (3));
    }
}
