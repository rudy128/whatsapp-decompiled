package com.whatsapp.contact.photos;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1E7;
import X.AnonymousClass1VW;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4IE;
import X.C18000vb;
import X.C18070vi;
import X.C37451pZ;
import X.C42971z2;
import X.C72453Mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public final class MultiContactThumbnail extends ViewGroup implements AnonymousClass009 {
    public float A00;
    public int A01;
    public Canvas A02;
    public Paint A03;
    public RectF A04;
    public AnonymousClass1VW A05;
    public C18000vb A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public int A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void A00(C42971z2 r7, C37451pZ r8, List list) {
        C18070vi.A0j(r8, r7);
        if (!list.isEmpty()) {
            int size = list.size();
            if (size > 4) {
                size = 4;
            }
            setNumImages(size);
            for (int i = 0; i < size; i++) {
                AnonymousClass1E7 r2 = (AnonymousClass1E7) list.get(i);
                r7.CIg(r2.A0J);
                View childAt = getChildAt(i);
                C18070vi.A0z(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                r8.A05((ImageView) childAt, r7, r2, false);
            }
        }
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Canvas canvas2 = this.A02;
        String str = "offscreenCanvas";
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvas2);
            RectF rectF = this.A04;
            if (rectF == null) {
                str = "drawRect";
            } else {
                float f = this.A00;
                Paint paint = this.A03;
                if (paint == null) {
                    str = "maskPaint";
                } else {
                    canvas.drawRoundRect(rectF, f, f, paint);
                    return;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    private final void setNumImages(int i) {
        if (i == this.A09) {
            invalidate();
            return;
        }
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        if (i <= childCount) {
            int i2 = childCount2 - i;
            int childCount3 = getChildCount();
            for (int i3 = 0; i3 < i2; i3++) {
                getChildAt((childCount3 - 1) - i3).setVisibility(8);
            }
        } else {
            int i4 = i - childCount2;
            for (int i5 = 0; i5 < i4; i5++) {
                ImageView A0U = C72453Mb.A0U(this);
                AnonymousClass3MW.A1R(A0U);
                addView(A0U);
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A09 = i;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r0 <= 1) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r0 = r14.A09
            r11 = 1
            if (r0 < r11) goto L_0x0083
            int r7 = r14.getPaddingLeft()
            int r10 = r14.getPaddingTop()
            int r6 = r14.getMeasuredWidth()
            int r0 = r14.getPaddingRight()
            int r6 = r6 - r0
            int r9 = r14.getMeasuredHeight()
            int r0 = r14.getPaddingBottom()
            int r9 = r9 - r0
            X.0vb r0 = r14.getWhatsAppLocale()
            boolean r13 = X.AnonymousClass3MW.A1Z(r0)
            int r6 = r6 - r7
            int r9 = r9 - r10
            int r8 = r6 / 2
            int r0 = r14.A01
            int r1 = r8 - r0
            int r5 = r9 / 2
            int r12 = r5 - r0
            int r8 = r8 + r7
            int r8 = r8 + r0
            int r5 = r5 + r10
            int r5 = r5 + r0
            int r0 = r14.A09
            if (r0 == r11) goto L_0x003c
            r6 = r1
        L_0x003c:
            r4 = 3
            r3 = r12
            if (r0 > r4) goto L_0x0041
            r3 = r9
        L_0x0041:
            if (r13 == 0) goto L_0x0046
            r2 = r8
            if (r0 > r11) goto L_0x0047
        L_0x0046:
            r2 = r7
        L_0x0047:
            android.view.View r1 = X.AnonymousClass3MY.A0F(r14)
            int r0 = r2 + r6
            int r3 = r3 + r10
            r1.layout(r2, r10, r0, r3)
            int r0 = r14.A09
            if (r0 == r11) goto L_0x0083
            r3 = r8
            if (r13 == 0) goto L_0x0059
            r3 = r7
        L_0x0059:
            r1 = 2
            if (r0 <= r1) goto L_0x005d
            r9 = r12
        L_0x005d:
            android.view.View r0 = r14.getChildAt(r11)
            int r2 = r3 + r6
            int r9 = r9 + r10
            r0.layout(r3, r10, r2, r9)
            int r0 = r14.A09
            if (r0 == r1) goto L_0x0083
            android.view.View r0 = r14.getChildAt(r1)
            int r1 = r5 + r12
            r0.layout(r3, r5, r2, r1)
            int r0 = r14.A09
            if (r0 == r4) goto L_0x0083
            if (r13 == 0) goto L_0x007b
            r7 = r8
        L_0x007b:
            android.view.View r0 = r14.getChildAt(r4)
            int r6 = r6 + r7
            r0.layout(r7, r5, r6, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.photos.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiContactThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass3MZ.A0e(A0O);
            this.A06 = AnonymousClass10E.A6Q(A0O);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass4IE.A00);
            C18070vi.A0X(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, this.A01);
            obtainStyledAttributes.recycle();
        }
        int i2 = ((int) this.A00) * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        C18070vi.A0X(createBitmap);
        this.A02 = new Canvas(createBitmap);
        float f = (float) i2;
        this.A04 = new RectF(0.0f, 0.0f, f, f);
        this.A03 = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        Paint paint = this.A03;
        if (paint == null) {
            C18070vi.A11("maskPaint");
            throw null;
        }
        paint.setShader(bitmapShader);
        setWillNotDraw(false);
    }

    public /* synthetic */ MultiContactThumbnail(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiContactThumbnail(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
