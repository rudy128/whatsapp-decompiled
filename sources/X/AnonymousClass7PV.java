package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7PV  reason: invalid class name */
public class AnonymousClass7PV implements Comparable {
    public final int A00;
    public final long A01;
    public final C139396yl A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass7PV r6 = (AnonymousClass7PV) obj;
        if (r6 == null) {
            return -1;
        }
        long j = this.A01;
        long j2 = r6.A01;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public AnonymousClass7PV(C139396yl r2, C139646zD r3, int i, long j) {
        this.A02 = r2;
        this.A01 = j;
        this.A00 = i;
        this.A03 = AnonymousClass3MW.A0z(r3);
    }
}
