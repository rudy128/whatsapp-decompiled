package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.ChS  reason: case insensitive filesystem */
public final class C25530ChS {
    public E8l A00;
    public final C22821Di A01;

    public static final void A00(C25530ChS chS) {
        C26791DDz dDz = new C26791DDz();
        chS.A00 = new C26782DDo(dDz, new BUV());
        C22821Di r2 = chS.A01;
        SurfaceTexture surfaceTexture = dDz.A03;
        if (surfaceTexture == null) {
            surfaceTexture = C26791DDz.A00(dDz);
        }
        r2.invoke(new Surface(surfaceTexture));
    }

    public C25530ChS(C22821Di r1) {
        this.A01 = r1;
        A00(this);
    }
}
