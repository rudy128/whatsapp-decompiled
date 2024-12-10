package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.DVg  reason: case insensitive filesystem */
public class C27120DVg implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C25090CXb A02;
    public final /* synthetic */ DEU A03;

    public C27120DVg(CaptureRequest.Builder builder, C25090CXb cXb, DEU deu, long j) {
        this.A02 = cXb;
        this.A01 = builder;
        this.A03 = deu;
        this.A00 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        EBS ebs;
        C25090CXb cXb = this.A02;
        if (!cXb.A0D) {
            throw AnonymousClass000.A0n("Not recording video.");
        } else if (cXb.A0B == null || cXb.A05 == null || cXb.A03 == null || cXb.A02 == null || cXb.A01 == null) {
            throw AnonymousClass000.A0n("Cannot stop recording video, camera is closed");
        } else if (cXb.A06 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - cXb.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            C25815CmS cmS = cXb.A06;
            cmS.A02(C25815CmS.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            Exception A002 = cXb.A00();
            C22907BUs bUs = cXb.A03;
            CKJ ckj = C25971Cpe.A0B;
            if (!(BEA.A09(ckj, bUs) == 0 || (builder = this.A01) == null || ((ebs = cXb.A04) != null && BE9.A1S(EBS.A03, ebs)))) {
                C26128Csq csq = new C26128Csq();
                C26128Csq.A01(ckj, csq, 0);
                cXb.A03.A06(csq.A03());
                C25315CdL.A01(builder, cXb.A03, cXb.A05, 0);
                cXb.A02.A05();
            }
            if (A002 == null) {
                cmS.A02(C25815CmS.A0P, Long.valueOf(this.A00));
                return cmS;
            }
            throw A002;
        } else {
            throw AnonymousClass000.A0n("Cannot stop recording video, VideoCaptureInfo is null");
        }
    }
}
