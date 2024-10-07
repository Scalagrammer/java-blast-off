package scg.blastoff.loops;

import static scg.blastoff.loops.Pair.pairOf;

public class ForEach {
    public static void main(String[] args) {

        Pair<String> ss = pairOf("1", "2");

        System.out.printf("Created pair: %s\n", ss);

        // syntax sugar:

        for (String s : ss) {
            System.out.println(s);
        }

        // desugared:

//        Iterator<String> iterator = ss.iterator();
//
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            System.out.println(s);
//        }

    }
}
