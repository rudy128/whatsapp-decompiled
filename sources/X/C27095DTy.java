package X;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: X.DTy  reason: case insensitive filesystem */
public class C27095DTy implements PrivilegedAction {
    public final int A00;
    public final String A01;

    public C27095DTy(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public Object run() {
        switch (this.A00) {
            case 0:
                try {
                    return Class.forName(this.A01);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                return Security.getProperty(this.A01);
            default:
                return System.getProperty(this.A01);
        }
    }
}
