package test.forewei.java.util.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 指定运算结果添加测试
 *
 * @auther forewei
 * @date 2020/8/18
 */
public class ReplaceAllTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.replaceAll(f -> f + 10);
        list.forEach(f -> {
            System.out.println(f);
        });
    }
}
