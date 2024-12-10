package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.0WS  reason: invalid class name */
public final class AnonymousClass0WS implements C17040te {
    public Matrix A00;
    public RectF A01;
    public float[] A02;
    public final Path A03;

    public static AnonymousClass0WS A00() {
        return new AnonymousClass0WS(new Path());
    }

    public void A01(AnonymousClass0NU r6) {
        float f = r6.A01;
        if (!Float.isNaN(f)) {
            float f2 = r6.A03;
            if (!Float.isNaN(f2)) {
                float f3 = r6.A02;
                if (!Float.isNaN(f3)) {
                    float f4 = r6.A00;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.A01;
                        if (rectF == null) {
                            rectF = new RectF();
                            this.A01 = rectF;
                        }
                        C18070vi.A0b(rectF);
                        rectF.set(f, f2, f3, f4);
                        Path path = this.A03;
                        RectF rectF2 = this.A01;
                        C18070vi.A0b(rectF2);
                        path.addRect(rectF2, Path.Direction.CCW);
                        return;
                    }
                    throw AnonymousClass000.A0n("Rect.bottom is NaN");
                }
                throw AnonymousClass000.A0n("Rect.right is NaN");
            }
            throw AnonymousClass000.A0n("Rect.top is NaN");
        }
        throw AnonymousClass000.A0n("Rect.left is NaN");
    }

    public void BBh(AnonymousClass0NJ r6) {
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        C18070vi.A0b(rectF);
        rectF.set(r6.A01, r6.A03, r6.A02, r6.A00);
        float[] fArr = this.A02;
        if (fArr == null) {
            fArr = new float[8];
            this.A02 = fArr;
        }
        C18070vi.A0b(fArr);
        long j = r6.A06;
        long j2 = C04140Lz.A00;
        fArr[0] = AnonymousClass000.A03(j);
        fArr[1] = AnonymousClass001.A01(j);
        long j3 = r6.A07;
        fArr[2] = AnonymousClass000.A03(j3);
        fArr[3] = AnonymousClass001.A01(j3);
        long j4 = r6.A05;
        fArr[4] = AnonymousClass000.A03(j4);
        fArr[5] = AnonymousClass001.A01(j4);
        long j5 = r6.A04;
        fArr[6] = AnonymousClass000.A03(j5);
        fArr[7] = AnonymousClass001.A01(j5);
        Path path = this.A03;
        RectF rectF2 = this.A01;
        C18070vi.A0b(rectF2);
        float[] fArr2 = this.A02;
        C18070vi.A0b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public AnonymousClass0WS(Path path) {
        this.A03 = path;
    }

    public AnonymousClass0WS() {
        this(new Path());
    }
}
