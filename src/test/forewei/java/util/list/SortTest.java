package test.forewei.java.util.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 用指定的 Comporator 对集合元素进行排序
 * @auther forewei
 * @date 2020/8/18
 */
public class SortTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(400);
        // 从大到小
        list.sort((f,f1)->f1.compareTo(f));
        list.forEach(f->{
            System.out.println(f);
        });
    }
}
