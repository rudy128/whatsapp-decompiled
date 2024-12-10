package X;

import android.content.DialogInterface;

/* renamed from: X.7AL  reason: invalid class name */
public class AnonymousClass7AL implements C22851Dl {
    public final int A00;

    public AnonymousClass7AL(int i) {
        this.A00 = i;
    }

    public static void A00(AnonymousClass1F9 r1, C73203Rj r2, int i, int i2) {
        r2.A0e(r1, new AnonymousClass7AL(i), i2);
    }

    public final void Bo9(Object obj) {
        if (9 - this.A00 != 0) {
            ((DialogInterface) obj).dismiss();
        }
    }
}
