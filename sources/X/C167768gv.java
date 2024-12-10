package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8gv  reason: invalid class name and case insensitive filesystem */
public final class C167768gv extends C180279Lx {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C167768gv r7 = (C167768gv) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A00;
        if (j > 0) {
            i = (int) ((100 * this.A01) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass3MX.A1S(A1a, 0, this.A01);
        C17890vO.A1M(A1a, j);
        C17880vN.A1T(A1a, i, 2);
        return C108955ca.A12(locale, "BackupProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(A1a, 3));
    }

    public C167768gv(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        C17890vO.A1L(A1b, this.A01);
        C17890vO.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
