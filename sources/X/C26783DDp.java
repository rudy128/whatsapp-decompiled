package X;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;

/* renamed from: X.DDp  reason: case insensitive filesystem */
public class C26783DDp implements E98, E8l, C28496E4b {
    public int A00;
    public int A01;
    public int A02;
    public RectF A03;
    public C28497E4c A04;
    public boolean A05;
    public EAJ A06;
    public final CJJ A07 = new CJJ(this);
    public final C25745ClF A08;
    public final DE1 A09;
    public final DE0 A0A;
    public final C26246Cvk A0B;
    public final boolean A0C;
    public final float[] A0D = new float[16];

    public void Bd8(C26045Cr9 cr9) {
    }

    public CWX A00() {
        int i;
        DE1 de1;
        boolean z;
        boolean z2;
        C26246Cvk cvk;
        boolean A1O = AnonymousClass000.A1O(this.A02 % 180);
        C25745ClF clF = this.A08;
        CRD crd = clF.A02;
        int i2 = crd.A02;
        int i3 = crd.A01;
        int i4 = this.A01;
        if (i4 <= 0 || (i = this.A00) <= 0) {
            i4 = i2;
            i = i3;
            if (A1O) {
                i4 = i3;
                i = i2;
            }
        }
        if (this.A0C) {
            float[] fArr = this.A0D;
            clF.A02(fArr);
            cvk = this.A0B;
            cvk.A09(fArr);
            de1 = this.A09;
            de1.A00(fArr);
            int i5 = i3;
            if (!A1O) {
                i5 = i2;
                i2 = i3;
            }
            cvk.A07(i5, i2, i4, i, 0, false, false);
        } else {
            de1 = this.A09;
            de1.A00(this.A0D);
            int i6 = this.A02;
            if (A1O) {
                z = this.A05;
                z2 = false;
            } else {
                z = false;
                z2 = this.A05;
            }
            cvk = this.A0B;
            cvk.A07(i2, i3, i4, i, i6, z, z2);
        }
        CWX A062 = cvk.A06();
        de1.A05 = A062;
        RectF rectF = this.A03;
        if (rectF == null) {
            return A062;
        }
        float f = (float) A062.A01;
        int A042 = BE6.A04(f, rectF.left);
        int A043 = BE6.A04((float) A062.A00, rectF.top);
        int A044 = BE6.A04(f, rectF.width());
        int A045 = BE6.A04((float) A062.A00, this.A03.height());
        DE0 de0 = this.A0A;
        de0.A00(A042, A043, A044, A045);
        return de0.Bbf();
    }

    public void BCi(EAJ eaj) {
        CZB czb;
        this.A06 = eaj;
        C25745ClF clF = this.A08;
        CJJ cjj = this.A07;
        C18070vi.A0d(cjj, 0);
        clF.A01 = cjj;
        if (clF.A0A) {
            C25008CTi cTi = new C25008CTi("SharedTextureVideoInputForBitmap");
            cTi.A02 = 3553;
            czb = new CZB(cTi);
        } else {
            C25008CTi cTi2 = new C25008CTi("SharedTextureVideoInput");
            cTi2.A02 = 36197;
            czb = new CZB(cTi2);
            SurfaceTexture surfaceTexture = new SurfaceTexture(czb.A00);
            CRD crd = clF.A02;
            surfaceTexture.setDefaultBufferSize(crd.A02, crd.A01);
            clF.A00 = surfaceTexture;
        }
        clF.A03 = czb;
        CRD crd2 = clF.A02;
        czb.A00(crd2.A02, crd2.A01);
        clF.A04.countDown();
    }

    public void BIY() {
        C25745ClF clF = this.A08;
        clF.A01();
        clF.A01 = null;
        this.A06 = null;
    }

    public EA3 BRy() {
        long j;
        long j2;
        DE1 de1 = this.A09;
        de1.A06 = false;
        C25745ClF clF = this.A08;
        synchronized (clF.A08) {
            SurfaceTexture surfaceTexture = clF.A00;
            if (surfaceTexture != null && clF.A09) {
                synchronized (clF.A07) {
                    surfaceTexture.updateTexImage();
                }
            }
        }
        BVt bVt = clF.A06;
        CZB czb = clF.A03;
        float[] fArr = bVt.A00;
        clF.A02(fArr);
        C24764CJc cJc = clF.A05;
        synchronized (cJc) {
            j = cJc.A00;
        }
        bVt.A01 = czb;
        bVt.A04 = fArr;
        float[] fArr2 = C25599Cie.A06;
        bVt.A05 = fArr2;
        bVt.A03 = fArr2;
        bVt.A02 = fArr2;
        bVt.A00 = j;
        if (czb != null) {
            de1.A04 = czb;
            synchronized (cJc) {
                j2 = cJc.A00;
            }
            de1.A03 = j2;
            de1.A00 = clF.A02.A00;
            A00();
            if (this.A03 != null) {
                return this.A0A;
            }
            return de1;
        }
        throw AnonymousClass000.A0n("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public int BT4() {
        return this.A08.A02.A00;
    }

    public CWX CQm(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i3;
        this.A00 = i4;
        CWX A002 = A00();
        C28111Yx.A02(A002);
        return A002;
    }

    public void release() {
        this.A08.A01();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DE1, java.lang.Object, X.EA3] */
    @Deprecated
    public C26783DDp(C25745ClF clF, boolean z) {
        this.A08 = clF;
        ? obj = new Object();
        this.A09 = obj;
        DE0 de0 = new DE0();
        this.A0A = de0;
        de0.A00 = obj;
        this.A0B = new BUV();
        this.A0C = z;
    }

    public void CJe(C28497E4c e4c) {
        this.A04 = e4c;
    }
}
