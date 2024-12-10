package com.whatsapp.payments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3MY;
import X.C108955ca;
import X.C109005cf;
import X.C114775ry;
import X.C1423279a;
import X.C18070vi;
import android.os.Bundle;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;

public final class IndiaUpiContactPicker extends ContactPicker {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114775ry.A03(A0A, r1, this, A0A.ABd);
            C114775ry.A0Q(r1, this);
        }
    }

    public IndiaUpiContactPicker(int i) {
        this.A00 = false;
        C1423279a.A00(this, 25);
    }

    public ContactPickerFragment A4f() {
        if (AnonymousClass3MY.A09(this) != null) {
            Bundle A09 = AnonymousClass3MY.A09(this);
            C18070vi.A0b(A09);
            if (A09.getBoolean("for_payment_merchants", false)) {
                return new IndiaPaymentMerchantContactPickerFragment();
            }
            if (A09.getBoolean("for_payment_to_number", false)) {
                return new IndiaUpiPayNumberContactPickerFragment();
            }
        }
        return new IndiaUpiSendPayContactPickerFragment();
    }

    public IndiaUpiContactPicker() {
        this(0);
    }
}
