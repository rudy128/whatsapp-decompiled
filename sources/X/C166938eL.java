package X;

import com.whatsapp.polls.creator.PollCreatorActivity;

/* renamed from: X.8eL  reason: invalid class name and case insensitive filesystem */
public abstract class C166938eL extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            PollCreatorActivity pollCreatorActivity = (PollCreatorActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A01 = C137116uw.A01(r4, pollCreatorActivity);
            C63932tv.A02(A01, pollCreatorActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A01(A01, r1, pollCreatorActivity);
            C63662tU.A00(A01, r1, pollCreatorActivity, r1.A5A);
            A03(r4, r1, pollCreatorActivity);
        }
    }

    public C166938eL() {
        AGE.A00(this, 11);
    }

    public static void A03(AnonymousClass1K1 r1, AnonymousClass10G r2, PollCreatorActivity pollCreatorActivity) {
        pollCreatorActivity.A03 = (C88184Yq) r2.A15.get();
        pollCreatorActivity.A04 = C000200d.A00(r2.AD5);
        pollCreatorActivity.A00 = C19890zB.A00;
        pollCreatorActivity.A01 = (AnonymousClass9V5) r1.A3D.get();
        pollCreatorActivity.A02 = (AnonymousClass9V6) r1.A3E.get();
        pollCreatorActivity.A05 = C000200d.A00(r2.A3q);
    }
}
