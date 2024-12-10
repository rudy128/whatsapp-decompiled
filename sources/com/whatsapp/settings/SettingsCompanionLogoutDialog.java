package com.whatsapp.settings;

import X.A9T;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11T;
import X.AnonymousClass17K;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass4a6;
import X.AnonymousClass8BV;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C19830z4;
import X.C22951Dx;
import X.C26721Tf;
import X.C62562rb;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

public class SettingsCompanionLogoutDialog extends Hilt_SettingsCompanionLogoutDialog {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public C26721Tf A02;
    public AnonymousClass11P A03;
    public C19830z4 A04;
    public AnonymousClass11O A05;
    public AnonymousClass1LU A06;
    public AnonymousClass10I A07;
    public AnonymousClass00H A08;

    public Dialog A27(Bundle bundle) {
        String str;
        boolean A1S = AnonymousClass8BV.A1S(this.A08);
        int i = 2131891821;
        if (A1S) {
            i = 2131886384;
        }
        String A1H = A1H(i);
        if (A1S) {
            str = null;
            try {
                C62562rb A032 = C17880vN.A0I(this.A08).A03();
                if (A032 != null) {
                    C18000vb r2 = this.A01;
                    String str2 = A032.A06;
                    C22951Dx r0 = PhoneUserJid.Companion;
                    str = r2.A0G(AnonymousClass17K.A05(C22951Dx.A01(str2)));
                } else {
                    Log.e("SettingsCompanionLogoutDialog/getCurrentPhoneNumber/currentAccount is null ");
                }
            } catch (AnonymousClass11T e) {
                C17900vP.A0X(e, "SettingsCompanionLogoutDialog/getCurrentPhoneNumber/InvalidJidException : ", AnonymousClass000.A10());
            }
        } else {
            str = A1H(2131891820);
        }
        C73203Rj A033 = AnonymousClass4a6.A03(this);
        A033.A0k(A1H);
        A033.A0S(str);
        return C73203Rj.A00(new A9T(4, this, A1S), A033, 2131891819);
    }
}
