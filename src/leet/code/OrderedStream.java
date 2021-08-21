package leet.code;

import java.util.LinkedList;
import java.util.List;

public class OrderedStream {

    private String[] array;

    public OrderedStream(int n) {
        array = new String[n+1];
    }

    public List<String> insert(int idKey, String value) {
        array[idKey] = value;

        List<String> result = new LinkedList<>();
        for (int i = idKey+1; i < array.length; i++) {
            if (array[i] != null) {
                result.add(array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        OrderedStream obj = new OrderedStream(5);
        System.out.println(obj.insert(3, "cccc"));
        System.out.println(obj.insert(1, "aaaa"));
    }
}
