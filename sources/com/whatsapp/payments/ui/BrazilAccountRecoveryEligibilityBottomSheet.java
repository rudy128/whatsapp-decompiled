package com.whatsapp.payments.ui;

import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.BD4;
import X.C17960vV;
import X.C18030ve;
import X.C186979f4;
import X.C26302CxJ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BrazilAccountRecoveryEligibilityBottomSheet extends Hilt_BrazilAccountRecoveryEligibilityBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public BD4 A04;
    public C186979f4 A05;
    public String A06;

    public void A1K() {
        super.A1K();
        this.A05 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A06 = AnonymousClass8BR.A0y(A15());
        View inflate = layoutInflater.inflate(2131623971, viewGroup, false);
        Context context = inflate.getContext();
        C18030ve r10 = this.A03;
        AnonymousClass1KB r7 = this.A01;
        AnonymousClass1L9 r6 = this.A00;
        AnonymousClass11C r9 = this.A02;
        C26302CxJ.A0K(context, Uri.parse("https://faq.whatsapp.com/1085240205511877"), r6, r7, AnonymousClass3MX.A0V(inflate, 2131429918), r9, r10, AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131886349), "learn-more");
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AnonymousClass3Ma.A19(AnonymousClass1HF.A06(view, 2131436597), this, 37);
        AnonymousClass3Ma.A19(AnonymousClass8BS.A06(view), this, 38);
        AnonymousClass3Ma.A19(AnonymousClass1HF.A06(view, 2131435334), this, 39);
        String str = this.A06;
        BD4 bd4 = this.A04;
        C17960vV.A07(bd4);
        bd4.BiL((Integer) null, "prompt_recover_payments", str, 0);
    }
}
