package zxh.demo.java.tips;

import java.util.ArrayList;
import java.util.List;

/**
 * DoubleBraceInitExample:
 * @author zhangxuhai
 * @date 2020/4/4
*/
public class DoubleBraceInitExample {
    private static List<String> initListBeforeJava9 = new ArrayList<>();
    static {
        initListBeforeJava9.add("Dopey");
        initListBeforeJava9.add("Doc");
        initListBeforeJava9.add("Bashful");
        initListBeforeJava9.add("Happy");
        initListBeforeJava9.add("Grumpy");
        initListBeforeJava9.add("Sleepy");
        initListBeforeJava9.add("Sneezy");
    }

    private static List<String> doubleBraceCollectionInit =
            new ArrayList<String>(){{
                add("Dopey");
                add("Doc");
                add("Bashful");
                add("Happy");
                add("Grumpy");
                add("Sleepy");
                add("Sneezy");
            }};

    private static List<String> java9CollectionInit =
            List.of("Dopey", "Doc", "Bashful", "Happy", "Grumpy", "Sleepy", "Sneezy");
}