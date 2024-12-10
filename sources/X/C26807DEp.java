package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.DEp  reason: case insensitive filesystem */
public class C26807DEp implements E9U {
    public ImageReader A00;
    public final int A01;
    public final ImageReader.OnImageAvailableListener A02 = new C26357CyJ(this, 0);
    public volatile CVC A03;

    public int BSm() {
        return this.A01;
    }

    public Surface BZw() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BdE(int i, int i2) {
        this.A00 = ImageReader.newInstance(i, i2, this.A01, 1);
    }

    public void CCL(Handler handler, CVC cvc) {
        if (this.A00 != null) {
            this.A03 = cvc;
            this.A00.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A03 = null;
    }

    public C26807DEp(int i) {
        this.A01 = i;
    }
}
