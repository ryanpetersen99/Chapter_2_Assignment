package za.ac.cput.projectone;

/**
 * Ryan Petersen 217027806
 * 3G
 * Chapter 2 Assignment Question 1
 *
 */
import java.util.*;
public class ColletionListSetMap {

    private List<Integer> numbers;
    private Set names;
    private Map cityCountry;
    private TreeSet sort;

    public ColletionListSetMap() {

        //List
        numbers = new ArrayList();
        numbers.add(12);
        numbers.add(7);
        numbers.add(22);
        Collections.sort(numbers);

        //Set
        names = new HashSet();
        names.add("Riyaad");
        names.add("Luke");
        names.add("David");
        sort = new TreeSet(names);


        //Map
        cityCountry = new HashMap();
        cityCountry.put("Cape Town", "South Africa");
        cityCountry.put("Luanda", "Angola");
        cityCountry.put("Yaounde", "Cameroon");
    }

    public List<Integer> getList() {
        return numbers;
    }

    public Set<String> getSet() {
        return sort;
    }

    public Map<String, String> getMap() {
        return cityCountry;
    }

        public static void main (String[]args)
        {
            ColletionListSetMap clsm = new ColletionListSetMap();
            System.out.println("List sorted from smallest to biggest: " + clsm.getList());
            System.out.println("Set sorted alphabetically: " + clsm.getSet());
            System.out.println("Map" + clsm.getMap());
        }
}
