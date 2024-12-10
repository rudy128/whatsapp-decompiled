package X;

import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: X.D4g  reason: case insensitive filesystem */
public class C26566D4g implements SurfaceHolder.Callback {
    public final /* synthetic */ BUK A00;

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public C26566D4g(BUK buk) {
        this.A00 = buk;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        BUK buk = this.A00;
        Surface surface = surfaceHolder.getSurface();
        C26159CtX.A01(surface);
        buk.CKB(surface, i2, i3);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        BUK buk = this.A00;
        C25742ClC clC = buk.A08;
        if (clC != null && clC.A00() == surfaceHolder.getSurface()) {
            buk.A08 = null;
            buk.A06 = 0;
            buk.A05 = 0;
            BUK.A02(buk, clC);
            clC.A01();
        }
    }
}
