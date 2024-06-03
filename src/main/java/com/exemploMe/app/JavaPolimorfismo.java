package main.java.com.exemploMe.app;

import main.java.com.exemploMe.superpackage.Sub;
import main.java.com.exemploMe.superpackage.Super;

public class JavaPolimorfismo {

    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();
        Super poli = new Sub();

        sup.print();
        sub.print();
        poli.print();
    }
}
