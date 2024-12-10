package X;

import java.util.HashSet;

/* renamed from: X.Cop  reason: case insensitive filesystem */
public final class C25926Cop {
    public static String A00 = "goog.exo.core";
    public static boolean A01 = true;
    public static final HashSet A02 = C17880vN.A12();

    public static synchronized void A00(String str) {
        synchronized (C25926Cop.class) {
            if (A02.add(str)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(A00);
                A00 = AnonymousClass001.A1H(", ", str, A10);
            }
        }
    }
}
