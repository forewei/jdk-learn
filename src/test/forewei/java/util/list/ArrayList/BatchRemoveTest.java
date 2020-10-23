package test.forewei.java.util.list.ArrayList;

import java.util.ArrayList;

/**
 * @auther forewei
 * @date 2020/10/23
 */
public class BatchRemoveTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            list1.add(i);
        }
        list.removeAll(list1);
    }
}
