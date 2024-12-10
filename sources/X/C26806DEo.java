package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.DEo  reason: case insensitive filesystem */
public class C26806DEo implements E9U {
    public ImageReader A00;
    public CVC A01;
    public final ImageReader.OnImageAvailableListener A02 = new C26357CyJ(this, 1);

    public int BSm() {
        return 35;
    }

    public Surface BZw() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BdE(int i, int i2) {
        this.A00 = ImageReader.newInstance(i, i2, 35, 1);
    }

    public void CCL(Handler handler, CVC cvc) {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            this.A01 = cvc;
            imageReader.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A01 = null;
    }
}
