package X;

import java.util.Arrays;

/* renamed from: X.2iq  reason: invalid class name and case insensitive filesystem */
public final class C57292iq {
    public final C18030ve A00;
    public final AnonymousClass118 A01;

    public final String A00(int i, int i2, Object... objArr) {
        String A02;
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A00, 5846);
        AnonymousClass118 r1 = this.A01;
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        if (A05) {
            A02 = r1.A02(i2, copyOf);
        } else {
            A02 = r1.A02(i, copyOf);
        }
        C18070vi.A0b(A02);
        return A02;
    }

    public C57292iq(AnonymousClass118 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
