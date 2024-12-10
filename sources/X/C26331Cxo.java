package X;

import android.content.DialogInterface;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.smartcapture.camera.CameraFragment;
import com.facebook.smartcapture.camera.PhotoCameraFragment;

/* renamed from: X.Cxo  reason: case insensitive filesystem */
public class C26331Cxo implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C26331Cxo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass02n r1;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                r1 = ((CameraFragment) obj).A07;
                break;
            case 1:
                r1 = ((PhotoCameraFragment) obj).A09;
                break;
            case 2:
                BLP blp = (BLP) obj;
                blp.setResult(0);
                blp.finish();
                blp.A2n();
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION;
                A1b[1] = "photo_save_failure";
                C24568C9p.A00(A1b);
                return;
            default:
                ((C72033Kj) obj).Bom();
                return;
        }
        r1.A03("android.permission.CAMERA");
    }
}
