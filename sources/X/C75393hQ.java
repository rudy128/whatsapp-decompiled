package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup;
import com.whatsapp.camera.areffects.CameraArEffectsBannerCoordinator$1;

/* renamed from: X.3hQ  reason: invalid class name and case insensitive filesystem */
public final class C75393hQ extends AnonymousClass4VL {
    public final C75603ho A00;
    public final C18030ve A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75393hQ(ViewStub viewStub, AnonymousClass1F9 r5, AnonymousClass1KB r6, C75603ho r7, C18030ve r8) {
        super(r6, AnonymousClass3MW.A0p(viewStub));
        C18070vi.A0d(viewStub, 3);
        this.A01 = r8;
        this.A00 = r7;
        AnonymousClass3MX.A1Q(new CameraArEffectsBannerCoordinator$1(r5, this, (C30391dr) null), AnonymousClass2SS.A00(r5));
    }

    public static final void A00(ActionFeedbackViewGroup actionFeedbackViewGroup, int i) {
        actionFeedbackViewGroup.setMinimumHeight(actionFeedbackViewGroup.getResources().getDimensionPixelSize(2131165729));
        actionFeedbackViewGroup.setGravity(17);
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(actionFeedbackViewGroup);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{A0P.topMargin, AnonymousClass3Ma.A02(actionFeedbackViewGroup, i)});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C88704ae(actionFeedbackViewGroup, A0P, 2));
        ofInt.setDuration(200);
        ofInt.start();
    }
}
