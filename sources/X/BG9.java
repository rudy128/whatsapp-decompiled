package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;

public class BG9 extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public C27083DTi A01;
    public BHD A02;
    public Error A03;
    public RuntimeException A04;

    public BG9() {
        super("dummySurface");
    }

    public boolean handleMessage(Message message) {
        DZX dzx;
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        C27083DTi dTi;
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                int i2 = message2.arg1;
                C26056CrS.A01(this.A01);
                C27083DTi dTi2 = this.A01;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] A1W = C108945cZ.A1W();
                    if (EGL14.eglInitialize(eglGetDisplay, A1W, 0, A1W, 1)) {
                        dTi2.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr3 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C27083DTi.A06, 0, eGLConfigArr, 0, 1, iArr3, 0);
                        if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            Object[] A1a = AnonymousClass8BR.A1a();
                            AnonymousClass8BR.A1L(A1a, 0, eglChooseConfig);
                            C17880vN.A1T(A1a, iArr3[0], 1);
                            A1a[2] = eGLConfigArr[0];
                            dzx = new DZX(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", A1a));
                        } else {
                            EGLDisplay eGLDisplay = dTi2.A02;
                            if (i2 == 0) {
                                iArr = new int[]{12440, 2, 12344};
                            } else {
                                iArr = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                            if (eglCreateContext != null) {
                                dTi2.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay2 = dTi2.A02;
                                if (i2 == 1) {
                                    eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    if (i2 == 2) {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                    } else {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                    }
                                    eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                    if (eglCreatePbufferSurface == null) {
                                        dzx = new DZX("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    dTi2.A03 = eglCreatePbufferSurface;
                                    int[] iArr4 = dTi2.A05;
                                    GLES20.glGenTextures(1, iArr4, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr4[0]);
                                        dTi2.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(dTi2);
                                        SurfaceTexture surfaceTexture2 = this.A01.A00;
                                        C26056CrS.A01(surfaceTexture2);
                                        this.A02 = new BHD(surfaceTexture2, this);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    BE9.A1J("glGenTextures failed. Error: ", A10, glGetError);
                                    dzx = new DZX(A10.toString());
                                } else {
                                    dzx = new DZX("eglMakeCurrent failed");
                                }
                            } else {
                                dzx = new DZX("eglCreateContext failed");
                            }
                        }
                    } else {
                        dzx = new DZX("eglInitialize failed");
                    }
                } else {
                    dzx = new DZX("eglGetDisplay failed");
                }
                throw dzx;
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                C26056CrS.A01(this.A01);
                dTi = this.A01;
                dTi.A04.removeCallbacks(dTi);
                SurfaceTexture surfaceTexture3 = dTi.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, dTi.A05, 0);
                }
                EGLSurface eGLSurface = dTi.A03;
                if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(dTi.A02, dTi.A03);
                }
                EGLContext eGLContext = dTi.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(dTi.A02, eGLContext);
                }
                dTi.A02 = null;
                dTi.A01 = null;
                dTi.A03 = null;
                dTi.A00 = null;
            } catch (Throwable th3) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th3);
                } catch (Throwable th4) {
                    quit();
                    throw th4;
                }
            }
            quit();
            return true;
        }
        return true;
    }
}
