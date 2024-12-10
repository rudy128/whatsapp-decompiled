package X;

import java.util.Comparator;

/* renamed from: X.4rp  reason: invalid class name and case insensitive filesystem */
public final class C98854rp implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass4U3 r6 = (AnonymousClass4U3) obj;
        AnonymousClass4U3 r7 = (AnonymousClass4U3) obj2;
        C18070vi.A0h(r6, r7);
        A2B a2b = r6.A00;
        int i = a2b.A00;
        if (i == 3 && r7.A00.A00 != 3) {
            return -1;
        }
        A2B a2b2 = r7.A00;
        if (a2b2.A00 != 3 || i == 3) {
            return a2b.A06.compareTo(a2b2.A06);
        }
        return 1;
    }
}
