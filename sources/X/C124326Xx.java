package X;

import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.6Xx  reason: invalid class name and case insensitive filesystem */
public abstract class C124326Xx {
    public static final String A00(String str) {
        C18070vi.A0d(str, 0);
        try {
            URL url = new URL(str);
            String host = url.getHost();
            C18070vi.A0X(host);
            int i = 0;
            int A0F = AnonymousClass1YF.A0F(str, host, 0, false);
            if (A0F < 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("cannot find host ");
                A10.append(url.getHost());
                C17900vP.A0e(" in ", str, A10);
                int length = str.length();
                if (length > 34) {
                    length = 34;
                }
                return C108955ca.A0q(0, length, str);
            }
            String A0z = C108955ca.A0z(str, A0F + url.getHost().length());
            String host2 = url.getHost();
            C18070vi.A0X(host2);
            if (C108975cc.A1N("www.", C108975cc.A0d(host2))) {
                host2 = C108955ca.A0z(host2, 4);
            }
            int length2 = A0z.length();
            if (length2 > 12 || host2.length() + length2 > 34) {
                int i2 = length2 - 12;
                int length3 = (host2.length() + length2) - 34;
                if (i2 < length3) {
                    i2 = length3;
                }
                i = length2;
                if (length2 > i2) {
                    i = i2;
                }
                A0z = C108955ca.A0q(0, length2 - i, A0z);
            }
            if (A0z.length() == 1) {
                A0z = "";
            }
            String A0A = C17900vP.A0A(host2, A0z);
            int length4 = A0A.length();
            if (length4 > 34) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(8230);
                A0A = AnonymousClass000.A0y(C108955ca.A0z(A0A, length4 - 34), A102);
            }
            if (i > 0) {
                return C17890vO.A0c(AnonymousClass000.A11(A0A), 8230);
            }
            return A0A;
        } catch (MalformedURLException e) {
            C17900vP.A0h("invalid url ", str, AnonymousClass000.A10(), e);
            int length5 = str.length();
            if (length5 > 34) {
                length5 = 34;
            }
            return C108955ca.A0q(0, length5, str);
        }
    }
}
