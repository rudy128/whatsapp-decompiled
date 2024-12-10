package com.whatsapp.payments.ui;

import X.A46;
import X.A7B;
import X.AGD;
import X.AH2;
import X.AXS;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1QE;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8Fe;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.AnonymousClass9V4;
import X.C137116uw;
import X.C175838zM;
import X.C17960vV;
import X.C191359mT;
import X.C20155A9r;
import X.C20284AEs;
import X.C20337AGt;
import X.C20752AXh;
import X.C21427Aju;
import X.C33331ie;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public class IndiaUpiStepUpActivity extends AnonymousClass91S {
    public AnonymousClass9V4 A00;
    public AnonymousClass8pN A01;
    public AnonymousClass1LU A02;
    public C33331ie A03;
    public C175838zM A04;
    public AnonymousClass8Fe A05;
    public String A06;
    public boolean A07;
    public final AnonymousClass1QE A08;
    public final List A09;

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
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
            this.A02 = AnonymousClass3MY.A0Z(r2);
            this.A00 = (AnonymousClass9V4) A002.A4S.get();
            this.A03 = (C33331ie) r2.AcE.get();
        }
    }

    public void C5K(A7B a7b) {
        throw new UnsupportedOperationException(this.A08.A03("onSetPin unsupported"));
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i != 28) {
            if (i != 32) {
                switch (i) {
                    case 10:
                        return A52(new C21427Aju(this, 6), getString(2131897423), getString(2131897422), i2, 2131894173, 2131898766);
                    case 11:
                        break;
                    case 12:
                        return A51(new C21427Aju(this, 7), getString(2131893923), 12, 2131899101, 2131899286);
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                A002.A0D(2131893786);
                C20155A9r.A01(A002, this, 17, 2131899286);
                return A002.create();
            }
        }
        return A50(this.A01, i);
    }

    public IndiaUpiStepUpActivity(int i) {
        this.A07 = false;
        AGD.A00(this, 32);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.9NX, java.lang.Object] */
    public void Bwk(A7B a7b, String str) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A08.A06("onListKeys called");
            AnonymousClass8Fe r4 = this.A05;
            AnonymousClass8pN r3 = r4.A05;
            ? obj = new Object();
            obj.A00 = 0;
            obj.A05 = str;
            obj.A04 = r3.A0B;
            obj.A01 = (AnonymousClass8pS) r3.A08;
            obj.A06 = (String) C20284AEs.A02(r3);
            r4.A02.A0F(obj);
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                AnonymousClass91U.A1b(this);
                A59(this.A01);
                return;
            }
            AnonymousClass1QE r2 = this.A08;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onListKeys: ");
            if (str != null) {
                num = AnonymousClass8BT.A0j(str);
            } else {
                num = null;
            }
            A10.append(num);
            AnonymousClass8BV.A1E(r2, " failed; ; showErrorAndFinish", A10);
            A56();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1014) {
            if (i2 == -1) {
                this.A0Q.A08();
                this.A0D.A06(this.A09);
                this.A03.A03((String) null);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable A1I = AnonymousClass91U.A1I(this);
        C17960vV.A08(A1I, "Bank account must be passed with intent extras");
        this.A01 = (AnonymousClass8pN) A1I;
        List list = this.A09;
        String stringExtra = getIntent().getStringExtra("extra_step_up_id");
        C17960vV.A08(stringExtra, "Step up id must be passed as intent extra");
        list.add(stringExtra);
        this.A04 = AnonymousClass91U.A1K(this);
        C191359mT r2 = new C191359mT(this, this.A05, AnonymousClass8BT.A0S(this), this.A0N);
        this.A06 = AXS.A01(this);
        AnonymousClass8Fe r22 = (AnonymousClass8Fe) AnonymousClass8BR.A0C(new AH2(r2, this, 5), this).A00(AnonymousClass8Fe.class);
        this.A05 = r22;
        r22.A00.A0A(this, new C20337AGt(this, 39));
        AnonymousClass8Fe r23 = this.A05;
        r23.A02.A0A(this, new C20337AGt(this, 40));
        A59(this.A01);
        AnonymousClass8Fe r0 = this.A05;
        A46.A00(r0.A04.A00, r0.A00, 2131895077);
    }

    public IndiaUpiStepUpActivity() {
        this(0);
        this.A08 = AnonymousClass1QE.A00("IndiaUpiStepUpActivity", "payment-settings", "IN");
        this.A09 = AnonymousClass000.A13();
    }
}
