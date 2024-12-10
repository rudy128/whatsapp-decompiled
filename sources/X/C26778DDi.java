package X;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DDi  reason: case insensitive filesystem */
public final class C26778DDi implements EAJ {
    public C26140Ct3 A00;
    public boolean A01;
    public final C26140Ct3 A02;
    public final C25083CWt A03;
    public final C25998CqE A04;
    public final C25517ChF A05;
    public final C28495E4a A06;
    public final C25084CWu A07;
    public final CNL A08;

    public C26140Ct3 BR4() {
        C26140Ct3 ct3 = this.A02;
        if (0 == (ct3.A00 & 32)) {
            return ct3;
        }
        C26140Ct3 ct32 = this.A00;
        if (ct32 != null) {
            return ct32;
        }
        C25517ChF chF = this.A05;
        C9S c9s = C25517ChF.A02;
        Object obj = C25675Ck6.A05;
        Map map = chF.A00;
        C26140Ct3 A012 = C26076Crq.A01(BE8.A0e(c9s, obj, map), AnonymousClass8BU.A03(C26159CtX.A00(C25517ChF.A07, map)));
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
        A012.A05(ct3, 5);
        this.A00 = A012;
        return A012;
    }

    public C26140Ct3 BR3() {
        return this.A02;
    }

    public C25998CqE BXf() {
        return this.A04;
    }

    public C25084CWu BY7() {
        return this.A07;
    }

    public CNL BZy() {
        return this.A08;
    }

    public C28495E4a BaJ() {
        return this.A06;
    }

    public void Big() {
        if (!this.A01) {
            this.A03.A00();
        }
    }

    public void release() {
        if (!this.A01) {
            this.A01 = true;
            C25084CWu cWu = this.A07;
            C25588CiS ciS = cWu.A02;
            if (ciS != null) {
                Map map = ciS.A04;
                Iterator A0l = C17890vO.A0l(map);
                while (A0l.hasNext()) {
                    ((C25739Cl9) A0l.next()).A02();
                }
                map.clear();
            }
            HashMap hashMap = cWu.A03;
            Iterator A0i = C17890vO.A0i(hashMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                ((E98) A16.getValue()).BIY();
                ((E98) A16.getValue()).release();
            }
            hashMap.clear();
            cWu.A00 = null;
            C26140Ct3 ct3 = this.A02;
            synchronized (ct3.A07) {
                EGLDisplay eGLDisplay = ct3.A04;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    BE7.A15(eGLDisplay);
                }
            }
            C25083CWt cWt = this.A03;
            EGLSurface eGLSurface = cWt.A00;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(cWt.A01.A04, eGLSurface);
            }
            cWt.A00 = EGL14.EGL_NO_SURFACE;
            ct3.A03();
            C26140Ct3 ct32 = this.A00;
            if (ct32 != null) {
                ct32.A03();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.E4a, java.lang.Object] */
    public C26778DDi(Context context, C26140Ct3 ct3, C26140Ct3 ct32, C25517ChF chF, C26045Cr9 cr9) {
        C25083CWt cWt;
        this.A05 = chF;
        this.A02 = ct3;
        int i = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A03, AnonymousClass000.A0h(), chF.A00)) ? 37 : 5;
        if (ct32 != null) {
            int i2 = ct32.A00;
            int i3 = i2 & 256;
            int i4 = i3 != 0 ? i | 256 : i;
            if ((i2 & 32) != 0) {
                i4 |= 32;
                if ((i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i4 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                } else if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                    i4 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                } else if ((i2 & 512) != 0) {
                    i4 |= 512;
                } else if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    i4 |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                } else if (i3 != 0) {
                    i4 |= 256;
                }
                if ((i2 & DefaultCrypto.BUFFER_SIZE) != 0) {
                    i4 |= DefaultCrypto.BUFFER_SIZE;
                }
            }
            ct3.A05(ct32, i4);
        } else {
            ct3.A04(EGL14.EGL_NO_CONTEXT, i);
        }
        this.A04 = new C25998CqE(context.getResources());
        synchronized (ct3.A07) {
            cWt = new C25083CWt(ct3);
            C26140Ct3 ct33 = cWt.A01;
            cWt.A00 = EGL14.eglCreatePbufferSurface(ct33.A04, ct33.A02, new int[]{12375, 8, 12374, 8, 12344}, 0);
            C26058CrU.A02("eglCreatePbufferSurface");
            if (cWt.A00 == null) {
                throw BE6.A0m();
            }
        }
        this.A03 = cWt;
        cWt.A00();
        this.A06 = new Object();
        C25084CWu cWu = new C25084CWu(chF, cr9);
        this.A07 = cWu;
        this.A08 = new CNL(this);
        cWu.A00 = this;
    }

    public void finish() {
        GLES20.glFinish();
    }

    public void flush() {
        GLES20.glFlush();
    }
}
