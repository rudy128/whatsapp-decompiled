package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BGs  reason: case insensitive filesystem */
public final class C22632BGs extends Transition {
    public int A00;
    public int A01;
    public final Rect A02 = AnonymousClass3MW.A07();
    public final boolean A03;
    public final int[] A04 = C108945cZ.A1W();
    public final Context A05;
    public final AnonymousClass4ZR A06;

    public void captureEndValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && !this.A03) {
            AnonymousClass4ZR r3 = this.A06;
            String str2 = null;
            if (r3 != null) {
                str = r3.A02(2131899525);
            } else {
                str = null;
            }
            if (C18070vi.A18(str, AnonymousClass1Xr.A02(view))) {
                int[] iArr = this.A04;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A02(2131899524);
            }
            if (C18070vi.A18(str2, AnonymousClass1Xr.A02(view))) {
                int[] iArr2 = this.A04;
                view.getLocationOnScreen(iArr2);
                this.A00 = AnonymousClass3MW.A02(view, iArr2[1]);
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && this.A03) {
            AnonymousClass4ZR r3 = this.A06;
            String str2 = null;
            if (r3 != null) {
                str = r3.A02(2131899525);
            } else {
                str = null;
            }
            if (C18070vi.A18(str, AnonymousClass1Xr.A02(view))) {
                int[] iArr = this.A04;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A02(2131899524);
            }
            if (C18070vi.A18(str2, AnonymousClass1Xr.A02(view))) {
                int[] iArr2 = this.A04;
                view.getLocationOnScreen(iArr2);
                this.A00 = AnonymousClass3MW.A02(view, iArr2[1]);
            }
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = 0;
        A1b[1] = 1;
        ValueAnimator ofObject = ValueAnimator.ofObject(floatEvaluator, A1b);
        ofObject.addUpdateListener(new C26315CxY(this, transitionValues2, 8));
        return ofObject;
    }

    public C22632BGs(Context context, AnonymousClass4ZR r3, boolean z) {
        this.A06 = r3;
        this.A03 = z;
        this.A05 = context;
    }
}
