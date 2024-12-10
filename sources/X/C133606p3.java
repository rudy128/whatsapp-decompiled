package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6p3  reason: invalid class name and case insensitive filesystem */
public final class C133606p3 {
    public final AnonymousClass11P A00;
    public final C18000vb A01;

    public final String A00(long j) {
        String A0J;
        AnonymousClass11P r0 = this.A00;
        C18000vb r5 = this.A01;
        long A09 = r0.A09(j);
        long currentTimeMillis = System.currentTimeMillis();
        int A002 = A87.A00(C108955ca.A0e(), currentTimeMillis, A09);
        if (A002 == 0) {
            int i = (int) ((currentTimeMillis - A09) / 60000);
            if (i < 1) {
                A0J = r5.A09(2131891542);
            } else {
                long j2 = (long) i;
                if (j2 >= TimeUnit.HOURS.toMinutes(1)) {
                    return A8I.A00(r5, A09);
                }
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[1];
                objArr[C72453Mb.A1b(objArr2, i)] = C108955ca.A12(r5.A0N(), "%d", Arrays.copyOf(objArr2, 1));
                A0J = r5.A0J(objArr, 270, j2);
            }
            C18070vi.A0b(A0J);
            return A0J;
        } else if (A002 == 1) {
            return AnonymousClass11X.A00.A05(r5);
        } else {
            AnonymousClass11Y r02 = AnonymousClass11X.A00;
            if (A002 < 7) {
                return r02.A08(r5, A09);
            }
            return r02.A0B(r5, A09);
        }
    }

    public final String A01(Object[] objArr, int i, long j) {
        String A0K = this.A01.A0K(Arrays.copyOf(objArr, 1), i, j);
        C18070vi.A0X(A0K);
        return A0K;
    }

    public C133606p3(AnonymousClass11P r1, C18000vb r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
