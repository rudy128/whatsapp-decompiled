package X;

import com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup;
import com.whatsapp.camera.areffects.CameraArEffectsViewModel$onBannerDismissed$1;

/* renamed from: X.4VL  reason: invalid class name */
public abstract class AnonymousClass4VL {
    public final C28931bI A00;
    public final AnonymousClass1KB A01;

    public void A02() {
    }

    public void A03(C108745cE r5) {
        C92274h2 r52 = (C92274h2) r5;
        C18070vi.A0d(r52, 0);
        C75603ho r3 = ((C75393hQ) this).A00;
        AnonymousClass3MX.A1Q(new CameraArEffectsViewModel$onBannerDismissed$1(r52, r3, (C30391dr) null), r3.A0N);
    }

    public void A04(C108745cE r9) {
        long j;
        C108745cE r6 = r9;
        C18070vi.A0d(r9, 0);
        C28931bI r1 = this.A00;
        if (r1.A00 != null) {
            ActionFeedbackViewGroup actionFeedbackViewGroup = (ActionFeedbackViewGroup) AnonymousClass3MX.A0D(r1);
            actionFeedbackViewGroup.A01();
            AnonymousClass3Qo A002 = actionFeedbackViewGroup.A00(r9);
            A02();
            if (!r9.isPersistent()) {
                Long BQw = r9.BQw();
                if (BQw != null) {
                    j = BQw.longValue();
                } else {
                    j = 3000;
                }
                actionFeedbackViewGroup.setActionFeedbackViewAutoDismiss(A002, j, new C21368Aix(actionFeedbackViewGroup, this, A002, r6, 29));
                return;
            }
            return;
        }
        C18070vi.A0X(r1.A02());
        this.A01.A0J(new C21453AkK(this, r9, 1));
    }

    public void A01() {
        C28931bI r1 = this.A00;
        if (r1.A00 != null) {
            ((ActionFeedbackViewGroup) AnonymousClass3MX.A0D(r1)).A01();
        }
    }

    public AnonymousClass4VL(AnonymousClass1KB r1, C28931bI r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
