package X;

import android.util.LongSparseArray;

public final class CW7 {
    public final LongSparseArray A00;
    public final LongSparseArray A01;
    public final AnonymousClass0IV A02;

    public final C04220Mi A00(DFL dfl) {
        LongSparseArray longSparseArray;
        C18070vi.A0d(dfl, 0);
        long j = (long) dfl.A04;
        AnonymousClass0sP r0 = (AnonymousClass0sP) this.A01.get(j);
        if (r0 == null && ((longSparseArray = this.A00) == null || (r0 = (AnonymousClass0sP) longSparseArray.get(j)) == null)) {
            return null;
        }
        return ((DFE) r0).A00.A02();
    }

    public CW7(AnonymousClass0IV r5, DFL dfl) {
        this.A02 = r5;
        int i = dfl.A04;
        LongSparseArray longSparseArray = new LongSparseArray(dfl.A0E().size());
        C04170Mc A002 = r5.A00();
        Long A0n = C17880vN.A0n(i);
        C18070vi.A0d(A0n, 0);
        A002.A01.put(A0n, longSparseArray);
        this.A01 = longSparseArray;
        Object obj = r5.A00().A00.get(A0n);
        this.A00 = (LongSparseArray) (obj == null ? null : obj);
    }
}
