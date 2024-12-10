package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.FutureTask;

/* renamed from: X.Cc8  reason: case insensitive filesystem */
public class C25267Cc8 {
    public CameraDevice A00;
    public CameraManager A01;
    public C28500E4g A02;
    public CK9 A03;
    public C26225CvG A04;
    public C26223CvD A05;
    public C22907BUs A06;
    public C25632CjI A07;
    public FutureTask A08;
    public boolean A09;
    public final C25158Ca9 A0A;
    public final C25850CnB A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public synchronized void A02(CaptureRequest.Builder builder, DEU deu, long j) {
        C27121DVh dVh = new C27121DVh(builder, this, deu, 1);
        A00();
        this.A08 = this.A0B.A02("reset_focus", dVh, j);
    }

    public C25267Cc8(C25850CnB cnB) {
        C25158Ca9 ca9 = new C25158Ca9(cnB);
        this.A0B = cnB;
        this.A0A = ca9;
    }

    public void A01(CaptureRequest.Builder builder, DEU deu) {
        E9T e9t;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null && this.A07 != null && this.A0D && (e9t = this.A04.A08) != null) {
                this.A0E = false;
                this.A0C = false;
                float A062 = this.A05.A06();
                C26223CvD cvD = this.A05;
                Rect rect = cvD.A04;
                MeteringRectangle[] A042 = C26223CvD.A04(cvD, cvD.A0D);
                C26223CvD cvD2 = this.A05;
                C26225CvG.A01(rect, builder2, this.A07, A042, C26223CvD.A04(cvD2, cvD2.A0C), A062);
                BE7.A14(builder, CaptureRequest.CONTROL_AF_TRIGGER, 2);
                e9t.BEY(builder.build(), deu);
                CameraManager cameraManager = this.A01;
                CameraDevice cameraDevice = this.A00;
                C28111Yx.A02(cameraDevice);
                String id = cameraDevice.getId();
                C22907BUs bUs = this.A06;
                C28111Yx.A02(bUs);
                int A002 = C25315CdL.A00(cameraManager, builder, bUs, this.A07, id, 0);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                e9t.CKN(builder.build(), deu);
                if (A002 == 1) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    BE7.A14(builder, key, 1);
                    e9t.BEY(builder.build(), deu);
                    builder.set(key, 0);
                }
            }
        }
    }

    public void A03(DEU deu) {
        C22907BUs bUs;
        C25632CjI cjI = this.A07;
        C28111Yx.A02(cjI);
        if (BE9.A1T(C25632CjI.A05, cjI)) {
            if (BE9.A1T(C25632CjI.A04, this.A07) && (bUs = this.A06) != null && BEA.A1X(C25971Cpe.A0Q, bUs)) {
                this.A09 = true;
                deu.A05 = new DEP(this);
                return;
            }
        }
        deu.A05 = null;
        this.A09 = false;
    }

    public void A04(Integer num, float[] fArr) {
        if (this.A02 != null) {
            C26078Crs.A00(new C27081DTg(num, this, fArr, 22));
        }
    }
}
