package X;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Trace;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

public class DHH implements EAR {
    public final CZT A00;
    public final /* synthetic */ CVl A01;

    public DHH(Context context, Surface surface, C25092CXd cXd, C25752ClM clM, C26052CrM crM, E7s e7s, CVl cVl, CTK ctk, CZT czt) {
        CVl cVl2 = cVl;
        this.A01 = cVl2;
        CZT czt2 = czt;
        this.A00 = czt2;
        if (cVl2.A00 == null) {
            E7s e7s2 = e7s;
            EAZ BGk = e7s2.BGk(context, EGL14.EGL_NO_CONTEXT, EGL14.EGL_NO_DISPLAY, EGL14.EGL_NO_SURFACE, (C25998CqE) null, cXd, clM, crM, czt2);
            cVl2.A00 = BGk;
            CTK ctk2 = ctk;
            if (ctk != null) {
                synchronized (ctk2.A03) {
                    ctk2.A00 = BGk;
                }
            }
            cVl2.A00.Bd6();
        }
        EAZ eaz = cVl2.A00;
        C26159CtX.A01(eaz);
        eaz.CJq(surface);
    }

    public void BB8(MediaEffect mediaEffect) {
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.BB7(mediaEffect);
    }

    public void BBq(int i) {
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.BBq(i);
    }

    public void BJ1(long j) {
        Trace.beginSection("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.BJ2(j);
        Trace.endSection();
    }

    public void BJS(long j) {
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.BJS(j);
    }

    public void CEf(MediaEffect mediaEffect) {
        EAZ eaz = this.A01.A00;
        if (eaz != null) {
            eaz.CEe(mediaEffect);
        }
    }

    public void CHa(C28560E7m e7m) {
        EAZ eaz = this.A01.A00;
        if (eaz instanceof C28562E7o) {
            ((C28562E7o) eaz).CCl(e7m);
        }
    }

    public void CHb(C28560E7m e7m, C28561E7n e7n) {
        EAZ eaz = this.A01.A00;
        if (eaz instanceof C28562E7o) {
            ((C28562E7o) eaz).CCm(e7m, e7n);
        }
    }

    public void CQg(Surface surface) {
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.CJq(surface);
    }

    public void CS3() {
        C26159CtX.A01(this.A01.A00);
    }

    public void cancel() {
        EAZ eaz = this.A01.A00;
        if (eaz != null) {
            eaz.cancel();
        }
    }

    public void flush() {
        EAZ eaz = this.A01.A00;
        C26159CtX.A01(eaz);
        eaz.flush();
    }

    public void release() {
        CVl cVl = this.A01;
        EAZ eaz = cVl.A00;
        if (eaz != null) {
            eaz.release();
        }
        cVl.A00 = null;
    }
}
