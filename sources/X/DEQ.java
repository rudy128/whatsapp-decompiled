package X;

import android.hardware.camera2.CaptureRequest;

public class DEQ implements C28501E4j {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C25267Cc8 A01;
    public final /* synthetic */ DEU A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public DEQ(CaptureRequest.Builder builder, C25267Cc8 cc8, DEU deu, float[] fArr, boolean z) {
        this.A01 = cc8;
        this.A02 = deu;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    public void Bup(boolean z) {
        Integer num;
        C25267Cc8 cc8 = this.A01;
        boolean z2 = cc8.A09;
        DEU deu = this.A02;
        if (z2) {
            cc8.A03(deu);
        } else {
            deu.A05 = null;
        }
        if (z) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A0Y;
        }
        cc8.A04(num, this.A04);
        if (!cc8.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j = 4000;
            if (number == null || number.intValue() != 1) {
                if (!this.A03) {
                    j = 2000;
                }
                cc8.A02(builder, deu, j);
                return;
            }
            if (!this.A03) {
                j = 2000;
            }
            synchronized (cc8) {
                C27121DVh dVh = new C27121DVh(builder, cc8, deu, 2);
                cc8.A00();
                cc8.A08 = cc8.A0B.A02("monitor_auto_exposure", dVh, j);
            }
        }
    }
}
