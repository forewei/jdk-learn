package test.forewei.java.util.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器交集测试
 * @auther forewei
 * @date 2020/8/13
 */
public class RetainAllTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list1.add(i);
        }
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        // 删除元素大于1的集合
        list.retainAll(list1);
        list.forEach(f-> System.out.println(f));
    }
}
