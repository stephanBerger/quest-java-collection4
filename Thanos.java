import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import fr.wcs.map.Computer;
import fr.wcs.map.User;



public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Map<Hero, Flower> party = new TreeMap<>(comparator);
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        // Hulk, Thor and Scarlet Witch have a Rose
        party.put(vision,tulip);
        // Vision has a Tulip
        party.put(captainAmerica,lily);
        // Captain America has a Lily
        party.put(doctorStrange,violet);
        party.put(blackWidow, violet);
        // Doctor Strange and Black Widow have a Violet

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(party.containsValue(begonia));
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero hero : party.keySet()) {
		     Flower flower = party.get(hero);
		    System.out.println(flower.getName());
		}
    }
    
    static Comparator<Hero> comparator = new Comparator<Hero>() {  
	    @Override  
	    public int compare(Hero orig, Hero compare) {  
	        return orig.getName().compareTo(compare.getName());  
	    }  
	};  
}