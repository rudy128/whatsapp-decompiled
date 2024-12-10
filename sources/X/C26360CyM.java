package X;

import android.media.ImageReader;
import org.pjsip.PjCamera;

/* renamed from: X.CyM  reason: case insensitive filesystem */
public class C26360CyM implements ImageReader.OnImageAvailableListener, C28629EBc {
    public final int A00;
    public final Object A01;

    public C26360CyM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onImageAvailable(ImageReader imageReader) {
        if (this.A00 != 0) {
            ((PjCamera) this.A01).imageAvailableListener(imageReader);
        } else {
            C24156BwM.A02(imageReader, (C24156BwM) this.A01);
        }
    }
}
