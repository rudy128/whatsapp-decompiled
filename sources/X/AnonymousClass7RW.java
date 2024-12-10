package X;

import java.util.Comparator;

/* renamed from: X.7RW  reason: invalid class name */
public final class AnonymousClass7RW implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C132776nZ r6 = (C132776nZ) obj;
        C132776nZ r7 = (C132776nZ) obj2;
        C18070vi.A0h(r6, r7);
        long j = r6.A00;
        long j2 = r7.A00;
        if (j == j2) {
            return r6.A03 - r7.A03;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
