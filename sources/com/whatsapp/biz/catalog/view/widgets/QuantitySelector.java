package com.whatsapp.biz.catalog.view.widgets;

import X.A9F;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IZ;
import X.AnonymousClass8BW;
import X.AnonymousClass8D3;
import X.B7N;
import X.B7O;
import X.C108995ce;
import X.C17890vO;
import X.C18000vb;
import X.C18030ve;
import X.C185659cw;
import X.C29261bv;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.WaImageButton;

public class QuantitySelector extends FrameLayout implements AnonymousClass009 {
    public long A00;
    public long A01;
    public ValueAnimator A02;
    public B7N A03;
    public B7O A04;
    public C185659cw A05;
    public AnonymousClass11C A06;
    public C18000vb A07;
    public C18030ve A08;
    public AnonymousClass031 A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E;
    public final TextView A0F;
    public final WaImageButton A0G;
    public final WaImageButton A0H;

    public void setLimit(int i) {
        this.A00 = (long) i;
    }

    public static void A00(QuantitySelector quantitySelector) {
        int measuredWidth = quantitySelector.A0H.getMeasuredWidth();
        int measuredWidth2 = (measuredWidth * 2) + quantitySelector.A0F.getMeasuredWidth();
        ValueAnimator A0B2 = C108995ce.A0B(measuredWidth, measuredWidth2);
        quantitySelector.A02 = A0B2;
        A0B2.addUpdateListener(new A9F(quantitySelector, measuredWidth, measuredWidth2, 0));
        quantitySelector.A02.setInterpolator(new DecelerateInterpolator());
        quantitySelector.A02.setDuration(250);
        quantitySelector.A02.start();
    }

    public static void A01(QuantitySelector quantitySelector) {
        quantitySelector.A0A = AnonymousClass00R.A00;
        WaImageButton waImageButton = quantitySelector.A0H;
        waImageButton.setImageResource(0);
        waImageButton.setBackgroundResource(2131231138);
        AnonymousClass3MZ.A1I(waImageButton, quantitySelector, 10);
        TextView textView = quantitySelector.A0F;
        AnonymousClass3MX.A1C(textView.getContext(), textView, 2131102234);
        A03(quantitySelector);
    }

    public static void A02(QuantitySelector quantitySelector) {
        quantitySelector.A0A = AnonymousClass00R.A01;
        A03(quantitySelector);
        TextView textView = quantitySelector.A0F;
        AnonymousClass8BW.A0z(textView.getContext(), quantitySelector.getResources(), textView, 2130971979, 2131102703);
        WaImageButton waImageButton = quantitySelector.A0H;
        waImageButton.setImageResource(2131233185);
        waImageButton.setBackgroundResource(2131232853);
        AnonymousClass3MZ.A1I(waImageButton, quantitySelector, 8);
        AnonymousClass3MZ.A1I(quantitySelector.A0G, quantitySelector, 9);
    }

    public static void A03(QuantitySelector quantitySelector) {
        TextView textView = quantitySelector.A0F;
        textView.setClickable(false);
        if (quantitySelector.A01 > 0) {
            textView.setText(quantitySelector.A07.A0L().format(quantitySelector.A01));
            if (quantitySelector.A0A == AnonymousClass00R.A01) {
                textView.setClickable(true);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1S(textView);
    }

    public void A04(long j, long j2) {
        long j3 = this.A01;
        this.A00 = j2;
        this.A01 = j;
        if (this.A0C) {
            if (this.A0A == AnonymousClass00R.A00 || j3 == 0) {
                if (j > 0) {
                    A01(this);
                    return;
                }
            } else if (this.A0B) {
                return;
            }
        }
        A02(this);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass8D3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass8D3 r5 = (AnonymousClass8D3) parcelable;
        super.onRestoreInstanceState(r5.getSuperState());
        this.A0C = r5.A02;
        this.A0A = AnonymousClass00R.A00;
        A04(r5.A01, r5.A00);
    }

    public void setCollapsible(boolean z) {
        this.A0C = z;
        if (z && AnonymousClass1Y5.A0D(this.A06.A0M())) {
            this.A0C = false;
        }
    }

    public void setMinusButtonContentDescription(String str) {
        this.A0G.setContentDescription(str);
    }

    public void setPlusButtonContentDescription(String str) {
        this.A0H.setContentDescription(str);
    }

    public void setQuantity(long j) {
        A04(j, this.A00);
    }

    /* JADX INFO: finally extract failed */
    public QuantitySelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A07 = AnonymousClass10E.A6Q(A0O);
            this.A06 = AnonymousClass3Ma.A0a(A0O);
            this.A08 = AnonymousClass10E.A8r(A0O);
        }
        this.A0E = C17890vO.A0D();
        this.A0B = false;
        this.A0A = AnonymousClass00R.A00;
        View inflate = View.inflate(getContext(), 2131626656, this);
        this.A0F = AnonymousClass3MW.A0J(inflate, 2131434273);
        this.A0G = (WaImageButton) AnonymousClass1HF.A06(inflate, 2131432764);
        this.A0H = (WaImageButton) AnonymousClass1HF.A06(inflate, 2131433903);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A05, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                this.A0G.setContentDescription(context.getTheme().getResources().getString(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId2 != 0) {
                this.A0H.setContentDescription(context.getTheme().getResources().getString(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId3 != 0) {
                C29261bv.A08(this.A0F, resourceId3);
            }
            setCollapsible(obtainStyledAttributes.getBoolean(1, false));
            obtainStyledAttributes.recycle();
            A04(0, 99);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public long getQuantity() {
        return this.A01;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int top;
        int left2;
        int left3;
        super.onLayout(z, i, i2, i3, i4);
        WaImageButton waImageButton = this.A0H;
        int measuredWidth = waImageButton.getMeasuredWidth();
        TextView textView = this.A0F;
        int measuredWidth2 = (measuredWidth - textView.getMeasuredWidth()) / 2;
        if (AnonymousClass3MY.A1b(this.A07)) {
            int left4 = waImageButton.getLeft();
            WaImageButton waImageButton2 = this.A0G;
            if (left4 >= waImageButton2.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton2.getRight();
                top = textView.getTop();
                left2 = waImageButton2.getRight();
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        } else {
            WaImageButton waImageButton3 = this.A0G;
            if (waImageButton3.getLeft() >= waImageButton3.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton3.getLeft() - textView.getMeasuredWidth();
                top = textView.getTop();
                left3 = waImageButton3.getLeft();
                textView.layout(left, top, left3, textView.getBottom());
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        }
        left3 = left2 + textView.getMeasuredWidth();
        textView.layout(left, top, left3, textView.getBottom());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r3 == X.AnonymousClass00R.A00) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        setMeasuredDimension(r6, getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r1 != 0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            com.whatsapp.WaImageButton r3 = r8.A0H
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r3.setLayoutParams(r1)
            com.whatsapp.WaImageButton r2 = r8.A0G
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r2.setLayoutParams(r1)
            super.onMeasure(r9, r10)
            int r6 = r3.getMeasuredWidth()
            int r7 = r6 * 2
            android.widget.TextView r0 = r8.A0F
            int r0 = r0.getMeasuredWidth()
            int r7 = r7 + r0
            boolean r0 = r8.A0B
            r4 = 0
            if (r0 != 0) goto L_0x005b
            java.lang.Integer r3 = r8.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r3 != r0) goto L_0x004f
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r7, r0)
            return
        L_0x004b:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
        L_0x004f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 != r0) goto L_0x005b
        L_0x0053:
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x005b:
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.widgets.QuantitySelector.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = AbsSavedState.EMPTY_STATE;
        }
        return new AnonymousClass8D3(onSaveInstanceState, this.A01, this.A00, this.A0C);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A0F.setEnabled(z);
        this.A0H.setEnabled(z);
        this.A0G.setEnabled(z);
    }

    public void setOnLimitReachedListener(B7N b7n) {
        this.A03 = b7n;
    }

    public void setOnQuantityChanged(B7O b7o) {
        this.A04 = b7o;
    }

    public QuantitySelector(Context context) {
        this(context, (AttributeSet) null);
    }

    public QuantitySelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
