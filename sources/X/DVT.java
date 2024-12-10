package X;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.os.Trace;
import java.util.HashSet;
import java.util.concurrent.Callable;

public final /* synthetic */ class DVT implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26810DEs A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i;
        C26810DEs dEs = this.A01;
        String str = this.A02;
        long j = this.A00;
        Trace.beginSection("Camera1Device.startVideoRecording.startVideoTask.call");
        HashSet hashSet = C25449Cg0.A00;
        if (!C25870Cne.A02(hashSet)) {
            dEs.A0J.A01();
        }
        C25202Cav cav = dEs.A0O;
        C25971Cpe A022 = cav.A02(dEs.A00);
        dEs.A0B = BEA.A1X(C25971Cpe.A0W, A022);
        CKJ ckj = C25971Cpe.A0B;
        dEs.A02 = BEA.A09(ckj, A022);
        C25971Cpe A023 = cav.A02(dEs.A00);
        boolean A024 = C25870Cne.A02(hashSet);
        EBS ebs = dEs.A06;
        C28111Yx.A02(ebs);
        int A0M = AnonymousClass000.A0M(ebs.BMB(EBS.A01));
        if (A0M == -1 || !CamcorderProfile.hasProfile(dEs.A00, A0M)) {
            A0M = 1;
        }
        C26194CuP cuP = dEs.A0I;
        CamcorderProfile camcorderProfile = CamcorderProfile.get(C26194CuP.A00(cuP, dEs.A00), A0M);
        C26132Csv csv = (C26132Csv) A023.A04(C25971Cpe.A0y);
        if (csv == null) {
            csv = (C26132Csv) A023.A04(C25971Cpe.A0q);
        }
        C28111Yx.A02(csv);
        int i2 = csv.A01;
        if (!A024 || A0M == 1) {
            camcorderProfile.videoCodec = 2;
            camcorderProfile.videoFrameWidth = csv.A02;
            camcorderProfile.videoFrameHeight = i2;
            camcorderProfile.videoFrameRate = BEA.A09(C25971Cpe.A0w, A023);
            Object BMB = dEs.A06.BMB(EBS.A0b);
            if (BMB.equals(C24331BzS.HIGH)) {
                i = 5000000;
            } else if (BMB.equals(C24331BzS.MEDIUM)) {
                i = 3000000;
            } else if (BMB.equals(C24331BzS.LOW)) {
                i = 1000000;
            }
            camcorderProfile.videoBitRate = i;
        }
        int A05 = cuP.A05(dEs.A00, dEs.A0Z);
        if (Integer.valueOf(A05) == null) {
            A05 = cuP.A05(dEs.A00, dEs.A0Z);
        }
        int i3 = dEs.A00;
        boolean A1X = BEA.A1X(C25971Cpe.A0N, A022);
        EAW eaw = dEs.A0c;
        C28111Yx.A02(eaw);
        C28553E7e BbR = eaw.BbR();
        dEs.A09 = BbR;
        if (BbR == null) {
            if (C25870Cne.A02(hashSet)) {
                dEs.A0J.A01();
            }
            C22909BUu A002 = cav.A00(i3);
            boolean z = !BEA.A1X(C25971Cpe.A0T, A022);
            if (BE9.A1T(C25632CjI.A0W, A002.A00)) {
                int i4 = 0;
                if (z) {
                    i4 = 3;
                }
                C26128Csq.A02(ckj, A002, i4);
            }
            C26128Csq.A02(C25971Cpe.A0x, A002, A05);
            A002.A02();
            E1D e1d = dEs.A05;
            if (e1d == null) {
                e1d = new DEO(dEs, 0);
                dEs.A05 = e1d;
            }
            BbR = new C26817DEz(e1d, A1X);
            dEs.A09 = BbR;
        }
        try {
            dEs.A08 = BbR.COQ(camcorderProfile, (C26225CvG) null, str, i3, A05, A1X, false);
            Camera camera = dEs.A0a;
            C28111Yx.A02(camera);
            camera.lock();
            dEs.A08.A02(C25815CmS.A0N, Long.valueOf(j));
            Trace.endSection();
            return dEs.A08;
        } catch (Throwable th) {
            Camera camera2 = dEs.A0a;
            C28111Yx.A02(camera2);
            camera2.lock();
            throw th;
        }
    }

    public /* synthetic */ DVT(C26810DEs dEs, String str, long j) {
        this.A01 = dEs;
        this.A02 = str;
        this.A00 = j;
    }
}
