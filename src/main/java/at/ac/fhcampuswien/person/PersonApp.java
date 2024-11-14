package at.ac.fhcampuswien.person;

public class PersonApp
{
    public static void main(String[] args)
    {
        try {
            Person ada = new Person("Ada Lovelace", 10, 12, 1815);
            Person pascal = new Person("Blaise Pascal", 19, 6, 1623);
            System.out.println(ada); // Ada Lovelace (10.12.1815)
            System.out.println(pascal); // Blaise Pascal (19.6.1623)

            Person ada1 = new Person("Ada Lovelace", 10, 12, 1815);
            System.out.println(ada.equals(pascal)); // false
            System.out.println(ada.equals(ada1)); // should be true: Task 1

            Person charles = new Person("Charles Babbage");
            System.out.println(charles); // Charles Babbage (null)

            charles.setBirthday(new SimpleDate(26,12,1791));
            charles.youthen();
            System.out.println(charles); // Charles Babbage (26.12.1792)

            /** Uncomment the following code after having implemented public static Person(Person)
             * and public static SimpleDate(SimpleDate) **/

            Person charles1= new Person(charles);
            System.out.println(charles1==charles); // false
            System.out.println(charles1.equals(charles)); // true
            System.out.println(charles.getBirthday().equals(charles1.getBirthday())); /// true

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
