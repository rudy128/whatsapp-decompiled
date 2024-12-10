package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2rB  reason: invalid class name and case insensitive filesystem */
public final class C62302rB {
    public static final int A06 = ((int) TimeUnit.DAYS.toHours(7));
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final C59592mZ A05;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C62302rB)) {
                return false;
            }
            C62302rB r9 = (C62302rB) obj;
            C59592mZ r6 = this.A05;
            int i = r6.A00;
            C59592mZ r5 = r9.A05;
            if (!(i == r5.A00 && C18070vi.A18(r6.A03, r5.A03) && C18070vi.A18(r6.A02, r5.A02) && this.A01 == r9.A01 && this.A02 == r9.A02 && this.A00 == r9.A00 && this.A04 == r9.A04 && C18070vi.A18(r6.A01, r5.A01))) {
                return false;
            }
        }
        return true;
    }

    static {
        TimeUnit.DAYS.toMillis(90);
    }

    public C62302rB(C40861vP r2, String str, String str2, int i, int i2, int i3, int i4, long j, long j2) {
        C59592mZ r0 = new C59592mZ(r2, str, str2, i);
        this.A00 = i2;
        this.A01 = j;
        this.A02 = j2;
        this.A04 = i3;
        this.A03 = i4;
        this.A05 = r0;
    }

    public int hashCode() {
        return this.A05.A00;
    }
}
