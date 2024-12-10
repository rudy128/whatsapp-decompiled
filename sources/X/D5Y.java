package X;

import com.facebook.smartcapture.camera.CameraFragment;
import com.facebook.smartcapture.camera.PhotoCameraFragment;

public class D5Y implements AnonymousClass02j {
    public final int A00;
    public final Object A01;

    public D5Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bkx(Object obj) {
        AnonymousClass1GO r0;
        int i = this.A00;
        Object obj2 = this.A01;
        if (i != 0) {
            PhotoCameraFragment photoCameraFragment = (PhotoCameraFragment) obj2;
            Boolean bool = (Boolean) obj;
            C18070vi.A0d(bool, 1);
            if (bool.booleanValue() || ((r0 = photoCameraFragment.A0G) != null && C110885hR.A0C(r0.A04, "android.permission.CAMERA"))) {
                photoCameraFragment.A04 = false;
            } else {
                photoCameraFragment.A04 = true;
            }
            PhotoCameraFragment.A00(photoCameraFragment);
            return;
        }
        CameraFragment cameraFragment = (CameraFragment) obj2;
        Boolean bool2 = (Boolean) obj;
        C18070vi.A0d(bool2, 1);
        if (bool2.booleanValue()) {
            cameraFragment.A02 = false;
            CameraFragment.A02(cameraFragment);
            return;
        }
        AnonymousClass1GO r02 = cameraFragment.A0G;
        if (r02 == null || !C110885hR.A0C(r02.A04, "android.permission.CAMERA")) {
            cameraFragment.A02 = true;
        } else {
            cameraFragment.A02 = false;
        }
        CameraFragment.A01(cameraFragment);
    }
}
