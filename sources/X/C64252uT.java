package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.2uT  reason: invalid class name and case insensitive filesystem */
public class C64252uT implements Drawable.Callback {
    public final /* synthetic */ C454028v A00;

    public C64252uT(C454028v r1) {
        this.A00 = r1;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.A00.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
