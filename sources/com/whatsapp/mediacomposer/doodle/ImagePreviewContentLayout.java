package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass7JF;
import X.AnonymousClass7QI;
import X.AnonymousClass7QJ;
import X.AnonymousClass85G;
import X.C108995ce;
import X.C1405671z;
import X.C1419877s;
import X.C146727Qj;
import X.C18070vi;
import X.C70743Ci;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public final class ImagePreviewContentLayout extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass7JF A00;
    public AnonymousClass85G A01;
    public C1419877s A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final Rect A05;
    public final RectF A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MW.A07();
        C1419877s.A00(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.setMatrix(this.A02.A0I);
        Rect rect = this.A05;
        canvas.getClipBounds(rect);
        AnonymousClass7JF r2 = this.A00;
        if (r2 != null) {
            float f = this.A02.A04;
            C18070vi.A0d(rect, 0);
            C1405671z r0 = r2.A0Q;
            r0.A06 = rect;
            r0.A01 = f;
        }
        super.onDraw(canvas);
    }

    public final void setDoodleController(AnonymousClass7JF r3) {
        C18070vi.A0d(r3, 0);
        this.A00 = r3;
        this.A02.A0E = r3.A0N.A03;
    }

    public final void setZoomableViewController(C1419877s r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public final void A01() {
        C1419877s r3 = this.A02;
        C146727Qj r1 = r3.A09;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        r3.A09 = null;
        AnonymousClass7QJ r12 = r3.A0B;
        if (r12 != null) {
            r12.A03 = false;
            r12.A04 = true;
        }
        r3.A0B = null;
        AnonymousClass7QI r13 = r3.A0A;
        if (r13 != null) {
            r13.A03 = false;
            r13.A04 = true;
        }
        r3.A0A = null;
        C70743Ci r14 = r3.A08;
        if (r14 != null) {
            r14.A01 = true;
        }
        r3.A08 = null;
        r3.A07 = null;
        r3.A07 = null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final boolean getOnFlingEnabled() {
        return this.A02.A0D;
    }

    public final int getTranslateTouchPoints() {
        return this.A02.A05;
    }

    public final void setMinScale(float f) {
        this.A02.A01 = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A02.A07 = onClickListener;
    }

    public final void setOnFlingEnabled(boolean z) {
        this.A02.A0D = z;
    }

    public final void setTranslateTouchPoints(int i) {
        this.A02.A05 = i;
    }

    public final GestureDetector.OnGestureListener getActionHandler() {
        return this.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            RectF rectF = this.A06;
            rectF.set(0.0f, 0.0f, (float) C108995ce.A03(this), (float) C72473Md.A04(this));
            C1419877s r2 = this.A02;
            r2.A0K.set(rectF);
            C1419877s.A01(r2);
            r2.A0C = true;
            Matrix matrix = r2.A06;
            if (matrix == null || matrix.equals(r2.A0I)) {
                C1419877s.A01(r2);
            }
        }
    }

    public final void setImagePreviewContentLayoutListener(AnonymousClass85G r1) {
        this.A01 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A00();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MW.A07();
        C1419877s.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MW.A07();
        C1419877s.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MW.A07();
        C1419877s.A00(this);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
