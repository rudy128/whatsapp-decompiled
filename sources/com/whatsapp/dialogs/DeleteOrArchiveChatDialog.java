package com.whatsapp.dialogs;

import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.C17960vV;
import X.C18070vi;
import X.C22621Co;
import X.C33251iW;
import X.C73203Rj;
import X.C89924dF;
import X.C91494fm;
import X.C91514fo;
import X.C91604fx;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class DeleteOrArchiveChatDialog extends Hilt_DeleteOrArchiveChatDialog {
    public AnonymousClass1KB A00;
    public C33251iW A01;
    public C22621Co A02;
    public AnonymousClass1CJ A03;
    public AnonymousClass10I A04;

    public Dialog A27(Bundle bundle) {
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(A15().getString("arg_chat_jid", (String) null));
        C17960vV.A07(A0l);
        C18070vi.A0X(A0l);
        View A09 = AnonymousClass3MX.A09(LayoutInflater.from(A1n()), (ViewGroup) null, 2131625067);
        View A05 = C18070vi.A05(A09, 2131429078);
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0c(A09);
        A032.A0g(this, new C91514fo(A05, A0l, this, 7), 2131889290);
        AnonymousClass1CJ r0 = this.A03;
        if (r0 != null) {
            if (r0.A0Q(A0l)) {
                A032.A0e(this, new C91604fx(this, 10), 2131898766);
            } else {
                A032.A0e(this, new C91494fm(A0l, this, 18), 2131886726);
                A032.A0f(this, new C91604fx(this, 11), 2131898766);
            }
            AnonymousClass3Ma.A0E(A09, 2131429986).setText(AnonymousClass3MZ.A09(this).getQuantityString(2131755082, 1));
            AnonymousClass3Ma.A0E(A09, 2131429980).setText(2131889328);
            C89924dF.A00(AnonymousClass1HF.A06(A09, 2131429079), A05, 42);
            return AnonymousClass3MY.A0L(A032);
        }
        AnonymousClass3MW.A1I();
        throw null;
    }
}
