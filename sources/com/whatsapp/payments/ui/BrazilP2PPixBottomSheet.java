package com.whatsapp.payments.ui;

import X.A3V;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C19740yt;
import X.C20087A6p;
import X.C20112A7u;
import X.C39351sv;
import X.C43531zx;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.components.PixPaymentInfoView;
import com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class BrazilP2PPixBottomSheet extends Hilt_BrazilP2PPixBottomSheet {
    public PixPaymentInfoView A00;
    public BrazilGetPixInfoViewModel A01;
    public WDSButton A02;
    public String A03;
    public String A04;
    public String A05;

    public void A21(Bundle bundle, View view) {
        TextEmojiLabel textEmojiLabel;
        String str;
        TextEmojiLabel textEmojiLabel2;
        C18070vi.A0d(view, 0);
        Bundle A15 = A15();
        this.A04 = A15.getString("pix_display_name");
        this.A03 = A15.getString("pix_key");
        this.A05 = A15.getString("pix_type");
        PixPaymentInfoView pixPaymentInfoView = (PixPaymentInfoView) view.findViewById(2131433869);
        this.A00 = pixPaymentInfoView;
        if (!(pixPaymentInfoView == null || (textEmojiLabel2 = pixPaymentInfoView.A04) == null)) {
            textEmojiLabel2.setText(this.A04);
        }
        String str2 = this.A03;
        if (!(str2 == null || (str = this.A05) == null)) {
            str2 = A3V.A01(str, str2);
            this.A03 = str2;
        }
        PixPaymentInfoView pixPaymentInfoView2 = this.A00;
        if (!(pixPaymentInfoView2 == null || (textEmojiLabel = pixPaymentInfoView2.A05) == null)) {
            textEmojiLabel.setText(str2);
        }
        WDSButton A0r = AnonymousClass3MW.A0r(view, 2131429668);
        this.A02 = A0r;
        if (A0r != null) {
            AnonymousClass3Ma.A19(A0r, this, 43);
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 2.0f, AnonymousClass3MZ.A09(this).getDisplayMetrics());
        int A002 = C19740yt.A00(A14(), 2131103410);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(A002);
        PixPaymentInfoView pixPaymentInfoView3 = this.A00;
        if (pixPaymentInfoView3 != null) {
            pixPaymentInfoView3.A01.setBackground(gradientDrawable);
        }
        int A003 = C19740yt.A00(A14(), 2131103233);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(TypedValue.applyDimension(1, 10.0f, AnonymousClass3MZ.A09(this).getDisplayMetrics()));
        gradientDrawable2.setColor(A003);
        PixPaymentInfoView pixPaymentInfoView4 = this.A00;
        if (pixPaymentInfoView4 != null) {
            pixPaymentInfoView4.A02.setBackground(gradientDrawable2);
        }
        int i = applyDimension * 4;
        PixPaymentInfoView pixPaymentInfoView5 = this.A00;
        if (pixPaymentInfoView5 != null) {
            pixPaymentInfoView5.A02.setPadding(i, i, i, i);
        }
        PixPaymentInfoView pixPaymentInfoView6 = this.A00;
        if (pixPaymentInfoView6 != null) {
            C43531zx.A03(pixPaymentInfoView6.A03, new C39351sv(applyDimension * 3, 0, 0, 0));
        }
        BrazilGetPixInfoViewModel brazilGetPixInfoViewModel = this.A01;
        if (brazilGetPixInfoViewModel == null) {
            C18070vi.A11("brazilGetPixInfoViewModel");
            throw null;
        }
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        A032.A07("payment_method", "pix");
        C20087A6p.A02(A032, brazilGetPixInfoViewModel.A07, (Integer) null, "payment_instructions_prompt", "contact_card", 0);
        super.A21(bundle, view);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A01 = (BrazilGetPixInfoViewModel) AnonymousClass3MW.A0N(this).A00(BrazilGetPixInfoViewModel.class);
    }

    public int A2F() {
        return 2131626391;
    }
}
