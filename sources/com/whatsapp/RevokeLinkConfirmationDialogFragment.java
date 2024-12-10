package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1M9;
import X.AnonymousClass1PU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C18070vi;
import X.C24921Me;
import X.C42941yz;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public AnonymousClass1PU A02;

    public Dialog A27(Bundle bundle) {
        String str;
        String A16;
        Bundle A15 = A15();
        boolean z = A15.getBoolean("from_qr");
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        int i = 2131895348;
        if (z) {
            i = 2131888834;
        }
        A03.A0L(new AnonymousClass4aq(this, 4), A1H(i));
        A03.A00.A0J((DialogInterface.OnClickListener) null, A1H(2131898766));
        if (z) {
            A03.setTitle(A1H(2131888837));
            A16 = A1H(2131895301);
        } else {
            C42941yz r1 = AnonymousClass1EC.A01;
            String string = A15.getString("jid");
            if (string != null) {
                AnonymousClass1EC A022 = r1.A02(string);
                AnonymousClass1PU r0 = this.A02;
                if (r0 != null) {
                    int i2 = 2131895303;
                    if (r0.A03(A022)) {
                        i2 = 2131895304;
                    }
                    Object[] A1a = AnonymousClass3MW.A1a();
                    C24921Me r12 = this.A01;
                    if (r12 != null) {
                        AnonymousClass1M9 r02 = this.A00;
                        if (r02 == null) {
                            str = "contactManager";
                        } else if (A022 != null) {
                            A16 = AnonymousClass3MX.A16(this, AnonymousClass3MY.A0p(r02, r12, A022), A1a, 0, i2);
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    } else {
                        str = "waContactNames";
                    }
                } else {
                    str = "groupChatUtils";
                }
                C18070vi.A11(str);
                throw null;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        A03.A0S(A16);
        return AnonymousClass3MY.A0L(A03);
    }
}
