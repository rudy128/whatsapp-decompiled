package X;

/* renamed from: X.8px  reason: invalid class name and case insensitive filesystem */
public abstract class C170498px extends C170598qH implements C72173Kx {
    public final AnonymousClass1BI A00;
    public final AnonymousClass205 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170498px(X.C62382rJ r12, X.C19999A2n r13, X.AnonymousClass205 r14, java.lang.String r15, int r16, long r17, boolean r19) {
        /*
            r11 = this;
            java.lang.String r6 = "regular_high"
            r0 = 7
            r2 = r12
            X.C18070vi.A0d(r12, r0)
            X.1BI r4 = r14.A00
            if (r4 == 0) goto L_0x001e
            r1 = r11
            r3 = r13
            r5 = r15
            r7 = r16
            r8 = r17
            r10 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            r11.A01 = r14
            X.1BI r0 = r11.A00
            r11.A00 = r0
            return
        L_0x001e:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170498px.<init>(X.2rJ, X.A2n, X.205, java.lang.String, int, long, boolean):void");
    }

    public final C170498px A0H(AnonymousClass1BI r12) {
        AnonymousClass205 r0 = this.A01;
        AnonymousClass205 A012 = AnonymousClass205.A01(r12, r0.A01, r0.A02);
        if (this instanceof C170488pw) {
            C170488pw r02 = (C170488pw) this;
            String str = r02.A07;
            boolean z = r02.A01;
            long j = r02.A04;
            return new C170488pw(r02.A00, r02.A00, A012, str, j, z, r02.A0D());
        }
        C170478pv r03 = (C170478pv) this;
        String str2 = r03.A07;
        boolean z2 = r03.A02;
        long j2 = r03.A04;
        long j3 = r03.A00;
        return new C170478pv(r03.A00, r03.A01, A012, str2, j2, j3, z2, r03.A0D());
    }
}
