package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Z5  reason: invalid class name */
public class AnonymousClass1Z5 {
    @Deprecated
    public float A00;
    @Deprecated
    public float A01;
    @Deprecated
    public float A02;
    @Deprecated
    public float A03;
    @Deprecated
    public float A04;
    @Deprecated
    public float A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();

    /* JADX WARNING: type inference failed for: r2v0, types: [X.25V, X.25W] */
    public static void A00(AnonymousClass1Z5 r4, float f) {
        float f2 = r4.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = r4.A02;
                float f5 = r4.A03;
                ? r2 = new AnonymousClass25V();
                r2.A01 = f4;
                r2.A05 = f5;
                r2.A02 = f4;
                r2.A00 = f5;
                r2.A03 = r4.A00;
                r2.A04 = f3;
                r4.A07.add(new AnonymousClass25X(r2));
                r4.A00 = f;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.25V, java.lang.Object, X.25Y] */
    public void A01(float f, float f2) {
        ? r2 = new AnonymousClass25V();
        r2.A00 = f;
        r2.A01 = f2;
        this.A06.add(r2);
        AnonymousClass25Z r4 = new AnonymousClass25Z(r2, this.A02, this.A03);
        AnonymousClass25Y r1 = r4.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((double) ((r1.A01 - r4.A01) / (r1.A00 - r4.A00))))) + 270.0f;
        A00(this, degrees);
        this.A07.add(r4);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    public void A02(float f, float f2, float f3, float f4) {
        this.A04 = f;
        this.A05 = f2;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = (f3 + f4) % 360.0f;
        this.A06.clear();
        this.A07.clear();
    }

    public void A03(Matrix matrix, Path path) {
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass25V r8 = (AnonymousClass25V) list.get(i);
            if (r8 instanceof AnonymousClass25Y) {
                AnonymousClass25Y r82 = (AnonymousClass25Y) r8;
                Matrix matrix2 = r82.A00;
                matrix.invert(matrix2);
                path.transform(matrix2);
                path.lineTo(r82.A00, r82.A01);
            } else {
                AnonymousClass25W r83 = (AnonymousClass25W) r8;
                Matrix matrix3 = r83.A00;
                matrix.invert(matrix3);
                path.transform(matrix3);
                RectF rectF = AnonymousClass25W.A06;
                rectF.set(r83.A01, r83.A05, r83.A02, r83.A00);
                path.arcTo(rectF, r83.A03, r83.A04, false);
            }
            path.transform(matrix);
        }
    }

    public AnonymousClass1Z5() {
        A02(0.0f, 0.0f, 270.0f, 0.0f);
    }
}
