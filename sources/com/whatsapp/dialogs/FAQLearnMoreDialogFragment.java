package com.whatsapp.dialogs;

import X.AnonymousClass129;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass9QX;
import X.C108955ca;
import X.C18070vi;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public class FAQLearnMoreDialogFragment extends Hilt_FAQLearnMoreDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KW A01;
    public AnonymousClass129 A02;

    public Dialog A27(Bundle bundle) {
        String str;
        String str2;
        String str3;
        A15();
        String A0s = C108955ca.A0s(A15(), "faq_id");
        C18070vi.A0X(A0s);
        Bundle bundle2 = this.A06;
        String str4 = null;
        if (bundle2 != null) {
            if (bundle2.containsKey("message_string_res_id")) {
                str = A1H(bundle2.getInt("message_string_res_id"));
            } else {
                str = C108955ca.A0s(A15(), "message_text");
            }
            if (bundle2.containsKey("title_string_res_id")) {
                str2 = A1H(bundle2.getInt("title_string_res_id"));
            } else {
                str2 = null;
            }
            if (bundle2.containsKey("faq_section_name")) {
                str4 = bundle2.getString("faq_section_name");
            }
        } else {
            str = "";
            str2 = null;
        }
        Context A14 = A14();
        AnonymousClass1KW r2 = this.A01;
        if (r2 != null) {
            AnonymousClass1L9 r1 = this.A00;
            if (r1 != null) {
                AnonymousClass129 r3 = this.A02;
                if (r3 != null) {
                    return AnonymousClass9QX.A00(A14, r1, r2, r3, str, A0s, str2, str4);
                }
                str3 = "faqLinkFactory";
            } else {
                str3 = "activityUtils";
            }
        } else {
            str3 = "emojiLoader";
        }
        C18070vi.A11(str3);
        throw null;
    }
}
