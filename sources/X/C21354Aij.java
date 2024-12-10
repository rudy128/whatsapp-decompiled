package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Aij  reason: case insensitive filesystem */
public class C21354Aij implements Runnable {
    public final int A00;
    public final int A01;

    public C21354Aij(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                Voip.adjustAudioLevel(this.A01);
                return;
            case 1:
                int i = this.A01;
                AtomicInteger atomicInteger = A99.A4B;
                Voip.cancelVideoUpgrade(i);
                return;
            case 2:
                int i2 = this.A01;
                AtomicInteger atomicInteger2 = A99.A4B;
                Voip.rejectVideoUpgrade(i2);
                return;
            case 3:
                int i3 = this.A01;
                AtomicInteger atomicInteger3 = A99.A4B;
                Voip.notifyAudioRouteChange(i3);
                return;
            default:
                int i4 = this.A01;
                Voip.videoDeviceAndDisplayOrientationChanged(i4, i4, false);
                return;
        }
    }
}
