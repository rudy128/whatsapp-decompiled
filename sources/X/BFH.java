package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public class BFH extends Drawable implements Runnable, Drawable.Callback, C28432E0y, C28433E0z {
    public static final Matrix A07 = C108945cZ.A0J();
    public float A00;
    public int A01;
    public Drawable A02;
    public C28433E0z A03;
    public boolean A04;
    public boolean A05;
    public final CSM A06 = new CSM();

    public void run() {
        this.A05 = false;
        this.A00 += (float) ((int) ((20.0f / ((float) this.A01)) * 360.0f));
        invalidateSelf();
    }

    public BFH(Drawable drawable) {
        C28432E0y e0y;
        this.A02 = drawable;
        drawable.setCallback(this);
        if ((drawable instanceof C28432E0y) && (e0y = (C28432E0y) drawable) != null) {
            ((BFH) e0y).A03 = this;
        }
        this.A00 = 0.0f;
        this.A05 = false;
        this.A01 = 850;
        this.A04 = true;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.A02;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    public boolean isStateful() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void setAlpha(int i) {
        this.A06.A00 = i;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        CSM csm = this.A06;
        csm.A03 = colorFilter;
        csm.A04 = AnonymousClass000.A1W(colorFilter);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.A06.A01 = z ? 1 : 0;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.A06.A02 = z ? 1 : 0;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.A00;
        if (!this.A04) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (i2 + (i3 / 2)), (float) (i5 + (i6 / 2)));
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restoreToCount(save);
        if (!this.A05) {
            this.A05 = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A02;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
