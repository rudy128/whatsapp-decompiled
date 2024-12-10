package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8GO;
import X.AnonymousClass8Gi;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C18000vb;
import X.C188439hQ;
import X.C197929xV;
import X.C197979xa;
import X.C199159zX;
import X.C20110A7s;
import X.C20118A8b;
import X.C20155A9r;
import X.C20160A9w;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;

public class IndiaUpiQrCodeUrlValidationActivity extends AnonymousClass91T {
    public C18000vb A00;
    public AnonymousClass1BI A01;
    public C199159zX A02;
    public C20110A7s A03;
    public C188439hQ A04;
    public C197929xV A05;
    public AnonymousClass8GO A06;
    public C197979xa A07;
    public String A08;
    public boolean A09;

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
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
            this.A05 = (C197929xV) r1.ACU.get();
            this.A00 = AnonymousClass10E.A6Q(r2);
            this.A07 = (C197979xa) r1.A9p.get();
            this.A04 = (C188439hQ) r1.ACH.get();
            this.A03 = r1.A8N();
            this.A02 = new C199159zX(AnonymousClass10E.A8q(r2));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            AnonymousClass4Yv.A01(this, 25);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r4;
        int i2;
        C20155A9r a9r;
        int i3;
        if (i == 21) {
            r4 = AnonymousClass4a6.A00(this);
            r4.A0S(AnonymousClass8BV.A0q(this, new Object[1], 2131891337, 0, 2131893635));
            i2 = 2131899286;
            a9r = new C20155A9r(this, 0);
        } else if (i != 22) {
            if (i == 40) {
                r4 = AnonymousClass4a6.A00(this);
                AnonymousClass8BT.A15(this, r4, new Object[]{this.A08}, 2131893948);
                i2 = 2131899286;
                i3 = 7;
            } else if (i != 41) {
                switch (i) {
                    case 24:
                        r4 = AnonymousClass4a6.A00(this);
                        r4.A0E(2131893951);
                        r4.A0D(2131893950);
                        C20155A9r.A01(r4, this, 2, 2131893949);
                        C20155A9r.A00(r4, this, 3, 2131898766);
                        r4.A0T(true);
                        break;
                    case 25:
                        Uri parse = Uri.parse(((C20118A8b) AnonymousClass8BS.A0W(this.A06.A03)).A0F);
                        String string = getString(2131897475);
                        SpannableString spannableString = new SpannableString(C197979xa.A00(parse.toString()));
                        Linkify.addLinks(spannableString, 1);
                        r4 = AnonymousClass4a6.A01(this, 2132082712);
                        r4.A0k(string);
                        r4.A0S(spannableString);
                        r4.setNegativeButton(2131894017, new C20155A9r(this, 4));
                        r4.setPositiveButton(2131897474, new C20155A9r(this, 5));
                        r4.A0T(true);
                        r4.A0O(C20160A9w.A00(this, 24));
                        break;
                    case 26:
                        r4 = AnonymousClass4a6.A00(this);
                        AnonymousClass8BT.A15(this, r4, new Object[]{this.A08}, 2131893947);
                        i2 = 2131899286;
                        i3 = 6;
                        break;
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                r4 = AnonymousClass4a6.A00(this);
                AnonymousClass8BT.A15(this, r4, new Object[]{this.A08}, 2131893946);
                i2 = 2131899286;
                i3 = 8;
            }
            a9r = new C20155A9r(this, i3);
        } else {
            r4 = AnonymousClass4a6.A00(this);
            r4.A0S(AnonymousClass8BV.A0q(this, new Object[1], 2131891337, 0, 2131897291));
            i2 = 2131899286;
            a9r = new C20155A9r(this, 1);
        }
        r4.A0Z(a9r, i2);
        r4.A0T(false);
        return r4.create();
    }

    public IndiaUpiQrCodeUrlValidationActivity(int i) {
        this.A09 = false;
        AGD.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = AnonymousClass3MX.A0l(getIntent().getStringExtra("ARG_JID"));
        this.A06 = (AnonymousClass8GO) AnonymousClass8BR.A0C(new AnonymousClass8Gi(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"), 1), this).A00(AnonymousClass8GO.class);
    }

    public IndiaUpiQrCodeUrlValidationActivity() {
        this(0);
    }
}
