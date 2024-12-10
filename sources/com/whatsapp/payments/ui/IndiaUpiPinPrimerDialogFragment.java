package com.whatsapp.payments.ui;

import X.AFP;
import X.AZ6;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BS;
import X.BBQ;
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

public class IndiaUpiPinPrimerDialogFragment extends Hilt_IndiaUpiPinPrimerDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public C20080A6g A04;
    public AZ6 A05;
    public BBQ A06;

    public void A21(Bundle bundle, View view) {
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            C20284AEs aEs = (C20284AEs) bundle2.getParcelable("extra_bank_account");
            if (!(aEs == null || aEs.A08 == null)) {
                AnonymousClass3MW.A0J(view, 2131429918).setText(AnonymousClass3MW.A0x(AnonymousClass3MZ.A09(this), C20080A6g.A01(aEs), new Object[1], 0, 2131894212));
            }
            Context context = view.getContext();
            C18030ve r10 = this.A03;
            AnonymousClass1KB r7 = this.A01;
            AnonymousClass1L9 r6 = this.A00;
            AnonymousClass11C r9 = this.A02;
            C26302CxJ.A0K(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r7, AnonymousClass3MX.A0V(view, 2131433193), r9, r10, AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131894213), "learn-more");
        }
        AFP.A00(AnonymousClass1HF.A06(view, 2131429535), this, 33);
        AFP.A00(AnonymousClass8BS.A06(view), this, 34);
        this.A05.BiL((Integer) null, "setup_pin_prompt", (String) null, 0);
    }

    public void A1K() {
        super.A1K();
        this.A06 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625673);
    }
}
