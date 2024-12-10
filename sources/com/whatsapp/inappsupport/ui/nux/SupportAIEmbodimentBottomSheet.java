package com.whatsapp.inappsupport.ui.nux;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aX;
import X.C17880vN;
import X.C18070vi;
import X.C89954dI;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class SupportAIEmbodimentBottomSheet extends Hilt_SupportAIEmbodimentBottomSheet {
    public TextView A00;
    public AnonymousClass00H A01;
    public WDSButton A02;
    public WDSButton A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0A = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131627152);
        C18070vi.A0b(A0A);
        this.A00 = C17880vN.A0E(A0A, 2131435891);
        String A0n = AnonymousClass3MY.A0n(this, 2131889371);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(A0n);
        Context A14 = A14();
        Drawable A05 = AnonymousClass4aX.A05(A14, AnonymousClass3MX.A06(A14, 2131231664), 2131102439);
        C18070vi.A0X(A05);
        TextView textView = this.A00;
        if (textView != null) {
            AnonymousClass4aX.A0C(A05, textView);
        }
        ImageSpan imageSpan = new ImageSpan(A05);
        int length = A0n.length();
        A09.setSpan(imageSpan, length - 1, length, 33);
        A09.append(".");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A09);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(A1H(2131889373));
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder);
        }
        WDSButton A0r = AnonymousClass3MW.A0r(A0A, 2131433260);
        C89954dI.A00(A0r, this, 12);
        this.A03 = A0r;
        WDSButton A0r2 = AnonymousClass3MW.A0r(A0A, 2131431962);
        C89954dI.A00(A0r2, this, 13);
        this.A02 = A0r2;
        return A0A;
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
        this.A03 = null;
    }
}
