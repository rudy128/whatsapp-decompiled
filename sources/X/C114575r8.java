package X;

import com.whatsapp.status.audienceselector.StatusRecipientsActivity;

/* renamed from: X.5r8  reason: invalid class name and case insensitive filesystem */
public abstract class C114575r8 extends C114635rQ {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, statusRecipientsActivity);
            AnonymousClass1FB.A0M(A0A, statusRecipientsActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, statusRecipientsActivity);
            C109005cf.A0e(A0A, r1, statusRecipientsActivity, r1.A5A);
            C114635rQ.A10(statusRecipientsActivity, r4, A0A, r1);
            statusRecipientsActivity.A00 = (C56422hR) r4.A2t.get();
            statusRecipientsActivity.A03 = C108955ca.A0M(A0A);
            statusRecipientsActivity.A04 = C108965cb.A0Z(A0A);
            statusRecipientsActivity.A02 = (C41911xI) A0A.AAl.get();
            statusRecipientsActivity.A01 = (C25001Mm) A0A.ABf.get();
        }
    }

    public C114575r8() {
        C1423279a.A00(this, 41);
    }
}
