package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: X.28z  reason: invalid class name and case insensitive filesystem */
public class C454428z extends AnonymousClass2S6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    /* JADX WARNING: type inference failed for: r3v3, types: [X.28y, X.28x] */
    public C454428z(AnonymousClass00P r7, C454428z r8) {
        C454328y r3;
        this.A0B = new Matrix();
        this.A0C = AnonymousClass000.A13();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix matrix = new Matrix();
        this.A0A = matrix;
        this.A08 = null;
        this.A02 = r8.A02;
        this.A00 = r8.A00;
        this.A01 = r8.A01;
        this.A03 = r8.A03;
        this.A04 = r8.A04;
        this.A05 = r8.A05;
        this.A06 = r8.A06;
        this.A09 = r8.A09;
        String str = r8.A08;
        this.A08 = str;
        this.A07 = r8.A07;
        if (str != null) {
            r7.put(str, this);
        }
        matrix.set(r8.A0A);
        ArrayList arrayList = r8.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C454428z) {
                this.A0C.add(new C454428z(r7, (C454428z) obj));
            } else {
                if (obj instanceof C454228x) {
                    C454228x r4 = (C454228x) obj;
                    ? r32 = new C454328y(r4);
                    r32.A03 = 0.0f;
                    r32.A01 = 1.0f;
                    r32.A00 = 1.0f;
                    r32.A06 = 0.0f;
                    r32.A04 = 1.0f;
                    r32.A05 = 0.0f;
                    r32.A07 = Paint.Cap.BUTT;
                    r32.A08 = Paint.Join.MITER;
                    r32.A02 = 4.0f;
                    r32.A0B = r4.A0B;
                    r32.A0A = r4.A0A;
                    r32.A03 = r4.A03;
                    r32.A01 = r4.A01;
                    r32.A09 = r4.A09;
                    r32.A01 = r4.A01;
                    r32.A00 = r4.A00;
                    r32.A06 = r4.A06;
                    r32.A04 = r4.A04;
                    r32.A05 = r4.A05;
                    r32.A07 = r4.A07;
                    r32.A08 = r4.A08;
                    r32.A02 = r4.A02;
                    r3 = r32;
                } else if (obj instanceof C454128w) {
                    r3 = new C454328y((C454328y) obj);
                } else {
                    throw AnonymousClass000.A0n("Unknown object in the tree!");
                }
                this.A0C.add(r3);
                String str2 = r3.A02;
                if (str2 != null) {
                    r7.put(str2, r3);
                }
            }
        }
    }

    public static void A00(C454428z r4) {
        Matrix matrix = r4.A0A;
        matrix.reset();
        matrix.postTranslate(-r4.A00, -r4.A01);
        matrix.postScale(r4.A03, r4.A04);
        matrix.postRotate(r4.A02, 0.0f, 0.0f);
        matrix.postTranslate(r4.A05 + r4.A00, r4.A06 + r4.A01);
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public C454428z() {
        this.A0B = new Matrix();
        this.A0C = AnonymousClass000.A13();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
    }
}
