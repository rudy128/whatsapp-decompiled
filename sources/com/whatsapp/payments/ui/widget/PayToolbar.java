package com.whatsapp.payments.ui.widget;

import X.AnonymousClass00R;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6Z4;
import X.C108975cc;
import X.C114555r4;
import X.C114625rN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C22891Dp;
import X.C29261bv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;

public class PayToolbar extends C114555r4 {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public WaImageView A03;
    public C18000vb A04;
    public C18030ve A05;
    public Integer A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0X();
        C114625rN.A00(this);
        A0X();
        AnonymousClass3MZ.A0D(this).inflate(2131626312, this, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r4 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r4 == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLockIconVisibility(boolean r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.A00
            r3 = 0
            int r0 = X.C72453Mb.A07(r6)
            r1.setVisibility(r0)
            X.0vb r0 = r5.A04
            boolean r4 = X.AnonymousClass3MY.A1b(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 3
            if (r4 == 0) goto L_0x001a
            r0 = 5
        L_0x001a:
            r0 = r0 | 16
            r2.gravity = r0
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r5)
            r0 = 2131166797(0x7f07064d, float:1.794785E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            r0 = 0
            if (r4 != 0) goto L_0x002e
            r0 = r1
            r1 = 0
        L_0x002e:
            r2.setMargins(r0, r3, r1, r3)
            android.widget.FrameLayout r0 = r5.A01
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r5)
            r0 = 2131166798(0x7f07064e, float:1.7947852E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            if (r6 == 0) goto L_0x0047
            r0 = r1
            if (r4 != 0) goto L_0x004c
        L_0x0047:
            r0 = 0
            if (r6 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r2.setMargins(r1, r3, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PayToolbar.setLockIconVisibility(boolean):void");
    }

    public void setLogo(int i) {
        this.A02.setVisibility(8);
        if (i != 2131430822) {
            this.A03.setVisibility(0);
        }
        this.A03.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i = 8;
        if (charSequence == null || !getContext().getString(2131890283).equalsIgnoreCase(charSequence.toString())) {
            this.A03.setVisibility(8);
            textView = this.A02;
            textView.setText(charSequence);
            i = 0;
        } else {
            textView = this.A02;
        }
        textView.setVisibility(i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null && frameLayout.getVisibility() != 8 && (num = this.A06) != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            int i9 = width - paddingRight;
            int i10 = height - paddingBottom;
            int measuredWidth = frameLayout.getMeasuredWidth();
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(frameLayout);
                i5 = A0B.leftMargin;
                i6 = A0B.rightMargin;
            } else {
                i5 = 0;
                i6 = 0;
            }
            int i11 = measuredWidth + i5 + i6;
            int measuredHeight = frameLayout.getMeasuredHeight();
            if (frameLayout.getLayoutParams() != null) {
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(frameLayout);
                i7 = A0B2.topMargin;
                i8 = A0B2.bottomMargin;
            } else {
                i7 = 0;
                i8 = 0;
            }
            int i12 = measuredHeight + i7 + i8;
            if (num.intValue() == 1) {
                int i13 = height / 2;
                int i14 = i12 / 2;
                int i15 = paddingLeft - currentContentInsetLeft;
                paddingLeft = Math.max(i15, ((width / 2) + i15) - (i11 / 2));
                i9 = Math.min(i9 - currentContentInsetRight, i11 + paddingLeft);
                paddingTop = Math.max(paddingTop, i13 - i14);
                i10 = Math.min(i10, i13 + i14);
            }
            frameLayout.layout(paddingLeft, paddingTop, i9, i10);
        }
    }

    public void setOnLockClicked(View.OnClickListener onClickListener) {
    }

    public PayToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer num;
        AnonymousClass3MZ.A0D(this).inflate(2131626312, this, true);
        if (attributeSet != null && !isInEditMode()) {
            int i = 0;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass6Z4.A01, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                AnonymousClass3MY.A0w(context, this, resourceId);
            }
            findViewById(2131428012).setVisibility(!obtainStyledAttributes.getBoolean(0, false) ? 8 : i);
            int i2 = obtainStyledAttributes.getInt(3, -1);
            if (i2 >= 0) {
                Integer[] A002 = AnonymousClass00R.A00(3);
                int length = A002.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        num = null;
                        break;
                    }
                    num = A002[i3];
                    if (num.intValue() == i2) {
                        break;
                    }
                    i3++;
                }
                this.A06 = num;
            }
            this.A02 = C108975cc.A0C(this);
            this.A01 = (FrameLayout) findViewById(2131436234);
            this.A03 = AnonymousClass3MW.A0S(this, 2131430822);
            this.A00 = findViewById(2131432198);
            setLockIconVisibility(obtainStyledAttributes.getBoolean(1, true));
            if (C22891Dp.A09) {
                C29261bv.A08(this.A02, 2132084447);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        this.A02.setVisibility(8);
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(0);
        waImageView.setImageDrawable(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayToolbar(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        A0X();
        C114625rN.A00(this);
        A0X();
        AnonymousClass3MZ.A0D(this).inflate(2131626312, this, true);
    }
}
