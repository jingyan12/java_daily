package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TraversalList
 * @Description TODO
 * @Author lenovo
 * @Date 2020/10/24
 **/

public class TraversalList {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>(
                Arrays.asList("tom","cat","jane","jerry"));
        Iterator<String> it1=list.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println();
                for (Iterator it2=list.iterator();it2.hasNext();){
                    System.out.println(it2.next());
                }
        System.out.println();
                for (String value:list){
                    System.out.println(value);
                }
        System.out.println();
                for (int i=0;i<list.size();i++){
                    System.out.println(i);
                }
        System.out.println();
                list.forEach(item -> System.out.println(item));
        System.out.println();
        list.forEach(System.out::print);
    }
}
