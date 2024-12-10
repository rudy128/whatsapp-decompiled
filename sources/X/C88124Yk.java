package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4Yk  reason: invalid class name and case insensitive filesystem */
public final class C88124Yk {
    public static final long A07 = TimeUnit.MINUTES.toMillis(30);
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass4S4 A02;
    public final C18030ve A03;
    public final C63272sn A04;
    public final C32981i4 A05;
    public final C25931Qe A06;

    public final void A00(C445823z r5, String str, C22821Di r7) {
        C18070vi.A0d(r5, 0);
        C21467AkY akY = new C21467AkY(r7, r5, str, 31);
        if (this.A06.A0B(r5.A0A)) {
            this.A04.A02(r5, akY, 93, false);
        } else {
            akY.run();
        }
    }

    public final void A01(C445823z r3, String str, C22821Di r5) {
        C18070vi.A0d(r3, 0);
        A00(r3, str, new C99204sR(r5, this, 4));
    }

    public final boolean A03(C49552Qx r4, int i) {
        C18070vi.A0d(r4, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A03, 7421) || r4 != C49552Qx.GOING || i <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A02(C445823z r6) {
        String str = r6.A05;
        if (str == null || str.length() == 0 || !this.A05.A0I(str) || r6.A00 - AnonymousClass11P.A01(this.A01) > A07) {
            return false;
        }
        return true;
    }

    public C88124Yk(AnonymousClass11S r2, C63272sn r3, AnonymousClass11P r4, C32981i4 r5, AnonymousClass4S4 r6, C18030ve r7, C25931Qe r8) {
        C18070vi.A0w(r4, r7, r2, r6, r5);
        C18070vi.A0d(r8, 6);
        this.A01 = r4;
        this.A03 = r7;
        this.A00 = r2;
        this.A02 = r6;
        this.A05 = r5;
        this.A06 = r8;
        this.A04 = r3;
    }
}
