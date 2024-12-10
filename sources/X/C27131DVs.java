package X;

import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.DVs  reason: case insensitive filesystem */
public final /* synthetic */ class C27131DVs implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CameraManager A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C25816CmT A05;
    public final /* synthetic */ DEU A06;
    public final /* synthetic */ EB1 A07;
    public final /* synthetic */ E9C A08;
    public final /* synthetic */ C25729Ckz A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ boolean A0B;

    public final Object call() {
        C25816CmT cmT = this.A05;
        C25729Ckz ckz = this.A09;
        CameraManager cameraManager = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        Integer num = this.A0A;
        cmT.A01(cameraManager, this.A04, this.A06, this.A07, this.A08, ckz, num, i, i2, i3, this.A0B);
        return null;
    }

    public /* synthetic */ C27131DVs(CameraManager cameraManager, CaptureRequest.Builder builder, C25816CmT cmT, DEU deu, EB1 eb1, E9C e9c, C25729Ckz ckz, Integer num, int i, int i2, int i3, boolean z) {
        this.A05 = cmT;
        this.A09 = ckz;
        this.A03 = cameraManager;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A0A = num;
        this.A04 = builder;
        this.A07 = eb1;
        this.A0B = z;
        this.A06 = deu;
        this.A08 = e9c;
    }
}
