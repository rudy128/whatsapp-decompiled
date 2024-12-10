package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Ct3  reason: case insensitive filesystem */
public class C26140Ct3 {
    public int A00 = 0;
    public int A01;
    public EGLConfig A02;
    public EGLContext A03 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A04 = EGL14.EGL_NO_DISPLAY;
    public C5D A05;
    public final int A06;
    public final Object A07;
    public final Map A08 = C17880vN.A11();

    public static EGLConfig A00(EGLDisplay eGLDisplay, int[] iArr, int i) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        C26058CrU.A02("eglChooseConfig");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("unable to find EGL config with flags = ");
        A10.append(i);
        throw new GLException(-1, AnonymousClass000.A0y(", no GL Errors", A10));
    }

    public static EGLConfig A01(C26140Ct3 ct3, int i) {
        char c;
        int i2;
        C26140Ct3 ct32 = ct3;
        Map map = ct32.A08;
        int i3 = i;
        Integer valueOf = Integer.valueOf(i3);
        if (map.containsKey(valueOf)) {
            return (EGLConfig) map.get(valueOf);
        }
        int i4 = 4;
        if ((i & 2) != 0) {
            i4 = 68;
        }
        int i5 = 0;
        if ((i3 & 4) != 0) {
            i5 = 16;
        }
        int i6 = i3 & 32;
        int i7 = 8;
        int i8 = 8;
        if (i6 != 0) {
            i7 = 2;
            i8 = 10;
        }
        if ((i3 & 8) != 0) {
            i7 = 0;
        }
        int[] iArr = {12324, i8, 12323, i8, 12322, i8, 12321, i7, 12325, i5, 12352, i4, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344};
        if ((i3 & 1) != 0) {
            iArr[20] = 12610;
            iArr[21] = 1;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            iArr[16] = 12338;
            iArr[17] = 1;
            iArr[18] = 12337;
            iArr[19] = 4;
        }
        if ((i3 & 64) != 0) {
            iArr[14] = 12339;
            iArr[15] = 1;
        }
        if ((i3 & 128) != 0) {
            iArr[14] = 12339;
            iArr[15] = 4;
        }
        if (i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                iArr[12] = 12327;
                c = 13;
                i2 = -1;
            } else if ((i3 & 512) != 0) {
                iArr[12] = 12327;
                c = 13;
                i2 = 12368;
            } else if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                iArr[12] = 12327;
                c = 13;
                i2 = 12369;
            } else if ((i3 & 256) != 0) {
                iArr[12] = 12327;
                iArr[13] = 12344;
            }
            iArr[c] = i2;
        }
        try {
            EGLConfig A002 = A00(ct32.A04, iArr, i3);
            if (!(i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
                int[] iArr2 = new int[1];
                EGL14.eglGetConfigAttrib(ct32.A04, A002, 12327, iArr2, 0);
                iArr[12] = 12327;
                iArr[13] = iArr2[0];
                A002 = A00(ct32.A04, iArr, i3);
            }
            map.put(valueOf, A002);
            return A002;
        } catch (GLException e) {
            if (i9 != 0) {
                iArr[16] = 12344;
                iArr[17] = 0;
                iArr[18] = 12344;
                iArr[19] = 0;
                EGLConfig A003 = A00(ct32.A04, iArr, i3);
                map.put(valueOf, A003);
                return A003;
            }
            throw e;
        }
    }

    public void A03() {
        synchronized (this.A07) {
            if (this.A04 != EGL14.EGL_NO_DISPLAY) {
                EGLContext eGLContext = this.A03;
                if (eGLContext == EGL14.EGL_NO_CONTEXT || !eGLContext.equals(EGL14.eglGetCurrentContext())) {
                    EGL14.eglDestroyContext(this.A04, this.A03);
                } else {
                    EGLDisplay eGLDisplay = this.A04;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        BE7.A15(eGLDisplay);
                    }
                    EGL14.eglDestroyContext(this.A04, this.A03);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.A04);
                }
            }
            this.A04 = EGL14.EGL_NO_DISPLAY;
            this.A03 = EGL14.EGL_NO_CONTEXT;
            this.A02 = null;
            this.A08.clear();
            this.A00 = 0;
            C5D c5d = this.A05;
            if (c5d != null) {
                C25533ChV chV = C25533ChV.A02;
                synchronized (chV) {
                    chV.A01.remove(c5d);
                }
                C5D c5d2 = this.A05;
                List list = c5d2.A00;
                list.remove(BE8.A0Z(this));
                if (list.isEmpty()) {
                    c5d2.A01.clear();
                }
                list.isEmpty();
            }
            this.A05 = null;
        }
    }

    public void A04(EGLContext eGLContext, int i) {
        Throwable th;
        String str;
        synchronized (this.A07) {
            this.A00 = i;
            this.A04 = EGL14.eglGetDisplay(0);
            C26058CrU.A02("eglGetDisplay");
            EGLDisplay eGLDisplay = this.A04;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig A012 = A01(this, i);
                    this.A02 = A012;
                    int i2 = this.A06;
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.A04, A012, eGLContext, new int[]{12440, i2, 12344}, 0);
                    this.A03 = eglCreateContext;
                    if (i2 == 3 && (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288)) {
                        this.A03 = EGL14.eglCreateContext(this.A04, this.A02, eGLContext, new int[]{12440, 2, 12344}, 0);
                        str = "eglCreateContext Version 2 fallback";
                    } else {
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, i2, 0);
                        str = String.format((Locale) null, "eglCreateContext Version %d", objArr);
                    }
                    C26058CrU.A02(str);
                    if (this.A03 != null) {
                        C25533ChV chV = C25533ChV.A02;
                        C5D c5d = this.A05;
                        synchronized (chV) {
                            if (c5d != null) {
                                try {
                                    chV.A01.add(c5d);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                        int[] iArr2 = new int[1];
                        EGL14.eglQueryContext(this.A04, this.A03, 12440, iArr2, 0);
                        this.A01 = iArr2[0];
                    } else {
                        th = BE6.A0m();
                    }
                } else {
                    C26058CrU.A02("eglInitialize");
                    th = new GLException(-1, "unable to initialize EGL14, no GL Errors");
                }
            } else {
                th = BE6.A0k();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.C5D, java.lang.Object] */
    public void A05(C26140Ct3 ct3, int i) {
        this.A05 = ct3.A05;
        A04(ct3.A03, i);
        C5D c5d = this.A05;
        if (c5d != null) {
            BE7.A11(hashCode(), c5d.A00);
            return;
        }
        ? obj = new Object();
        obj.A01 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        obj.A00 = A13;
        C17890vO.A1D(A13, hashCode());
        this.A05 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.C5D, java.lang.Object] */
    public C26140Ct3(Object obj, int i) {
        this.A07 = obj;
        ? obj2 = new Object();
        obj2.A01 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        obj2.A00 = A13;
        C17890vO.A1D(A13, hashCode());
        this.A05 = obj2;
        this.A06 = i;
    }

    public static EGLSurface A02(EGLConfig eGLConfig, Surface surface, C26140Ct3 ct3) {
        int[] A1X = BE6.A1X();
        A1X[0] = 12344;
        int i = ct3.A00;
        if (!((i & 32) == 0 || (i & DefaultCrypto.BUFFER_SIZE) == 0 || EGL14.eglQueryString(ct3.A04, 12373) == null || !EGL14.eglQueryString(ct3.A04, 12373).contains("KHR_gl_colorspace") || EGL14.eglQueryString(ct3.A04, 12373) == null || !EGL14.eglQueryString(ct3.A04, 12373).contains("EXT_gl_colorspace_bt2020"))) {
            A1X = new int[]{12445, 13632, 12344};
        }
        if (surface.isValid()) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(ct3.A04, eGLConfig, surface, A1X, 0);
            C26058CrU.A02("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw BE6.A0m();
        }
        throw new C27216DZt(-1, "Surface is invalid while createWindowSurface");
    }
}
