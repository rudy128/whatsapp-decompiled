package X;

import android.util.LongSparseArray;
import java.util.Arrays;

public final class CYA {
    public final LongSparseArray A00;
    public final C04170Mc A01;

    public final C04220Mi A00(DFL dfl, boolean z) {
        C18070vi.A0d(dfl, 0);
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, dfl.A04, 0);
        AnonymousClass8BR.A1L(A1b, 1, z);
        long hashCode = (long) Arrays.hashCode(A1b);
        C04220Mi r0 = (C04220Mi) this.A00.get(hashCode);
        if (r0 != null) {
            return r0;
        }
        C04170Mc r2 = this.A01;
        Long valueOf = Long.valueOf(hashCode);
        C18070vi.A0d(valueOf, 0);
        Object obj = r2.A00.get(valueOf);
        if (obj == null) {
            obj = null;
        }
        C04220Mi r02 = (C04220Mi) obj;
        if (r02 == null) {
            return null;
        }
        return r02;
    }

    public final void A01(C04220Mi r6, DFL dfl, boolean z) {
        boolean A17 = C18070vi.A17(dfl, r6);
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, dfl.A04, 0);
        AnonymousClass8BR.A1L(A1b, A17 ? 1 : 0, z);
        long hashCode = (long) Arrays.hashCode(A1b);
        this.A00.put(hashCode, r6);
        C04170Mc r2 = this.A01;
        Long valueOf = Long.valueOf(hashCode);
        C18070vi.A0d(valueOf, 0);
        r2.A01.put(valueOf, r6);
    }

    public CYA(AnonymousClass0IV r3, DFL dfl) {
        this.A00 = new LongSparseArray(dfl.A0E().size());
        this.A01 = r3.A00();
    }
}
