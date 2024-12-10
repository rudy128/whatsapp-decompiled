package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: X.1Z0  reason: invalid class name */
public abstract class AnonymousClass1Z0 {
    public static final Matrix A01 = new Matrix();
    public final Matrix A00 = new Matrix();

    public void A00(Canvas canvas, Matrix matrix, AnonymousClass1Z1 r23, int i) {
        int[] iArr;
        int i2;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        AnonymousClass1Z1 r4 = r23;
        int i3 = i;
        if (this instanceof AnonymousClass25Z) {
            AnonymousClass25Z r8 = (AnonymousClass25Z) this;
            AnonymousClass25Y r11 = r8.A02;
            float f = r11.A01;
            float f2 = r8.A01;
            float f3 = r11.A00;
            float f4 = r8.A00;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
            Matrix matrix3 = r8.A00;
            matrix3.set(matrix2);
            matrix3.preTranslate(f4, f2);
            matrix3.preRotate((float) Math.toDegrees(Math.atan((double) ((r11.A01 - f2) / (r11.A00 - f4)))));
            rectF.bottom += (float) i3;
            rectF.offset(0.0f, (float) (-i3));
            int[] iArr2 = AnonymousClass1Z1.A0B;
            iArr2[0] = r4.A00;
            iArr2[1] = r4.A01;
            iArr2[2] = r4.A02;
            Paint paint = r4.A04;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr2, AnonymousClass1Z1.A09, Shader.TileMode.CLAMP));
            canvas2.save();
            canvas2.concat(matrix3);
            canvas2.drawRect(rectF, paint);
        } else if (this instanceof AnonymousClass25X) {
            AnonymousClass25W r2 = ((AnonymousClass25X) this).A00;
            RectF rectF2 = AnonymousClass25W.A06;
            float f6 = r2.A03;
            float f7 = r2.A04;
            RectF rectF3 = new RectF(r2.A01, r2.A05, r2.A02, r2.A00);
            boolean z = false;
            if (f7 < 0.0f) {
                z = true;
            }
            Path path = r4.A07;
            if (z) {
                iArr = AnonymousClass1Z1.A0A;
                iArr[0] = 0;
                iArr[1] = r4.A00;
                iArr[2] = r4.A01;
                i2 = r4.A02;
            } else {
                path.rewind();
                path.moveTo(rectF3.centerX(), rectF3.centerY());
                path.arcTo(rectF3, f6, f7);
                path.close();
                float f8 = (float) (-i3);
                rectF3.inset(f8, f8);
                iArr = AnonymousClass1Z1.A0A;
                iArr[0] = 0;
                iArr[1] = r4.A02;
                iArr[2] = r4.A01;
                i2 = r4.A00;
            }
            iArr[3] = i2;
            float width = rectF3.width() / 2.0f;
            if (width > 0.0f) {
                float f9 = 1.0f - (((float) i3) / width);
                float[] fArr = AnonymousClass1Z1.A08;
                fArr[1] = f9;
                fArr[2] = ((1.0f - f9) / 2.0f) + f9;
                RadialGradient radialGradient = new RadialGradient(rectF3.centerX(), rectF3.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint2 = r4.A03;
                paint2.setShader(radialGradient);
                canvas2.save();
                canvas2.concat(matrix2);
                canvas2.scale(1.0f, rectF3.height() / rectF3.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, r4.A06);
                }
                canvas2.drawArc(rectF3, f6, f7, true, paint2);
            } else {
                return;
            }
        } else {
            C448525a r82 = (C448525a) this;
            for (AnonymousClass1Z0 A002 : r82.A02) {
                A002.A00(canvas2, r82.A00, r4, i3);
            }
            return;
        }
        canvas2.restore();
    }
}
