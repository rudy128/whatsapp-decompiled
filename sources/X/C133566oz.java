package X;

import com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity;

/* renamed from: X.6oz  reason: invalid class name and case insensitive filesystem */
public final class C133566oz {
    public final /* synthetic */ ShareToFacebookActivity A00;
    public final /* synthetic */ C133616p4 A01;

    public C133566oz(ShareToFacebookActivity shareToFacebookActivity, C133616p4 r2) {
        this.A00 = shareToFacebookActivity;
        this.A01 = r2;
    }

    public void A00() {
        ShareToFacebookActivity shareToFacebookActivity = this.A00;
        C30131dR A4b = shareToFacebookActivity.A4b();
        AnonymousClass00H r0 = shareToFacebookActivity.A04;
        if (r0 != null) {
            C35511mM A11 = C108945cZ.A11(r0);
            Integer num = ShareToFacebookActivity.A07;
            A4b.A02(Boolean.valueOf(C72463Mc.A1Y(A11.A01(num))), "final_auto_setting");
            A4b.A04("SEE_UNLINK_SUCCESS");
            A4b.A01();
            this.A01.A00();
            AnonymousClass00H r02 = shareToFacebookActivity.A04;
            if (r02 != null) {
                if (!C108945cZ.A11(r02).A06(num)) {
                    C72453Mb.A14(shareToFacebookActivity);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("fbAccountManagerLazy");
        throw null;
    }

    public void A01(C122946Sn r9) {
        String str;
        ShareToFacebookActivity shareToFacebookActivity = this.A00;
        C30131dR A4b = shareToFacebookActivity.A4b();
        AnonymousClass00H r0 = shareToFacebookActivity.A04;
        if (r0 != null) {
            A4b.A02(Boolean.valueOf(C72463Mc.A1Y(C108945cZ.A11(r0).A01(ShareToFacebookActivity.A07))), "final_auto_setting");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Class: ");
            Class<?> cls = r9.getClass();
            A10.append(cls);
            A4b.A05("SEE_UNLINK_ERROR", C17900vP.A0C(", message: ", A10, r9));
            this.A01.A00();
            boolean A18 = C18070vi.A18(cls, AnonymousClass6Q9.class);
            AnonymousClass730 r3 = shareToFacebookActivity.A02;
            if (r3 != null) {
                int i = 2131889149;
                if (A18) {
                    i = 2131889150;
                }
                AnonymousClass730.A01((C114375qh) null, (C38471rL) null, r3, "share_to_fb_activity", i, 0, false);
                return;
            }
            str = "crosspostSnackbarManager";
        } else {
            str = "fbAccountManagerLazy";
        }
        C18070vi.A11(str);
        throw null;
    }
}
