package X;

import java.util.Comparator;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
public final class C06710Zj implements Comparator {
    public static final C06710Zj A00 = new Object();

    public static int A00(AnonymousClass0XV r2, AnonymousClass0XV r3) {
        int A002 = C18070vi.A00(r3.A00, r2.A00);
        if (A002 == 0) {
            return C18070vi.A00(r2.hashCode(), r3.hashCode());
        }
        return A002;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((AnonymousClass0XV) obj, (AnonymousClass0XV) obj2);
    }
}
