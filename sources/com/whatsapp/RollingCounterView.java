package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C108945cZ;
import X.C108985cd;
import X.C109195cy;
import X.C114685rh;
import X.C128946gw;
import X.C1409073n;
import X.C1410974g;
import X.C17960vV;
import X.C72463Mc;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RollingCounterView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C128946gw A05;
    public C128946gw A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public String A09;
    public final Rect A0A = AnonymousClass3MW.A07();
    public final ValueAnimator A0B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final ValueAnimator A0C = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    private void setupWidthAnimator(int i) {
        int measuredWidth = this.A07.getMeasuredWidth();
        int measuredHeight = this.A07.getMeasuredHeight();
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this);
        int i2 = A0B2.leftMargin;
        int i3 = A0B2.rightMargin;
        ValueAnimator valueAnimator = this.A0C;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new C1410974g(this, i - measuredWidth, measuredWidth, measuredHeight, i2, i3));
    }

    public static void A01(C128946gw r8, RollingCounterView rollingCounterView) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        rollingCounterView.A05 = r8;
        TextEmojiLabel textEmojiLabel = rollingCounterView.A08;
        String str = rollingCounterView.A09;
        if (str == null) {
            int i = r8.A00;
            if (rollingCounterView instanceof C114685rh) {
                C114685rh r0 = (C114685rh) rollingCounterView;
                str = C1409073n.A01(AnonymousClass3MY.A04(r0), r0.getWhatsAppLocale(), i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        C72463Mc.A12(rollingCounterView.A07);
        C72463Mc.A12(rollingCounterView.A08);
        long j = r8.A02;
        if (j == 0 && r8.A03 == 0) {
            int measuredWidth = rollingCounterView.A08.getMeasuredWidth();
            int measuredHeight = rollingCounterView.A08.getMeasuredHeight();
            int i2 = rollingCounterView.A01;
            int i3 = rollingCounterView.A02;
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(rollingCounterView);
            A0B2.width = measuredWidth;
            A0B2.height = measuredHeight;
            A0B2.leftMargin = i2;
            A0B2.rightMargin = i3;
            rollingCounterView.A0A.set(0, 0, measuredWidth, measuredHeight);
            rollingCounterView.setLayoutParams(A0B2);
            A02(rollingCounterView);
            return;
        }
        int measuredWidth2 = rollingCounterView.A08.getMeasuredWidth() - rollingCounterView.A07.getMeasuredWidth();
        AnimatorSet A0B3 = C108945cZ.A0B();
        if (measuredWidth2 != 0) {
            rollingCounterView.setupWidthAnimator(rollingCounterView.A08.getMeasuredWidth());
            Animator[] animatorArr = new Animator[2];
            if (measuredWidth2 > 0) {
                animatorArr[0] = rollingCounterView.A0C;
                valueAnimator2 = rollingCounterView.A0B;
                valueAnimator = valueAnimator2;
            } else {
                valueAnimator = rollingCounterView.A0B;
                animatorArr[0] = valueAnimator;
                valueAnimator2 = rollingCounterView.A0C;
            }
            animatorArr[1] = valueAnimator2;
            A0B3.playSequentially(animatorArr);
        } else {
            valueAnimator = rollingCounterView.A0B;
            A0B3.play(valueAnimator);
        }
        rollingCounterView.A0C.setDuration(r8.A03);
        valueAnimator.setDuration(j);
        A0B3.start();
    }

    public static void A02(RollingCounterView rollingCounterView) {
        C128946gw r0 = rollingCounterView.A05;
        if (r0 == null) {
            C17960vV.A0B(AnonymousClass000.A0n("finishedAnimationl called when currentAnimationInfo is null! This should never occur."));
            return;
        }
        int i = r0.A00;
        rollingCounterView.A00 = i;
        TextEmojiLabel textEmojiLabel = rollingCounterView.A07;
        String str = rollingCounterView.A09;
        if (str == null) {
            if (rollingCounterView instanceof C114685rh) {
                C114685rh r02 = (C114685rh) rollingCounterView;
                str = C1409073n.A01(AnonymousClass3MY.A04(r02), r02.getWhatsAppLocale(), i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        rollingCounterView.A07.requestLayout();
        rollingCounterView.A08.requestLayout();
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(rollingCounterView);
        A0B2.leftMargin = rollingCounterView.A01;
        A0B2.rightMargin = rollingCounterView.A02;
        rollingCounterView.setLayoutParams(A0B2);
        C128946gw r1 = rollingCounterView.A06;
        if (r1 != null) {
            rollingCounterView.A06 = null;
            A01(r1, rollingCounterView);
            return;
        }
        rollingCounterView.A05 = null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        float f;
        if (view == this.A07 || view == this.A08) {
            C128946gw r0 = this.A05;
            if (r0 == null) {
                i = 0;
            } else {
                i = r0.A01;
            }
            ValueAnimator valueAnimator = this.A0B;
            if (valueAnimator.isRunning()) {
                f = C108985cd.A00(valueAnimator);
            } else {
                f = 0.0f;
            }
            if (view == this.A08) {
                i = -i;
                f = 1.0f - f;
            }
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.A0A;
            if (rect.isEmpty()) {
                rect.set(0, 0, getMeasuredWidth(), measuredHeight);
            }
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(0.0f, ((float) (-measuredHeight)) * f * ((float) i));
            view.draw(canvas);
            canvas.restore();
            if (valueAnimator.isRunning()) {
                invalidate();
                return true;
            }
        } else {
            C17960vV.A0B(AnonymousClass000.A0k("drawChild given something other than primary/secondary textview"));
        }
        return false;
    }

    public String getPrimaryText() {
        if (TextUtils.isEmpty(this.A07.getText())) {
            return null;
        }
        return this.A07.getText().toString();
    }

    public void setAnimationInterpolator(TimeInterpolator timeInterpolator) {
        this.A0B.setInterpolator(timeInterpolator);
        this.A0C.setInterpolator(timeInterpolator);
    }

    public void setTextColor(int i) {
        this.A07.setTextColor(i);
        this.A08.setTextColor(i);
    }

    public RollingCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A07 = new TextEmojiLabel(getContext());
        this.A08 = new TextEmojiLabel(getContext());
        super.addView(this.A07);
        super.addView(this.A08);
        C109195cy.A02(this.A0B, this, 1);
    }

    public RollingCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RollingCounterView(Context context) {
        super(context);
        A00();
    }
}
