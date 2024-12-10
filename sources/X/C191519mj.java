package X;

/* renamed from: X.9mj  reason: invalid class name and case insensitive filesystem */
public final class C191519mj {
    public final int A00;
    public final long A01;
    public final C23203Bcx A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass00H A04;
    public final boolean A05;

    public C191519mj(AnonymousClass18K r4, C195909u8 r5, AnonymousClass00H r6, int i) {
        C18070vi.A0j(r4, r5);
        C18070vi.A0d(r6, 4);
        this.A03 = r4;
        this.A00 = i;
        this.A04 = r6;
        this.A01 = r5.A00();
        C23203Bcx bcx = new C23203Bcx(C41371wF.A00(r5.A00));
        C17900vP.A0Y(bcx, "PasskeyGooglePlayChecks / googlePlayServicesStatus : ", AnonymousClass000.A10());
        this.A02 = bcx;
        this.A05 = r5.A02();
    }

    public final void A00(String str, Throwable th, int i) {
        C193939qu A002 = C181569Qz.A00(th);
        C171418rg r2 = new C171418rg();
        r2.A04 = (String) ((AnonymousClass2ZS) this.A04.get()).A00.get();
        r2.A02 = Integer.valueOf(this.A00);
        r2.A01 = Integer.valueOf(i);
        r2.A07 = A002.A00;
        r2.A08 = A002.A01;
        r2.A03 = Long.valueOf(this.A01);
        r2.A06 = this.A02.toString();
        r2.A00 = Boolean.valueOf(this.A05);
        if (str != null) {
            r2.A05 = str;
        }
        this.A03.CC7(r2);
    }
}
