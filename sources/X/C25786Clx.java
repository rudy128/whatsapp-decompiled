package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Clx  reason: case insensitive filesystem */
public final class C25786Clx {
    public static final C25786Clx A02 = new C25786Clx(-1, false);
    public static final C25786Clx A03 = new C25786Clx(-2, false);
    public static final C25786Clx A04 = new C25786Clx(-1, true);
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25786Clx)) {
            return false;
        }
        C25786Clx clx = (C25786Clx) obj;
        return this.A00 == clx.A00 && this.A01 == clx.A01;
    }

    public int hashCode() {
        Integer valueOf = Integer.valueOf(this.A00);
        Boolean valueOf2 = Boolean.valueOf(this.A01);
        return ((AnonymousClass001.A0k(valueOf) + 31) * 31) + C17880vN.A02(valueOf2);
    }

    public C25786Clx(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public String toString() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        BE8.A1O(A1b, this.A01);
        return C108955ca.A12((Locale) null, "%d defer:%b", Arrays.copyOf(A1b, 2));
    }
}
