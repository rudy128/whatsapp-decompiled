package X;

import android.os.Bundle;

/* renamed from: X.9wk  reason: invalid class name and case insensitive filesystem */
public abstract class C197469wk {
    public static final long A00 = A8Y.A06(AnonymousClass8BV.A0x(C21349Aie.A00(2100, 11).A05)).getTimeInMillis();
    public static final long A01 = A8Y.A06(AnonymousClass8BV.A0x(C21349Aie.A00(1900, 0).A05)).getTimeInMillis();

    public static ADU A00(BDY bdy, Long l, int i, long j, long j2) {
        C21349Aie aie;
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("DEEP_COPY_VALIDATOR_KEY", bdy);
        C21349Aie aie2 = new C21349Aie(AnonymousClass8BV.A0x(j2));
        C21349Aie aie3 = new C21349Aie(AnonymousClass8BV.A0x(j));
        BDY bdy2 = (BDY) A0D.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        if (l == null) {
            aie = null;
        } else {
            aie = new C21349Aie(AnonymousClass8BV.A0x(l.longValue()));
        }
        return new ADU(bdy2, aie2, aie3, aie, i);
    }
}
