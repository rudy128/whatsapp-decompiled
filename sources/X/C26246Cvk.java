package X;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: X.Cvk  reason: case insensitive filesystem */
public abstract class C26246Cvk {
    public String A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final CWX A09;
    public final float[] A0A;
    public final float[] A0B;

    public static void A03(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = (float) i;
        float f7 = (float) i2;
        float f8 = f6 / f7;
        float f9 = (float) i3;
        float f10 = (float) i4;
        float f11 = f9 / f10;
        if (i < i2) {
            f2 = f8;
            f = 1.0f;
        } else {
            f = f7 / f6;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = f11;
            f3 = 1.0f;
        } else {
            f3 = f10 / f9;
            f4 = 1.0f;
        }
        if (f8 < f11) {
            f5 = f2 / f4;
        } else {
            f5 = f / f3;
        }
        Matrix.scaleM(fArr, 0, f5, f5, 1.0f);
    }

    public CWX A06() {
        if (this.A01) {
            this.A01 = false;
            A08(this.A09, this.A0B, this.A0A, this.A06, this.A05, this.A03, this.A02, this.A04, this.A07, this.A08);
        }
        return this.A09;
    }

    public abstract void A08(CWX cwx, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    public static void A00(CWX cwx, int i, int i2, int i3, int i4, int i5, int i6) {
        cwx.A01 = i5;
        cwx.A00 = i6;
        float f = (float) i5;
        float f2 = (float) i6;
        float[] fArr = cwx.A02;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, ((float) (((i * 2) + i3) - i5)) / f, ((float) (((i2 * 2) + i4) - i6)) / f2, 0.0f);
        Matrix.scaleM(fArr, 0, (1.0f * ((float) i3)) / f, (1.0f * ((float) i4)) / f2, 1.0f);
    }

    public static void A01(CWX cwx, float[] fArr) {
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        System.arraycopy(fArr, 0, cwx.A03, 0, 16);
    }

    public static void A02(float[] fArr, int i) {
        if (i != 0) {
            Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, -1.0f);
        }
    }

    public static void A04(float[] fArr, boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!z2) {
                f = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        }
    }

    public static void A05(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, 16);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
    }

    public void A07(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (i != this.A06 || i2 != this.A05 || i3 != this.A03 || i4 != this.A02 || i5 != this.A04 || z != this.A07 || z2 != this.A08) {
            this.A06 = i;
            this.A05 = i2;
            this.A03 = i3;
            this.A02 = i4;
            this.A04 = i5;
            this.A07 = z;
            this.A08 = z2;
            this.A01 = true;
        }
    }

    public void A09(float[] fArr) {
        float[] fArr2 = this.A0B;
        if (!Arrays.equals(fArr2, fArr)) {
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            this.A01 = true;
        }
    }

    public C26246Cvk() {
        float[] fArr = new float[16];
        this.A0B = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        CWX cwx = new CWX();
        this.A09 = cwx;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        System.arraycopy(fArr, 0, cwx.A03, 0, 16);
        System.arraycopy(fArr2, 0, cwx.A02, 0, 16);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BaseScaleType{");
        String str = this.A00;
        if (str == null) {
            str = Arrays.toString(Arrays.copyOfRange(Thread.currentThread().getStackTrace(), 4, 15));
        }
        A10.append(str);
        A10.append(", mBaseMatrix=");
        A10.append(Arrays.toString(this.A0B));
        A10.append(", mBaseContentMatrix=");
        A10.append(Arrays.toString(this.A0A));
        A10.append(", mViewport=");
        A10.append(this.A09);
        A10.append(", mSrcWidth=");
        A10.append(this.A06);
        A10.append(", mSrcHeight=");
        A10.append(this.A05);
        A10.append(", mDstWidth=");
        A10.append(this.A03);
        A10.append(", mDstHeight=");
        A10.append(this.A02);
        A10.append(", mOrientation=");
        A10.append(this.A04);
        A10.append(", mFlipX=");
        A10.append(this.A07);
        A10.append(", mFlipY=");
        A10.append(this.A08);
        return C17890vO.A0b(A10);
    }
}
