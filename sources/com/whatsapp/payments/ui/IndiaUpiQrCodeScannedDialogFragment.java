package com.whatsapp.payments.ui;

import X.A7Z;
import X.A8C;
import X.AFP;
import X.AX4;
import X.AX5;
import X.AXS;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1QE;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8Ft;
import X.AnonymousClass8Gi;
import X.AnonymousClass9YW;
import X.BB3;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C194529rs;
import X.C19954A0l;
import X.C20118A8b;
import X.C20756AXl;
import X.C22372B5b;
import X.C27831Xu;
import X.C72463Mc;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class IndiaUpiQrCodeScannedDialogFragment extends Hilt_IndiaUpiQrCodeScannedDialogFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public AnonymousClass18O A0B;
    public AnonymousClass11P A0C;
    public AnonymousClass118 A0D;
    public C18000vb A0E;
    public C18030ve A0F;
    public AnonymousClass1BI A0G;
    public C20756AXl A0H;
    public AXS A0I;
    public AnonymousClass1QL A0J;
    public AnonymousClass1QJ A0K;
    public AnonymousClass1QO A0L;
    public AZ6 A0M;
    public A8C A0N;
    public AnonymousClass8Ft A0O;
    public AnonymousClass00H A0P;
    public String A0Q;
    public final AnonymousClass1QE A0R = AnonymousClass1QE.A00("IndiaUpiQrCodeScannedDialogFragment", "payment-settings", "IN");

    public void A1y(Bundle bundle) {
        this.A0X = true;
        Bundle A15 = A15();
        this.A0G = AnonymousClass3MX.A0l(A15.getString("ARG_JID"));
        this.A0O = (AnonymousClass8Ft) AnonymousClass8BR.A0C(new AnonymousClass8Gi(this, A15.getString("ARG_URL"), A15.getString("external_payment_source"), 0), this).A00(AnonymousClass8Ft.class);
        AXS axs = this.A0I;
        this.A0H = new C20756AXl(this.A0B, this.A0F, axs, this.A0M, this.A0N);
        AFP.A00(this.A02, this, 44);
    }

    public static IndiaUpiQrCodeScannedDialogFragment A00(AnonymousClass1BI r4, String str, String str2, String str3) {
        String str4;
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = new IndiaUpiQrCodeScannedDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("ARG_URL", str);
        if (r4 != null) {
            str4 = r4.getRawString();
        } else {
            str4 = "";
        }
        A0D2.putString("ARG_JID", str4);
        A0D2.putString("external_payment_source", str2);
        A0D2.putString("referral_screen", str3);
        indiaUpiQrCodeScannedDialogFragment.A1R(A0D2);
        return indiaUpiQrCodeScannedDialogFragment;
    }

    public static void A01(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment) {
        C20118A8b a8b = (C20118A8b) AnonymousClass8BS.A0W(indiaUpiQrCodeScannedDialogFragment.A0O.A06);
        String str = indiaUpiQrCodeScannedDialogFragment.A0Q;
        if ("main_qr_code_gallery".equals(str) || "main_qr_code_camera".equals(str)) {
            C20756AXl aXl = indiaUpiQrCodeScannedDialogFragment.A0H;
            AnonymousClass1FL A1D = indiaUpiQrCodeScannedDialogFragment.A1D();
            String str2 = a8b.A08;
            C17960vV.A07(str2);
            C20756AXl.A00(A1D, indiaUpiQrCodeScannedDialogFragment.A0G, new AX5(A1D, 1025, true), (BB3) null, aXl, str2, a8b.A02, indiaUpiQrCodeScannedDialogFragment.A0Q, true);
        } else if (((C19954A0l) indiaUpiQrCodeScannedDialogFragment.A0P.get()).A01(indiaUpiQrCodeScannedDialogFragment.A0Q, true)) {
            C20756AXl aXl2 = indiaUpiQrCodeScannedDialogFragment.A0H;
            String str3 = a8b.A08;
            C17960vV.A07(str3);
            C20756AXl.A00(indiaUpiQrCodeScannedDialogFragment.A14(), indiaUpiQrCodeScannedDialogFragment.A0G, new AX4(indiaUpiQrCodeScannedDialogFragment), (BB3) null, aXl2, str3, a8b.A02, indiaUpiQrCodeScannedDialogFragment.A0Q, true);
            return;
        } else {
            AnonymousClass1FL A1D2 = indiaUpiQrCodeScannedDialogFragment.A1D();
            C20756AXl aXl3 = indiaUpiQrCodeScannedDialogFragment.A0H;
            String str4 = a8b.A08;
            C17960vV.A07(str4);
            aXl3.A01(A1D2, indiaUpiQrCodeScannedDialogFragment.A0G, (BB3) null, str4, a8b.A02, indiaUpiQrCodeScannedDialogFragment.A0Q);
        }
        indiaUpiQrCodeScannedDialogFragment.A28();
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0R.A06("scanned payment QR code deep link");
        View inflate = A1D().getLayoutInflater().inflate(2131625681, (ViewGroup) null);
        this.A01 = inflate;
        this.A07 = (ProgressBar) inflate.findViewById(2131434180);
        this.A03 = AnonymousClass8BR.A0A(this.A01, 2131429955);
        this.A09 = C17880vN.A0E(this.A01, 2131429420);
        this.A08 = C17880vN.A0E(this.A01, 2131429419);
        this.A0A = C17880vN.A0E(this.A01, 2131430522);
        this.A02 = (Button) this.A01.findViewById(2131433997);
        this.A04 = AnonymousClass8BR.A0A(this.A01, 2131434027);
        this.A05 = AnonymousClass8BR.A0A(this.A01, 2131434251);
        this.A00 = this.A01.findViewById(2131434252);
        for (Drawable drawable : AnonymousClass3MW.A0J(this.A01, 2131437014).getCompoundDrawables()) {
            if (drawable != null) {
                C27831Xu.A0C(drawable, AnonymousClass3MZ.A09(this).getColor(C72463Mc.A01(A1n())));
            }
        }
        ProgressBar progressBar = (ProgressBar) this.A01.findViewById(2131428615);
        this.A06 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(AnonymousClass3MZ.A02(A1n(), A1n(), 2130970830, 2131102245), PorterDuff.Mode.SRC_IN);
        String A0y = AnonymousClass8BR.A0y(A15());
        this.A0Q = A0y;
        this.A0M.BiL((Integer) null, "qr_code_scan_prompt", A0y, 0);
        return this.A01;
    }

    public void A1K() {
        super.A1K();
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof C22372B5b) {
            AnonymousClass3MW.A1U((C22372B5b) A1B);
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 1001) {
            if (this.A0J.A0E() || this.A0J.A0F()) {
                if (!C18020vd.A05(C18040vf.A02, this.A0F, 1933) || !A7Z.A05(this.A0Q)) {
                    Bundle A15 = A15();
                    this.A0O.A0T(A15.getString("ARG_URL"), A15.getString("external_payment_source"));
                    return;
                }
                A01(this);
                return;
            }
        } else if (i == 1002) {
            if (((C19954A0l) this.A0P.get()).A01(this.A0Q, true)) {
                AnonymousClass1FL A1B = A1B();
                if (A1B instanceof AnonymousClass1FU) {
                    AnonymousClass1FU r4 = (AnonymousClass1FU) A1B;
                    if (!r4.isFinishing() && intent != null && i2 == -1) {
                        ((C19954A0l) this.A0P.get()).A00(r4, new C194529rs(intent.getExtras(), true, true), (AnonymousClass9YW) null);
                    }
                }
            }
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 instanceof C22372B5b) {
                ((Activity) ((C22372B5b) A1B2)).setResult(i2, intent);
            }
        } else {
            return;
        }
        A28();
    }
}
