package com.whatsapp.payments.ui;

import X.A12;
import X.AFO;
import X.AFP;
import X.AX3;
import X.AZ6;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BS;
import X.AnonymousClass8BX;
import X.BCD;
import X.C18030ve;
import X.C20080A6g;
import X.C20284AEs;
import X.C26302CxJ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IndiaUpiForgotPinDialogFragment extends Hilt_IndiaUpiForgotPinDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public A12 A04;
    public C20080A6g A05;
    public AZ6 A06;
    public BCD A07;

    public void A21(Bundle bundle, View view) {
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            C20284AEs aEs = (C20284AEs) bundle2.getParcelable("extra_bank_account");
            if (!(aEs == null || aEs.A08 == null)) {
                AnonymousClass3MW.A0J(view, 2131429918).setText(AnonymousClass3MW.A0x(AnonymousClass3MZ.A09(this), C20080A6g.A01(aEs), new Object[1], 0, 2131894196));
            }
            Context context = view.getContext();
            C18030ve r10 = this.A03;
            AnonymousClass1KB r7 = this.A01;
            AnonymousClass1L9 r6 = this.A00;
            AnonymousClass11C r9 = this.A02;
            C26302CxJ.A0K(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r7, AnonymousClass3MX.A0V(view, 2131433193), r9, r10, AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131894197), "learn-more");
        }
        AFO.A00(AnonymousClass1HF.A06(view, 2131429535), this, 48);
        AFO.A00(AnonymousClass8BS.A06(view), this, 49);
        AFP.A00(AnonymousClass1HF.A06(view, 2131430972), this, 0);
        this.A06.BiL((Integer) null, "forgot_pin_prompt", (String) null, 0);
    }

    public void A1K() {
        super.A1K();
        this.A07 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass8BX.A0u(A1D());
        this.A04.A01(new AX3(this, 2));
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625624);
    }
}
