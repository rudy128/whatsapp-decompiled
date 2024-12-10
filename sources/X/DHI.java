package X;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Trace;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

public class DHI implements EAR {
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public final Surface A03;
    public final C25998CqE A04;
    public final CZT A05;
    public final /* synthetic */ CVl A06;

    public DHI(Context context, Surface surface, C25092CXd cXd, C25752ClM clM, C26052CrM crM, E7s e7s, CVl cVl, CTK ctk, CZT czt) {
        EGLSurface eglCreatePbufferSurface;
        CVl cVl2 = cVl;
        this.A06 = cVl2;
        CZT czt2 = czt;
        this.A05 = czt2;
        Context context2 = context;
        this.A04 = new C25998CqE(context2.getResources());
        E7s e7s2 = e7s;
        Surface surface2 = surface;
        if (e7s2.Bch()) {
            this.A03 = null;
        } else {
            this.A03 = surface2;
        }
        if (cVl2.A00 == null) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A01 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    Surface surface3 = this.A03;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.A01, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, surface3 == null ? 1 : 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        this.A00 = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                        C26058CrU.A02("eglCreateContext");
                        if (this.A00 != null) {
                            int[] iArr2 = {12344};
                            if (surface3 != null) {
                                eglCreatePbufferSurface = EGL14.eglCreateWindowSurface(this.A01, eGLConfigArr[0], surface3, iArr2, 0);
                            } else {
                                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A01, eGLConfigArr[0], new int[]{12375, 8, 12374, 8, 12344}, 0);
                            }
                            this.A02 = eglCreatePbufferSurface;
                            C26058CrU.A02("eglCreateWindowSurface");
                            EGLSurface eGLSurface = this.A02;
                            if (eGLSurface != null) {
                                EGLContext eGLContext = this.A00;
                                if (eGLContext == null || EGL14.eglMakeCurrent(this.A01, eGLSurface, eGLSurface, eGLContext)) {
                                    CVl cVl3 = this.A06;
                                    C25998CqE cqE = this.A04;
                                    EGLContext eGLContext2 = this.A00;
                                    C26159CtX.A01(eGLContext2);
                                    EGLDisplay eGLDisplay = this.A01;
                                    C26159CtX.A01(eGLDisplay);
                                    EGLSurface eGLSurface2 = this.A02;
                                    C26159CtX.A01(eGLSurface2);
                                    EAZ BGk = e7s2.BGk(context2, eGLContext2, eGLDisplay, eGLSurface2, cqE, cXd, clM, crM, czt2);
                                    cVl3.A00 = BGk;
                                    CTK ctk2 = ctk;
                                    if (ctk != null) {
                                        synchronized (ctk2.A03) {
                                            ctk2.A00 = BGk;
                                        }
                                    }
                                    cVl3.A00.Bd6();
                                } else {
                                    throw AnonymousClass8BR.A0w("eglMakeCurrent failed");
                                }
                            } else {
                                throw AnonymousClass8BR.A0w("surface was null");
                            }
                        } else {
                            throw AnonymousClass8BR.A0w("null context");
                        }
                    } else {
                        throw AnonymousClass8BR.A0w("unable to find RGB888+recordable ES2 EGL config");
                    }
                } else {
                    this.A01 = null;
                    throw AnonymousClass8BR.A0w("unable to initialize EGL14");
                }
            } else {
                throw AnonymousClass8BR.A0w("unable to get EGL14 display");
            }
        }
        EAZ eaz = cVl2.A00;
        C26159CtX.A01(eaz);
        eaz.CJq(surface2);
    }

    public void BB8(MediaEffect mediaEffect) {
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.BB7(mediaEffect);
    }

    public void BBq(int i) {
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.BBq(i);
    }

    public void BJ1(long j) {
        Trace.beginSection("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.BJ2(j);
        Trace.endSection();
    }

    public void BJS(long j) {
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.BJS(j);
    }

    public void CEf(MediaEffect mediaEffect) {
        EAZ eaz = this.A06.A00;
        if (eaz != null) {
            eaz.CEe(mediaEffect);
        }
    }

    public void CHa(C28560E7m e7m) {
        EAZ eaz = this.A06.A00;
        if (eaz instanceof C28562E7o) {
            ((C28562E7o) eaz).CCl(e7m);
        }
    }

    public void CHb(C28560E7m e7m, C28561E7n e7n) {
        EAZ eaz = this.A06.A00;
        if (eaz instanceof C28562E7o) {
            ((C28562E7o) eaz).CCm(e7m, e7n);
        }
    }

    public void CQg(Surface surface) {
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.CJq(surface);
    }

    public void CS3() {
        C26159CtX.A01(this.A06.A00);
    }

    public void cancel() {
        EAZ eaz = this.A06.A00;
        if (eaz != null) {
            eaz.cancel();
        }
    }

    public void flush() {
        EAZ eaz = this.A06.A00;
        C26159CtX.A01(eaz);
        eaz.flush();
    }

    public void release() {
        boolean z;
        EGLSurface eGLSurface;
        if (this.A05 instanceof BWA) {
            z = true;
        } else {
            z = false;
        }
        CVl cVl = this.A06;
        EAZ eaz = cVl.A00;
        if (eaz != null && z) {
            eaz.release();
        }
        if (this.A00 != null) {
            if (EGL14.eglGetCurrentContext().equals(this.A00)) {
                BE7.A15(this.A01);
            }
            EGL14.eglDestroyContext(this.A01, this.A00);
        }
        EGLDisplay eGLDisplay = this.A01;
        if (!(eGLDisplay == null || (eGLSurface = this.A02) == null)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        EAZ eaz2 = cVl.A00;
        if (eaz2 != null && !z) {
            eaz2.release();
        }
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        cVl.A00 = null;
    }
}
