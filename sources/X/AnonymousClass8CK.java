package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.8CK  reason: invalid class name */
public final class AnonymousClass8CK extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public AnonymousClass8CK(Context context) {
        C18070vi.A0d(context, 1);
        Drawable A002 = C24261Jm.A00(context, 2131231210);
        if (A002 != null) {
            this.A03 = A002;
            A002.setCallback(this);
            Drawable A003 = C24261Jm.A00(context, 2131231209);
            if (A003 != null) {
                this.A02 = A003;
                A003.setCallback(this);
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C18070vi.A0d(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C18070vi.A0d(runnable, 1);
        unscheduleSelf(runnable);
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public static final void A00(AnonymousClass8CK r6) {
        Rect bounds = r6.getBounds();
        C18070vi.A0X(bounds);
        r6.A03.setBounds(bounds);
        Drawable drawable = r6.A02;
        int i = bounds.left + r6.A01;
        drawable.setBounds(i, bounds.top, i + r6.A00, bounds.bottom);
        r6.invalidateSelf();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00(this);
    }
}
