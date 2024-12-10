package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.2o6  reason: invalid class name and case insensitive filesystem */
public abstract class C60482o6 {
    public static Pair A01(C29621ca r4) {
        Iterator A03 = C29621ca.A03(r4, "error");
        while (A03.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A03);
            if (A0a != null) {
                String A0Q = A0a.A0Q("code", (String) null);
                String A0Q2 = A0a.A0Q("text", (String) null);
                if (A0Q != null) {
                    return new Pair(Integer.valueOf(C20099A7c.A01(A0Q, 0)), A0Q2);
                }
            }
        }
        return null;
    }

    public static int A00(C29621ca r0) {
        Pair A01 = A01(r0);
        if (A01 != null) {
            return AnonymousClass000.A0M(A01.first);
        }
        return 0;
    }
}
