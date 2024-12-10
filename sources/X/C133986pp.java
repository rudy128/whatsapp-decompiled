package X;

import java.util.List;

/* renamed from: X.6pp  reason: invalid class name and case insensitive filesystem */
public final class C133986pp {
    public final C133756pR A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        C133986pp r5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C133986pp) {
            r5 = (C133986pp) obj;
        } else {
            r5 = null;
        }
        return r5 != null && C18070vi.A18(this.A02, r5.A02) && this.A04 == r5.A04 && C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A00, r5.A00) && this.A05 == r5.A05;
    }

    public int hashCode() {
        int i;
        int A002 = AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17880vN.A03(this.A02), this.A05), this.A04);
        String str = this.A01;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int A0N = AnonymousClass000.A0N(this.A03, (A002 + i) * 31);
        C133756pR r0 = this.A00;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return A0N + i2;
    }

    public C133986pp(C130246j7 r2) {
        this.A02 = r2.A02;
        this.A05 = r2.A04;
        this.A04 = r2.A03;
        this.A01 = r2.A01;
        this.A03 = r2.A05;
        this.A00 = r2.A00;
    }
}
