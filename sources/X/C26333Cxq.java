package X;

import android.content.DialogInterface;
import com.facebook.smartcapture.camera.CameraFragment;
import com.facebook.smartcapture.camera.PhotoCameraFragment;

/* renamed from: X.Cxq  reason: case insensitive filesystem */
public class C26333Cxq implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C26333Cxq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
            case 1:
                ((CameraFragment) obj).A03 = false;
                return;
            default:
                ((PhotoCameraFragment) obj).A03 = false;
                return;
        }
    }
}
