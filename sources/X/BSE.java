package X;

import android.graphics.Bitmap;

public class BSE extends BSF {
    public void finalize() {
        if (!isClosed()) {
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = C108955ca.A0x(this);
            AnonymousClass000.A1M(A1b, System.identityHashCode(this));
            C26265CwA.A06("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", A1b);
            close();
        }
    }

    public BSE(Bitmap bitmap, E4M e4m, C25112CYh cYh) {
        super(bitmap, e4m, cYh);
    }

    public BSE(DRN drn, C25112CYh cYh, int i, int i2) {
        super(drn, cYh, i, i2);
    }
}
