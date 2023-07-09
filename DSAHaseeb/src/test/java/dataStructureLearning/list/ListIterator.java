package dataStructureLearning.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List li = new ArrayList<>();
        li.add(10);
        li.add("dee");
        li.add("rahul");

        Iterator it = li.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        li.remove(1);

        System.out.println(li);

        System.out.println("------------------------------");

        List list = new ArrayList<>();
        list.add(20);
        list.add("wrwrw");
        list.add("QAXWS");

     java.util.ListIterator lt = list.listIterator();

     while(lt.hasNext()){
         System.out.println(lt.next());
     }

       lt.remove();
        System.out.println("------------------------------");

     while(lt.hasPrevious()){
         System.out.println(lt.previous());
     }

     li.set(0,200);
        System.out.println(li);

    }
}
