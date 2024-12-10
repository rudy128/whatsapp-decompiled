package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: X.69G  reason: invalid class name */
public class AnonymousClass69G extends AnonymousClass656 {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Drawable A04;
    public Drawable A05;
    public C112855m9 A06;
    public AnonymousClass72S A07;
    public C131086kU A08;
    public HashSet A09;
    public final Paint A0A;
    public final Matrix A0B = C108945cZ.A0J();
    public final ImageView.ScaleType A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0073, code lost:
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass69G(android.content.Context r5, X.C131086kU r6, java.util.HashSet r7, float r8, int r9) {
        /*
            r4 = this;
            r2 = 1
            r4.<init>(r5)
            r4.A06()
            r4.A00 = r2
            r4.A06()
            android.graphics.Matrix r0 = X.C108945cZ.A0J()
            r4.A0B = r0
            android.graphics.Paint r3 = X.AnonymousClass3MW.A06()
            r4.A0A = r3
            java.util.HashSet r0 = X.C17880vN.A12()
            r4.A09 = r0
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r4.A0C = r0
            android.widget.ImageView$ScaleType r0 = r4.getDefaultScaleType()
            r4.setScaleType(r0)
            r4.A00 = r8
            r4.A08 = r6
            r4.A09 = r7
            r4.A02 = r9
            int r0 = X.C72463Mc.A03(r5)
            X.AnonymousClass3MX.A19(r5, r3, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166897(0x7f0706b1, float:1.7948052E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            r3.setStrokeWidth(r0)
            X.AnonymousClass3MW.A1P(r3)
            r3.setAntiAlias(r2)
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            r4.setId(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131101219(0x7f060623, float:1.7814842E38)
            int r0 = r1.getColor(r0)
            r4.A01 = r0
            r1 = 0
            X.5el r0 = new X.5el
            r0.<init>(r1, r8)
            r4.setOutlineProvider(r0)
            r4.setClipToOutline(r2)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r0 = r3 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0077
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r3 != 0) goto L_0x007b
        L_0x0077:
            android.widget.LinearLayout$LayoutParams r3 = X.AnonymousClass3Ma.A0D()
        L_0x007b:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168783(0x7f070e0f, float:1.7951878E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.topMargin
            int r0 = r3.bottomMargin
            r3.setMargins(r2, r1, r2, r0)
            r4.setLayoutParams(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69G.<init>(android.content.Context, X.6kU, java.util.HashSet, float, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            r0 = 0
            r5 = r14
            X.C18070vi.A0d(r14, r0)
            X.6kU r0 = r13.A08
            if (r0 == 0) goto L_0x000d
            android.view.View r0 = r0.A06
            if (r0 == r13) goto L_0x00b3
        L_0x000d:
            java.util.HashSet r1 = r13.A09
            X.72S r0 = r13.A07
            boolean r0 = X.C29431cG.A18(r1, r0)
            if (r0 != 0) goto L_0x00b3
            r14.save()
            X.72S r0 = r13.A07
            if (r0 == 0) goto L_0x0036
            int r0 = r0.A02()
            if (r0 == 0) goto L_0x0036
            android.graphics.Matrix r3 = r13.A0B
            float r2 = (float) r0
            float r1 = X.C108955ca.A00(r13)
            int r0 = X.C108945cZ.A06(r13)
            float r0 = (float) r0
            r3.setRotate(r2, r1, r0)
            r14.concat(r3)
        L_0x0036:
            super.onDraw(r14)
            r14.restore()
            android.graphics.drawable.Drawable r0 = r13.A05
            if (r0 == 0) goto L_0x00b4
            android.animation.ValueAnimator r0 = r13.A03
            if (r0 != 0) goto L_0x005e
            int[] r0 = X.C108945cZ.A1W()
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r0 = 15
            X.C1411074h.A00(r2, r13, r0)
            r2.start()
            r13.A03 = r2
        L_0x005e:
            android.graphics.drawable.Drawable r4 = r13.A05
            if (r4 == 0) goto L_0x008d
            int r1 = r13.getHeight()
            int r0 = r4.getIntrinsicHeight()
            int r1 = r1 - r0
            int r3 = r1 / 2
            int r1 = r13.getWidth()
            int r0 = r4.getIntrinsicWidth()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r0 = r13.A01
            r14.drawColor(r0)
            int r1 = r4.getIntrinsicWidth()
            int r1 = r1 + r2
            int r0 = r4.getIntrinsicHeight()
            int r0 = r0 + r3
            r4.setBounds(r2, r3, r1, r0)
        L_0x008a:
            r4.draw(r14)
        L_0x008d:
            boolean r0 = r13.isPressed()
            if (r0 != 0) goto L_0x0099
            boolean r0 = r13.isSelected()
            if (r0 == 0) goto L_0x00b3
        L_0x0099:
            boolean r0 = r13 instanceof X.AnonymousClass69F
            if (r0 != 0) goto L_0x00b3
            float r10 = r13.A00
            r6 = 0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            float r8 = X.C108945cZ.A03(r13)
            float r9 = X.C108945cZ.A04(r13)
            if (r0 <= 0) goto L_0x00c7
            android.graphics.Paint r12 = r13.A0A
            r7 = r6
            r11 = r10
            r5.drawRoundRect(r6, r7, r8, r9, r10, r11, r12)
        L_0x00b3:
            return
        L_0x00b4:
            android.graphics.drawable.Drawable r4 = r13.A04
            if (r4 == 0) goto L_0x008d
            int r0 = r4.getIntrinsicHeight()
            int r0 = r0 / 4
            X.C110785h5.A02(r4, r13, r0)
            int r0 = r13.A01
            r14.drawColor(r0)
            goto L_0x008a
        L_0x00c7:
            android.graphics.Paint r10 = r13.A0A
            r7 = r6
            r5.drawRect(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69G.onDraw(android.graphics.Canvas):void");
    }

    public final void setItem(AnonymousClass72S r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setViewHolder(C112855m9 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public Uri getUri() {
        AnonymousClass72S r0 = this.A07;
        if (r0 != null) {
            return r0.A0X;
        }
        return null;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.A02;
        setMeasuredDimension(i3, i3);
    }

    public final void setCustomId(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2131436123;
        }
        setId(i);
    }

    public final void setOverlayIcon(Drawable drawable) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
        if (drawable != null) {
            drawable.setAlpha(0);
        } else {
            drawable = null;
        }
        this.A05 = drawable;
    }

    public ImageView.ScaleType getDefaultScaleType() {
        return this.A0C;
    }

    public final int getThumbSize() {
        return this.A02;
    }

    public final C112855m9 getViewHolder() {
        return this.A06;
    }

    public final void setIcon(Drawable drawable) {
        this.A04 = drawable;
    }

    public final void setThumbSize(int i) {
        this.A02 = i;
    }
}
