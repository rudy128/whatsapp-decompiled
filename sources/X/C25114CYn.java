package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.CYn  reason: case insensitive filesystem */
public class C25114CYn {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public C26003CqK A01;
    public Surface A02;
    public boolean A03;

    public void A00() {
        C26003CqK cqK = this.A01;
        EGLSurface eGLSurface = this.A00;
        if (cqK.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(cqK.A02, eGLSurface, eGLSurface, cqK.A01)) {
            throw AnonymousClass8BR.A0w("eglMakeCurrent failed");
        }
    }

    public void A01() {
        C26003CqK cqK = this.A01;
        EGL14.eglDestroySurface(cqK.A02, this.A00);
        this.A00 = EGL14.EGL_NO_SURFACE;
        Surface surface = this.A02;
        if (surface != null) {
            if (this.A03) {
                surface.release();
            }
            this.A02 = null;
        }
    }

    public C25114CYn(Surface surface, C26003CqK cqK, boolean z) {
        this.A01 = cqK;
        if (surface == null) {
            throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(surface, "invalid surface: ", AnonymousClass000.A10()));
        }
        int[] A1X = BE6.A1X();
        A1X[0] = 12344;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(cqK.A02, cqK.A00, surface, A1X, 0);
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder A11 = AnonymousClass000.A11("eglCreateWindowSurface");
            BE9.A1J(": EGL error: 0x", A11, eglGetError);
            throw BE8.A0f(A11);
        } else if (eglCreateWindowSurface != null) {
            this.A00 = eglCreateWindowSurface;
            this.A02 = surface;
            this.A03 = z;
        } else {
            throw AnonymousClass8BR.A0w("surface was null");
        }
    }
}
