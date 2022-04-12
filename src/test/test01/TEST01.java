package test.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TEST01 {
    public static void main(String[] args) throws Exception{
        List<String> test = new ArrayList<String>(Arrays.asList(new String [] {"a" , "ab" , "abc" , "abcd"} ));
        System.out.println("list before deleting: " + test);

        Iterator<String> iterator = test.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.length() == 4 ){
                iterator.remove();
                System.out.println("delete " + s + " successfully!");
            }
        }

        System.out.println("after iterating:" + test );
    }
}
