package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: X.Cbg  reason: case insensitive filesystem */
public abstract class C25244Cbg {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public void A03() {
        EGLDisplay eGLDisplay = ((E04) this).A02;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            E04.A01("detachCurrent");
            throw AnonymousClass8BR.A0w("eglMakeCurrent failed");
        }
    }

    public void A04() {
        E04 e04 = (E04) this;
        E04.A02(e04);
        EGLSurface eGLSurface = e04.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass8BR.A0w("No EGLSurface - can't make current");
        } else if (!EGL14.eglMakeCurrent(e04.A02, eGLSurface, eGLSurface, e04.A01)) {
            E04.A01("makeCurrent");
            throw AnonymousClass8BR.A0w("eglMakeCurrent failed");
        }
    }

    public void A05() {
        E04 e04 = (E04) this;
        E04.A02(e04);
        e04.A06();
        e04.A03();
        EGL14.eglDestroyContext(e04.A02, e04.A01);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(e04.A02);
        e04.A01 = EGL14.EGL_NO_CONTEXT;
        e04.A02 = EGL14.EGL_NO_DISPLAY;
        e04.A00 = null;
    }

    public void A06() {
        E04 e04 = (E04) this;
        EGLSurface eGLSurface = e04.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(e04.A02, eGLSurface);
            e04.A03 = EGL14.EGL_NO_SURFACE;
        }
    }
}
