package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;

public final class E04 extends C25244Cbg {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL14.EGL_NO_SURFACE;

    public static void A00(Object obj, E04 e04) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            A02(e04);
            if (e04.A03 == EGL14.EGL_NO_SURFACE) {
                int[] A1X = BE6.A1X();
                A1X[0] = 12344;
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(e04.A02, e04.A00, obj, A1X, 0);
                e04.A03 = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    A01("eglCreateWindowSurface");
                    throw AnonymousClass8BR.A0w("Failed to create window surface");
                }
                return;
            }
            throw AnonymousClass8BR.A0w("Already has an EGLSurface");
        }
        throw AnonymousClass000.A0n("Input must be either a Surface or SurfaceTexture");
    }

    public static void A02(E04 e04) {
        if (e04.A02 == EGL14.EGL_NO_DISPLAY || e04.A01 == EGL14.EGL_NO_CONTEXT || e04.A00 == null) {
            throw AnonymousClass8BR.A0w("This object has been released");
        }
    }

    public E04(C24445C4k c4k, int[] iArr) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] A1W = C108945cZ.A1W();
            if (EGL14.eglInitialize(eglGetDisplay, A1W, 0, A1W, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLDisplay eGLDisplay = this.A02;
                    if (c4k != null) {
                        throw AnonymousClass000.A0s("egl14Context");
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                    } else {
                        A01("eglCreateContext");
                        throw AnonymousClass8BR.A0w("Failed to create EGL context");
                    }
                } else {
                    A01("eglChooseConfig");
                    throw AnonymousClass8BR.A0w("Unable to find any matching EGL config");
                }
            } else {
                A01("eglInitialize");
                throw AnonymousClass8BR.A0w("Unable to initialize EGL14");
            }
        } else {
            throw AnonymousClass8BR.A0w("Unable to get EGL14 display");
        }
    }

    public static void A01(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C17900vP.A0i(": glError ", AnonymousClass000.A11(str), glGetError);
            } else {
                return;
            }
        }
    }
}
