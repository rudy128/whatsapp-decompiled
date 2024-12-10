package com.whatsapp.payments.ui.international;

import X.AGE;
import X.ALX;
import X.AXS;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1K1;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.AnonymousClass9F7;
import X.C003401n;
import X.C137116uw;
import X.C1418477e;
import X.C175608yz;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C186169dl;
import X.C19968A1d;
import X.C20061A5k;
import X.C20087A6p;
import X.C20112A7u;
import X.C20339AGv;
import X.C20996Aco;
import X.C21967AvV;
import X.C22242Azw;
import X.C22243Azx;
import X.C29621ca;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import com.whatsapp.util.Log;

public final class IndiaUpiInternationalValidateQrActivity extends AnonymousClass91T {
    public ALX A00;
    public boolean A01;
    public final C18100vl A02;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (ALX) r2.AcF.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625626);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BU.A17(supportActionBar, 2131897619);
        }
        C18100vl r3 = this.A02;
        C20339AGv.A00(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A00, new C22243Azx(this), 44);
        C20339AGv.A00(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A03, new C22242Azw(this), 44);
        IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) r3.getValue();
        Class<String> cls = String.class;
        C1418477e A0Y = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, AXS.A01(this), "upiSequenceNumber");
        C1418477e A0Y2 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, getIntent().getStringExtra("INTERNATIONAL_QR_PAYLOAD"), "invoiceUrl");
        C1418477e A0D = this.A0N.A0D();
        String stringExtra = getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = this.A0f;
        AnonymousClass1DT r6 = indiaUpiInternationalValidateQrViewModel.A00;
        C19968A1d a1d = (C19968A1d) r6.A06();
        C19968A1d a1d2 = null;
        if (a1d != null) {
            a1d2 = new C19968A1d(a1d.A00, true);
        }
        r6.A0F(a1d2);
        C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
        A03.A07("payments_request_name", "validate_international_qr");
        C20087A6p.A02(A03, indiaUpiInternationalValidateQrViewModel.A02, (Integer) null, "international_payment_prompt", str, 3);
        C175608yz r2 = (C175608yz) indiaUpiInternationalValidateQrViewModel.A04.get();
        C186169dl r4 = new C186169dl(A0Y2, indiaUpiInternationalValidateQrViewModel, stringExtra);
        Log.i("PAY: validateInternationalQrCode called");
        AnonymousClass00H r1 = r2.A02;
        String A0T = C17890vO.A0T(r1);
        String A012 = r2.A00.A01();
        C18070vi.A0X(A012);
        AnonymousClass9F7 r8 = new AnonymousClass9F7(A0T, A012, AnonymousClass8BS.A0h(A0Y), AnonymousClass8BS.A0h(A0Y2), (String) C20061A5k.A01(A0D));
        AnonymousClass8BW.A1B(C17880vN.A0U(r1), new C20996Aco(r8, r4, 17), (C29621ca) r8.A00, A0T);
    }

    public IndiaUpiInternationalValidateQrActivity(int i) {
        this.A01 = false;
        AGE.A00(this, 6);
    }

    public IndiaUpiInternationalValidateQrActivity() {
        this(0);
        this.A02 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C21967AvV(this));
    }
}
