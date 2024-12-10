package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: X.0WO  reason: invalid class name */
public final class AnonymousClass0WO implements C16960tV {
    public Canvas A00 = AnonymousClass0M0.A00;
    public Rect A01;
    public Rect A02;

    public /* synthetic */ void BF1(AnonymousClass0NU r7) {
        BF0(r7.A01, r7.A03, r7.A02, r7.A00, 1);
    }

    public void BFU(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                if (fArr[(i * 4) + i2] == f) {
                    i2++;
                } else {
                    Matrix matrix = new Matrix();
                    AnonymousClass0LJ.A00(matrix, fArr);
                    this.A00.concat(matrix);
                    return;
                }
            } while (i2 < 4);
        }
    }

    public void BJN(C16790tE r10, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, false, ((AnonymousClass0WR) r10).A01);
    }

    public void BEz(C17040te r4) {
        Canvas canvas = this.A00;
        if (r4 instanceof AnonymousClass0WS) {
            canvas.clipPath(((AnonymousClass0WS) r4).A03, Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void BF0(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.A00;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    public void BIk() {
        C02970Gc.A00(this.A00, false);
    }

    public void BJP(C16790tE r5, float f, long j) {
        this.A00.drawCircle(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j), f, ((AnonymousClass0WR) r5).A01);
    }

    public void BJV(C16980tX r6, C16790tE r7, long j) {
        Canvas canvas = this.A00;
        if (r6 instanceof AnonymousClass0WQ) {
            canvas.drawBitmap(((AnonymousClass0WQ) r6).A00, AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j), ((AnonymousClass0WR) r7).A01);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public void BJX(C16980tX r21, C16790tE r22, long j, long j2, long j3, long j4) {
        C16790tE r13 = r22;
        C16980tX r1 = r21;
        if (this.A02 == null) {
            this.A02 = new Rect();
            this.A01 = new Rect();
        }
        Canvas canvas = this.A00;
        if (r1 instanceof AnonymousClass0WQ) {
            Bitmap bitmap = ((AnonymousClass0WQ) r1).A00;
            Rect rect = this.A02;
            C18070vi.A0b(rect);
            int i = (int) (j >> 32);
            rect.left = i;
            int i2 = (int) (j & 4294967295L);
            rect.top = i2;
            rect.right = i + ((int) (j2 >> 32));
            rect.bottom = i2 + ((int) (j2 & 4294967295L));
            Rect rect2 = this.A01;
            C18070vi.A0b(rect2);
            int i3 = (int) (j3 >> 32);
            rect2.left = i3;
            int i4 = (int) (j3 & 4294967295L);
            rect2.top = i4;
            rect2.right = i3 + ((int) (j4 >> 32));
            rect2.bottom = i4 + ((int) (j4 & 4294967295L));
            canvas.drawBitmap(bitmap, rect, rect2, ((AnonymousClass0WR) r13).A01);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public void BJc(C16790tE r7, long j, long j2) {
        this.A00.drawLine(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j), AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(j2), ((AnonymousClass0WR) r7).A01);
    }

    public void BJd(C16790tE r4, C17040te r5) {
        Canvas canvas = this.A00;
        if (r5 instanceof AnonymousClass0WS) {
            canvas.drawPath(((AnonymousClass0WS) r5).A03, ((AnonymousClass0WR) r4).A01);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void BJg(C16790tE r7, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, ((AnonymousClass0WR) r7).A01);
    }

    public void BJj(C16790tE r9, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, ((AnonymousClass0WR) r9).A01);
    }

    public void BJz() {
        C02970Gc.A00(this.A00, true);
    }

    public void CFz() {
        this.A00.restore();
    }

    public void CG7(float f) {
        this.A00.rotate(f);
    }

    public void CGe() {
        this.A00.save();
    }

    public void CGr(float f, float f2) {
        this.A00.scale(f, f2);
    }

    public void CPp(float f, float f2) {
        this.A00.translate(f, f2);
    }
}
