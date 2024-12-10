package com.whatsapp;

import X.A9U;
import X.AnonymousClass129;
import X.AnonymousClass1KW;
import X.AnonymousClass4IP;
import X.AnonymousClass4a6;
import X.C010105w;
import X.C1411874q;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C43251zV;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public C18000vb A00;
    public AnonymousClass1KW A01;
    public AnonymousClass129 A02;

    /* JADX WARNING: type inference failed for: r7v0, types: [com.whatsapp.Hilt_PushnameEmojiBlacklistDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.PushnameEmojiBlacklistDialogFragment] */
    public static PushnameEmojiBlacklistDialogFragment A00(String str) {
        ? hilt_PushnameEmojiBlacklistDialogFragment = new Hilt_PushnameEmojiBlacklistDialogFragment();
        Bundle A0D = C17880vN.A0D();
        String[] strArr = AnonymousClass4IP.A01;
        ArrayList A0z = C17880vN.A0z(3);
        int i = 0;
        do {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                A0z.add(str2);
            }
            i++;
        } while (i < 3);
        A0D.putStringArrayList("invalid_emojis", A0z);
        hilt_PushnameEmojiBlacklistDialogFragment.A1R(A0D);
        return hilt_PushnameEmojiBlacklistDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A022 = AnonymousClass4a6.A02(this);
        ArrayList<String> stringArrayList = A15().getStringArrayList("invalid_emojis");
        C17960vV.A07(stringArrayList);
        String A06 = this.A02.A06("26000056");
        A022.A0S(C43251zV.A05(A1B().getApplicationContext(), this.A01, this.A00.A0K(new Object[]{TextUtils.join(" ", stringArrayList)}, 2131755345, (long) stringArrayList.size())));
        A022.A0Y(new A9U(0, A06, this), 2131899101);
        A022.setPositiveButton(2131899286, new C1411874q(4));
        C010105w create = A022.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
