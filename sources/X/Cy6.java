package X;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import org.pjsip.PjCamera;

public class Cy6 implements Camera.ErrorCallback {
    public final int A00;
    public final Object A01;

    public Cy6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(int i, Camera camera) {
        String str;
        switch (this.A00) {
            case 0:
                C26810DEs dEs = (C26810DEs) this.A01;
                boolean z = false;
                if (i != 1) {
                    if (i == 2) {
                        str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
                    } else if (i != 100) {
                        str = AnonymousClass001.A1I("Unknown error code: ", AnonymousClass000.A10(), i);
                    } else {
                        str = "Camera server died. Camera resources will be released.";
                    }
                    z = true;
                } else {
                    str = "Unknown error";
                }
                List list = dEs.A0P.A00;
                UUID uuid = dEs.A0R.A03;
                C25103CXw cXw = dEs.A0b;
                if (cXw != null && !cXw.A00.isEmpty()) {
                    C26078Crs.A00(new C21452AkJ(8, str, cXw));
                }
                Log.e("Camera1Device", str);
                dEs.A0S.A05(new C21437Ak4(dEs, list, new C27221Da0(i, str), uuid, 0, z), uuid);
                return;
            case 1:
                Bq6 bq6 = (Bq6) this.A01;
                synchronized (bq6) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("cameraview/start-camera camera error:");
                    A10.append(i);
                    A10.append(" takingpicture:");
                    A10.append(bq6.A0Q);
                    A10.append(" recording:");
                    A10.append(bq6.A0O);
                    A10.append(" inpreview:");
                    com.whatsapp.util.Log.w(AnonymousClass3MY.A0r(A10, bq6.A0M));
                    if (i == 100) {
                        Bq6.A08(bq6);
                        Handler handler = bq6.A09;
                        handler.getClass();
                        handler.post(new AnonymousClass7R9((Object) bq6, 23));
                    } else if (i == 2) {
                        Camera camera2 = bq6.A07;
                        if (camera2 != null) {
                            camera2.release();
                        }
                        bq6.A07 = null;
                        Bq6.A09(bq6, new Exception("CameraCustomException: Camera error evicted"), i);
                    }
                }
                return;
            default:
                ((PjCamera) this.A01).m83lambda$startOnCameraThread$0$orgpjsipPjCamera(i, camera);
                return;
        }
    }
}
