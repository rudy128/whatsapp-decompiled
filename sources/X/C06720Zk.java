package X;

import java.util.Comparator;

/* renamed from: X.0Zk  reason: invalid class name and case insensitive filesystem */
public final class C06720Zk implements Comparator {
    public static final C06720Zk A00 = new Object();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((AnonymousClass1D6) obj, (AnonymousClass1D6) obj2);
    }

    public static int A00(AnonymousClass1D6 r3, AnonymousClass1D6 r4) {
        AnonymousClass0NU r32 = (AnonymousClass0NU) r3.A06();
        float f = r32.A03;
        AnonymousClass0NU r2 = (AnonymousClass0NU) r4.A06();
        int compare = Float.compare(f, r2.A03);
        if (compare == 0) {
            return Float.compare(r32.A00, r2.A00);
        }
        return compare;
    }
}
