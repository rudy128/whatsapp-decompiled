package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3Vl  reason: invalid class name */
public final class AnonymousClass3Vl extends C37981qV {
    public final C18000vb A00;

    public static final int A04(C42011xT r2) {
        RecyclerView recyclerView;
        C38391rD r0;
        ViewParent viewParent = null;
        View view = r2.A0H;
        if (view != null) {
            viewParent = view.getParent();
        }
        if (!(viewParent instanceof RecyclerView) || (recyclerView = (RecyclerView) viewParent) == null || (r0 = recyclerView.A0B) == null) {
            return 0;
        }
        return r0.A0Q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (A04(r10) > 2) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.C57072iU r7, X.C57072iU r8, X.C42011xT r9, X.C42011xT r10) {
        /*
            r6 = this;
            r2 = 1
            android.view.View r3 = r10.A0H
            int r0 = r10.A05()
            float r0 = (float) r0
            float r0 = -r0
            r3.setTranslationZ(r0)
            r10.A05()
            A04(r10)
            int r0 = r10.A05()
            r5 = 0
            r4 = 2
            if (r0 != 0) goto L_0x004b
            int r0 = A04(r10)
            if (r0 != r2) goto L_0x004b
            r0 = 0
        L_0x0021:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0025:
            float r5 = r0.floatValue()
            float[] r4 = new float[r4]
            float r1 = r3.getRotation()
            r0 = 0
            r4[r0] = r1
            X.0vb r0 = r6.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x003b
            float r5 = -r5
        L_0x003b:
            r4[r2] = r5
            java.lang.String r0 = "rotation"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r3, r0, r4)
        L_0x0043:
            android.animation.AnimatorSet r0 = r6.A05(r5, r10)
            r0.start()
            return r2
        L_0x004b:
            int r0 = r10.A05()
            r1 = 1086324736(0x40c00000, float:6.0)
            if (r0 != 0) goto L_0x005e
            int r0 = A04(r10)
            if (r0 <= r2) goto L_0x005e
        L_0x0059:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L_0x0025
        L_0x005e:
            int r0 = r10.A05()
            if (r0 != r2) goto L_0x006d
            int r0 = A04(r10)
            if (r0 != r4) goto L_0x006d
            r0 = -1048576000(0xffffffffc1800000, float:-16.0)
            goto L_0x0021
        L_0x006d:
            int r0 = r10.A05()
            if (r0 != r2) goto L_0x0043
            int r0 = A04(r10)
            if (r0 <= r4) goto L_0x0043
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Vl.A0H(X.2iU, X.2iU, X.1xT, X.1xT):boolean");
    }

    public boolean A0I(C42011xT r8) {
        String str;
        C72543Ml r4 = new C72543Ml(this, r8, 2);
        A06(r8);
        View view = r8.A0H;
        view.setTranslationZ(-9999.0f);
        int i = r8.A05;
        if (i == -1) {
            i = r8.A04;
        }
        float[] fArr = new float[2];
        if (i == -1) {
            fArr[0] = view.getAlpha();
            fArr[1] = 0.0f;
            str = "alpha";
        } else {
            fArr[0] = view.getRotation();
            float f = 6.0f;
            if (AnonymousClass3MW.A1Z(this.A00)) {
                f = -6.0f;
            }
            fArr[1] = f;
            str = "rotation";
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(200);
        ofFloat.addListener(r4);
        ofFloat.start();
        return true;
    }

    private final AnimatorSet A05(Animator animator, C42011xT r12) {
        float f;
        int A002;
        float f2;
        CardView cardView;
        View view = r12.A0H;
        view.setTranslationZ(-((float) r12.A05()));
        A06(r12);
        if (r12.A05() == 0) {
            f = 0.9f;
            if (A04(r12) == 1) {
                f = 1.0f;
            }
        } else {
            f = 0.81f;
        }
        int i = r12.A05;
        if (i == -1) {
            i = r12.A04;
        }
        if (i == 0 && A04(r12) == 1) {
            f2 = 0.0f;
        } else {
            int i2 = r12.A05;
            if (i2 == -1) {
                i2 = r12.A04;
            }
            if (i2 == 0) {
                A002 = C43531zx.A00(view, 2);
            } else {
                A002 = C43531zx.A00(view, 6);
            }
            f2 = -((float) A002);
        }
        view.setTranslationY(f2);
        int i3 = 2131166901;
        if (r12.A05() == 0) {
            i3 = 2131166900;
        }
        float dimension = AnonymousClass000.A0Y(view).getDimension(i3) / f;
        Animator[] animatorArr = new Animator[4];
        ObjectAnimator objectAnimator = null;
        if (view instanceof CardView) {
            cardView = (CardView) view;
        } else {
            cardView = null;
        }
        if (cardView != null) {
            objectAnimator = ObjectAnimator.ofFloat(cardView, "radius", new float[]{cardView.getRadius(), dimension});
        }
        animatorArr[0] = objectAnimator;
        animatorArr[1] = ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), f});
        animatorArr[2] = ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), f});
        animatorArr[3] = animator;
        List A0P = C200410p.A0P(animatorArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(A0P);
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    public static final void A06(C42011xT r2) {
        View view = r2.A0H;
        if (view != null) {
            view.setPivotX(((float) view.getLayoutParams().width) / 2.0f);
            view.setPivotY((float) view.getLayoutParams().height);
        }
    }

    public AnonymousClass3Vl(C18000vb r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(X.C42011xT r8) {
        /*
            r7 = this;
            int r0 = r8.A05()
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x002b
            int r0 = A04(r8)
            if (r0 != r4) goto L_0x002b
            android.view.View r1 = r8.A0H
            r0 = 0
            r1.setRotation(r0)
            boolean r0 = r1 instanceof androidx.cardview.widget.CardView
            if (r0 == 0) goto L_0x002b
            r2 = r1
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            if (r2 == 0) goto L_0x002b
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r1)
            r0 = 2131166900(0x7f0706b4, float:1.7948058E38)
            float r0 = r1.getDimension(r0)
            r2.setRadius(r0)
        L_0x002b:
            int r0 = r8.A05()
            r6 = 0
            java.lang.String r5 = "rotation"
            r1 = 2
            if (r0 != r4) goto L_0x008b
            int r0 = A04(r8)
            if (r0 != r1) goto L_0x008b
            android.view.View r3 = r8.A0H
            float[] r2 = new float[r1]
            float r1 = r3.getRotation()
        L_0x0043:
            r2[r6] = r1
            r1 = -1048576000(0xffffffffc1800000, float:-16.0)
            X.0vb r0 = r7.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0051
            r1 = 1098907648(0x41800000, float:16.0)
        L_0x0051:
            r2[r4] = r1
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r5, r2)
        L_0x0057:
            int r0 = r8.A05()
            if (r0 <= r4) goto L_0x007f
            android.view.View r1 = r8.A0H
            r0 = 1062165545(0x3f4f5c29, float:0.81)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            boolean r0 = r1 instanceof androidx.cardview.widget.CardView
            if (r0 == 0) goto L_0x007f
            r2 = r1
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            if (r2 == 0) goto L_0x007f
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r1)
            r0 = 2131166901(0x7f0706b5, float:1.794806E38)
            float r0 = r1.getDimension(r0)
            r2.setRadius(r0)
        L_0x007f:
            android.animation.AnimatorSet r0 = r7.A05(r3, r8)
            r0.start()
            boolean r0 = super.A0K(r8)
            return r0
        L_0x008b:
            int r0 = r8.A05()
            if (r0 != r1) goto L_0x0057
            android.view.View r3 = r8.A0H
            float[] r2 = new float[r1]
            r1 = -1040187392(0xffffffffc2000000, float:-32.0)
            X.0vb r0 = r7.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0043
            r1 = 1107296256(0x42000000, float:32.0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Vl.A0K(X.1xT):boolean");
    }
}
