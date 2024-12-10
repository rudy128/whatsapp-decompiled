package X;

import com.whatsapp.status.audienceselector.StatusPrivacyActivity;

/* renamed from: X.7PH  reason: invalid class name */
public final class AnonymousClass7PH implements C1605989c {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public AnonymousClass7PH(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    public void Btv(C122946Sn r8, Integer num, Integer num2) {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        AnonymousClass00H r0 = statusPrivacyActivity.A0J;
        if (r0 != null) {
            C108945cZ.A12(r0).A01(statusPrivacyActivity, r8, num, num2, "status_privacy_activity", true);
        } else {
            C18070vi.A11("xFamilyCrosspostManager");
            throw null;
        }
    }

    public void onSuccess() {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        AnonymousClass00H r0 = statusPrivacyActivity.A0J;
        if (r0 != null) {
            AnonymousClass730.A01((C114375qh) null, (C38471rL) null, (AnonymousClass730) C108945cZ.A12(r0).A07.get(), "status_privacy_activity", 2131889129, 0, true);
            statusPrivacyActivity.A05.CGP(new C146527Pl(statusPrivacyActivity, (Object) null, 42));
            AnonymousClass7RH.A01(statusPrivacyActivity.A05, statusPrivacyActivity, 10);
            return;
        }
        C18070vi.A11("xFamilyCrosspostManager");
        throw null;
    }
}
