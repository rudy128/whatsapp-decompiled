package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.CkQ  reason: case insensitive filesystem */
public final class C25695CkQ {
    public final int A00;
    public final AnimatorSet A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ValueAnimator A06;
    public final ValueAnimator A07;
    public final ValueAnimator A08;
    public final ValueAnimator A09;
    public final ValueAnimator A0A;
    public final ValueAnimator A0B;
    public final Context A0C;

    public C25695CkQ(View view) {
        View view2 = view;
        this.A02 = view2;
        ImageView imageView = (ImageView) AnonymousClass3MX.A0C(view2, 2131437081);
        this.A03 = imageView;
        ImageView imageView2 = (ImageView) AnonymousClass3MX.A0C(view2, 2131437084);
        this.A04 = imageView2;
        ImageView imageView3 = (ImageView) AnonymousClass3MX.A0C(view2, 2131437085);
        this.A05 = imageView3;
        Context A042 = AnonymousClass3MY.A04(view2);
        this.A0C = A042;
        int A002 = C19740yt.A00(A042, 2131102660);
        int A003 = C19740yt.A00(A042, 2131102661);
        this.A00 = A003;
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer valueOf = Integer.valueOf(A002);
        Integer valueOf2 = Integer.valueOf(A003);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, new Object[]{valueOf, valueOf2});
        C26323Cxg.A00(ofObject, this, 21);
        this.A06 = ofObject;
        ValueAnimator A004 = A00(valueOf2, valueOf);
        C26323Cxg.A00(A004, this, 22);
        this.A07 = A004;
        ValueAnimator A005 = A00(valueOf, valueOf2);
        C26323Cxg.A00(A005, this, 23);
        this.A08 = A005;
        ValueAnimator A006 = A00(valueOf2, valueOf);
        C26323Cxg.A00(A006, this, 24);
        this.A09 = A006;
        ValueAnimator A007 = A00(valueOf, valueOf2);
        C26323Cxg.A00(A007, this, 25);
        this.A0A = A007;
        ValueAnimator A008 = A00(valueOf2, valueOf);
        C26323Cxg.A00(A008, this, 26);
        this.A0B = A008;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        BEQ.A00(animatorSet, this, 20);
        A004.setStartDelay(470);
        A006.setStartDelay(470);
        A008.setStartDelay(470);
        imageView.setColorFilter(A002);
        imageView2.setColorFilter(A002);
        imageView3.setColorFilter(A002);
        Animator[] animatorArr = new Animator[6];
        animatorArr[0] = A004;
        animatorArr[1] = A005;
        BE7.A1F(A006, A007, animatorArr);
        C72453Mb.A1T(A008, ofObject, animatorArr);
        animatorSet.playSequentially(animatorArr);
        animatorSet.setDuration(0);
    }

    public static ValueAnimator A00(Object obj, Object obj2) {
        return ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{obj, obj2});
    }

    public final void A01() {
        ImageView imageView = this.A05;
        int i = this.A00;
        imageView.setColorFilter(i);
        this.A04.setColorFilter(i);
        this.A03.setColorFilter(i);
    }
}
