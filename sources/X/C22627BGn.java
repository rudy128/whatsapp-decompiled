package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;

/* renamed from: X.BGn  reason: case insensitive filesystem */
public abstract class C22627BGn extends ReplacementSpan implements Drawable.Callback {
    public View A00;
    public C18090vk A01;
    public final Resources A02;
    public final E4Q A03;
    public final C22626BGm A04;

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C18070vi.A0d(canvas, 0);
        Paint paint2 = paint;
        C18070vi.A0d(paint2, 8);
        this.A04.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C18070vi.A0d(paint, 0);
        return this.A04.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C18070vi.A0d(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C18070vi.A0d(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.removeCallbacks(runnable);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        View view = this.A00;
        if (view != null) {
            view.invalidate();
        }
    }

    public C22627BGn(Resources resources, C22626BGm bGm, E4Q e4q) {
        this.A02 = resources;
        this.A03 = e4q;
        this.A04 = bGm;
        ((Drawable) e4q).setCallback(this);
    }
}
