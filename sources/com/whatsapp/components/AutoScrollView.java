package com.whatsapp.components;

import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass783;
import X.BEF;
import X.C18070vi;
import X.C26321Cxe;
import X.C84144If;
import X.D51;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.whatsapp.WaTextView;

public final class AutoScrollView extends FrameLayout {
    public HorizontalScrollView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final long A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A06 = getResources().getDimensionPixelSize(2131165403);
        this.A03 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A02);
        C18070vi.A0X(obtainStyledAttributes);
        this.A0B = (long) obtainStyledAttributes.getInt(2, 3500);
        this.A08 = (long) obtainStyledAttributes.getInt(0, 5000);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(2131168774));
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(2131165402));
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(2131624242, this, true);
        this.A09 = (WaTextView) C18070vi.A05(inflate, 2131432250);
        WaTextView waTextView = (WaTextView) C18070vi.A05(inflate, 2131433875);
        this.A0A = waTextView;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C18070vi.A05(inflate, 2131431480);
        this.A00 = horizontalScrollView;
        horizontalScrollView.setOnTouchListener(new D51(1));
        this.A00.getChildAt(0).setOnClickListener(new AnonymousClass783(inflate, 9));
        waTextView.setVisibility(8);
    }

    public static final void A00(AutoScrollView autoScrollView, float f, int i, int i2, int i3, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        long j2 = autoScrollView.A0B;
        if (j2 <= 0) {
            ofFloat.setRepeatCount(-1);
        }
        ofFloat.addUpdateListener(new C26321Cxe(autoScrollView, f, i, i2, i3));
        AnimatorSet animatorSet = new AnimatorSet();
        if (j2 > 0) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(j2);
            animatorSet.addListener(new BEF());
            Animator[] animatorArr = new Animator[2];
            AnonymousClass001.A1Q(ofFloat2, ofFloat, animatorArr);
            animatorSet.playSequentially(animatorArr);
        } else {
            animatorSet.play(ofFloat);
        }
        animatorSet.start();
    }

    public final void setText(String str) {
        C18070vi.A0d(str, 0);
        this.A09.setText(str);
        this.A0A.setText(str);
    }

    public final HorizontalScrollView getHorizontalScrollView() {
        return this.A00;
    }

    public final int getScrollWidth() {
        return this.A05;
    }

    public final CharSequence getText() {
        CharSequence text = this.A09.getText();
        C18070vi.A0X(text);
        return text;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoScrollView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    public final void setText(int i) {
        this.A09.setText(i);
        this.A0A.setText(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
