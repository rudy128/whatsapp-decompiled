package X;

import android.hardware.Camera;
import com.whatsapp.util.Log;

/* renamed from: X.Cy8  reason: case insensitive filesystem */
public final /* synthetic */ class C26346Cy8 implements Camera.PictureCallback {
    public final /* synthetic */ E8C A00;
    public final /* synthetic */ Bq6 A01;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        Bq6 bq6 = this.A01;
        E8C e8c = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("cameraview/take-picture taken ");
        C17900vP.A0r(A10, bq6.A0N);
        try {
            bq6.A07.stopPreview();
            bq6.A0M = false;
        } catch (Exception e) {
            Log.w("cameraview/take-picture error stopping camera preview", e);
        }
        bq6.A0Q = false;
        bq6.A0V.post(new C21434Ak1(bq6, e8c, bArr, 34));
    }

    public /* synthetic */ C26346Cy8(E8C e8c, Bq6 bq6) {
        this.A01 = bq6;
        this.A00 = e8c;
    }
}
