package com.whatsapp.payments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1QE;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46N;
import X.C000200d;
import X.C003401n;
import X.C192489oU;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import X.C97674pr;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.qrcode.WaQrScannerView;

public final class IndiaUpiQrCodeScanActivity extends AnonymousClass46N {
    public AnonymousClass00H A00;
    public boolean A01;
    public final AnonymousClass1QE A02;

    public IndiaUpiQrCodeScanActivity() {
        this(0);
        this.A02 = AnonymousClass1QE.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");
    }

    public void onCreate(Bundle bundle) {
        A2r(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(2131625682, (ViewGroup) null, false));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131892007);
            supportActionBar.A0W(true);
        }
        AnonymousClass3MY.A0J(this).A0W(true);
        WaQrScannerView waQrScannerView = (WaQrScannerView) findViewById(2131434258);
        this.A05 = waQrScannerView;
        waQrScannerView.setQrScannerCallback(new C97674pr(this, 0));
        AnonymousClass3MX.A1H(this, 2131433364, 0);
        A4b();
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A03 = AnonymousClass3MZ.A0Z(A0L);
            this.A04 = AnonymousClass3Ma.A0b(A0L);
            this.A00 = C000200d.A00(r1.AFx);
        }
    }

    public void onPause() {
        super.onPause();
        ((C192489oU) this.A00.get()).A01(4);
    }

    public IndiaUpiQrCodeScanActivity(int i) {
        this.A01 = false;
        C91024f1.A00(this, 14);
    }
}
