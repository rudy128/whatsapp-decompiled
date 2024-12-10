package X;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* renamed from: X.0WR  reason: invalid class name */
public final class AnonymousClass0WR implements C16790tE {
    public int A00 = 3;
    public Paint A01 = new Paint(7);
    public Shader A02;
    public AnonymousClass0HD A03;

    public void CHo(float f) {
        this.A01.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public void CI6(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            Paint paint = this.A01;
            if (Build.VERSION.SDK_INT >= 29) {
                C02560Em.A00(i, paint);
            } else {
                paint.setXfermode(new PorterDuffXfermode(AnonymousClass0LI.A01(i)));
            }
        }
    }

    public void CIO(long j) {
        this.A01.setColor(AnonymousClass0Oy.A00(j));
    }

    public void CKv(int i) {
        Paint.Join join;
        Paint paint = this.A01;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = Paint.Join.ROUND;
        }
        paint.setStrokeJoin(join);
    }
}
