package com.whatsapp.status.playback.content;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass6MA;
import X.C108975cc;
import X.C108995ce;
import X.C18070vi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public final class BlurFrameLayout extends FrameLayout implements AnonymousClass009 {
    public Bitmap A00;
    public Bitmap A01;
    public ViewPropertyAnimator A02;
    public AnonymousClass118 A03;
    public AnonymousClass6MA A04;
    public AnonymousClass10I A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0063
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x003e
            android.graphics.Bitmap r0 = r5.A00
            if (r0 != 0) goto L_0x0052
            android.graphics.Bitmap r0 = X.C108995ce.A0H(r5)
            r5.A00 = r0
            if (r0 != 0) goto L_0x0052
        L_0x0018:
            X.6MA r0 = r5.A04
            if (r0 == 0) goto L_0x0021
            java.lang.ref.WeakReference r0 = r0.A00
            r0.clear()
        L_0x0021:
            X.6MA r0 = r5.A04
            boolean r0 = X.C108975cc.A1G(r0)
            X.6MA r4 = new X.6MA
            r4.<init>(r5)
            r5.A04 = r4
            X.10I r3 = r5.getWaWorkers()
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r0]
            android.graphics.Bitmap r1 = r5.A00
            r0 = 0
            r2[r0] = r1
            r3.CGD(r4, r2)
            r5.A07 = r0
        L_0x003e:
            android.graphics.Bitmap r2 = r5.A01
            if (r2 == 0) goto L_0x0048
            r1 = 0
            r0 = 0
            r6.drawBitmap(r2, r0, r0, r1)
        L_0x0047:
            return
        L_0x0048:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x0047
            r0.draw(r6)
            return
        L_0x0052:
            android.graphics.Canvas r1 = X.C108945cZ.A0I(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x005f
            r0.draw(r1)
        L_0x005f:
            super.dispatchDraw(r1)
            goto L_0x0018
        L_0x0063:
            super.dispatchDraw(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.content.BlurFrameLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A03 = AnonymousClass3MZ.A0l(A0O);
            this.A05 = AnonymousClass10E.AL1(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final void setBlurEnabled(boolean z) {
        this.A08 = z;
        if (z) {
            this.A07 = true;
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass6MA r0 = this.A04;
        if (r0 != null) {
            r0.A00.clear();
        }
        boolean A1G = C108975cc.A1G(this.A04);
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.A01 = null;
        this.A07 = A1G;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.A00 = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A08) {
            this.A00 = C108995ce.A0H(this);
            this.A07 = true;
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
