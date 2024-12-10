package com.whatsapp.userban.ui.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01E;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1DT;
import X.AnonymousClass1EG;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1LC;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass67T;
import X.AnonymousClass71O;
import X.AnonymousClass7N0;
import X.AnonymousClass7RO;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C124286Xt;
import X.C132216mP;
import X.C136576u2;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18030ve;
import X.C19830z4;
import X.C27301Vn;
import X.C33841jT;
import X.C36361nl;
import X.C41731wy;
import X.C74703cE;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import com.whatsapp.util.Log;

public class BanAppealViewModel extends AnonymousClass1J2 {
    public int A00;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final C132216mP A03;
    public final AnonymousClass1LC A04;
    public final C27301Vn A05;
    public final AnonymousClass129 A06;
    public final C136576u2 A07;
    public final AnonymousClass71O A08;
    public final C41731wy A09 = AnonymousClass3MW.A0o();
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final C41731wy A0B = AnonymousClass3MW.A0o();
    public final C33841jT A0C;

    public SpannableStringBuilder A0T(Context context, AnonymousClass1KB r16, C36361nl r17, AnonymousClass11C r18) {
        Context context2 = context;
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(AnonymousClass1EG.A01(context, new Object[]{this.A04.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, 2131886920));
        URLSpan[] uRLSpanArr = (URLSpan[]) A092.getSpans(0, A092.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A092.setSpan(new C74703cE(context2, r17, r16, r18, uRLSpan.getURL()), A092.getSpanStart(uRLSpan), A092.getSpanEnd(uRLSpan), A092.getSpanFlags(uRLSpan));
                A092.removeSpan(uRLSpan);
            }
        }
        return A092;
    }

    public void A0U() {
        Log.i("BanAppealViewModel/fetchBanAppealStatus");
        AnonymousClass71O r3 = this.A08;
        C19830z4 r4 = r3.A06;
        AnonymousClass3MX.A1J(this.A0A, A00(this, C124286Xt.A00(C17880vN.A0r(C17890vO.A0B(r4), "support_ban_appeal_state")), false));
        if (!this.A07.A01()) {
            Log.i("BanAppealViewModel/fetchBanAppealStatus returning since phone number not verified yet");
            return;
        }
        Log.i("BanAppealViewModel/fetchBanAppealStatus trying to fetch ban appeal status");
        AnonymousClass7N0 r2 = new AnonymousClass7N0(this, 0);
        String A0r = C17880vN.A0r(C17890vO.A0B(r4), "support_ban_appeal_token");
        if (A0r == null) {
            r2.Btp(C17880vN.A0j());
            return;
        }
        AnonymousClass10E r0 = r3.A03.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r0);
        AnonymousClass7RO.A02(r3.A0A, r3, new AnonymousClass67T(C108965cb.A0H(r0), AnonymousClass3Ma.A0c(r0), A8r, C108955ca.A0X(r0), C108945cZ.A14(r0), A0r), r2, 23);
    }

    public void A0V() {
        if (this.A00 != 2 || !C17880vN.A1W(C17890vO.A0B(this.A08.A06), "support_ban_appeal_user_banned_from_chat_disconnect")) {
            AnonymousClass3MY.A1L(this.A09, true);
        } else {
            AnonymousClass3MX.A1J(this.A0A, 1);
        }
    }

    public void A0W(Activity activity, boolean z) {
        this.A05.BEJ(42, "BanAppealActivity");
        this.A0C.A04();
        C19830z4 r2 = this.A08.A06;
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_state");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_token");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_violation_type");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_violation_reason");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_unban_reason");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_unban_reason_url");
        if (!z) {
            C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_user_banned_from_chat_disconnect");
        }
        Log.i("BanAppealRepository/clearFormReviewDraft");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_form_review_draft");
        C17880vN.A1B(C19830z4.A00(r2), "support_ban_appeal_is_eu_smb_user");
        activity.startActivity(AnonymousClass1LU.A01(activity));
        activity.finishAffinity();
    }

    public BanAppealViewModel(C132216mP r2, AnonymousClass1LC r3, C27301Vn r4, C33841jT r5, AnonymousClass129 r6, C136576u2 r7, AnonymousClass71O r8) {
        this.A07 = r7;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r6;
        this.A08 = r8;
        this.A0C = r5;
        this.A05 = r4;
    }

    public static int A00(BanAppealViewModel banAppealViewModel, String str, boolean z) {
        String str2;
        switch (str.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 272787191:
                if (str.equals("UNBANNED")) {
                    return 4;
                }
                break;
            case 527514546:
                if (str.equals("IN_REVIEW")) {
                    if (!z) {
                        return 1;
                    }
                    return 3;
                }
                break;
            case 1166090011:
                str2 = "NO_APPEAL_OPENED";
                break;
            case 1951953694:
                if (str.equals("BANNED")) {
                    return 5;
                }
                break;
        }
        if (str.equals(str2)) {
            if (banAppealViewModel.A00 != 2 || !C17880vN.A1W(C17890vO.A0B(banAppealViewModel.A08.A06), "support_ban_appeal_user_banned_from_chat_disconnect")) {
                return 1;
            }
            return 2;
        }
        throw new UnsupportedOperationException(AnonymousClass001.A1H("Invalid BanAppealState: ", str, AnonymousClass000.A10()));
    }

    public static void A03(Activity activity, boolean z) {
        C17960vV.A07(activity);
        C003401n supportActionBar = ((AnonymousClass01E) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(z);
            int i = 2131899103;
            if (z) {
                i = 2131886926;
            }
            supportActionBar.A0M(i);
        }
    }
}
