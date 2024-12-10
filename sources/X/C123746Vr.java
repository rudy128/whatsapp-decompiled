package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

/* renamed from: X.6Vr  reason: invalid class name and case insensitive filesystem */
public abstract class C123746Vr {
    public static void A00(View view, DOZ doz, DFL dfl, C26025Cqj cqj) {
        TextView A0J = AnonymousClass3MW.A0J(view, 2131436044);
        String A0D = dfl.A0D(38);
        if (A0D != null) {
            A0J.setText(A0D);
        }
        View A06 = AnonymousClass1HF.A06(view, 2131429078);
        View A062 = AnonymousClass1HF.A06(view, 2131436958);
        if (dfl.A04(41, 0) > 0) {
            float x = A062.getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x, AnonymousClass3MW.A00(A062.getResources(), 2131166685) + x});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C1411074h.A00(ofFloat, A062, 6);
            ofFloat.addListener(new C109155cu(A062, x, 0));
            ofFloat.start();
            AnonymousClass4a5.A03(cqj.A03);
        }
        A062.setOnClickListener(new C90084dV((Object) A06, (Object) dfl, (Object) doz, 10));
    }
}
