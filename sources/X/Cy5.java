package X;

import android.graphics.Point;
import android.hardware.Camera;

public final /* synthetic */ class Cy5 implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ C28500E4g A01;
    public final /* synthetic */ C25690CkL A02;

    public final void onAutoFocus(boolean z, Camera camera) {
        Integer num;
        C25690CkL ckL = this.A02;
        Point point = this.A00;
        C28500E4g e4g = this.A01;
        ckL.A07 = z;
        ckL.A08 = false;
        if (ckL.A0A) {
            ckL.A04 = false;
        }
        if (z) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A0Y;
        }
        C25690CkL.A00(point, ckL.A02, ckL, num);
        C25690CkL.A00(point, e4g, ckL, num);
    }

    public /* synthetic */ Cy5(Point point, C28500E4g e4g, C25690CkL ckL) {
        this.A02 = ckL;
        this.A00 = point;
        this.A01 = e4g;
    }
}
