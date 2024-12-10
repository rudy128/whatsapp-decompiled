package X;

import android.graphics.Bitmap;

/* renamed from: X.2iM  reason: invalid class name and case insensitive filesystem */
public final class C56992iM {
    public final C24771Lp A00;

    public C56992iM(C24771Lp r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(Bitmap bitmap, String str) {
        C18070vi.A0d(str, 0);
        if (!bitmap.isRecycled()) {
            C24771Lp r2 = this.A00;
            C32071ga A07 = r2.A07();
            C18070vi.A0X(A07);
            Bitmap bitmap2 = (Bitmap) A07.A0A(str);
            if (bitmap2 != null) {
                if (bitmap2.isRecycled()) {
                    A07.A0E(str);
                } else {
                    return;
                }
            }
            r2.A07().A0F(str, bitmap);
        }
    }
}
