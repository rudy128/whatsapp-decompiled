package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.CiP  reason: case insensitive filesystem */
public final class C25585CiP {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C27705Djn(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(C27909Dnk.A00);
    public final C18100vl A04 = AnonymousClass1DF.A01(C27910Dnl.A00);

    public static final C88084Yg A00(C26023Cqh cqh, C25585CiP ciP, boolean z, boolean z2) {
        int i;
        Integer valueOf;
        C18100vl r0;
        AnonymousClass118 r2;
        int i2;
        String str = cqh.A07;
        AnonymousClass1E7 r5 = cqh.A02;
        Drawable drawable = cqh.A00;
        CQU cqu = cqh.A01;
        if (cqu != null) {
            i = cqu.A00.ordinal();
        } else {
            i = -1;
        }
        boolean z3 = true;
        if (i != 1 && (i == 2 || r5 == null || !r5.A10)) {
            z3 = false;
        }
        String str2 = cqh.A05;
        if (str2 == null) {
            str2 = "";
        }
        if (!cqh.A06) {
            return new C88084Yg((Drawable) null, (AnonymousClass1E7) null, (Integer) null, str, (String) null, (String) null, (String) null, (AnonymousClass1D6) null, false, false);
        }
        boolean z4 = z2;
        if (r5 != null) {
            String str3 = null;
            if (z3) {
                if (r5.A0O() || r5.A0P()) {
                    valueOf = Integer.valueOf(C196929vs.A01(ciP.A01));
                } else {
                    valueOf = null;
                }
                if (!(!AnonymousClass1YF.A0T(str2))) {
                    drawable = (Drawable) ciP.A02.getValue();
                }
                if (!AnonymousClass1YF.A0T(str2)) {
                    str3 = str2;
                }
                String str4 = str2;
                if (AnonymousClass1YF.A0T(str2)) {
                    str4 = ciP.A00.A01(2131889422);
                    C18070vi.A0X(str4);
                }
                if (!AnonymousClass1YF.A0T(str2)) {
                    r0 = ciP.A03;
                } else {
                    r0 = ciP.A04;
                }
                AnonymousClass1D6 r11 = (AnonymousClass1D6) r0.getValue();
                String str5 = cqh.A05;
                if (str5 == null) {
                    str5 = "";
                }
                if (AnonymousClass1YF.A0T(str5)) {
                    str5 = ciP.A00.A01(2131889422);
                } else {
                    AnonymousClass1E7 r02 = cqh.A02;
                    if (r02 == null || !r02.A0C()) {
                        Integer num = cqh.A03;
                        if (num == AnonymousClass00R.A0Y) {
                            r2 = ciP.A00;
                            i2 = 2131889423;
                        } else if (num == AnonymousClass00R.A01) {
                            r2 = ciP.A00;
                            i2 = 2131889417;
                        }
                    } else {
                        r2 = ciP.A00;
                        i2 = 2131889416;
                        if (valueOf != null) {
                            i2 = 2131889424;
                        }
                    }
                    str5 = r2.A02(i2, str5);
                }
                C18070vi.A0b(str5);
                return new C88084Yg(drawable, r5, valueOf, str, str3, str4, str5, r11, false, z4);
            }
            if (!(!AnonymousClass1YF.A0T(str2))) {
                drawable = null;
            }
            if (!AnonymousClass1YF.A0T(str2)) {
                str3 = str2;
            }
            String str6 = str2;
            if (AnonymousClass1YF.A0T(str2)) {
                str6 = ciP.A00.A01(2131889419);
                C18070vi.A0X(str6);
            }
            AnonymousClass1D6 r112 = (AnonymousClass1D6) ciP.A04.getValue();
            if (AnonymousClass1YF.A0T(str2)) {
                str2 = ciP.A00.A01(2131889419);
                C18070vi.A0X(str2);
            }
            return new C88084Yg(drawable, r5, (Integer) null, str, str3, str6, str2, r112, false, z4);
        } else if (z) {
            return new C88084Yg((Drawable) null, (AnonymousClass1E7) null, (Integer) null, str, (String) null, (String) null, ciP.A00.A01(2131889418), (AnonymousClass1D6) null, true, z4);
        } else {
            if (cqu != null && cqu.A00 == C24296Byt.FAILURE_NEED_TO_RETRY) {
                return new C88084Yg((Drawable) null, (AnonymousClass1E7) null, (Integer) null, str, (String) null, (String) null, (String) null, (AnonymousClass1D6) null, false, z4);
            }
            AnonymousClass118 r22 = ciP.A00;
            return new C88084Yg((Drawable) null, (AnonymousClass1E7) null, (Integer) null, str, (String) null, r22.A01(2131889419), r22.A01(2131889419), (AnonymousClass1D6) ciP.A04.getValue(), false, z4);
        }
    }

    public C25585CiP(AnonymousClass118 r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
