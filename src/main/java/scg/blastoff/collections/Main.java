package scg.blastoff.collections;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {

// Collection<T> implements Iterable<T>

    public static void main(String[] args) throws IOException {
//        lists();
//        sets();
//        stack();
//        maps();
    }

    private static void showJFrame() throws IOException {
        JFrame dictionary = new JFrame("Dictionary");

        dictionary.setBounds(0, 0, 500, 500);

        dictionary.setVisible(true);

        BorderLayout borderLayout = new BorderLayout();

        dictionary.setLayout(borderLayout);

        ImageIcon imageIcon = new ImageIcon(Files.readAllBytes(Paths.get("//icons/img.png")));

        JButton jButton = new JButton(imageIcon);

        jButton.setVisible(true);

        dictionary.getContentPane()
                .add(jButton, BorderLayout.CENTER);

        jButton.addActionListener(e -> {
            System.out.println("CLICK!");
        });

        dictionary.toFront();
    }

//   persons
// +------------+
// | name | age |
// +------+-----+
// | Petya|  10 |
// +------+-----+
// | Vasya|   5 |
// +------+-----+

// class Person(name, age)

// SELECT name, age FROM persons WHERE age <= 10; // read
// INSERT ....; // write
// UPDATE ....; // update
// DELETE ....; // delete

// CRUD

// String query = "SELECT name, age FROM persons WHERE age <= 10"
// ResultSet resultSet = select(query);

    private static void maps() {

        // Map<K, V>
        // HashMap
        // hashCode <-> equals
        // search: O(1) -> O(n)

        Map<String, String> ss = new HashMap<>();

        ss.put("1", "a");
        ss.put("2", "b");
        ss.put("3", "c");

        for (String nextKey : ss.keySet()) {
            System.out.println(nextKey);
        }

        System.out.println("///");

        for (String nextValue : ss.values()) {
            System.out.println(nextValue);
        }

        System.out.println("///");

        System.out.println(ss.get("1"));

        System.out.println("///");

        for (String nextKey : ss.keySet()) {
            System.out.println(ss.get(nextKey));
        }

        ss.put("3", "d");

        System.out.println("///");

        System.out.println(ss.get("3"));

        System.out.println("///");
    }

    private static void stack() {
        // FIFO

        Stack<String> ss = new Stack<>();

//        ss.pop();
//        ss.push();
//        ss.peek();

        ss.push("1");
        ss.push("2");
        ss.push("3");

        // |3| <- top
        // |2|
        // |1|

        for (String s : ss) {
            System.out.println(s);
        }

        System.out.println(ss.pop()); // remove

        // |2| <- top
        // |1|

        System.out.println(ss.pop()); // remove

        // |1| <- top

        System.out.println(ss.pop()); // remove

        // _ <- top

        System.out.println(ss.pop());

    }

    private static void sets() {
        // Set<T> implements Collection<T>
        // HashSet
        // TreeSet

        Set<String> ss = new HashSet<>();

        ss.add("1");
        ss.add("2");
        ss.add("3");

        for (String s : ss) {
            System.out.println(s);
        }
    }

    private static void lists() {
        // List<T> implements Collection<T>
        // ArrayList
        // LinkedList
        // search : O(n)

        List<String> ss = new ArrayList<>();

        ss.add("1");
        ss.add("2");

        for (String s : ss) {
            System.out.println(s);
        }

        ss.remove("2");

        for (String s : ss) {
            System.out.println(s);
        }

        ss.remove("1");

        System.out.println(ss.isEmpty()); // true
    }

}
