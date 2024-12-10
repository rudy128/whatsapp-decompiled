package X;

import java.util.List;

/* renamed from: X.3Uy  reason: invalid class name and case insensitive filesystem */
public final class C73343Uy extends AnonymousClass1J2 {
    public AnonymousClass1BI A00;
    public String A01 = "";
    public List A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass1E7 A05;
    public final C33251iW A06;
    public final C26911Ty A07;
    public final AnonymousClass1NK A08;
    public final C41111vp A09;
    public final AnonymousClass00H A0A;
    public final C95504mL A0B = new C95504mL(this, 1);
    public final AnonymousClass1KB A0C;
    public final C24681Lg A0D;
    public final AnonymousClass10I A0E;

    public static final void A00(C73343Uy r3) {
        r3.A0C.A0J(new C21446AkD(r3, 4));
    }

    public void A0S() {
        this.A0D.unregisterObserver(this.A0B);
    }

    public final void A0T(AnonymousClass1E7 r4, AnonymousClass1BI r5) {
        this.A00 = r5;
        this.A05 = r4;
        if (C22971Dz.A0d(r5)) {
            this.A0D.registerObserver(this.A0B);
            C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            this.A0E.CGN(new C21451AkI(this, r5, 30));
        }
    }

    public C73343Uy(AnonymousClass1KB r3, C33251iW r4, C26911Ty r5, C24681Lg r6, AnonymousClass1NK r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0w(r8, r7, r4, r6, r5);
        C18070vi.A0l(r3, r9);
        this.A0E = r8;
        this.A08 = r7;
        this.A06 = r4;
        this.A0D = r6;
        this.A07 = r5;
        this.A0C = r3;
        this.A0A = r9;
        C18460wS r0 = C18460wS.A00;
        this.A02 = r0;
        this.A09 = AnonymousClass3MW.A0n(r0);
    }
}
