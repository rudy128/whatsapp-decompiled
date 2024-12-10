package X;

import java.util.Comparator;

/* renamed from: X.0Zg  reason: invalid class name and case insensitive filesystem */
public final class C06680Zg implements Comparator {
    public static final C06680Zg A00 = new Object();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass0NU A0D = ((C05060Qg) obj).A0D();
        AnonymousClass0NU A0D2 = ((C05060Qg) obj2).A0D();
        int compare = Float.compare(A0D2.A02, A0D.A02);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(A0D.A03, A0D2.A03);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(A0D.A00, A0D2.A00);
        if (compare3 == 0) {
            return Float.compare(A0D2.A01, A0D.A01);
        }
        return compare3;
    }
}
