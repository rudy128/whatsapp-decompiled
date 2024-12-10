package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5cy  reason: invalid class name and case insensitive filesystem */
public class C109195cy extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public static final ValueAnimator A01(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view2 = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        int i = marginLayoutParams.leftMargin;
        int i2 = marginLayoutParams.topMargin;
        int i3 = marginLayoutParams.bottomMargin;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        ofFloat.setDuration(ofFloat.getDuration());
        ofFloat.addUpdateListener(new C1410874f(view2, i, i2, i3, 0));
        return ofFloat;
    }

    public C109195cy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final ObjectAnimator A00(View view) {
        if (view == null) {
            return null;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        Property property = View.ALPHA;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        return ObjectAnimator.ofFloat(view, property, A1V);
    }

    public static void A02(Animator animator, Object obj, int i) {
        animator.addListener(new C109195cy(obj, i));
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 2:
            case 3:
                super.onAnimationCancel(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A01;
                callDetailsLayout.A00 = 0;
                callDetailsLayout.clearAnimation();
                return;
            case 4:
                Log.i("PipViewContainer/animatePiPView onAnimationCancel");
                PipViewContainer pipViewContainer = (PipViewContainer) this.A01;
                PipViewContainer.A02(pipViewContainer);
                PipViewContainer.A05(pipViewContainer, false);
                return;
            case 30:
                animator.removeListener(this);
                return;
            case 38:
                ((C109945eR) this.A01).A0c = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0384, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0386, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0150, code lost:
        r1.height = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016a, code lost:
        r2.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r1.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0267, code lost:
        X.C108975cc.A0u(r1, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x03eb;
                case 2: goto L_0x03d6;
                case 3: goto L_0x0398;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0005;
                case 6: goto L_0x0387;
                case 7: goto L_0x037d;
                case 8: goto L_0x036e;
                case 9: goto L_0x035a;
                case 10: goto L_0x0005;
                case 11: goto L_0x004e;
                case 12: goto L_0x02ec;
                case 13: goto L_0x026d;
                case 14: goto L_0x0263;
                case 15: goto L_0x0005;
                case 16: goto L_0x0253;
                case 17: goto L_0x0247;
                case 18: goto L_0x022b;
                case 19: goto L_0x021a;
                case 20: goto L_0x020b;
                case 21: goto L_0x01fb;
                case 22: goto L_0x0013;
                case 23: goto L_0x01dd;
                case 24: goto L_0x0005;
                case 25: goto L_0x01d3;
                case 26: goto L_0x01cb;
                case 27: goto L_0x0009;
                case 28: goto L_0x01ba;
                case 29: goto L_0x01a1;
                case 30: goto L_0x018d;
                case 31: goto L_0x0181;
                case 32: goto L_0x016e;
                case 33: goto L_0x0153;
                case 34: goto L_0x013f;
                case 35: goto L_0x0153;
                case 36: goto L_0x012d;
                case 37: goto L_0x011f;
                case 38: goto L_0x0117;
                case 39: goto L_0x010b;
                case 40: goto L_0x00fe;
                case 41: goto L_0x0153;
                case 42: goto L_0x00ec;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0153;
                case 46: goto L_0x00da;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r9)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r8.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x0013:
            java.lang.Object r0 = r8.A01
            X.6uj r0 = (X.C136986uj) r0
            X.7JF r3 = r0.A05
            X.6uj r0 = r3.A0W
            X.7JS r2 = r0.A0G
            int r1 = r2.A09()
            r0 = 1
            if (r1 != r0) goto L_0x0038
            X.5cz r0 = r3.A03
            if (r0 == 0) goto L_0x0038
            X.1FL r0 = r3.A0A
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0038
            X.5cz r0 = r3.A03
        L_0x0032:
            if (r0 == 0) goto L_0x0008
            r0.show()
            return
        L_0x0038:
            int r1 = r2.A09()
            r0 = 3
            if (r1 != r0) goto L_0x0008
            X.5d1 r0 = r3.A04
            if (r0 == 0) goto L_0x0008
            X.1FL r0 = r3.A0A
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0008
            X.5d1 r0 = r3.A04
            goto L_0x0032
        L_0x004e:
            java.lang.Object r5 = r8.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r5 = (com.whatsapp.mediacomposer.VideoComposerFragment) r5
            X.1bI r0 = r5.A0U
            if (r0 == 0) goto L_0x0008
            android.view.View r7 = r0.A02()
            if (r7 == 0) goto L_0x0008
            r0 = 2131436195(0x7f0b22a3, float:1.8494254E38)
            android.view.View r6 = r7.findViewById(r0)
            com.whatsapp.mediacomposer.VideoTimelineView r6 = (com.whatsapp.mediacomposer.VideoTimelineView) r6
            java.io.File r2 = r5.A0Z
            long r0 = X.C108995ce.A09(r5)
            r6.A06(r2, r0)
            long r2 = r5.A06
            long r0 = r5.A07
            r6.A0A = r2
            r6.A0B = r0
            r6.invalidate()
            boolean r0 = r5.A0g
            long r3 = r5.A02
            if (r0 == 0) goto L_0x0087
            r1 = 7000(0x1b58, double:3.4585E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r3 = 7000(0x1b58, double:3.4585E-320)
        L_0x0087:
            r6.A09 = r3
            r0 = 1
            r6.setImportantForAccessibility(r0)
            r6.requestLayout()
            r5.A0Q = r6
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r7, r0)
            X.80B r0 = new X.80B
            r0.<init>(r5)
            X.C84084Hu.A00(r1, r0)
            return
        L_0x00a2:
            java.lang.String r0 = "PipViewContainer/animatePiPView onAnimationEnd"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r8.A01
            com.whatsapp.calling.callgrid.view.PipViewContainer r1 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r1
            com.whatsapp.calling.callgrid.view.PipViewContainer.A02(r1)
            r0 = 0
            com.whatsapp.calling.callgrid.view.PipViewContainer.A05(r1, r0)
            X.0vp r0 = r1.A0H
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0008
            com.whatsapp.calling.callgrid.view.PipViewContainer.A03(r1)
            com.whatsapp.calling.callgrid.view.PipViewContainer.A01(r1)
            return
        L_0x00c1:
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            android.view.ViewGroup r1 = r2.A0C
            if (r1 == 0) goto L_0x0008
            android.view.View$OnLayoutChangeListener r0 = r2.A2H
            r1.removeOnLayoutChangeListener(r0)
            android.animation.AnimatorSet r0 = r2.A04
            r0.removeAllListeners()
            r0 = 0
            r2.A04 = r0
            return
        L_0x00da:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C55872gV.A07
            goto L_0x0150
        L_0x00ec:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C139216yQ.A06
            goto L_0x0150
        L_0x00fe:
            super.onAnimationEnd(r9)
            java.lang.Object r0 = r8.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.6o5 r0 = r0.A0f
            r0.A00()
            return
        L_0x010b:
            java.lang.Object r1 = r8.A01
            X.5eR r1 = (X.C109945eR) r1
            r0 = 4
            X.C108975cc.A0u(r1, r0)
            X.C109945eR.A00(r1)
            return
        L_0x0117:
            java.lang.Object r1 = r8.A01
            X.5eR r1 = (X.C109945eR) r1
            r0 = 0
            r1.A0c = r0
            return
        L_0x011f:
            super.onAnimationEnd(r9)
            java.lang.Object r0 = r8.A01
            com.whatsapp.util.FloatingChildLayout r0 = (com.whatsapp.util.FloatingChildLayout) r0
            android.view.View r1 = r0.A07
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x012d:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C137926wF.A01
            goto L_0x0150
        L_0x013f:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C138856xo.A01
        L_0x0150:
            r1.height = r0
            goto L_0x016a
        L_0x0153:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
            r0 = 8
            r2.setVisibility(r0)
        L_0x016a:
            r2.requestLayout()
            return
        L_0x016e:
            java.lang.Object r0 = r8.A01
            X.7M6 r0 = (X.AnonymousClass7M6) r0
            com.whatsapp.status.StatusesFragment r0 = r0.A02
            X.6z5 r2 = r0.A0j
            X.6Up r1 = r2.A01()
            r0 = 0
            r1.A03 = r0
            X.C139586z5.A00(r2)
            return
        L_0x0181:
            java.lang.Object r0 = r8.A01
            X.79A r0 = (X.AnonymousClass79A) r0
            java.lang.Object r1 = r0.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x018d:
            java.lang.Object r2 = r8.A01
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            java.util.List r1 = r2.A1B
            java.util.List r0 = r2.A1C
            r1.removeAll(r0)
            X.5fE r0 = r2.A0e
            r0.notifyDataSetChanged()
            r0 = 0
            r2.A00 = r0
            return
        L_0x01a1:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            X.6qA r2 = (X.C134176qA) r2
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r2.A07
            java.lang.String r0 = r2.A0A
            r1.setHint(r0)
            android.widget.TextView r1 = r2.A05
            X.AnonymousClass3MW.A1S(r1)
            r0 = 0
            goto L_0x01f2
        L_0x01ba:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r0 = r8.A01
            X.6qA r0 = (X.C134176qA) r0
            android.widget.TextView r0 = r0.A06
            X.AnonymousClass3MW.A1S(r0)
            return
        L_0x01cb:
            java.lang.Object r0 = r8.A01
            X.70F r0 = (X.AnonymousClass70F) r0
            android.view.View r1 = r0.A0H
            goto L_0x0267
        L_0x01d3:
            java.lang.Object r0 = r8.A01
            X.6A8 r0 = (X.AnonymousClass6A8) r0
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = r0.A06
            r0.A2D()
            return
        L_0x01dd:
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            android.view.View r1 = r3.A02
            java.lang.String r2 = "titleBar"
            if (r1 == 0) goto L_0x01f6
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x01f6
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x01f2:
            r1.setAlpha(r0)
            return
        L_0x01f6:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x01fb:
            super.onAnimationEnd(r9)
            java.lang.Object r0 = r8.A01
            X.6uj r0 = (X.C136986uj) r0
            android.animation.ValueAnimator r0 = r0.A0D
            r0.removeAllUpdateListeners()
            r0.removeAllListeners()
            return
        L_0x020b:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onAnimationEnd(r9)
            java.lang.Object r0 = r8.A01
            X.6ov r0 = (X.C133536ov) r0
            r0.A01()
            return
        L_0x021a:
            java.lang.Object r2 = r8.A01
            X.71R r2 = (X.AnonymousClass71R) r2
            android.view.View r1 = r2.A04
            r0 = 1
            r1.setClickable(r0)
            r1 = 0
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            return
        L_0x022b:
            java.lang.Object r3 = r8.A01
            X.71R r3 = (X.AnonymousClass71R) r3
            android.view.View r1 = r3.A04
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.ClearableEditText r2 = r3.A0A
            r0 = 0
            r2.setVisibility(r0)
            android.widget.ImageView r1 = r3.A07
            r0 = 2131232269(0x7f08060d, float:1.8080642E38)
            r1.setImageResource(r0)
            r2.requestFocus()
            return
        L_0x0247:
            java.lang.Object r0 = r8.A01
            X.6eN r0 = (X.C127446eN) r0
            X.6c6 r0 = r0.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = r0.A00
            r0.A2W()
            return
        L_0x0253:
            java.lang.Object r0 = r8.A01
            X.6eN r0 = (X.C127446eN) r0
            X.6c6 r0 = r0.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = r0.A00
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r1)
            com.whatsapp.mediacomposer.MediaComposerActivity.A1B(r1, r0)
            return
        L_0x0263:
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
        L_0x0267:
            r0 = 8
            X.C108975cc.A0u(r1, r0)
            return
        L_0x026d:
            java.lang.Object r5 = r8.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r5 = (com.whatsapp.mediacomposer.VideoComposerFragment) r5
            X.1bI r0 = r5.A0U
            if (r0 == 0) goto L_0x0280
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x0280
            r0 = 8
            X.C108975cc.A0u(r1, r0)
        L_0x0280:
            X.1bI r0 = r5.A0V
            if (r0 == 0) goto L_0x028f
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x028f
            r0 = 8
            X.C108975cc.A0u(r1, r0)
        L_0x028f:
            X.1bI r0 = r5.A0V
            if (r0 == 0) goto L_0x0296
            r0.A02()
        L_0x0296:
            android.animation.AnimatorSet r2 = X.C108945cZ.A0B()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r0 = 4
            android.animation.Animator[] r3 = new android.animation.Animator[r0]
            android.widget.FrameLayout r0 = r5.A0F
            r4 = 0
            if (r0 == 0) goto L_0x02ea
            android.animation.ValueAnimator r1 = A01(r0)
        L_0x02ab:
            r0 = 0
            r3[r0] = r1
            android.view.View r0 = r5.A0B
            if (r0 == 0) goto L_0x02e8
            android.animation.ValueAnimator r1 = A01(r0)
        L_0x02b6:
            r0 = 1
            r3[r0] = r1
            X.6uj r0 = r5.A0R
            if (r0 == 0) goto L_0x02e6
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            android.animation.Animator r1 = r0.getTitleBarShowAnimator()
        L_0x02c3:
            r0 = 2
            r3[r0] = r1
            X.8Ai r0 = r5.A29()
            if (r0 == 0) goto L_0x02d8
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r0 = r0.A0a
            if (r0 == 0) goto L_0x02d8
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r0.A07
            android.animation.Animator r4 = r0.getBottomBarShowAnimator()
        L_0x02d8:
            r0 = 3
            r3[r0] = r4
            java.util.List r0 = X.C200410p.A0P(r3)
            r2.playTogether(r0)
            r2.start()
            return
        L_0x02e6:
            r1 = r4
            goto L_0x02c3
        L_0x02e8:
            r1 = r4
            goto L_0x02b6
        L_0x02ea:
            r1 = r4
            goto L_0x02ab
        L_0x02ec:
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r3 = (com.whatsapp.mediacomposer.VideoComposerFragment) r3
            X.1bI r0 = r3.A0V
            r6 = 0
            if (r0 == 0) goto L_0x0358
            android.view.View r5 = r0.A02()
        L_0x02f9:
            int r4 = r3.A01
            if (r5 == 0) goto L_0x031c
            if (r4 == 0) goto L_0x031c
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x031c
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x031c
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r5)
            r0 = 2131169545(0x7f071109, float:1.7953423E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r0 + r4
            r2.topMargin = r0
            r5.setLayoutParams(r2)
        L_0x031c:
            android.animation.AnimatorSet r4 = X.C108945cZ.A0B()
            r0 = 2
            android.animation.Animator[] r2 = new android.animation.Animator[r0]
            X.1bI r0 = r3.A0U
            if (r0 == 0) goto L_0x0356
            android.view.View r0 = r0.A02()
        L_0x032b:
            android.animation.ObjectAnimator r1 = A00(r0)
            r0 = 0
            r2[r0] = r1
            X.1bI r0 = r3.A0V
            if (r0 == 0) goto L_0x033a
            android.view.View r6 = r0.A02()
        L_0x033a:
            android.animation.ObjectAnimator r1 = A00(r6)
            r0 = 1
            r2[r0] = r1
            java.util.List r0 = X.C200410p.A0P(r2)
            r4.playTogether(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            r0 = 11
            A02(r4, r3, r0)
            r4.start()
            return
        L_0x0356:
            r0 = r6
            goto L_0x032b
        L_0x0358:
            r5 = r6
            goto L_0x02f9
        L_0x035a:
            java.lang.Object r3 = r8.A01
            com.whatsapp.components.AnimatingArrowsLayout r3 = (com.whatsapp.components.AnimatingArrowsLayout) r3
            android.animation.AnimatorSet r2 = r3.A03
            r2.getClass()
            r1 = 25
            X.7Pc r0 = new X.7Pc
            r0.<init>(r2, r1)
            r3.post(r0)
            return
        L_0x036e:
            java.lang.Object r2 = r8.A01
            X.701 r2 = (X.AnonymousClass701) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0B
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r2.A0C
            r0 = 0
            goto L_0x0384
        L_0x037d:
            java.lang.Object r0 = r8.A01
            X.701 r0 = (X.AnonymousClass701) r0
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r0.A0C
            r0 = 1
        L_0x0384:
            r1.A00 = r0
            return
        L_0x0387:
            super.onAnimationEnd(r9)
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setTranslationY(r0)
            return
        L_0x0398:
            super.onAnimationCancel(r9)
            java.lang.Object r4 = r8.A01
            com.whatsapp.calling.CallDetailsLayout r4 = (com.whatsapp.calling.CallDetailsLayout) r4
            r0 = 2
            r4.A00 = r0
            r3 = 8
            X.1ba r2 = new X.1ba
            r2.<init>()
            r0 = 400(0x190, double:1.976E-321)
            r2.A0C(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.A0D(r0)
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C29191bl.A02(r0, r2)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A08
            r0.setVisibility(r3)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167211(0x7f0707eb, float:1.794869E38)
            java.lang.Integer r0 = X.AnonymousClass3MY.A0i(r1, r0)
            com.whatsapp.calling.CallDetailsLayout.A00(r4, r0)
            r4.clearAnimation()
            return
        L_0x03d6:
            super.onAnimationEnd(r9)
            java.lang.Object r2 = r8.A01
            com.whatsapp.calling.CallDetailsLayout r2 = (com.whatsapp.calling.CallDetailsLayout) r2
            r0 = 2
            r2.A00 = r0
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A08
            r0 = 8
            r1.setVisibility(r0)
            r2.clearAnimation()
            return
        L_0x03eb:
            java.lang.Object r0 = r8.A01
            com.whatsapp.RollingCounterView r0 = (com.whatsapp.RollingCounterView) r0
            com.whatsapp.RollingCounterView.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109195cy.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.A00) {
            case 4:
                Log.i("PipViewContainer/animatePiPView onAnimationRepeat");
                return;
            case 5:
                super.onAnimationRepeat(animator);
                C116165wV r1 = (C116165wV) this.A01;
                if (!r1.A05.A0I) {
                    C116165wV.A00(r1);
                    return;
                }
                return;
            case 10:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
                C130576jf r0 = identityVerificationActivity.A0G;
                if (r0 != null) {
                    r0.A00.setVisibility(8);
                    C130576jf r02 = identityVerificationActivity.A0G;
                    if (r02 != null) {
                        r02.A01.setVisibility(0);
                        C130576jf r03 = identityVerificationActivity.A0G;
                        if (r03 != null) {
                            r03.A01.A04();
                            return;
                        }
                    }
                }
                C18070vi.A11("soteriaViewHolder");
                throw null;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        if (r2 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r2.setAlpha(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationStart(android.animation.Animator r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 1: goto L_0x0125;
                case 4: goto L_0x0117;
                case 6: goto L_0x0009;
                case 7: goto L_0x010c;
                case 15: goto L_0x00ff;
                case 18: goto L_0x00ee;
                case 19: goto L_0x00d2;
                case 20: goto L_0x00bf;
                case 24: goto L_0x00a8;
                case 28: goto L_0x0089;
                case 29: goto L_0x0076;
                case 34: goto L_0x0069;
                case 36: goto L_0x0069;
                case 38: goto L_0x0061;
                case 39: goto L_0x0056;
                case 42: goto L_0x0069;
                case 43: goto L_0x0044;
                case 44: goto L_0x0037;
                case 46: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationStart(r7)
        L_0x0008:
            return
        L_0x0009:
            super.onAnimationStart(r7)
            java.lang.Object r1 = r6.A01
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r1 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r1
            X.8Au r5 = r1.A05
            boolean r0 = r5 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x001d
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r5 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel) r5
            r0 = 0
            r5.A0T(r0)
            return
        L_0x001d:
            boolean r0 = r5 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2
            if (r0 == 0) goto L_0x0008
            X.7C7 r4 = r1.A04
            if (r4 == 0) goto L_0x0008
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r5 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r5
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0K
            r1 = 0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onBannerDismissed$1 r0 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onBannerDismissed$1
            r0.<init>(r4, r5, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0037:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            super.onAnimationStart(r7)
            java.lang.Object r2 = r6.A01
            android.view.View r2 = (android.view.View) r2
            goto L_0x0104
        L_0x0044:
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            super.onAnimationStart(r7)
            java.lang.Object r0 = r6.A01
            X.7Oq r0 = (X.C146317Oq) r0
            android.view.View r2 = r0.A00
            r2.setVisibility(r1)
            goto L_0x0107
        L_0x0056:
            super.onAnimationStart(r7)
            java.lang.Object r1 = r6.A01
            X.5eR r1 = (X.C109945eR) r1
            r0 = 0
            r1.A0d = r0
            return
        L_0x0061:
            java.lang.Object r1 = r6.A01
            X.5eR r1 = (X.C109945eR) r1
            r0 = 1
            r1.A0c = r0
            return
        L_0x0069:
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            super.onAnimationStart(r7)
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            goto L_0x00fb
        L_0x0076:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            super.onAnimationStart(r7)
            java.lang.Object r0 = r6.A01
            X.6qA r0 = (X.C134176qA) r0
            android.widget.TextView r1 = r0.A05
            java.lang.String r0 = r0.A0A
            r1.setText(r0)
            return
        L_0x0089:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            super.onAnimationStart(r7)
            java.lang.Object r2 = r6.A01
            X.6qA r2 = (X.C134176qA) r2
            android.widget.TextView r1 = r2.A06
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.String r0 = r2.A08
            r1.setText(r0)
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r2.A07
            java.lang.String r0 = ""
            r1.setHint(r0)
            return
        L_0x00a8:
            java.lang.Object r3 = r6.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            android.view.View r2 = r3.A02
            java.lang.String r1 = "titleBar"
            if (r2 == 0) goto L_0x00ba
            r0 = 0
            r2.setVisibility(r0)
            android.view.View r2 = r3.A02
            if (r2 != 0) goto L_0x0107
        L_0x00ba:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x00bf:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            super.onAnimationStart(r7)
            java.lang.Object r1 = r6.A01
            X.6ov r1 = (X.C133536ov) r1
            r0 = 1
            r1.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            return
        L_0x00d2:
            java.lang.Object r3 = r6.A01
            X.71R r3 = (X.AnonymousClass71R) r3
            com.whatsapp.ClearableEditText r2 = r3.A0A
            r2.clearFocus()
            android.widget.ImageView r1 = r3.A07
            r0 = 2131232293(0x7f080625, float:1.8080691E38)
            r1.setImageResource(r0)
            android.view.View r1 = r3.A04
            r0 = 0
            r1.setVisibility(r0)
            r0 = 4
            r2.setVisibility(r0)
            return
        L_0x00ee:
            java.lang.Object r2 = r6.A01
            X.71R r2 = (X.AnonymousClass71R) r2
            android.view.View r1 = r2.A04
            r0 = 0
            r1.setClickable(r0)
            r1 = 4
            android.view.View r0 = r2.A06
        L_0x00fb:
            r0.setVisibility(r1)
            return
        L_0x00ff:
            java.lang.Object r2 = r6.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 0
        L_0x0104:
            r2.setVisibility(r0)
        L_0x0107:
            r0 = 0
            r2.setAlpha(r0)
            return
        L_0x010c:
            java.lang.Object r0 = r6.A01
            X.701 r0 = (X.AnonymousClass701) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0B
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0117:
            java.lang.String r0 = "PipViewContainer/animatePiPView onAnimationStart"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A01
            com.whatsapp.calling.callgrid.view.PipViewContainer r1 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r1
            r0 = 1
            com.whatsapp.calling.callgrid.view.PipViewContainer.A05(r1, r0)
            return
        L_0x0125:
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109195cy.onAnimationStart(android.animation.Animator):void");
    }
}
