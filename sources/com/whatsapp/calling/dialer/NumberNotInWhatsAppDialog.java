package com.whatsapp.calling.dialer;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C90034dQ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaTextView;

public final class NumberNotInWhatsAppDialog extends Hilt_NumberNotInWhatsAppDialog {
    public C18000vb A00;
    public AnonymousClass00H A01;
    public String A02;
    public boolean A03;
    public View A04;
    public WaTextView A05;

    public void A21(Bundle bundle, View view) {
        String string;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (string = bundle2.getString("phone_number_formatted", (String) null)) == null) {
            throw C17890vO.A0K();
        }
        this.A02 = string;
        this.A05 = AnonymousClass3MW.A0T(view, 2131429973);
        this.A04 = AnonymousClass1HF.A06(view, 2131429970);
        WaTextView waTextView = this.A05;
        if (waTextView != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            C18000vb r1 = this.A00;
            if (r1 != null) {
                String str = this.A02;
                if (str == null) {
                    C18070vi.A11("phoneNumberFormatted");
                    throw null;
                }
                waTextView.setText(AnonymousClass3MX.A16(this, r1.A0G(str), A1a, 0, 2131889421));
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        View view2 = this.A04;
        if (view2 != null) {
            C90034dQ.A01(view2, this, 18);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("NumberNotInWhatsAppDialog", this.A03);
        AnonymousClass3MY.A16(A0D, this, "NumberNotInWhatsAppDialog");
    }

    public NumberNotInWhatsAppDialog() {
        super(2131625089);
        this.A00 = false;
    }

    public void A1s() {
        super.A1s();
        this.A05 = null;
        this.A04 = null;
    }
}
