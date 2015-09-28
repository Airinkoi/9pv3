package org.itstep;

import java.util.ArrayList;
import java.util.LinkedList;

public class Nesting {
    public static void main(String[] args) {
        int x = Source.NestedStatic.x;
        Source s = new Source();
        Source.Nested nested = s.new Nested();
    }
}

class Source {
    public static class NestedStatic {
        public static int x = 10;
    }
    public class Nested {
        public int x = 12;
    }
}