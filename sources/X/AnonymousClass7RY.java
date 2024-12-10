package X;

import java.util.Comparator;

/* renamed from: X.7RY  reason: invalid class name */
public final class AnonymousClass7RY implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass725 r3 = (AnonymousClass725) obj;
        AnonymousClass725 r4 = (AnonymousClass725) obj2;
        if (r3 == null || r4 == null) {
            return 0;
        }
        boolean z = r3.A0S;
        if (r4.A0S ^ z) {
            return C108975cc.A0m(z ? 1 : 0);
        }
        return r4.A00 - r3.A00;
    }
}
