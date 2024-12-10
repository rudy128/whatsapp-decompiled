package org.apache.xml.security.utils;

import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import java.io.IOException;
import java.io.StringReader;

public class RFC2253Parser {
    public static boolean a = true;
    public static int b;

    public static int a(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            if (str.charAt(i) == '\"') {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static String d(String str) {
        String trim = str.toUpperCase().trim();
        return trim.startsWith("OID") ? trim.substring(3) : trim;
    }

    public static String f(String str) {
        return a(str, ";", ",");
    }

    public static String c(String str) {
        String e;
        int indexOf = str.indexOf("=");
        if (indexOf == -1 || (indexOf > 0 && str.charAt(indexOf - 1) == '\\')) {
            return str;
        }
        String d = d(str.substring(0, indexOf));
        if (d.charAt(0) < '0' || d.charAt(0) > '9') {
            e = e(BE6.A0p(indexOf, str));
        } else {
            e = BE6.A0p(indexOf, str);
        }
        return BE9.A0p("=", e, BE8.A0i(d));
    }

    public static String a(String str, String str2, String str3) {
        StringBuffer A0s = BE6.A0s();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                return BE7.A0n(g(str.substring(i2)), A0s);
            }
            i3 += a(str, i, indexOf);
            if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                A0s.append(BE9.A0p(g(str.substring(i2, indexOf)), str3, BE6.A0s()));
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String b(String str) {
        StringBuffer A0s = BE6.A0s();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf("+", i);
            if (indexOf < 0) {
                return BE7.A0n(c(g(str.substring(i2))), A0s);
            }
            i3 += a(str, i, indexOf);
            if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                A0s.append(BE9.A0p(c(g(str.substring(i2, indexOf))), "+", BE6.A0s()));
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String e(String str) {
        String g = g(str);
        if (g.startsWith("\"")) {
            StringBuffer A0s = BE6.A0s();
            StringReader stringReader = new StringReader(g.substring(1, g.length() - 1));
            while (true) {
                int read = stringReader.read();
                if (read <= -1) {
                    break;
                }
                char c = (char) read;
                if (c == ',' || c == '=' || c == '+' || c == '<' || c == '>' || c == '#' || c == ';') {
                    A0s.append('\\');
                }
                A0s.append(c);
            }
            g = g(A0s.toString());
        }
        if (a) {
            if (!g.startsWith("#")) {
                return g;
            }
            StringBuffer A0s2 = BE6.A0s();
            A0s2.append('\\');
            return BE7.A0n(g, A0s2);
        } else if (g.startsWith("\\#")) {
            return g.substring(1);
        } else {
            return g;
        }
    }

    public static String g(String str) {
        String trim = str.trim();
        int indexOf = str.indexOf(trim) + trim.length();
        if (str.length() <= indexOf || !trim.endsWith("\\") || trim.endsWith("\\\\") || str.charAt(indexOf) != ' ') {
            return trim;
        }
        return BE7.A0n(" ", BE8.A0i(trim));
    }

    public static String a(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        try {
            String f = f(str);
            StringBuffer A0s = BE6.A0s();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = f.indexOf(",", i);
                if (indexOf >= 0) {
                    i3 += a(f, i, indexOf);
                    if (!(indexOf <= 0 || f.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                        A0s.append(BE9.A0p(b(f.substring(i2, indexOf).trim()), ",", BE6.A0s()));
                        i2 = indexOf + 1;
                        i3 = 0;
                    }
                    i = indexOf + 1;
                } else {
                    A0s.append(b(g(f.substring(i2))));
                    return A0s.toString();
                }
            }
        } catch (IOException unused) {
            return str;
        }
    }
}
