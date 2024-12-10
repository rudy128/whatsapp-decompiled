package X;

import java.util.List;

/* renamed from: X.2Tu  reason: invalid class name and case insensitive filesystem */
public abstract class C50272Tu {
    public static final double A00(List list) {
        C18070vi.A0d(list, 0);
        long j = 0;
        for (Object A0M : list) {
            j += (long) AnonymousClass000.A0M(A0M);
        }
        return ((double) j) / ((double) list.size());
    }
}
