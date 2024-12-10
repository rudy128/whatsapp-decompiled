package com.whatsapp.dialogs;

import X.AnonymousClass129;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass9QX;
import X.C18070vi;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class ForwardLimitToGroupsLearnMoreDialogFragment extends Hilt_ForwardLimitToGroupsLearnMoreDialogFragment {
    public Dialog A27(Bundle bundle) {
        String str;
        String A0F = C18070vi.A0F(A14(), 2131890519);
        Context A14 = A14();
        AnonymousClass1KW r2 = this.A01;
        if (r2 != null) {
            AnonymousClass1L9 r1 = this.A00;
            if (r1 != null) {
                AnonymousClass129 r3 = this.A02;
                if (r3 != null) {
                    return AnonymousClass9QX.A00(A14, r1, r2, r3, A0F, "26000253", (String) null, (String) null);
                }
                str = "faqLinkFactory";
            } else {
                str = "activityUtils";
            }
        } else {
            str = "emojiLoader";
        }
        C18070vi.A11(str);
        throw null;
    }
}
