package X;

import android.graphics.Bitmap;

public abstract class BSF extends C26766DCv implements C28672EDo {
    public DRN A00;
    public final C25112CYh A01;
    public final int A02;
    public final int A03;
    public volatile Bitmap A04;

    public BSF(Bitmap bitmap, E4M e4m, C25112CYh cYh) {
        this.A04 = bitmap;
        Bitmap bitmap2 = this.A04;
        C26208Cuj.A01(e4m);
        this.A00 = DRN.A00(e4m, bitmap2);
        this.A01 = cYh;
        this.A03 = 0;
        this.A02 = 0;
    }

    public synchronized DRN A00() {
        DRN drn;
        DRN drn2 = this.A00;
        if (drn2 != null) {
            drn = drn2.A04();
        } else {
            drn = null;
        }
        return drn;
    }

    public void close() {
        DRN drn;
        synchronized (this) {
            drn = this.A00;
            this.A00 = null;
            this.A04 = null;
        }
        if (drn != null) {
            drn.close();
        }
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1X(this.A00);
    }

    public void BSS() {
        int i;
        if (this.A03 % 180 != 0 || (i = this.A02) == 5 || i == 7) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                bitmap.getWidth();
                return;
            }
            return;
        }
        Bitmap bitmap2 = this.A04;
        if (bitmap2 != null) {
            bitmap2.getHeight();
        }
    }

    public void Bbq() {
        int i;
        if (this.A03 % 180 != 0 || (i = this.A02) == 5 || i == 7) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                bitmap.getHeight();
                return;
            }
            return;
        }
        Bitmap bitmap2 = this.A04;
        if (bitmap2 != null) {
            bitmap2.getWidth();
        }
    }

    public int getSizeInBytes() {
        Bitmap bitmap = this.A04;
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public BSF(DRN drn, C25112CYh cYh, int i, int i2) {
        DRN A042 = drn.A04();
        C26208Cuj.A01(A042);
        this.A00 = A042;
        this.A04 = (Bitmap) A042.A05();
        this.A01 = cYh;
        this.A03 = i;
        this.A02 = i2;
    }
}
