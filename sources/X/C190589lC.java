package X;

/* renamed from: X.9lC  reason: invalid class name and case insensitive filesystem */
public final class C190589lC {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;

    public final void A00(String str, boolean z, int i) {
        C18070vi.A0d(str, 0);
        C18030ve r6 = this.A01;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r6, 7840) && !z) {
            C19830z4 r3 = this.A00;
            String A0r = C17880vN.A0r(C17890vO.A0B(r3), "flows_analytics_id");
            if (A0r == null) {
                A0r = C17890vO.A0Q();
                C17880vN.A1E(C19830z4.A00(r3), "flows_analytics_id", A0r);
            }
            C18070vi.A0X(A0r);
            long A022 = A67.A00.A02(C108975cc.A1O(A0r));
            long j = A022 >>> 52;
            int i2 = 0;
            while ((1 & A022) == 0 && i2 < 52) {
                i2++;
                A022 >>>= 1;
            }
            long min = (long) Math.min(i2, 23);
            C170998r0 r0 = new C170998r0();
            r0.A03 = str;
            Integer valueOf = Integer.valueOf(i);
            r0.A00 = valueOf;
            Long valueOf2 = Long.valueOf(j);
            r0.A01 = valueOf2;
            Long valueOf3 = Long.valueOf(min);
            r0.A02 = valueOf3;
            AnonymousClass18K r1 = this.A02;
            r1.CC4(r0);
            if (C18020vd.A05(r5, r6, 9969)) {
                C171008r1 r02 = new C171008r1();
                r02.A03 = str;
                r02.A00 = valueOf;
                r02.A01 = valueOf2;
                r02.A02 = valueOf3;
                r1.CC4(r02);
            }
        }
    }

    public C190589lC(C19830z4 r1, C18030ve r2, AnonymousClass18K r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
