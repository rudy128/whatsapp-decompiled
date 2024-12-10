package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

public class BGA extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public BHC A01;
    public C27084DTj A02;
    public Error A03;
    public RuntimeException A04;

    public BGA() {
        super("DummySurface");
    }

    public boolean handleMessage(Message message) {
        Throwable th;
        EGLConfig eGLConfig;
        C27084DTj dTj;
        int i = message.what;
        if (i == 1) {
            try {
                C221718w.A00(this.A02);
                C27084DTj dTj2 = this.A02;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] A1W = C108945cZ.A1W();
                    if (EGL14.eglInitialize(eglGetDisplay, A1W, 0, A1W, 1)) {
                        dTj2.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C27084DTj.A06, 0, eGLConfigArr, 0, 1, iArr, 0);
                        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            Locale locale = Locale.ROOT;
                            Object[] A1a = AnonymousClass8BR.A1a();
                            AnonymousClass8BR.A1L(A1a, 0, eglChooseConfig);
                            C17880vN.A1T(A1a, iArr[0], 1);
                            A1a[2] = eGLConfigArr[0];
                            th = new C27209DZj(String.format(locale, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", A1a));
                        } else {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(dTj2.A02, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            if (eglCreateContext != null) {
                                dTj2.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay = dTj2.A02;
                                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eglCreatePbufferSurface == null) {
                                    th = new C27209DZj("eglCreatePbufferSurface failed");
                                } else if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    dTj2.A03 = eglCreatePbufferSurface;
                                    int[] iArr2 = dTj2.A05;
                                    GLES20.glGenTextures(1, iArr2, 0);
                                    int i2 = 0;
                                    while (true) {
                                        int glGetError = GLES20.glGetError();
                                        if (glGetError == 0) {
                                            break;
                                        }
                                        i2 = glGetError;
                                    }
                                    if (i2 == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr2[0]);
                                        dTj2.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(dTj2);
                                        SurfaceTexture surfaceTexture2 = this.A02.A00;
                                        C221718w.A00(surfaceTexture2);
                                        this.A01 = new BHC(surfaceTexture2, this);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("glError ");
                                    th = BE9.A0n(GLU.gluErrorString(i2), A10);
                                } else {
                                    th = new C27209DZj("eglMakeCurrent failed");
                                }
                            } else {
                                th = new C27209DZj("eglCreateContext failed");
                            }
                        }
                    } else {
                        th = new C27209DZj("eglInitialize failed");
                    }
                } else {
                    th = new C27209DZj("eglGetDisplay failed");
                }
                throw th;
            } catch (RuntimeException e) {
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                C221718w.A00(this.A02);
                dTj = this.A02;
                dTj.A04.removeCallbacks(dTj);
                SurfaceTexture surfaceTexture3 = dTj.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, dTj.A05, 0);
                }
                EGLDisplay eGLDisplay2 = dTj.A02;
                if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                    BE7.A15(dTj.A02);
                }
                EGLSurface eGLSurface = dTj.A03;
                if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(dTj.A02, dTj.A03);
                }
                EGLContext eGLContext = dTj.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(dTj.A02, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = dTj.A02;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(dTj.A02);
                }
                dTj.A02 = null;
                dTj.A01 = null;
                dTj.A03 = null;
                dTj.A00 = null;
            } catch (Throwable unused) {
            }
            quit();
            return true;
        }
        return true;
    }
}
