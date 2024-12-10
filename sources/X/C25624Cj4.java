package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cj4  reason: case insensitive filesystem */
public class C25624Cj4 {
    public int A00;
    public long A01 = 0;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public C24802CKv A05;
    public C25752ClM A06;
    public C24995CSv A07;
    public C25000CTa A08;
    public C24460C5a A09;
    public C26343Cy2 A0A;
    public List A0B;
    public int A0C = 0;
    public final List A0D = AnonymousClass000.A13();
    public final float[] A0E = new float[16];
    public final C25998CqE A0F;

    public static void A00(CZA cza, C25624Cj4 cj4, long j) {
        long j2;
        int i = cza.A03.A00;
        C25000CTa cTa = cj4.A08;
        C26159CtX.A01(cTa);
        C26058CrU.A03("onDrawFrame start", new Object[0]);
        C25752ClM clM = cTa.A02;
        GLES20.glViewport(0, 0, clM.A0A, clM.A08);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        C25710Ckg A012 = cTa.A01.A01();
        A012.A02("uSTMatrix", cTa.A05);
        A012.A02("uConstMatrix", cTa.A03);
        A012.A02("uContentTransform", cTa.A04);
        C25739Cl9.A00(cTa.A00, A012.A00);
        C26058CrU.A01("drawFrame here");
        GLES20.glBindTexture(3553, -1);
        GLES20.glFinish();
        C24802CKv cKv = cj4.A05;
        C26159CtX.A01(cKv);
        if (cKv.A00) {
            j2 = TimeUnit.MICROSECONDS.toNanos(j);
        } else {
            int i2 = cj4.A0C;
            cj4.A0C = i2 + 1;
            j2 = ((long) i2) * 50000 * 1000;
        }
        C24460C5a c5a = cj4.A09;
        C26159CtX.A01(c5a);
        EGLExt.eglPresentationTimeANDROID(c5a.A02, c5a.A03, j2);
        C24460C5a c5a2 = cj4.A09;
        C26159CtX.A01(c5a2);
        EGL14.eglSwapBuffers(c5a2.A02, c5a2.A03);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.C5a, java.lang.Object] */
    public C25624Cj4(Surface surface, C25998CqE cqE, C25752ClM clM) {
        this.A0F = cqE;
        this.A06 = clM;
        this.A05 = clM.A0D;
        this.A0B = AnonymousClass000.A13();
        ? obj = new Object();
        obj.A02 = EGL14.EGL_NO_DISPLAY;
        obj.A01 = EGL14.EGL_NO_CONTEXT;
        obj.A03 = EGL14.EGL_NO_SURFACE;
        obj.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        obj.A02 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] A1W = C108945cZ.A1W();
            if (EGL14.eglInitialize(eglGetDisplay, A1W, 0, A1W, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(obj.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    obj.A01 = EGL14.eglCreateContext(obj.A02, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    C26058CrU.A02("eglCreateContext");
                    if (obj.A01 != null) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        obj.A00 = eGLConfig;
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(obj.A02, eGLConfig, surface, new int[]{12344}, 0);
                        C26058CrU.A02("eglCreateWindowSurface");
                        if (eglCreateWindowSurface != null) {
                            obj.A03 = eglCreateWindowSurface;
                            this.A09 = obj;
                            if (obj.A02 == EGL14.EGL_NO_DISPLAY) {
                                Log.d("EglCore", "NOTE: makeCurrent w/o display");
                            }
                            EGLDisplay eGLDisplay = obj.A02;
                            EGLSurface eGLSurface = obj.A03;
                            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, obj.A01)) {
                                int[] iArr = new int[1];
                                GLES20.glGenTextures(1, iArr, 0);
                                C26058CrU.A01("glGenTextures");
                                int i = iArr[0];
                                GLES20.glBindTexture(36197, i);
                                C26058CrU.A01(AnonymousClass001.A1I("glBindTexture ", AnonymousClass000.A10(), i));
                                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                BEA.A0z();
                                C26058CrU.A01("glTexParameter");
                                this.A00 = i;
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                this.A02 = surfaceTexture;
                                this.A0A = new C26343Cy2(surfaceTexture);
                                HandlerThread handlerThread = new HandlerThread("videotranscoder-framecallback-boomerang", -19);
                                this.A03 = handlerThread;
                                handlerThread.start();
                                SurfaceTexture surfaceTexture2 = this.A02;
                                C26343Cy2 cy2 = this.A0A;
                                HandlerThread handlerThread2 = this.A03;
                                C26159CtX.A01(handlerThread2);
                                Looper looper = handlerThread2.getLooper();
                                C26159CtX.A01(looper);
                                surfaceTexture2.setOnFrameAvailableListener(cy2, new Handler(looper));
                                this.A04 = new Surface(this.A02);
                                this.A07 = new C24995CSv(cqE);
                                this.A08 = new C25000CTa(cqE, clM);
                                return;
                            }
                            throw AnonymousClass8BR.A0w("eglMakeCurrent failed");
                        }
                        throw AnonymousClass8BR.A0w("surface was null");
                    }
                    throw AnonymousClass8BR.A0w("null context");
                }
                throw AnonymousClass8BR.A0w("unable to find RGB888+recordable ES2 EGL config");
            }
            throw AnonymousClass8BR.A0w("unable to initialize EGL14");
        }
        throw AnonymousClass8BR.A0w("unable to get EGL14 display");
    }
}
