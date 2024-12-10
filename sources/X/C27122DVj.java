package X;

import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: X.DVj  reason: case insensitive filesystem */
public final /* synthetic */ class C27122DVj implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DRB A02;
    public final /* synthetic */ CZE A03;

    public final Object call() {
        int i;
        DRB drb = this.A02;
        CZE cze = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        HandlerThread handlerThread = drb.A0B;
        C17960vV.A04(handlerThread);
        drb.A08 = true;
        if (!DRB.A08(drb)) {
            i = -6;
        } else {
            boolean A012 = cze.A01(drb.A0E, i2, i3);
            i = -7;
            if (A012) {
                C17960vV.A04(handlerThread);
                drb.A08 = false;
                i = DRB.A01(drb);
            }
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C27122DVj(DRB drb, CZE cze, int i, int i2) {
        this.A02 = drb;
        this.A03 = cze;
        this.A00 = i;
        this.A01 = i2;
    }
}
