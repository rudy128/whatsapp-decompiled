package X;

import java.util.Arrays;

/* renamed from: X.CqL  reason: case insensitive filesystem */
public final class C26004CqL {
    public CPQ A00;
    public final CPQ A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CPQ, java.lang.Object] */
    public static void A00(C26004CqL cqL, Object obj, String str) {
        ? obj2 = new Object();
        cqL.A00.A00 = obj2;
        cqL.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public String toString() {
        StringBuilder A0t = BE6.A0t(32);
        A0t.append(this.A02);
        A0t.append('{');
        String str = "";
        for (CPQ cpq = this.A01.A00; cpq != null; cpq = cpq.A00) {
            Object obj = cpq.A01;
            A0t.append(str);
            if (cpq.A02 != null) {
                BE8.A1E(A0t, cpq.A02);
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0t.append(obj);
            } else {
                String deepToString = Arrays.deepToString(AnonymousClass000.A1b(obj, 1));
                A0t.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return C17890vO.A0b(A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CPQ, java.lang.Object] */
    public C26004CqL(String str) {
        ? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        C26208Cuj.A01(str);
        this.A02 = str;
    }

    public static void A01(C26004CqL cqL, String str, int i) {
        A00(cqL, String.valueOf(i), str);
    }

    public void A02(String str, boolean z) {
        A00(this, String.valueOf(z), str);
    }
}
