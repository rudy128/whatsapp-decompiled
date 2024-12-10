package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.69a  reason: invalid class name */
public abstract class AnonymousClass69a extends C1409773u {
    public static void A02(RectF rectF, int i) {
        if (i < 0) {
            float width = rectF.width() / rectF.height();
            rectF.set(rectF.centerX() - ((C1409773u.A07 * width) / 2.0f), rectF.centerY() - (C1409773u.A07 / 2.0f), rectF.centerX() + ((C1409773u.A07 * width) / 2.0f), rectF.centerY() + (C1409773u.A07 / 2.0f));
        }
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f2;
        float f6 = f;
        RectF rectF2 = rectF;
        C18070vi.A0d(rectF, 0);
        float A0a = A0a();
        float f7 = f3;
        float f8 = f4;
        if (A0a == 0.0f) {
            super.A0O(rectF2, f6, f5, f7, f8);
            return;
        }
        float f9 = f3 - f;
        float f10 = f4 - f2;
        if (f9 / f10 < A0a) {
            f10 = f9 / A0a;
        } else {
            f9 = f10 * A0a;
        }
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = f9 / 2.0f;
        float f14 = f10 / 2.0f;
        super.A0O(rectF, f11 - f13, f12 - f14, f11 + f13, f12 + f14);
    }

    public float A0a() {
        float f;
        float f2;
        int intrinsicHeight;
        float f3;
        if (this instanceof AnonymousClass69N) {
            Drawable drawable = ((AnonymousClass69N) this).A00;
            if (drawable == null) {
                return 0.0f;
            }
            if (drawable instanceof C109515dZ) {
                Rect bounds = drawable.getBounds();
                C18070vi.A0X(bounds);
                f = (float) bounds.right;
                intrinsicHeight = bounds.bottom;
            } else {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                f = (float) bitmap.getWidth();
                intrinsicHeight = bitmap.getHeight();
            }
        } else if (this instanceof AnonymousClass69K) {
            AnonymousClass69K r3 = (AnonymousClass69K) this;
            Bitmap bitmap2 = r3.A01;
            float f4 = 1.0f;
            if (bitmap2 != null) {
                f3 = (float) bitmap2.getWidth();
            } else {
                f3 = 1.0f;
            }
            Bitmap bitmap3 = r3.A01;
            if (bitmap3 != null) {
                f4 = (float) bitmap3.getHeight();
            }
            return f3 / f4;
        } else if (this instanceof AnonymousClass69M) {
            Drawable drawable2 = ((AnonymousClass69M) this).A00;
            if (drawable2 == null) {
                return 0.0f;
            }
            f = (float) drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        } else {
            f = ((AnonymousClass69L) this).A00;
            f2 = 116.0f;
            return f / f2;
        }
        f2 = (float) intrinsicHeight;
        return f / f2;
    }
}
