package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.ClearableEditText;

/* renamed from: X.71R  reason: invalid class name */
public class AnonymousClass71R {
    public ValueAnimator A00;
    public ValueAnimator A01;
    public final Activity A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ClearableEditText A0A;
    public final C18000vb A0B;
    public final C111085iA A0C;
    public final C1192967n A0D;
    public final AnonymousClass1L4 A0E;
    public final C41111vp A0F;

    private void A00(AnimatorListenerAdapter animatorListenerAdapter, int i, int i2, long j) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 0;
            A1V[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            this.A01 = ofFloat;
            C108955ca.A19(ofFloat);
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A01.removeAllListeners();
        }
        this.A01.setDuration(j);
        View view = this.A04;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        this.A01.addUpdateListener(new C1411174i(layoutParams, this, i, view.getWidth(), i2, view.getHeight()));
        this.A01.addListener(animatorListenerAdapter);
        this.A01.start();
    }

    public static void A01(AnonymousClass71R r11, long j, boolean z) {
        C109195cy r7;
        int A022;
        int A023;
        AnonymousClass71R r6 = r11;
        long j2 = j;
        if (z) {
            int width = r6.A0A.getWidth();
            View view = r6.A03;
            int A024 = AnonymousClass3Ma.A02(view, 2131168696);
            r7 = new C109195cy(r6, 18);
            r6.A00(r7, width, A024, j2);
            if (!C72463Mc.A1O(r6.A0F)) {
                A023 = AnonymousClass3Ma.A02(view, 2131168538);
                A022 = AnonymousClass3Ma.A02(view, 2131168537);
            } else {
                return;
            }
        } else {
            View view2 = r6.A03;
            int A025 = AnonymousClass3Ma.A02(view2, 2131168695);
            int A026 = AnonymousClass3Ma.A02(view2, 2131168678);
            r7 = new C109195cy(r6, 19);
            r6.A00(r7, A025, A026, j2);
            if (!C72463Mc.A1O(r6.A0F)) {
                A022 = AnonymousClass3Ma.A02(view2, 2131168538);
                A023 = AnonymousClass3Ma.A02(view2, 2131168537);
            } else {
                return;
            }
        }
        ValueAnimator valueAnimator = r6.A00;
        if (valueAnimator == null) {
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 0;
            A1V[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            r6.A00 = ofFloat;
            C108955ca.A19(ofFloat);
        } else {
            valueAnimator.removeAllUpdateListeners();
            r6.A00.removeAllListeners();
        }
        r6.A00.setDuration(j);
        r6.A00.addUpdateListener(new A9F(r6.A05.getLayoutParams(), A022, A023, 2));
        r6.A00.addListener(r7);
        r6.A00.start();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1Ir, java.lang.Object] */
    public AnonymousClass71R(Activity activity, View view, AnonymousClass1F9 r8, AnonymousClass1FD r9, C18000vb r10, C1192967n r11, AnonymousClass1L4 r12, C41111vp r13) {
        this.A0E = r12;
        this.A0B = r10;
        this.A0D = r11;
        this.A03 = view;
        this.A02 = activity;
        this.A0F = r13;
        this.A0C = (C111085iA) new C24071It(new Object(), r9).A00(C111085iA.class);
        this.A09 = AnonymousClass3MW.A0J(view, 2131435776);
        this.A08 = AnonymousClass3MW.A0J(view, 2131430344);
        this.A06 = AnonymousClass1HF.A06(view, 2131435998);
        this.A05 = AnonymousClass1HF.A06(view, 2131434873);
        this.A0A = (ClearableEditText) AnonymousClass1HF.A06(view, 2131434882);
        this.A07 = AnonymousClass3MW.A0G(view, 2131434900);
        this.A04 = AnonymousClass1HF.A06(view, 2131434860);
        View view2 = this.A06;
        view2.setVisibility(0);
        TextView textView = this.A09;
        AnonymousClass78K.A00(textView, this, 28);
        TextView textView2 = this.A08;
        AnonymousClass78K.A00(textView2, this, 29);
        if (AnonymousClass3MW.A1Z(r10)) {
            textView.setBackgroundResource(2131232981);
            textView2.setBackgroundResource(2131232980);
        }
        view2.addOnLayoutChangeListener(new C1420978d(this, 9));
        ClearableEditText clearableEditText = this.A0A;
        clearableEditText.setHint(2131899369);
        clearableEditText.getBackground().setAlpha(clearableEditText.hasFocus() ? 230 : 204);
        clearableEditText.setOnFocusChangeListener(new AnonymousClass78V(this, 4));
        clearableEditText.addTextChangedListener(new AnonymousClass6Ic(clearableEditText, this.A05, this.A0C));
        clearableEditText.A01 = new AnonymousClass78K(this, 26);
        clearableEditText.setVisibility(4);
        clearableEditText.setAlwaysShowClearIcon(true);
        View view3 = this.A04;
        AnonymousClass78K.A00(view3, this, 27);
        view3.setVisibility(0);
        ImageView imageView = this.A07;
        imageView.setVisibility(0);
        imageView.requestLayout();
        A01(this, 0, false);
        C1192967n r2 = this.A0D;
        r2.A00 = new AnonymousClass7IM(this, 1);
        AnonymousClass3MY.A1L(this.A0C.A01, r2.A02);
        r2.A01((Integer) null);
        Boolean bool = C17970vW.A03;
        AnonymousClass7AQ.A01(r8, this.A0F, this, 5);
        C111085iA r22 = this.A0C;
        AnonymousClass7AQ.A01(r8, r22.A03, this, 6);
        AnonymousClass7AQ.A01(r8, r22.A01, this, 7);
        AnonymousClass7AQ.A01(r8, r22.A00, this, 8);
    }
}
