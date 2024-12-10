package X;

import android.content.res.Configuration;

/* renamed from: X.1J4  reason: invalid class name */
public class AnonymousClass1J4 extends AnonymousClass1J2 {
    public int A00;
    public final AnonymousClass1DT A01 = new AnonymousClass1DS();

    public void A0T(Configuration configuration) {
        int i;
        int i2 = AnonymousClass013.A00;
        if ((i2 != 3 && i2 != -1) || this.A00 == (i = configuration.uiMode & 48)) {
            this.A01.A0F(0);
        } else if (i == 16 || i == 32) {
            this.A01.A0F(1);
        }
    }
}
