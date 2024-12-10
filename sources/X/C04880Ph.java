package X;

import java.util.Map;

/* renamed from: X.0Ph  reason: invalid class name and case insensitive filesystem */
public abstract class C04880Ph {
    public static final AnonymousClass0U0 A00 = new AnonymousClass0U0((Object) null, 400.0f);
    public static final AnonymousClass0U0 A01;
    public static final AnonymousClass0U0 A02;
    public static final C16590sg A03 = AnonymousClass0MW.A00(C11580kL.A00, C11590kM.A00);

    public static final C10390iG A00(AnonymousClass0KK r6, AnonymousClass0KL r7, C03520Io r8, C03520Io r9, C03520Io r10, AnonymousClass0Q5 r11) {
        C05800Vt r3;
        C05800Vt r4;
        AnonymousClass0NB r5;
        C05800Vt r2 = null;
        if (r8 != null) {
            r3 = r8.A00(new C10120hp(r6, r7), new AnonymousClass0j7(r6, r7));
        } else {
            r3 = null;
        }
        if (r9 != null) {
            r4 = r9.A00(new C10130hq(r6, r7), new AnonymousClass0j8(r6, r7));
        } else {
            r4 = null;
        }
        if (AnonymousClass0Q5.A02(r11) == AnonymousClass0CL.PreEnter) {
            AnonymousClass0JX r0 = ((AnonymousClass072) r6).A00.A01;
            if (!(r0 == null && (r0 = ((AnonymousClass073) r7).A00.A01) == null)) {
                r5 = new AnonymousClass0NB(r0.A00);
            }
            r5 = null;
        } else {
            AnonymousClass0JX r02 = ((AnonymousClass073) r7).A00.A01;
            if (!(r02 == null && (r02 = ((AnonymousClass072) r6).A00.A01) == null)) {
                r5 = new AnonymousClass0NB(r02.A00);
            }
            r5 = null;
        }
        if (r10 != null) {
            r2 = r10.A00(C11600kN.A00, new C11100jU(r6, r7, r5));
        }
        return new C10390iG(r3, r4, r2);
    }

    static {
        Map map = AnonymousClass0GP.A01;
        long A0o = AnonymousClass001.A0o();
        A01 = new AnonymousClass0U0(C26143Ct6.A00(A0o), 400.0f);
        A02 = new AnonymousClass0U0(C26142Ct5.A00(A0o), 400.0f);
    }

    public static final AnonymousClass072 A02(C17190uG r6) {
        AnonymousClass0KK r0 = AnonymousClass0KK.A00;
        return new AnonymousClass072(new AnonymousClass0OX(new AnonymousClass0JC(r6), (AnonymousClass0JX) null, (Map) null, 62, false));
    }

    public static final AnonymousClass073 A03(C17190uG r6) {
        AnonymousClass0KL r0 = AnonymousClass0KL.A00;
        return new AnonymousClass073(new AnonymousClass0OX(new AnonymousClass0JC(r6), (AnonymousClass0JX) null, (Map) null, 62, false));
    }
}
