package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.3Mp  reason: invalid class name */
public class AnonymousClass3Mp extends AnimatorListenerAdapter {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass3Mp(FocusViewContainer focusViewContainer) {
        this.A01 = 0;
        this.A02 = focusViewContainer;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        this.A00 = true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3.A00 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0017;
                case 2: goto L_0x0005;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r4)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r3.A02
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r2 = r0.A00
            if (r2 == 0) goto L_0x0008
            boolean r1 = r3.A00
            r0 = 0
            if (r1 != 0) goto L_0x004d
            goto L_0x004b
        L_0x0017:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            super.onAnimationEnd(r4)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0029
            java.lang.Object r0 = r3.A02
            X.3RH r0 = (X.AnonymousClass3RH) r0
            r0.setVisibilityInternal(false)
        L_0x0029:
            java.lang.Object r0 = r3.A02
            X.3RH r0 = (X.AnonymousClass3RH) r0
            r0.requestLayout()
            java.lang.Runnable r0 = r0.A04
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x0038:
            super.onAnimationEnd(r4)
            java.lang.Object r2 = r3.A02
            com.whatsapp.calling.callgrid.view.FocusViewContainer r2 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r2
            r0 = 0
            r2.A07 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0008
        L_0x004b:
            r0 = 8
        L_0x004d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Mp.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 2:
                C80053wT r11 = (C80053wT) this.A02;
                RecyclerView recyclerView = r11.A03;
                if (recyclerView == null) {
                    C18070vi.A11("emojiRecyclerView");
                    throw null;
                }
                int childCount = recyclerView.getChildCount();
                int[] iArr = r11.A0L;
                int length = iArr.length;
                int min = Math.min(childCount, length);
                for (int i = 0; i < min; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = iArr[i];
                    childAt.setLayoutParams(layoutParams);
                }
                C42491yG.A0B(r11, 0);
                boolean z = this.A00;
                int min2 = Math.min(length, recyclerView.getChildCount());
                int i2 = 0;
                int i3 = 1;
                if (z == AnonymousClass3MY.A1b(r11.getWhatsAppLocale())) {
                    i2 = min2 - 1;
                    min2 = -1;
                    i3 = -1;
                }
                int i4 = 0;
                while (i2 != min2) {
                    View childAt2 = recyclerView.getChildAt(i2);
                    C18070vi.A0X(childAt2);
                    if (!(childAt2 instanceof C108285bR)) {
                        C17960vV.A0F(false, "Given view is not ReactionTrayItem.");
                    }
                    View childAt3 = recyclerView.getChildAt(i2);
                    C18070vi.A0z(childAt3, "null cannot be cast to non-null type com.whatsapp.reactions.ReactionTrayItem");
                    C108285bR r13 = (C108285bR) childAt3;
                    r13.setForegroundScale(0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    r11.getSystemFeatures();
                    float f = 1.0f + 0.1f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r13, "foregroundScale", new float[]{0.0f, f});
                    C18070vi.A0X(ofFloat);
                    ofFloat.setDuration(160);
                    Interpolator interpolator = AnonymousClass4IU.A02;
                    ofFloat.setInterpolator(interpolator);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(r13, "foregroundAlpha", new float[]{0.0f, 1.0f}).setDuration(120);
                    C18070vi.A0X(duration);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r13, "foregroundScale", new float[]{f, 1.0f});
                    C18070vi.A0X(ofFloat2);
                    ofFloat2.setDuration(160);
                    ofFloat2.setInterpolator(interpolator);
                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    r13.setBackgroundAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r13, "backgroundAlpha", new float[]{0.0f, 1.0f});
                    ofFloat3.setInterpolator(AnonymousClass4IU.A00);
                    ofFloat3.setDuration(320);
                    animatorSet.playTogether(new Animator[]{ofFloat, duration, ofFloat3});
                    animatorSet.setStartDelay(((long) i4) * 35);
                    animatorSet.start();
                    i2 += i3;
                    i4++;
                }
                return;
            case 3:
                C72453Mb.A1C(((UserNoticeBottomSheetDialogFragment) this.A02).A00);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public AnonymousClass3Mp(int i, Object obj, boolean z) {
        this.A01 = i;
        this.A00 = z;
        this.A02 = obj;
    }
}
