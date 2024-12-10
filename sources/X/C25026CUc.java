package X;

import android.graphics.Bitmap;

/* renamed from: X.CUc  reason: case insensitive filesystem */
public abstract class C25026CUc {
    public DRN A00(Bitmap.Config config, int i, int i2) {
        BSB bsb = (BSB) this;
        int A01 = C26077Crr.A01(config, i, i2);
        BSH bsh = bsb.A01;
        Bitmap bitmap = (Bitmap) bsh.get(A01);
        if (bitmap.getAllocationByteCount() >= i * i2 * C26077Crr.A00(config)) {
            bitmap.reconfigure(i, i2, config);
            return new DRN(bsb.A00.A00, (E4M) bsh, (Object) bitmap);
        }
        throw AnonymousClass000.A0n("Check failed.");
    }
}
