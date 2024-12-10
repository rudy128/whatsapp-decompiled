package com.whatsapp.payments.ui.international;

import X.A7B;
import X.AGE;
import X.AXS;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C1418477e;
import X.C170278pb;
import X.C18070vi;
import X.C20284AEs;
import X.C20752AXh;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;

public final class IndiaUpiInternationalDeactivationActivity extends AnonymousClass91S {
    public AnonymousClass8pN A00;
    public C1418477e A01;
    public boolean A02;

    public void Bwk(A7B a7b, String str) {
        String str2;
        String str3 = str;
        if (str != null && str.length() != 0) {
            AnonymousClass8pN r2 = this.A00;
            if (r2 != null) {
                String str4 = r2.A0B;
                C1418477e r0 = this.A01;
                if (r0 == null) {
                    str2 = "seqNumber";
                } else {
                    String str5 = (String) r0.A00;
                    C170278pb r4 = r2.A08;
                    C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                    AnonymousClass8pS r42 = (AnonymousClass8pS) r4;
                    AnonymousClass8pN r02 = this.A00;
                    if (r02 != null) {
                        A5C(r42, str3, str4, str5, (String) C20284AEs.A02(r02), 3);
                        return;
                    }
                }
            }
            C18070vi.A11("paymentBankAccount");
            throw null;
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                AnonymousClass91U.A1b(this);
                AnonymousClass8pN r03 = this.A00;
                if (r03 == null) {
                    str2 = "paymentBankAccount";
                } else {
                    A5A(r03.A08);
                    return;
                }
            } else {
                A56();
                throw null;
            }
        } else {
            return;
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1T(A002, r2, r1, this);
        }
    }

    public IndiaUpiInternationalDeactivationActivity(int i) {
        this.A02 = false;
        AGE.A00(this, 5);
    }

    public void C5K(A7B a7b) {
        throw AnonymousClass8BY.A0b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8pN r0 = (AnonymousClass8pN) AnonymousClass91U.A1I(this);
        if (r0 != null) {
            this.A00 = r0;
        }
        this.A01 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, AXS.A01(this), "upiSequenceNumber");
        AnonymousClass8pN r02 = this.A00;
        if (r02 == null) {
            C18070vi.A11("paymentBankAccount");
            throw null;
        } else {
            A5A(r02.A08);
        }
    }

    public IndiaUpiInternationalDeactivationActivity() {
        this(0);
    }
}
