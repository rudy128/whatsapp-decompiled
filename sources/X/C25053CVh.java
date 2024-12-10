package X;

import android.graphics.ColorSpace;

/* renamed from: X.CVh  reason: case insensitive filesystem */
public final class C25053CVh {
    public final AnonymousClass1D6 A00;
    public final ColorSpace A01;

    public final ColorSpace A00() {
        return this.A01;
    }

    public C25053CVh(ColorSpace colorSpace, int i, int i2) {
        AnonymousClass1D6 r0;
        this.A01 = colorSpace;
        if (i == -1 || i2 == -1) {
            r0 = null;
        } else {
            r0 = AnonymousClass1D6.A00(Integer.valueOf(i), i2);
        }
        this.A00 = r0;
    }
}
