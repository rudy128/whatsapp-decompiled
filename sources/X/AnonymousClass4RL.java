package X;

import android.content.Context;

/* renamed from: X.4RL  reason: invalid class name */
public final class AnonymousClass4RL {
    public final AnonymousClass1KB A00;
    public final C36361nl A01;
    public final A5M A02;
    public final C84644Kh A03;
    public final C86224Qu A04;
    public final AnonymousClass11C A05;
    public final C18030ve A06;
    public final AnonymousClass10I A07;

    public final C74923d8 A00(Context context, AnonymousClass206 r21, String str) {
        C74923d8 r7;
        int i = 2;
        AnonymousClass206 r15 = r21;
        AnonymousClass1BI r4 = r15.A0v.A00;
        AnonymousClass1BI r18 = r4;
        if (r4 == null) {
            r4 = r15.A0H();
        }
        C86224Qu r2 = this.A04;
        String str2 = str;
        Context context2 = context;
        if (r2.A00.A0A.A04(str2, true) == null || !r2.A00(r4)) {
            AnonymousClass1KB r5 = this.A00;
            AnonymousClass11C r42 = this.A05;
            r7 = new C74923d8(context2, this.A01, r5, r42, this.A06, r15, str2);
        } else {
            AnonymousClass1KB r10 = this.A00;
            AnonymousClass11C r13 = this.A05;
            C36361nl r9 = this.A01;
            C18030ve r14 = this.A06;
            C84644Kh r12 = this.A03;
            r7 = new AnonymousClass3v6(context2, r9, r10, this.A02, r12, r13, r14, r15, this.A07, str2);
        }
        if (r15 instanceof AnonymousClass210) {
            r7.A01 = ((AnonymousClass210) r15).A00;
            r7.A02 = true;
        }
        if (C22971Dz.A0e(r18)) {
            i = 3;
        } else if (!C22971Dz.A0d(r18)) {
            if (C22971Dz.A0a(r18)) {
                i = 1;
            } else {
                if (r15.A0w()) {
                    i = 6;
                }
                return r7;
            }
        }
        r7.A00 = i;
        return r7;
    }

    public AnonymousClass4RL(AnonymousClass1KB r1, C36361nl r2, A5M a5m, C84644Kh r4, C86224Qu r5, AnonymousClass11C r6, C18030ve r7, AnonymousClass10I r8) {
        C18070vi.A0w(r7, r1, r6, r2, r5);
        C18070vi.A0q(r4, a5m, r8);
        this.A06 = r7;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = a5m;
        this.A07 = r8;
    }
}
