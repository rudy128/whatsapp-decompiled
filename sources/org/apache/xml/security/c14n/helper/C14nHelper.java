package org.apache.xml.security.c14n.helper;

import org.w3c.dom.Attr;

public class C14nHelper {
    public static boolean a(String str) {
        return !b(str);
    }

    public static boolean b(String str) {
        return str.length() == 0 || str.indexOf(58) > 0;
    }

    public static boolean b(Attr attr) {
        return b(attr.getValue());
    }

    public static boolean a(Attr attr) {
        return !b(attr.getValue());
    }
}
