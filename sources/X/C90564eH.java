package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4eH  reason: invalid class name and case insensitive filesystem */
public final class C90564eH implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ TextView A04;
    public final /* synthetic */ Toolbar A05;
    public final /* synthetic */ C108865cQ A06;
    public final /* synthetic */ C86134Qi A07;
    public final /* synthetic */ Integer A08;

    public C90564eH(View view, ViewGroup viewGroup, TextView textView, Toolbar toolbar, C108865cQ r5, C86134Qi r6, Integer num, int i, long j) {
        this.A06 = r5;
        this.A08 = num;
        this.A07 = r6;
        this.A04 = textView;
        this.A03 = viewGroup;
        this.A00 = i;
        this.A05 = toolbar;
        this.A01 = j;
        this.A02 = view;
    }

    public void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        int i4;
        int measuredWidth;
        ValueAnimator duration;
        C108865cQ r7 = this.A06;
        int intValue = this.A08.intValue();
        if (intValue != 0) {
            i = 54;
        } else {
            i = 26;
        }
        View findViewById = r7.findViewById(i);
        if (findViewById != null) {
            C86134Qi r6 = this.A07;
            TextView textView = this.A04;
            C18000vb r15 = r6.A02;
            textView.setBackground(AnonymousClass3NL.A00(r7.CFa(), r15, 2131233098));
            if (intValue != 0) {
                i2 = 2131892822;
            } else {
                i2 = 2131896294;
            }
            textView.setText(i2);
            textView.setVisibility(0);
            AnonymousClass1Y5.A00(r7.getWAContext().A00, r7.getSystemServices(), r7.getString(i2));
            ViewGroup viewGroup = this.A03;
            int i5 = this.A00;
            Toolbar toolbar = this.A05;
            Context context = r7.getWAContext().A00;
            C18070vi.A0X(context);
            int A012 = C62762rw.A01(context, 30.0f);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            textView.measure(0, 0);
            if (toolbar != null) {
                i3 = toolbar.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            int A013 = (i5 + i3) - C62762rw.A01(r7.getWAContext().A00, 20.0f);
            Resources resources = context.getResources();
            if (intValue != 0) {
                i4 = 2131168056;
            } else {
                i4 = 2131167081;
            }
            int A014 = AnonymousClass3MW.A01(resources, i4);
            int measuredWidth2 = findViewById.getMeasuredWidth() / 2;
            if (AnonymousClass3MY.A1b(r15)) {
                measuredWidth = iArr[0] + measuredWidth2;
            } else {
                measuredWidth = viewGroup.getMeasuredWidth() - (iArr[0] + measuredWidth2);
            }
            int i6 = measuredWidth + A012;
            int min = Math.min(A014, textView.getMeasuredWidth());
            int i7 = i6;
            if (i6 > min) {
                i7 = min;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i7;
                textView.setLayoutParams(layoutParams);
                C27641Ww.A06(textView, r15, i6 - i7, A013, 0, 0);
                long j = this.A01;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f});
                r6.A00 = ofFloat;
                if (!(ofFloat == null || (duration = ofFloat.setDuration(320)) == null)) {
                    duration.start();
                }
                r7.getGlobalUI().A0K(r6.A03, j);
                AnonymousClass3MY.A1D(this.A02, this);
                return;
            }
            throw AnonymousClass3MY.A0k();
        }
    }
}
