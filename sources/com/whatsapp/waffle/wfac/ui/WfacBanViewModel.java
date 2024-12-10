package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass10I;
import X.AnonymousClass1J2;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.C003401n;
import X.C132556n0;
import X.C138066wT;
import X.C17880vN;
import X.C18070vi;
import X.C19830z4;
import X.C27301Vn;
import X.C31081ez;
import X.C33841jT;
import X.C41731wy;
import X.C72473Md;
import android.app.Activity;

public final class WfacBanViewModel extends AnonymousClass1J2 {
    public int A00 = 1;
    public String A01 = "other";
    public final C27301Vn A02;
    public final C41731wy A03 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A04;
    public final C33841jT A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public WfacBanViewModel(C27301Vn r3, C33841jT r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0p(r6, r3, r7);
        C72473Md.A1J(r5, r8);
        this.A05 = r4;
        this.A04 = r6;
        this.A02 = r3;
        this.A08 = r7;
        this.A06 = r5;
        this.A07 = r8;
    }

    public static final void A04(Activity activity) {
        C003401n supportActionBar = ((AnonymousClass01E) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(false);
            supportActionBar.A0M(2131899103);
        }
    }

    public static C132556n0 A03(WfacBanViewModel wfacBanViewModel) {
        return (C132556n0) wfacBanViewModel.A04.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
        if (r0.length() == 0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r4 = this;
            java.lang.String r0 = "WfacBanViewModel/updateBanState"
            X.C31081ez.A02(r0)
            X.6n0 r0 = A03(r4)
            java.lang.String r0 = r0.A00()
            int r1 = A00(r0)
            X.1wy r0 = r4.A03
            X.AnonymousClass3MX.A1J(r0, r1)
            X.00H r0 = r4.A08
            java.lang.Object r2 = r0.get()
            X.6yf r2 = (X.C139336yf) r2
            X.1CM r1 = r2.A06
            r0 = 0
            int r3 = r1.A00(r0)
            r0 = 21
            if (r3 != r0) goto L_0x004e
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.6n0 r0 = (X.C132556n0) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6wT r0 = (X.C138066wT) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "wfac_ban_status_token"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r0.length()
            r2 = 1
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfacManager/canFetchBanStatus canFetchBanStatus "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", reg_state: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            X.C31081ez.A02(r0)
            if (r2 != 0) goto L_0x006b
            java.lang.String r0 = "WfacBanViewModel/updateBanState cannot fetch ban status"
            X.C31081ez.A02(r0)
        L_0x006b:
            X.10I r1 = r4.A06
            r0 = 47
            X.C146787Qp.A00(r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.wfac.ui.WfacBanViewModel.A0U():void");
    }

    public final void A0V(Activity activity) {
        C31081ez.A02("WfacBanViewModel/resetRegistration");
        this.A02.BEJ(76, "WfacBanActivity");
        this.A05.A04();
        C132556n0 A032 = A03(this);
        AnonymousClass00H r2 = A032.A02;
        C17880vN.A1B(C138066wT.A00(r2), "wfac_ban_state");
        C17880vN.A1B(C138066wT.A00(r2), "wfac_ban_status_token");
        C17880vN.A1B(C138066wT.A00(r2), "wfac_ban_violation_type");
        C17880vN.A1B(C138066wT.A00(r2), "wfac_ban_violation_reason");
        C17880vN.A1B(C138066wT.A00(r2), "wfac_ban_violation_source");
        C17880vN.A1B(C19830z4.A00(C17880vN.A0K(A032.A01)), "support_ban_appeal_user_banned_from_chat_disconnect");
        this.A07.get();
        activity.startActivity(AnonymousClass1LU.A01(activity));
        activity.finishAffinity();
    }

    public static final int A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 191367207:
                str2 = "CHECKPOINTED";
                break;
            case 272787191:
                if (str.equals("UNBANNED")) {
                    return 2;
                }
                break;
            case 1951953694:
                if (str.equals("BANNED")) {
                    return 3;
                }
                break;
        }
        if (str.equals(str2)) {
            return 1;
        }
        throw new UnsupportedOperationException(AnonymousClass001.A1H("Invalid BanState: ", str, AnonymousClass000.A10()));
    }

    public final int A0T() {
        int i = C17880vN.A0C(((C138066wT) A03(this).A02.get()).A01).getInt("wfac_ban_violation_source", -1);
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return -1;
        }
        return 2;
    }
}
