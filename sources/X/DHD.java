package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DHD implements EAZ {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public C25739Cl9 A03;
    public CZB A04;
    public C25092CXd A05;
    public C25752ClM A06;
    public CZT A07;
    public boolean A08;
    public final C25998CqE A09;
    public final C25599Cie A0A;
    public final List A0B;
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final EGLContext A0G;
    public final EGLDisplay A0H;
    public final EGLSurface A0I;
    public final CPT A0J = C25326CdX.A00();

    public void BB7(MediaEffect mediaEffect) {
    }

    public void BBq(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bd6() {
        /*
            r6 = this;
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r1, r1, r1, r0)
            X.CXd r0 = r6.A05
            if (r0 == 0) goto L_0x001e
            int r2 = r0.A02
            r0 = 6
            if (r2 == r0) goto L_0x0012
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x0012:
            X.CZT r1 = r6.A07
            boolean r0 = r1 instanceof X.BWA
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1 instanceof X.BWB
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r6.A00 = r2
        L_0x001e:
            int r1 = r6.A00
            r0 = 6
            if (r1 != r0) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            r0 = 7
            if (r1 != r0) goto L_0x0052
            X.CqE r5 = r6.A09     // Catch:{ Exception -> 0x0043 }
            r1 = 2132017239(0x7f140057, float:1.967275E38)
            r0 = 2132017234(0x7f140052, float:1.967274E38)
            X.Cl9 r0 = X.C25998CqE.A00(r5, r1, r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0040
        L_0x0034:
            X.CqE r5 = r6.A09     // Catch:{ Exception -> 0x0043 }
            r1 = 2132017239(0x7f140057, float:1.967275E38)
            r0 = 2132017236(0x7f140054, float:1.9672745E38)
            X.Cl9 r0 = X.C25998CqE.A00(r5, r1, r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0040:
            r6.A03 = r0     // Catch:{ Exception -> 0x0043 }
            goto L_0x0060
        L_0x0043:
            X.CqE r5 = r6.A09
            r1 = 2132017238(0x7f140056, float:1.9672749E38)
            r0 = 2132017235(0x7f140053, float:1.9672743E38)
            X.Cl9 r0 = X.C25998CqE.A00(r5, r1, r0)
            r6.A03 = r0
            goto L_0x0060
        L_0x0052:
            X.CqE r5 = r6.A09
            r1 = 2132017238(0x7f140056, float:1.9672749E38)
            r0 = 2132017235(0x7f140053, float:1.9672743E38)
            X.Cl9 r0 = X.C25998CqE.A00(r5, r1, r0)
            r6.A03 = r0
        L_0x0060:
            java.util.List r3 = r6.A0B
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "SimpleFrameRenderer"
            X.CTi r2 = new X.CTi
            r2.<init>(r0)
            android.util.SparseIntArray r0 = r2.A08
            X.BEB.A0p(r0)
            boolean r1 = r6.A08
            r0 = 36197(0x8d65, float:5.0723E-41)
            if (r1 == 0) goto L_0x007d
            r0 = 3553(0xde1, float:4.979E-42)
        L_0x007d:
            r2.A02 = r0
            X.CZB r0 = new X.CZB
            r0.<init>(r2)
            r6.A04 = r0
            java.util.Iterator r4 = r3.iterator()
        L_0x008a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r2 = r4.next()
            X.E9y r2 = (X.C28607E9y) r2
            boolean r0 = r2 instanceof X.DGS
            if (r0 == 0) goto L_0x00a1
            r1 = r2
            X.DGS r1 = (X.DGS) r1
            int r0 = r6.A00
            r1.A00 = r0
        L_0x00a1:
            r2.C84(r5)
            X.ClM r0 = r6.A06
            int r1 = r0.A0A
            int r0 = r0.A08
            r2.C83(r1, r0)
            goto L_0x008a
        L_0x00ae:
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "video texture"
            X.C26058CrU.A03(r0, r1)
            goto L_0x00dd
        L_0x00b8:
            r2 = 1
            int[] r1 = new int[r2]
            r0 = 0
            android.opengl.GLES20.glGenTextures(r2, r1, r0)
            r0 = r1[r0]
            r6.A01 = r0
            r2 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r2, r0)
            java.lang.String r0 = "glBindTexture mTextureID"
            X.C26058CrU.A01(r0)
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)
            X.BEA.A0z()
            java.lang.String r0 = "glTexParameter"
            X.C26058CrU.A01(r0)
        L_0x00dd:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00f7
            X.CZB r2 = r6.A04
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r0 = 0
            X.C26171Ctn.A03(r1, r0)
            int r1 = r2.A00
        L_0x00ef:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r6.A02 = r0
            return
        L_0x00f7:
            int r1 = r6.A01
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHD.Bd6():void");
    }

    public void Bzo() {
    }

    public void Bzp() {
    }

    public void CEe(MediaEffect mediaEffect) {
    }

    public void CJq(Surface surface) {
    }

    public /* synthetic */ void cancel() {
    }

    public void flush() {
    }

    public void BJ2(long j) {
        EGLDisplay eGLDisplay = this.A0H;
        EGLSurface eGLSurface = this.A0I;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    public void CQV(int i, Bitmap bitmap) {
        int i2;
        CAD.A00(this.A0C, (float) this.A06.A06);
        if (!this.A0B.isEmpty()) {
            CZB czb = this.A04;
            C26171Ctn.A03(AnonymousClass000.A1W(czb), (String) null);
            i2 = czb.A00;
        } else {
            i2 = this.A01;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public void release() {
        for (C28607E9y C85 : this.A0B) {
            C85.C85();
        }
    }

    public DHD(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C25998CqE cqE, C25092CXd cXd, C25752ClM clM, C26052CrM crM, CZT czt) {
        float[] fArr = new float[16];
        this.A0E = fArr;
        float[] fArr2 = new float[16];
        this.A0C = fArr2;
        float[] fArr3 = new float[16];
        this.A0F = fArr3;
        float[] fArr4 = new float[16];
        this.A0D = fArr4;
        this.A0A = new C25599Cie();
        this.A01 = -12345;
        this.A00 = 0;
        C26159CtX.A01(cqE);
        this.A09 = cqE;
        this.A06 = clM;
        this.A0G = eGLContext;
        this.A0H = eGLDisplay;
        this.A0I = eGLSurface;
        boolean z = clM.A0J;
        this.A08 = z;
        if (z) {
            List list = clM.A0H;
            if (list == null) {
                list = AnonymousClass000.A13();
                clM.A0H = list;
            }
            if (list.isEmpty()) {
                clM.A0H.add(new DGS(false));
            }
        }
        List list2 = this.A06.A0H;
        this.A0B = list2 == null ? Collections.emptyList() : list2;
        this.A07 = czt;
        this.A05 = cXd;
        if (cXd == null && crM != null) {
            HashMap A062 = crM.A06(C24322BzJ.VIDEO);
            C26159CtX.A01(A062);
            File file = BE9.A0Q(((C25833Cmm) C17890vO.A0P(C17890vO.A0i(A062))).A04).A05;
            C26171Ctn.A02(file);
            this.A05 = C25872Cng.A01(context, Uri.fromFile(file).toString());
        }
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        C25326CdX.A01(clM, fArr2, fArr4);
    }

    public void BJS(long j) {
        C26058CrU.A03("onDrawFrame start", BE6.A1Z());
        List<C28607E9y> list = this.A0B;
        if (!list.isEmpty()) {
            C26171Ctn.A03(AnonymousClass000.A1W(this.A04), (String) null);
            SurfaceTexture surfaceTexture = this.A02;
            float[] fArr = this.A0E;
            surfaceTexture.getTransformMatrix(fArr);
            if (this.A08) {
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            }
            for (C28607E9y BsM : list) {
                long micros = TimeUnit.NANOSECONDS.toMicros(j);
                C25599Cie cie = this.A0A;
                CZB czb = this.A04;
                float[] fArr2 = this.A0C;
                float[] fArr3 = this.A0F;
                float[] fArr4 = this.A0D;
                cie.A01 = czb;
                cie.A04 = fArr;
                cie.A05 = fArr2;
                cie.A03 = fArr3;
                cie.A02 = fArr4;
                cie.A00 = j;
                BsM.BsM(cie, micros);
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = this.A02;
        float[] fArr5 = this.A0E;
        surfaceTexture2.getTransformMatrix(fArr5);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.A01);
        C25710Ckg A012 = this.A03.A01();
        A012.A02("uSTMatrix", fArr5);
        A012.A02("uConstMatrix", this.A0C);
        A012.A02("uSceneMatrix", this.A0F);
        A012.A02("uContentTransform", this.A0D);
        C25739Cl9.A00(this.A0J, A012.A00);
        GLES20.glFinish();
    }

    public SurfaceTexture BT6(int i) {
        return this.A02;
    }
}
