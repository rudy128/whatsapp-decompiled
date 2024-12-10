package X;

import java.util.HashMap;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
public final class C57442j5 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass121 A01;
    public final HashMap A02 = C17880vN.A11();

    public final long A00(AnonymousClass1BI r10) {
        HashMap hashMap = this.A02;
        Number number = (Number) hashMap.get(r10.toString());
        if (number == null) {
            AnonymousClass1LW r7 = this.A00;
            long A09 = r7.A09(r10);
            long A07 = r7.A07(A09);
            if (A07 == -1) {
                A07 = this.A01.BVc(A09);
                r7.A0E(A09, A07);
            }
            number = Long.valueOf(A07);
            hashMap.put(r10.toString(), number);
        }
        return number.longValue();
    }

    public C57442j5(AnonymousClass1LW r2, AnonymousClass121 r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
