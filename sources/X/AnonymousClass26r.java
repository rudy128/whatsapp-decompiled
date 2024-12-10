package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.26r  reason: invalid class name */
public final class AnonymousClass26r extends Drawable implements Drawable.Callback {
    public float A00 = 1.0f;
    public final Drawable A01;
    public final Rect A02 = new Rect();

    public AnonymousClass26r(Drawable drawable) {
        C18070vi.A0d(drawable, 1);
        this.A01 = drawable;
        drawable.setCallback(this);
    }

    public static Drawable A00(AnonymousClass26r r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A01;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        int A012 = C22339B3q.A01(((float) rect.width()) * this.A00);
        int A013 = C22339B3q.A01(((float) rect.height()) * this.A00);
        Rect rect2 = this.A02;
        Gravity.apply(17, A012, A013, rect, rect2, getLayoutDirection());
        this.A01.setBounds(rect2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C18070vi.A0d(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C18070vi.A0d(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public boolean canApplyTheme() {
        return this.A01.canApplyTheme();
    }

    public void clearColorFilter() {
        this.A01.clearColorFilter();
    }

    public int getAlpha() {
        return this.A01.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.A01.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A01.getConstantState();
    }

    public Drawable getCurrent() {
        Drawable current = this.A01.getCurrent();
        C18070vi.A0X(current);
        return current;
    }

    public int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    public int getMinimumHeight() {
        return this.A01.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A01.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A01.getOpacity();
    }

    public Insets getOpticalInsets() {
        Insets opticalInsets = this.A01.getOpticalInsets();
        C18070vi.A0X(opticalInsets);
        return opticalInsets;
    }

    public int[] getState() {
        int[] state = this.A01.getState();
        C18070vi.A0X(state);
        return state;
    }

    public Region getTransparentRegion() {
        return this.A01.getTransparentRegion();
    }

    public boolean hasFocusStateSpecified() {
        return this.A01.hasFocusStateSpecified();
    }

    public void invalidateSelf() {
        this.A01.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.A01.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return this.A01.isFilterBitmap();
    }

    public boolean isProjected() {
        return this.A01.isProjected();
    }

    public boolean isStateful() {
        return this.A01.isStateful();
    }

    public void jumpToCurrentState() {
        this.A01.jumpToCurrentState();
    }

    public Drawable mutate() {
        this.A01.mutate();
        Drawable mutate = super.mutate();
        C18070vi.A0X(mutate);
        return mutate;
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.A01.onLayoutDirectionChanged(i);
    }

    public boolean onLevelChange(int i) {
        return this.A01.setLevel(i);
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.A01.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.A01.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A01.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A01.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C27831Xu.A0B(this.A01, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C27831Xu.A0F(this.A01, i, i2, i3, i4);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.A01.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        C27831Xu.A04(colorStateList, this.A01);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C27831Xu.A08(mode, this.A01);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.A01.setVisible(z, z2);
    }

    public void applyTheme(Resources.Theme theme) {
        A00(this, theme).applyTheme(theme);
    }

    public void draw(Canvas canvas) {
        A00(this, canvas).draw(canvas);
    }

    public void getHotspotBounds(Rect rect) {
        A00(this, rect).getHotspotBounds(rect);
    }

    public void getOutline(Outline outline) {
        A00(this, outline).getOutline(outline);
    }

    public boolean getPadding(Rect rect) {
        return A00(this, rect).getPadding(rect);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C18070vi.A0n(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean onStateChange(int[] iArr) {
        boolean state = A00(this, iArr).setState(iArr);
        if (state) {
            Rect bounds = getBounds();
            C18070vi.A0X(bounds);
            onBoundsChange(bounds);
        }
        return state;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        A00(this, runnable).scheduleSelf(runnable, j);
    }

    public boolean setState(int[] iArr) {
        return A00(this, iArr).setState(iArr);
    }

    public void unscheduleSelf(Runnable runnable) {
        A00(this, runnable).unscheduleSelf(runnable);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        C18070vi.A0n(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet);
    }
}
