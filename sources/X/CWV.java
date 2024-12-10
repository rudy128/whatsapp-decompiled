package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ScaleGestureDetector;
import java.lang.ref.WeakReference;
import java.util.List;

public class CWV {
    public C26273CwN A00 = null;
    public CTE A01 = new CTE(false, false, false, false, false, false, false);
    public WeakReference A02;
    public final List A03 = AnonymousClass000.A13();

    public void A00(WeakReference weakReference) {
        WeakReference weakReference2;
        this.A02 = weakReference;
        C26273CwN cwN = this.A00;
        if (cwN != null) {
            HandlerThread handlerThread = cwN.A04;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                cwN.A04 = null;
            }
            this.A00 = null;
        }
        if (this.A01.A06 && (weakReference2 = this.A02) != null && weakReference2.get() != null) {
            C26273CwN cwN2 = new C26273CwN(this);
            this.A00 = cwN2;
            WeakReference weakReference3 = this.A02;
            if (weakReference3.get() != null) {
                cwN2.A0C = weakReference3;
                Context applicationContext = C108945cZ.A0O(weakReference3).getContext().getApplicationContext();
                C26273CwN.A02(cwN2);
                C26273CwN.A03(cwN2);
                cwN2.A03 = 1;
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    if (cwN2.A04 == null) {
                        HandlerThread handlerThread2 = new HandlerThread(C108955ca.A0x(cwN2));
                        cwN2.A04 = handlerThread2;
                        handlerThread2.start();
                    }
                    myLooper = cwN2.A04.getLooper();
                    C199610h.A04(myLooper);
                }
                Handler handler = new Handler(myLooper);
                CW9 cw9 = new CW9(cwN2);
                cwN2.A08 = cw9;
                cwN2.A0A = new C26016CqX(applicationContext, handler, cw9);
                C26565D4f d4f = new C26565D4f(cwN2);
                cwN2.A07 = d4f;
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(applicationContext, d4f, handler);
                cwN2.A05 = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                CPP cpp = new CPP(cwN2);
                cwN2.A06 = cpp;
                cwN2.A09 = new CU3(cpp);
                cwN2.A02 = 0;
            }
            C26273CwN cwN3 = this.A00;
            cwN3.A0B = this.A01;
            C26273CwN.A03(cwN3);
        }
    }
}
