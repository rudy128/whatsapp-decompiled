package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class BHC extends Surface {
    public static CZT A02;
    public boolean A00;
    public final BGA A01;

    public BHC(SurfaceTexture surfaceTexture, BGA bga) {
        super(surfaceTexture);
        this.A01 = bga;
    }

    public void release() {
        super.release();
        BGA bga = this.A01;
        synchronized (bga) {
            if (!this.A00) {
                C221718w.A00(bga.A00);
                bga.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
