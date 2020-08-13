package test.forewei.java.util.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试条件删除容器里的元素
 * @auther forewei
 * @date 2020/8/13
 */
public class RemoveIfTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        // 删除元素大于1的集合
        list.removeIf(f -> f > 1);
        list.forEach(f-> System.out.println(f));
    }
}
