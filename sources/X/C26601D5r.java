package X;

import android.graphics.Typeface;

/* renamed from: X.D5r  reason: case insensitive filesystem */
public final class C26601D5r implements E78 {
    public static final Typeface A00(DSF dsf, String str, int i) {
        if (i == 0 && C18070vi.A18(dsf, DSF.A03) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int A00 = C24505C6z.A00(dsf, i);
        if (str == null || str.length() == 0) {
            return Typeface.defaultFromStyle(A00);
        }
        return Typeface.create(str, A00);
    }

    public Typeface BHJ(DSF dsf, int i) {
        return A00(dsf, (String) null, i);
    }

    public Typeface BHb(DSF dsf, BJG bjg, int i) {
        StringBuilder A11;
        String str;
        String str2 = bjg.A00;
        String str3 = str2;
        int i2 = dsf.A00 / 100;
        if (i2 >= 0) {
            if (i2 < 2) {
                A11 = AnonymousClass000.A11(str2);
                str = "-thin";
            } else if (i2 < 4) {
                A11 = AnonymousClass000.A11(str2);
                str = "-light";
            } else if (i2 != 4) {
                if (i2 == 5) {
                    A11 = AnonymousClass000.A11(str2);
                    str = "-medium";
                } else if (i2 >= 8 && i2 < 11) {
                    A11 = AnonymousClass000.A11(str2);
                    str = "-black";
                }
            }
            str3 = AnonymousClass000.A0y(str, A11);
        }
        if (str3.length() != 0) {
            Typeface A00 = A00(dsf, str3, i);
            if (!C18070vi.A18(A00, Typeface.create(Typeface.DEFAULT, C24505C6z.A00(dsf, i))) && !C18070vi.A18(A00, A00(dsf, (String) null, i)) && A00 != null) {
                return A00;
            }
        }
        return A00(dsf, str2, i);
    }
}
