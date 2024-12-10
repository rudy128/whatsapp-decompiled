package X;

import java.util.Collection;

/* renamed from: X.4lj  reason: invalid class name and case insensitive filesystem */
public abstract class C95124lj implements AnonymousClass5ZZ {
    public final AnonymousClass5ZZ[] A00;

    public boolean BKp(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        for (AnonymousClass5ZZ r0 : this.A00) {
            if (r0 != null && r0.BKp(i, collection)) {
                return true;
            }
        }
        return false;
    }

    public C95124lj(AnonymousClass5ZZ... r1) {
        this.A00 = r1;
    }

    public static void A00(C56472hW r0, AnonymousClass1FU r1, Object[] objArr) {
        objArr[0] = r0.A00(r1);
    }
}
