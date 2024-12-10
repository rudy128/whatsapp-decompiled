package X;

import java.util.Map;

/* renamed from: X.1VF  reason: invalid class name */
public class AnonymousClass1VF {
    public static final Map A04 = AnonymousClass1D7.A0B(new AnonymousClass1D6(AnonymousClass1VG.TOOLTIP_AR_EFFECT, AnonymousClass1VH.AR_EFFECT), new AnonymousClass1D6(AnonymousClass1VG.TOOLTIP_SCREEN_SHARING, AnonymousClass1VH.SCREEN_SHARING), new AnonymousClass1D6(AnonymousClass1VG.TOOLTIP_ADD_PARTICIPANT, AnonymousClass1VH.ADD_PARTICIPANT), new AnonymousClass1D6(AnonymousClass1VG.BANNER, AnonymousClass1VH.GROUP_CALL));
    public final C19830z4 A00;
    public final boolean A01;
    public final AnonymousClass11S A02;
    public final C18030ve A03;

    public AnonymousClass1VF(AnonymousClass11S r3, C19830z4 r4, C18030ve r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A03 = r5;
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = C18020vd.A05(C18040vf.A02, r5, 6399);
    }

    public final void A00(AnonymousClass1VH r4) {
        if (C18020vd.A00(C18040vf.A01, this.A03, 10081) > 0) {
            this.A00.A1i(r4.key);
        }
    }

    public final void A01(AnonymousClass1VG r3) {
        C19830z4 r1 = this.A00;
        r1.A1i(r3.lastSeenKey);
        r1.A1i(r3.coolOffKey);
    }

    public final boolean A02(AnonymousClass1VG r7) {
        AnonymousClass1VH r0;
        AnonymousClass11S r1 = this.A02;
        r1.A0I();
        if (r1.A0P(r1.A02)) {
            return false;
        }
        if (this.A01) {
            return true;
        }
        C19830z4 r3 = this.A00;
        if (r3.A0W(r7.lastSeenKey) != -1 || !r3.A2b(r7.coolOffKey, 604800000) || (r0 = (AnonymousClass1VH) A04.get(r7)) == null || !r3.A2b(r0.key, 2592000000L)) {
            return false;
        }
        return true;
    }
}
