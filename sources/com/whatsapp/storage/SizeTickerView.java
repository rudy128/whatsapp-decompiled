package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass3Mf;
import X.AnonymousClass4IZ;
import X.C17880vN;
import X.C72463Mc;
import X.C72483Me;
import X.C88584aA;
import X.C88714af;
import X.C88754aj;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class SizeTickerView extends WaTextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public boolean A07;

    public SizeTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A0M(int i, long j, boolean z) {
        long j2 = j;
        if (z) {
            ArrayList A13 = AnonymousClass000.A13();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = new AnimatorSet();
            long j3 = this.A05;
            if (j3 != j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 10});
                ofInt.addUpdateListener(new C88714af(this, j3, j2));
                A13.add(ofInt);
            }
            if (this.A02 != i) {
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, this.A02);
                C17880vN.A1T(objArr, i, 1);
                ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
                C88754aj.A00(ofObject, this, 22);
                A13.add(ofObject);
            }
            this.A06.addListener(new AnonymousClass3Mf(this, i, j));
            this.A06.setInterpolator(new LinearInterpolator());
            this.A06.setDuration((long) this.A01);
            this.A06.setStartDelay((long) this.A00);
            this.A06.playTogether(A13);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j;
        this.A02 = i;
        setTextColor(i);
        A0F(this);
    }

    public static void A0F(SizeTickerView sizeTickerView) {
        CharSequence charSequence;
        CharSequence[] split = C88584aA.A02(sizeTickerView.A03, sizeTickerView.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            charSequence = "";
        } else if (length == 1) {
            charSequence = split[0];
        } else {
            SpannableString spannableString = new SpannableString(split[1]);
            spannableString.setSpan(new AbsoluteSizeSpan(sizeTickerView.A03), 0, split[1].length(), 18);
            charSequence = TextUtils.concat(new CharSequence[]{split[0], " ", spannableString});
        }
        sizeTickerView.setText(charSequence);
    }

    public void A0I() {
        if (!this.A07) {
            this.A07 = true;
            C72483Me.A0s(C72463Mc.A0X(this), this);
        }
    }

    public SizeTickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0I();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A06);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
        setTextSize(0, (float) this.A04);
    }

    public SizeTickerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
