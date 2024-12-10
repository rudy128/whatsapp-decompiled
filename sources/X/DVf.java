package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

public final /* synthetic */ class DVf implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C22900BUl A01;
    public final /* synthetic */ DEU A02;
    public final /* synthetic */ boolean A03;

    public final Object call() {
        C22900BUl bUl = this.A01;
        CaptureRequest.Builder builder = this.A00;
        DEU deu = this.A02;
        boolean z = this.A03;
        C25090CXb cXb = bUl.A02;
        cXb.A00();
        C25267Cc8 cc8 = cXb.A01;
        if (cc8 != null) {
            cc8.A01(builder, deu);
        }
        C26225CvG cvG = cXb.A02;
        if (cvG == null) {
            return null;
        }
        cvG.A0A(z, true);
        return null;
    }

    public /* synthetic */ DVf(CaptureRequest.Builder builder, C22900BUl bUl, DEU deu, boolean z) {
        this.A01 = bUl;
        this.A00 = builder;
        this.A02 = deu;
        this.A03 = z;
    }
}
