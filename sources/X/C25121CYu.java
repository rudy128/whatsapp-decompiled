package X;

import java.util.Arrays;

/* renamed from: X.CYu  reason: case insensitive filesystem */
public final class C25121CYu {
    public final C24924CPx A00;
    public final int A01;
    public final C28622EAu A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C25121CYu) {
                    C25121CYu cYu = (C25121CYu) obj;
                    if (!C25332Cdd.A01(this.A00, cYu.A00) || !C25332Cdd.A01(this.A02, cYu.A02) || !C25332Cdd.A01(this.A03, cYu.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public C25121CYu(C28622EAu eAu, C24924CPx cPx, String str) {
        this.A00 = cPx;
        this.A02 = eAu;
        this.A03 = str;
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass8BX.A1K(cPx, eAu, str, A1a);
        this.A01 = Arrays.hashCode(A1a);
    }
}
