package X;

import com.whatsapp.util.Log;

/* renamed from: X.1W9  reason: invalid class name */
public class AnonymousClass1W9 {
    public final AnonymousClass18K A00;

    public static void A01(AnonymousClass18K r3, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/missing message secret");
        Log.e(sb.toString());
        AnonymousClass2FV r2 = new AnonymousClass2FV();
        r2.A02 = 0;
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 0;
        r3.CC7(r2);
    }

    public void A02(int i, int i2) {
        AnonymousClass2FV r1 = new AnonymousClass2FV();
        r1.A02 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = 0;
        this.A00.CC7(r1);
    }

    public AnonymousClass1W9(AnonymousClass18K r1) {
        this.A00 = r1;
    }

    public static Integer A00(AnonymousClass206 r3, AnonymousClass1W9 r4, int i) {
        int i2;
        boolean A002 = C60612oK.A00(r3);
        if (!A002 && !r3.A11(16777216)) {
            return null;
        }
        if (r3.A0t()) {
            if (r3.A1D.length == 32) {
                return null;
            }
            r4.A02(1, i);
            i2 = 67;
        } else if (!A002) {
            return null;
        } else {
            r4.A02(0, i);
            i2 = 66;
        }
        return Integer.valueOf(i2);
    }
}
