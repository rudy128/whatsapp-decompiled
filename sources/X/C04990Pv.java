package X;

import android.content.res.Configuration;

/* renamed from: X.0Pv  reason: invalid class name and case insensitive filesystem */
public abstract class C04990Pv {
    public static C22821Di A00 = C12370le.A00;

    public static final void A04(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float A002 = AnonymousClass002.A00(fArr4, fArr3, 0, 0);
        float A003 = AnonymousClass002.A00(fArr4, fArr3, 0, 1);
        float A004 = AnonymousClass002.A00(fArr4, fArr3, 0, 2);
        float A005 = AnonymousClass002.A00(fArr4, fArr3, 0, 3);
        float A006 = AnonymousClass002.A00(fArr4, fArr3, 1, 0);
        float A007 = AnonymousClass002.A00(fArr4, fArr3, 1, 1);
        float A008 = AnonymousClass002.A00(fArr4, fArr3, 1, 2);
        float A009 = AnonymousClass002.A00(fArr4, fArr3, 1, 3);
        float A0010 = AnonymousClass002.A00(fArr4, fArr3, 2, 0);
        float A0011 = AnonymousClass002.A00(fArr4, fArr3, 2, 1);
        float A0012 = AnonymousClass002.A00(fArr4, fArr3, 2, 2);
        float A0013 = AnonymousClass002.A00(fArr4, fArr3, 2, 3);
        float A0014 = AnonymousClass002.A00(fArr4, fArr3, 3, 0);
        float A0015 = AnonymousClass002.A00(fArr4, fArr3, 3, 1);
        float A0016 = AnonymousClass002.A00(fArr4, fArr3, 3, 2);
        float A0017 = AnonymousClass002.A00(fArr4, fArr3, 3, 3);
        fArr3[0] = A002;
        fArr3[1] = A003;
        fArr3[2] = A004;
        fArr3[3] = A005;
        AnonymousClass001.A1U(fArr3, A006, A007, A008, A009);
        fArr3[8] = A0010;
        fArr3[9] = A0011;
        fArr3[10] = A0012;
        fArr3[11] = A0013;
        AnonymousClass001.A1V(fArr3, A0014, A0015, A0016, A0017);
    }

    public static final C24246By4 A00(int i) {
        if (i == 0 || i != 1) {
            return C24246By4.Ltr;
        }
        return C24246By4.Rtl;
    }

    public static final C24246By4 A02(Configuration configuration) {
        return A00(configuration.getLayoutDirection());
    }

    public static final C22821Di A03() {
        return A00;
    }
}
