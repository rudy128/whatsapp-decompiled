package X;

import java.util.Comparator;

/* renamed from: X.0Zh  reason: invalid class name and case insensitive filesystem */
public class C06690Zh implements Comparator {
    public final int A00;

    public C06690Zh(int i) {
        this.A00 = i;
    }

    public static int A00(AnonymousClass0XV r2, AnonymousClass0XV r3) {
        int A002 = C18070vi.A00(r2.A00, r3.A00);
        if (A002 == 0) {
            return C18070vi.A00(r2.hashCode(), r3.hashCode());
        }
        return A002;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return C05020Qb.A00((AnonymousClass0Jr) obj, (AnonymousClass0Jr) obj2);
            case 1:
                return A00((AnonymousClass0XV) obj, (AnonymousClass0XV) obj2);
            default:
                return AnonymousClass0XV.A00((AnonymousClass0XV) obj, (AnonymousClass0XV) obj2);
        }
    }
}
