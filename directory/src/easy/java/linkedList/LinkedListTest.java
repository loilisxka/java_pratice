package linkedList;

import java.util.*;

/**
 * this program demonstrates operations on linked lists.
 * @version 1.9 2020-09-07
 * @auther lzzaya hu
 */

public class LinkedListTest {
    public static void main(String[] args){
        var a = new LinkedList<String>();
        a.add("xiaoA");
        a.add("xiaoB");
        a.add("xiaoC");

        var b = new LinkedList<String>();
        b.add("xiaoD");
        b.add("xiaoE");
        b.add("xiaoF");
        b.add("xiaoG");
        b.add("xiaoH");

        ListIterator<String> aIter = a.listIterator();
        ListIterator<String> bIter = b.listIterator();

        while(bIter.hasNext()){
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.listIterator();
        while(bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);
    }

}
