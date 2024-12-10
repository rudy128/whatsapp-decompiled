package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass10I;
import X.AnonymousClass1HS;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RB;
import X.C17890vO;
import X.C19830z4;
import X.C20098A7b;
import X.C72453Mb;
import X.C97674pr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.qrcode.Hilt_QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;

public class QrScanCodeFragment extends Hilt_QrScanCodeFragment {
    public ImageView A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1HS A02;
    public C19830z4 A03;
    public WaQrScannerView A04;
    public AnonymousClass10I A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public QrScannerOverlay A0C;
    public final Runnable A0D = new AnonymousClass7RB((Object) this, 33);
    public final Runnable A0E = new AnonymousClass7RB((Object) this, 34);

    public static void A00(QrScanCodeFragment qrScanCodeFragment) {
        WaQrScannerView waQrScannerView = qrScanCodeFragment.A04;
        if (waQrScannerView != null) {
            int i = 0;
            waQrScannerView.setVisibility(C72453Mb.A07(qrScanCodeFragment.A0A ? 1 : 0));
            QrScannerOverlay qrScannerOverlay = qrScanCodeFragment.A0C;
            if (!qrScanCodeFragment.A0A) {
                i = 8;
            }
            qrScannerOverlay.setVisibility(i);
        }
    }

    public void A1r() {
        this.A01.A0I(this.A0D);
        super.A1r();
    }

    public void A26() {
        this.A01.A0I(this.A0E);
        this.A0A = true;
        A00(this);
        AnonymousClass1KB r0 = this.A01;
        Runnable runnable = this.A0D;
        r0.A0I(runnable);
        if (this.A08) {
            if (A1e()) {
                C20098A7b.A02(new Hilt_QrEducationDialogFragment(), A1E());
                this.A07 = true;
            }
        } else if (!this.A09) {
            this.A01.A0K(runnable, 15000);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A092 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624689);
        this.A04 = (WaQrScannerView) A092.findViewById(2131434258);
        this.A0C = (QrScannerOverlay) A092.findViewById(2131433364);
        this.A0B = A092.findViewById(2131434257);
        this.A00 = AnonymousClass3MW.A0H(A092, 2131434256);
        this.A08 = AnonymousClass3MX.A1T(C17890vO.A0B(this.A03), "contact_qr_education");
        AnonymousClass3Ma.A1A(this.A00, this, 24);
        AnonymousClass3Ma.A1A(this.A0B, this, 25);
        WaQrScannerView waQrScannerView = this.A04;
        waQrScannerView.setQrScannerCallback(new C97674pr(this, 2));
        waQrScannerView.setContentDescription(A1H(2131898820));
        AnonymousClass1Y5.A02(this.A04, 2131886184);
        AnonymousClass3Ma.A1A(this.A04, this, 26);
        A00(this);
        return A092;
    }

    public void A1t() {
        super.A1t();
        this.A01.A0I(this.A0D);
    }

    public void A1u() {
        super.A1u();
        if (this.A0A && !this.A09 && !this.A08) {
            this.A01.A0K(this.A0D, 15000);
        }
    }
}
