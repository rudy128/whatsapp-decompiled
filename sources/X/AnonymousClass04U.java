package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.04U  reason: invalid class name */
public class AnonymousClass04U extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public boolean A01;

    public void A00(float f, float f2) {
        C27831Xu.A0A(this.A00, f, f2);
    }

    public void A01(int i, int i2, int i3, int i4) {
        C27831Xu.A0E(this.A00, i, i2, i3, i4);
    }

    public void draw(Canvas canvas) {
        if (this.A01) {
            this.A00.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.A00.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A00.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A00.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A00.getPadding(rect);
    }

    public int[] getState() {
        return this.A00.getState();
    }

    public Region getTransparentRegion() {
        return this.A00.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.A00.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.A00.isStateful();
    }

    public void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.A00.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.A00.setLevel(i);
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.A00.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.A00.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A00.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A00.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        if (this.A01) {
            A00(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.A01) {
            A01(i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.A01) {
            return this.A00.setState(iArr);
        }
        return false;
    }

    public void setTint(int i) {
        C27831Xu.A0C(this.A00, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C27831Xu.A03(colorStateList, this.A00);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C27831Xu.A07(mode, this.A00);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!this.A01) {
            return false;
        }
        if (super.setVisible(z, z2) || this.A00.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
