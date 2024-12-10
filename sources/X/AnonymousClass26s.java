package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.26s  reason: invalid class name */
public class AnonymousClass26s extends Drawable implements Drawable.Callback, AnonymousClass3LV, C24271Jn {
    public static Method A06;
    public static final PorterDuff.Mode A07 = PorterDuff.Mode.SRC_IN;
    public Drawable A00;
    public AnonymousClass26i A01;
    public int A02;
    public PorterDuff.Mode A03;
    public boolean A04;
    public boolean A05;

    public static void A00() {
        if (A06 == null) {
            try {
                A06 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public boolean A02() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.A00;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final void CLU(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A00 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            AnonymousClass26i r1 = this.A01;
            if (r1 != null) {
                r1.A03 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public Drawable.ConstantState getConstantState() {
        AnonymousClass26i r1 = this.A01;
        if (r1 == null || r1.A03 == null) {
            return null;
        }
        r1.A00 = getChangingConfigurations();
        return this.A01;
    }

    public Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public Rect getDirtyBounds() {
        return this.A00.getDirtyBounds();
    }

    public int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C27831Xu.A00(this.A00);
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

    public void getOutline(Outline outline) {
        this.A00.getOutline(outline);
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

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.A00;
        if (!(drawable == null || (method = A06) == null)) {
            try {
                return AnonymousClass000.A1Y(method.invoke(drawable, new Object[0]));
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.A05 && super.mutate() == this) {
            this.A01 = new AnonymousClass26i(this.A01);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.mutate();
            }
            AnonymousClass26i r1 = this.A01;
            if (r1 != null) {
                Drawable drawable2 = this.A00;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                r1.A03 = constantState;
            }
            this.A05 = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C27831Xu.A0G(i, this.A00);
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
        this.A00.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A00.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        boolean state = this.A00.setState(iArr);
        if (!A01(iArr) && !state) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    private boolean A01(int[] iArr) {
        if (A02()) {
            AnonymousClass26i r0 = this.A01;
            ColorStateList colorStateList = r0.A01;
            PorterDuff.Mode mode = r0.A02;
            if (colorStateList == null || mode == null) {
                this.A04 = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!(this.A04 && colorForState == this.A02 && mode == this.A03)) {
                    setColorFilter(colorForState, mode);
                    this.A02 = colorForState;
                    this.A03 = mode;
                    this.A04 = true;
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable Bbv() {
        return this.A00;
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        AnonymousClass26i r0 = this.A01;
        if (r0 != null) {
            i = r0.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.A00.getChangingConfigurations();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        AnonymousClass26i r0;
        ColorStateList colorStateList;
        if ((!A02() || (r0 = this.A01) == null || (colorStateList = r0.A01) == null || !colorStateList.isStateful()) && !this.A00.isStateful()) {
            return false;
        }
        return true;
    }

    public void setTint(int i) {
        if (A02()) {
            setTintList(ColorStateList.valueOf(i));
        } else {
            this.A00.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (A02()) {
            this.A01.A01 = colorStateList;
            A01(this.A00.getState());
            return;
        }
        this.A00.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            this.A01.A02 = mode;
            A01(this.A00.getState());
            return;
        }
        this.A00.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.A00.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
