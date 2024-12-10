package com.whatsapp.payments.ui;

import X.AnonymousClass3MY;
import X.AnonymousClass8BT;
import X.C18070vi;
import X.C189599jV;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PaymentCheckoutIncentiveFragment extends BasePaymentIncentiveFragment {
    public C189599jV A00;
    public String A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        String string = A15().getString("extra_formatted_discount");
        C18070vi.A0b(string);
        this.A01 = string;
        WaTextView waTextView = this.A02;
        Object[] objArr = new Object[1];
        if (string != null) {
            objArr[0] = string;
            AnonymousClass8BT.A18(waTextView, this, objArr, 2131893273);
            TextEmojiLabel textEmojiLabel = this.A00;
            Object[] objArr2 = new Object[1];
            String str = this.A01;
            if (str != null) {
                objArr2[0] = str;
                AnonymousClass8BT.A18(textEmojiLabel, this, objArr2, 2131893272);
                this.A03.setText(2131896067);
                AnonymousClass3MY.A1A(view, 2131435043, 0);
                return;
            }
        }
        C18070vi.A11("formattedDiscount");
        throw null;
    }

    public void A1K() {
        super.A1K();
        C189599jV r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }
}
