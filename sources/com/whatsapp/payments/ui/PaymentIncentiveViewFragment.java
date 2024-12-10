package com.whatsapp.payments.ui;

import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1KN;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BW;
import X.AnonymousClass9YI;
import X.BD4;
import X.C18030ve;
import X.C198769ys;
import X.C19962A0v;
import X.C20087A6p;
import X.C21427Aju;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class PaymentIncentiveViewFragment extends Hilt_PaymentIncentiveViewFragment {
    public AnonymousClass1LC A00;
    public AnonymousClass11C A01;
    public AnonymousClass11P A02;
    public C18030ve A03;
    public AnonymousClass9YI A04;
    public C36401np A05;
    public final BD4 A06;
    public final C19962A0v A07;

    public PaymentIncentiveViewFragment(BD4 bd4, C19962A0v a0v) {
        this.A07 = a0v;
        this.A06 = bd4;
    }

    public void A1K() {
        super.A1K();
        this.A04 = null;
    }

    public void A21(Bundle bundle, View view) {
        TextEmojiLabel textEmojiLabel;
        CharSequence charSequence;
        super.A21(bundle, view);
        C19962A0v a0v = this.A07;
        C198769ys r6 = a0v.A01;
        C20087A6p.A03(C20087A6p.A00(this.A02, (AnonymousClass1KN) null, a0v, (String) null, true), this.A06, "incentive_details", "new_payment");
        if (r6 == null) {
            Log.e("PAY: PaymentIncentiveViewFragment/PaymentIncentiveOfferInfo is null or has null items in it");
            return;
        }
        this.A02.setText(r6.A0F);
        String str = r6.A0C;
        if (!TextUtils.isEmpty(str)) {
            C36401np r7 = this.A05;
            Context context = this.A00.getContext();
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = r6.A0B;
            String[] strArr = new String[1];
            AnonymousClass8BW.A17(this.A00, str, strArr, 0);
            Runnable[] runnableArr = {new C21427Aju(this, 18)};
            charSequence = r7.A04(context, AnonymousClass3MX.A16(this, "learn-more", A1b, 1, 2131891314), runnableArr, new String[]{"learn-more"}, strArr);
            AnonymousClass3Ma.A1K(this.A00, this.A01);
            AnonymousClass3Ma.A1L(this.A03, this.A00);
            textEmojiLabel = this.A00;
        } else {
            textEmojiLabel = this.A00;
            charSequence = r6.A0B;
        }
        textEmojiLabel.setText(charSequence);
    }
}
