package com.whatsapp.calling.capi.view;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17900vP;
import X.C18070vi;
import X.C195199sx;
import X.C22941Dw;
import X.C24921Me;
import X.C89874dA;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

public final class CapiCallingConfirmationBottomSheetDialogFragment extends Hilt_CapiCallingConfirmationBottomSheetDialogFragment {
    public AnonymousClass1VP A00;
    public C195199sx A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public AnonymousClass1E7 A04;

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        String str3;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C22941Dw r2 = UserJid.Companion;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("jid");
        } else {
            str = null;
        }
        UserJid A042 = r2.A04(str);
        if (A042 == null) {
            str3 = "no user found";
        } else {
            AnonymousClass1M9 r0 = this.A02;
            if (r0 != null) {
                AnonymousClass1E7 A0F = r0.A0F(A042);
                if (A0F == null) {
                    str3 = "no contact found";
                } else {
                    this.A04 = A0F;
                    C24921Me r02 = this.A03;
                    if (r02 != null) {
                        AnonymousClass3MW.A0J(view, 2131435407).setText(r02.A0I(A0F));
                        AnonymousClass3MW.A0J(view, 2131428694).setText(A1H(2131898713));
                        C89874dA.A00(AnonymousClass1HF.A06(view, 2131428647), this, 38);
                        C89874dA.A00(AnonymousClass1HF.A06(view, 2131428648), this, 39);
                        TextView A0J = AnonymousClass3MW.A0J(view, 2131434083);
                        AnonymousClass3MY.A1X(A1H(2131887938), A0J);
                        C89874dA.A00(A0J, this, 40);
                        return;
                    }
                    str2 = "waContactNames";
                }
            } else {
                str2 = "contactManager";
            }
            C18070vi.A11(str2);
            throw null;
        }
        C17900vP.A0e("CapiCallingConfirmationBottomSheetDialogFragment ", str3, AnonymousClass000.A10());
        A28();
    }

    public int A2F() {
        return 2131624495;
    }
}
