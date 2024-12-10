package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.04V  reason: invalid class name */
public abstract class AnonymousClass04V extends Drawable implements Drawable.Callback {
    public int A00 = -1;
    public Drawable A01;
    public AnonymousClass04Q A02;
    public int A03 = 255;
    public long A04;
    public long A05;
    public Rect A06;
    public Drawable A07;
    public AnonymousClass0R3 A08;
    public Runnable A09;
    public boolean A0A;
    public boolean A0B;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r14) {
        /*
            r13 = this;
            r8 = 1
            r13.A0A = r8
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r9 = r13.A01
            r11 = 255(0xff, double:1.26E-321)
            r3 = 0
            r7 = 0
            if (r9 == 0) goto L_0x001f
            long r5 = r13.A04
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0021
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0057
            int r0 = r13.A03
            r9.setAlpha(r0)
        L_0x001f:
            r13.A04 = r3
        L_0x0021:
            r10 = 0
        L_0x0022:
            android.graphics.drawable.Drawable r9 = r13.A07
            if (r9 == 0) goto L_0x0036
            long r5 = r13.A05
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            r9.setVisible(r7, r7)
            r0 = 0
            r13.A07 = r0
        L_0x0036:
            r13.A05 = r3
        L_0x0038:
            r8 = r10
        L_0x0039:
            if (r14 == 0) goto L_0x0045
            if (r8 == 0) goto L_0x0045
            java.lang.Runnable r0 = r13.A09
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r0, r1)
        L_0x0045:
            return
        L_0x0046:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r3 = (int) r5
            X.04Q r0 = r13.A02
            int r0 = r0.A08
            int r3 = r3 / r0
            int r0 = r13.A03
            int r3 = r3 * r0
            int r0 = r3 / 255
            r9.setAlpha(r0)
            goto L_0x0039
        L_0x0057:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r10 = (int) r5
            X.04Q r0 = r13.A02
            int r0 = r0.A07
            int r10 = r10 / r0
            int r5 = 255 - r10
            int r0 = r13.A03
            int r5 = r5 * r0
            int r0 = r5 / 255
            r9.setAlpha(r0)
            r10 = 1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04V.A06(boolean):void");
    }

    public abstract AnonymousClass04Q A08();

    /* JADX WARNING: type inference failed for: r1v9, types: [X.0R3, java.lang.Object] */
    private void A00(Drawable drawable) {
        AnonymousClass0R3 r1 = this.A08;
        AnonymousClass0R3 r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            this.A08 = obj;
            r12 = obj;
        }
        r12.A00 = drawable.getCallback();
        drawable.setCallback(r12);
        try {
            if (this.A02.A07 <= 0 && this.A0A) {
                drawable.setAlpha(this.A03);
            }
            AnonymousClass04Q r13 = this.A02;
            if (r13.A0R) {
                drawable.setColorFilter(r13.A0E);
            } else {
                if (r13.A0S) {
                    C27831Xu.A03(r13.A0C, drawable);
                }
                AnonymousClass04Q r14 = this.A02;
                if (r14.A0T) {
                    C27831Xu.A07(r14.A0F, drawable);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.A02.A0Q);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C27831Xu.A0G(C27831Xu.A00(this), drawable);
            }
            drawable.setAutoMirrored(this.A02.A0I);
            Rect rect = this.A06;
            if (rect != null) {
                C27831Xu.A0E(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            AnonymousClass0R3 r2 = this.A08;
            Drawable.Callback callback = r2.A00;
            r2.A00 = null;
            drawable.setCallback(callback);
        }
    }

    private boolean A01() {
        if (!this.A02.A0I || C27831Xu.A00(this) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(int r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            r3 = 0
            if (r9 != r0) goto L_0x0006
            return r3
        L_0x0006:
            long r5 = android.os.SystemClock.uptimeMillis()
            X.04Q r0 = r8.A02
            int r0 = r0.A08
            r7 = 0
            r1 = 0
            if (r0 <= 0) goto L_0x0075
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r3, r3)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r8.A01
            if (r0 == 0) goto L_0x0070
            r8.A07 = r0
            X.04Q r0 = r8.A02
            int r0 = r0.A08
            long r3 = (long) r0
            long r3 = r3 + r5
            r8.A05 = r3
        L_0x0028:
            if (r9 < 0) goto L_0x006a
            X.04Q r3 = r8.A02
            int r0 = r3.A0A
            if (r9 >= r0) goto L_0x006a
            android.graphics.drawable.Drawable r7 = r3.A03(r9)
            r8.A01 = r7
            r8.A00 = r9
            if (r7 == 0) goto L_0x0047
            X.04Q r0 = r8.A02
            int r0 = r0.A07
            if (r0 <= 0) goto L_0x0044
            long r3 = (long) r0
            long r5 = r5 + r3
            r8.A04 = r5
        L_0x0044:
            r8.A00(r7)
        L_0x0047:
            long r3 = r8.A04
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            long r3 = r8.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
        L_0x0054:
            java.lang.Runnable r0 = r8.A09
            if (r0 != 0) goto L_0x0066
            X.0Yi r0 = new X.0Yi
            r0.<init>(r8)
            r8.A09 = r0
        L_0x005f:
            r8.A06(r5)
        L_0x0062:
            r8.invalidateSelf()
            return r5
        L_0x0066:
            r8.unscheduleSelf(r0)
            goto L_0x005f
        L_0x006a:
            r8.A01 = r7
            r0 = -1
            r8.A00 = r0
            goto L_0x0047
        L_0x0070:
            r8.A07 = r7
            r8.A05 = r1
            goto L_0x0028
        L_0x0075:
            android.graphics.drawable.Drawable r0 = r8.A01
            if (r0 == 0) goto L_0x0028
            r0.setVisible(r3, r3)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04V.A07(int):boolean");
    }

    public void A09(AnonymousClass04Q r2) {
        this.A02 = r2;
        int i = this.A00;
        if (i >= 0) {
            Drawable A032 = r2.A03(i);
            this.A01 = A032;
            if (A032 != null) {
                A00(A032);
            }
        }
        this.A07 = null;
    }

    public void applyTheme(Resources.Theme theme) {
        this.A02.A07(theme);
    }

    public boolean canApplyTheme() {
        return this.A02.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        AnonymousClass04Q r6 = this.A02;
        if (!r6.A0L) {
            AnonymousClass04Q.A01(r6);
            r6.A0L = true;
            int i = r6.A0A;
            Drawable[] drawableArr = r6.A0X;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    r6.A0J = false;
                    return null;
                }
            }
            r6.A0J = true;
        } else if (!r6.A0J) {
            return null;
        }
        this.A02.A00 = getChangingConfigurations();
        return this.A02;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.A06;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A04();
            }
            return r1.A02;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A04();
            }
            return r1.A05;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A04();
            }
            return r1.A03;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A04();
            }
            return r1.A04;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        int i;
        Drawable drawable = this.A01;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AnonymousClass04Q r5 = this.A02;
        if (r5.A0M) {
            return r5.A0B;
        }
        AnonymousClass04Q.A01(r5);
        int i2 = r5.A0A;
        Drawable[] drawableArr = r5.A0X;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        } else {
            i = -2;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        r5.A0B = i;
        r5.A0M = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r4 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getPadding(android.graphics.Rect r10) {
        /*
            r9 = this;
            X.04Q r7 = r9.A02
            boolean r0 = r7.A0W
            r4 = 0
            if (r0 != 0) goto L_0x0053
            android.graphics.Rect r0 = r7.A0G
            if (r0 != 0) goto L_0x0051
            boolean r0 = r7.A0N
            if (r0 != 0) goto L_0x0053
            X.AnonymousClass04Q.A01(r7)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            int r6 = r7.A0A
            android.graphics.drawable.Drawable[] r5 = r7.A0X
            r3 = 0
            r2 = 0
        L_0x001d:
            if (r2 >= r6) goto L_0x0061
            r0 = r5[r2]
            boolean r0 = r0.getPadding(r8)
            if (r0 == 0) goto L_0x004e
            if (r4 != 0) goto L_0x002e
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r3, r3, r3)
        L_0x002e:
            int r1 = r8.left
            int r0 = r4.left
            if (r1 <= r0) goto L_0x0036
            r4.left = r1
        L_0x0036:
            int r1 = r8.top
            int r0 = r4.top
            if (r1 <= r0) goto L_0x003e
            r4.top = r1
        L_0x003e:
            int r1 = r8.right
            int r0 = r4.right
            if (r1 <= r0) goto L_0x0046
            r4.right = r1
        L_0x0046:
            int r1 = r8.bottom
            int r0 = r4.bottom
            if (r1 <= r0) goto L_0x004e
            r4.bottom = r1
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0051:
            r4 = r0
            goto L_0x0068
        L_0x0053:
            android.graphics.drawable.Drawable r0 = r9.A01
            if (r0 == 0) goto L_0x005c
            boolean r2 = r0.getPadding(r10)
            goto L_0x007a
        L_0x005c:
            boolean r2 = super.getPadding(r10)
            goto L_0x007a
        L_0x0061:
            r0 = 1
            r7.A0N = r0
            r7.A0G = r4
            if (r4 == 0) goto L_0x0053
        L_0x0068:
            r10.set(r4)
            int r1 = r4.left
            int r0 = r4.top
            r1 = r1 | r0
            int r0 = r4.bottom
            r1 = r1 | r0
            int r0 = r4.right
            r0 = r0 | r1
            boolean r2 = X.AnonymousClass000.A1O(r0)
        L_0x007a:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0088
            int r1 = r10.left
            int r0 = r10.right
            r10.left = r0
            r10.right = r1
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04V.getPadding(android.graphics.Rect):boolean");
    }

    public void invalidateDrawable(Drawable drawable) {
        AnonymousClass04Q r1 = this.A02;
        if (r1 != null) {
            r1.A0M = false;
            r1.A0O = false;
        }
        if (drawable == this.A01 && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.A02.A0I;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.A07;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.A07 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.A0A) {
                this.A01.setAlpha(this.A03);
            }
        }
        if (this.A05 != 0) {
            this.A05 = 0;
        } else {
            z2 = z;
        }
        if (this.A04 != 0) {
            this.A04 = 0;
        } else if (!z2) {
            return;
        }
        invalidateSelf();
    }

    public Drawable mutate() {
        if (!this.A0B && super.mutate() == this) {
            AnonymousClass04Q A082 = A08();
            A082.A05();
            A09(A082);
            this.A0B = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.A02.A09(i, this.A00);
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A07;
        if (drawable == null && (drawable = this.A01) == null) {
            return false;
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A07;
        if (drawable == null && (drawable = this.A01) == null) {
            return false;
        }
        return drawable.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.A01 && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.A0A || this.A03 != i) {
            this.A0A = true;
            this.A03 = i;
            Drawable drawable = this.A01;
            if (drawable == null) {
                return;
            }
            if (this.A04 == 0) {
                drawable.setAlpha(i);
            } else {
                A06(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0I != z) {
            r1.A0I = z;
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass04Q r1 = this.A02;
        r1.A0R = true;
        if (r1.A0E != colorFilter) {
            r1.A0E = colorFilter;
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        AnonymousClass04Q r1 = this.A02;
        if (r1.A0Q != z) {
            r1.A0Q = z;
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            C27831Xu.A0A(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.A06;
        if (rect == null) {
            this.A06 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            C27831Xu.A0E(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        AnonymousClass04Q r1 = this.A02;
        r1.A0S = true;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            C27831Xu.A03(colorStateList, this.A01);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AnonymousClass04Q r1 = this.A02;
        r1.A0T = true;
        if (r1.A0F != mode) {
            r1.A0F = mode;
            C27831Xu.A07(mode, this.A01);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.A01 && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public int getAlpha() {
        return this.A03;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AnonymousClass04Q r0 = this.A02;
        return changingConfigurations | r0.A00 | r0.A01;
    }

    public Drawable getCurrent() {
        return this.A01;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }
}
