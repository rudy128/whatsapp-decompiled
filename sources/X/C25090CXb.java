package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: X.CXb  reason: case insensitive filesystem */
public class C25090CXb {
    public long A00;
    public C25267Cc8 A01;
    public C26225CvG A02;
    public C22907BUs A03;
    public EBS A04;
    public C25632CjI A05;
    public C25815CmS A06;
    public C28553E7e A07;
    public final C26221CvA A08;
    public final C25158Ca9 A09;
    public final C25850CnB A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public Exception A00() {
        Surface surface;
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        C28553E7e e7e = this.A07;
        if (e7e != null) {
            try {
                e7e.COd();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C26225CvG cvG = this.A02;
        if (cvG != null) {
            C25158Ca9 ca9 = cvG.A0I;
            ca9.A01("Can only stop video recording on the Optic thread");
            ca9.A01("Can only check if the prepared on the Optic thread");
            if (ca9.A00) {
                CaptureRequest.Builder builder = cvG.A02;
                if (!(builder == null || (surface = cvG.A05) == null)) {
                    builder.removeTarget(surface);
                }
                cvG.A05 = null;
            }
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public C25090CXb(C26221CvA cvA, C25850CnB cnB) {
        this.A0A = cnB;
        this.A08 = cvA;
        this.A09 = new C25158Ca9(cnB);
    }
}
