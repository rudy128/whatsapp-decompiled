package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8gw  reason: invalid class name and case insensitive filesystem */
public final class C167778gw extends C180279Lx {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C167778gw r7 = (C167778gw) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A01;
        if (j > 0) {
            i = (int) ((100 * this.A00) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass3MX.A1S(A1a, 0, this.A00);
        C17890vO.A1M(A1a, j);
        C17880vN.A1T(A1a, i, 2);
        return C108955ca.A12(locale, "MediaRestoreProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(A1a, 3));
    }

    public C167778gw(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        C17890vO.A1L(A1b, this.A00);
        C17890vO.A1M(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }
}
