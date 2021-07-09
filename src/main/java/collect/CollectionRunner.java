package collect;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args){
        List<String> x = new ArrayList();
        x.add("hi");
        x.add("3");
        x.add("10");

        for(String str : x){
            System.out.println(str);
        }

    }

}


