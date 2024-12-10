package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Log;

/* renamed from: X.CYg  reason: case insensitive filesystem */
public final class C25111CYg {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02 = EGL14.EGL_NO_DISPLAY;

    public C25111CYg() {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        this.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A02 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLContext eGLContext2 = this.A01;
                if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                    int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12352, 4, 12344, 0, 12344};
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.A02, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("unable to find RGB8888 / ");
                        A10.append(2);
                        Log.w("MsqrdEglCore", AnonymousClass000.A0y(" EGLConfig", A10));
                    } else {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.A00 = eGLConfig;
                                this.A01 = eGLContext2;
                            } else {
                                StringBuilder A11 = AnonymousClass000.A11("eglCreateContext");
                                BE9.A1J(": EGL error: 0x", A11, eglGetError);
                                throw BE8.A0f(A11);
                            }
                        }
                    }
                    throw AnonymousClass8BR.A0w("Unable to find a suitable EGLConfig");
                }
                int[] iArr3 = new int[1];
                EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr3, 0);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("EGLContext created, client version ");
                Log.i("MsqrdEglCore", C17880vN.A0t(A102, iArr3[0]));
                return;
            }
            this.A02 = null;
            throw AnonymousClass8BR.A0w("unable to initialize EGL14");
        }
        throw AnonymousClass8BR.A0w("unable to get EGL14 display");
    }

    public void A00() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            BE7.A15(eGLDisplay);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void finalize() {
        if (this.A02 != EGL14.EGL_NO_DISPLAY) {
            Log.w("MsqrdEglCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
            A00();
        }
    }
}
