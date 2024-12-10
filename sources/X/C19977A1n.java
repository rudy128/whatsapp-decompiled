package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A1n  reason: case insensitive filesystem */
public final class C19977A1n {
    public static final long A03 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final C196189ub A01;
    public final String A02;

    public C19977A1n(C196189ub r2, String str, long j) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C19977A1n a1n = (C19977A1n) obj;
            if (!C18070vi.A18(this.A02, a1n.A02) || !C18070vi.A18(this.A01, a1n.A01) || this.A00 != a1n.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A02;
        A1a[1] = this.A01;
        C17890vO.A1N(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaAdConsumerDCStateInfo(jid=");
        A10.append(this.A02);
        A10.append(", loggingTracker=");
        A10.append(this.A01);
        A10.append(", lastInteractionTsMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
