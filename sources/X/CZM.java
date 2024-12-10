package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class CZM {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public C26146CtA A04 = null;
    public C26146CtA A05 = null;
    public C26146CtA[] A06 = new C26146CtA[4];
    public Paint A07 = C108945cZ.A0K(2);
    public final Rect A08 = AnonymousClass3MW.A07();
    public final RectF A09 = AnonymousClass3MW.A08();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap bitmap;
        Bitmap A022;
        C26146CtA ctA = this.A05;
        Bitmap bitmap2 = null;
        if (ctA != null) {
            bitmap = ctA.A02();
        } else {
            bitmap = null;
        }
        Bitmap bitmap3 = C26146CtA.A0F;
        if (bitmap != bitmap3) {
            Canvas canvas2 = canvas;
            float f3 = f;
            float f4 = f2;
            if (AnonymousClass000.A1W(bitmap)) {
                Paint paint = this.A07;
                paint.setAlpha(255);
                canvas2.drawBitmap(bitmap, f3, f4, paint);
                return;
            }
            Paint paint2 = this.A07;
            paint2.setAlpha(255);
            C26146CtA[] ctAArr = this.A06;
            int i = 0;
            int i2 = 0;
            do {
                C26146CtA ctA2 = ctAArr[i];
                if (!(ctA2 == null || ctA2.A04 != this.A02 + 1 || ctAArr[i].A02() == null)) {
                    i2++;
                }
                i++;
            } while (i < 4);
            C26146CtA ctA3 = this.A04;
            if (ctA3 != null) {
                bitmap2 = ctA3.A02();
            }
            if (i2 != 4) {
                if (!(bitmap2 == null || bitmap2 == bitmap3)) {
                    int i3 = this.A02;
                    C26146CtA ctA4 = this.A04;
                    int i4 = i3 - ctA4.A04;
                    int i5 = 1 << i4;
                    int i6 = ctA4.A00 >> i4;
                    int i7 = (this.A00 & (i5 - 1)) * i6;
                    int i8 = ((i5 - 1) & this.A01) * i6;
                    Rect rect = this.A08;
                    rect.set(i7, i8, i7 + i6, i6 + i8);
                    RectF rectF = this.A09;
                    C26146CtA ctA5 = this.A04;
                    rectF.set(f3, f4, ((float) ctA5.A01) + f, ((float) ctA5.A00) + f2);
                    canvas2.drawBitmap(bitmap2, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i9 = 0;
            do {
                int i10 = 0;
                do {
                    C26146CtA ctA6 = ctAArr[(i9 << 1) + i10];
                    if (!(ctA6 == null || ctA6.A04 != this.A02 + 1 || (A022 = ctA6.A02()) == null || A022 == bitmap3)) {
                        int i11 = ctA6.A00;
                        int i12 = i11 >> 1;
                        float f5 = ((float) (i12 * i9)) + f;
                        float f6 = ((float) (i12 * i10)) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, ctA6.A01, i11);
                        RectF rectF2 = this.A09;
                        float f7 = (float) i12;
                        rectF2.set(f5, f6, f7 + f5, f7 + f6);
                        canvas2.drawBitmap(A022, rect2, rectF2, paint2);
                    }
                    i10++;
                } while (i10 < 2);
                i9++;
            } while (i9 < 2);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{tile=");
        Object obj = this.A05;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        A10.append(obj);
        A10.append(", mParentTile=");
        Object obj3 = this.A04;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A10.append(obj2);
        A10.append(", status=");
        A10.append(this.A03);
        return AnonymousClass000.A0y("}", A10);
    }
}
