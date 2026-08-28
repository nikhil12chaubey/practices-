import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nikhil");
        list.add("he");
        list.add("kishan");
        list.add("prassana");
        list.add("purab");
        System.out.println("list of the students" + list);
        System.out.println("acess the index element" +  list.get ( 2));
        // remove the list
        list.remove(3);
        System.out.println("after removing the element" + list);
        
        list.set(5,"purabiii");
        System.out.println("list of the elements"+list);
        }

}
