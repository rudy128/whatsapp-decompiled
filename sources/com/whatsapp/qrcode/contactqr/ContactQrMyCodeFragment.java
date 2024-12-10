package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass001;
import X.AnonymousClass11S;
import X.AnonymousClass1HF;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactQrMyCodeFragment extends Hilt_ContactQrMyCodeFragment {
    public AnonymousClass11S A00;
    public ContactQrContactCardView A01;
    public String A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View inflate = layoutInflater.inflate(2131624688, viewGroup, false);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) AnonymousClass1HF.A06(inflate, 2131429446);
        this.A01 = contactQrContactCardView;
        contactQrContactCardView.setStyle(0);
        ContactQrContactCardView contactQrContactCardView2 = this.A01;
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        contactQrContactCardView2.A02(r0.A0D, true);
        this.A01.setPrompt(A1H(2131888829));
        ContactQrContactCardView contactQrContactCardView3 = this.A01;
        if (!(contactQrContactCardView3 == null || (str = this.A02) == null)) {
            contactQrContactCardView3.setQrCode(AnonymousClass001.A1H("https://wa.me/qr/", str, C18070vi.A0K(str)));
        }
        return inflate;
    }
}
