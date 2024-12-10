package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.7M6  reason: invalid class name */
public class AnonymousClass7M6 implements C1603187z {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public AnonymousClass7M6(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public static void A00(AnonymousClass7M6 r9, boolean z, boolean z2) {
        int measuredHeight = r9.A01.getMeasuredHeight();
        if (r9.A01.getVisibility() != 0) {
            C72473Md.A12(r9.A01, r9.A00.getMeasuredWidth(), Integer.MIN_VALUE);
            measuredHeight = r9.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = r9.A02;
        AnimatorSet animatorSet = statusesFragment.A01;
        if (animatorSet == null || (!animatorSet.isRunning() && !statusesFragment.A01.isStarted())) {
            statusesFragment.A01 = C108945cZ.A0B();
            int i = 8;
            float f = 100.0f;
            float f2 = 0.0f;
            if (z) {
                i = 0;
                f2 = 100.0f;
                f = 0.0f;
            }
            int i2 = 1;
            if (z2) {
                i2 = 500;
            }
            float[] A1V = C108945cZ.A1V();
            A1V[0] = f2;
            A1V[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            ofFloat.setDuration((long) i2);
            C108955ca.A19(ofFloat);
            ofFloat.addUpdateListener(new C1410474b(r9, measuredHeight, 2));
            ofFloat.addListener(new C109145ct(r9, i, 0, z));
            statusesFragment.A01.playSequentially(new Animator[]{ofFloat});
            C109195cy.A02(statusesFragment.A01, r9, 32);
            if (z) {
                statusesFragment.A01.setStartDelay(700);
            }
            statusesFragment.A01.start();
        }
    }

    public View BbX(Context context, View view, ViewGroup viewGroup, C37451pZ r7, List list, List list2, List list3, List list4, boolean z) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(2131435706);
        } else {
            View A09 = AnonymousClass3MX.A09(LayoutInflater.from(context), viewGroup, 2131627090);
            this.A00 = A09;
            StatusesFragment statusesFragment = this.A02;
            C108955ca.A1J(A09, statusesFragment, 2131896112);
            AnonymousClass1Y5.A02(this.A00, 2131896112);
            C89974dK.A00(this.A00, this, 40);
            C89974dK.A00(this.A00.findViewById(2131435700), this, 41);
            this.A01 = this.A00.findViewById(2131435706);
            C139586z5 r1 = statusesFragment.A0j;
            r1.A00 = new C127766et(viewGroup, this);
            C123476Up r0 = r1.A01;
            A00(this, r0.A04, r0.A03);
        }
        return this.A00;
    }
}
