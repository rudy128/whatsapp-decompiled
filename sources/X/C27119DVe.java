package X;

import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

/* renamed from: X.DVe  reason: case insensitive filesystem */
public final /* synthetic */ class C27119DVe implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DRB A02;

    public final Object call() {
        int i;
        DRB drb = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (!DRB.A08(drb)) {
            i = -6;
        } else {
            DRB.A03(drb, DRB.A0P);
            GlVideoRenderer glVideoRenderer = drb.A0E;
            i = 0;
            glVideoRenderer.setWindow(0, 0, i2, i3);
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C27119DVe(DRB drb, int i, int i2) {
        this.A02 = drb;
        this.A00 = i;
        this.A01 = i2;
    }
}
