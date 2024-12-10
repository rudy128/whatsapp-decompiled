package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.DVk  reason: case insensitive filesystem */
public class C27123DVk implements Callable {
    public final /* synthetic */ C26225CvG A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C27123DVk(C26225CvG cvG, List list, boolean z, boolean z2, boolean z3) {
        this.A00 = cvG;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = list;
        this.A04 = z3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C26225CvG cvG = this.A00;
        C28111Yx.A03(cvG.A01, "CameraDevice should not be null for createCaptureSession!");
        C28111Yx.A03(cvG.A0D, "mPreviewSetupDelegate should not be null for createCaptureSession!");
        C27133DVu dVu = new C27133DVu(cvG.A0O.A02);
        boolean z = this.A03;
        if (z || this.A02) {
            CameraDevice cameraDevice = cvG.A01;
            List list = this.A01;
            C26816DEy dEy = cvG.A0L;
            DEW.A01(cameraDevice, dEy, list, dVu, AnonymousClass000.A09(z ? 1 : 0));
            return dEy;
        }
        CameraDevice cameraDevice2 = cvG.A01;
        List list2 = this.A01;
        boolean z2 = this.A04;
        C26816DEy dEy2 = cvG.A0L;
        DEV.A01(cameraDevice2, dEy2, list2, dVu, z2);
        return dEy2;
    }
}
