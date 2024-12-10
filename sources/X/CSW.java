package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;

public class CSW {
    public long A00 = 0;
    public HandlerThread A01;
    public Surface A02;
    public C26343Cy2 A03;
    public final /* synthetic */ CVl A04;

    public CSW(CVl cVl, CZT czt, int i) {
        boolean z;
        this.A04 = cVl;
        EAZ eaz = cVl.A00;
        C26159CtX.A01(eaz);
        SurfaceTexture BT6 = eaz.BT6(i);
        C26159CtX.A01(BT6);
        C26343Cy2 cy2 = new C26343Cy2(BT6);
        this.A03 = cy2;
        if (czt instanceof BWA) {
            z = true;
        } else {
            z = false;
        }
        cy2.A03 = z;
        cy2.A02 = cVl.A01;
        HandlerThread handlerThread = new HandlerThread("videotranscoder-framecallback", -19);
        this.A01 = handlerThread;
        handlerThread.start();
        C26343Cy2 cy22 = this.A03;
        Looper looper = this.A01.getLooper();
        C26159CtX.A01(looper);
        BT6.setOnFrameAvailableListener(cy22, new Handler(looper));
        this.A02 = new Surface(BT6);
    }
}
