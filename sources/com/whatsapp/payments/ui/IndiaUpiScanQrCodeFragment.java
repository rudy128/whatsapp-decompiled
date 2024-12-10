package com.whatsapp.payments.ui;

import X.AFP;
import X.AXS;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1HS;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1QD;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass78G;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BY;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C192489oU;
import X.C21007Acz;
import X.C21422Ajp;
import X.C28931bI;
import X.C36401np;
import X.C72463Mc;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.widget.IndiaUpiQrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiScanQrCodeFragment extends Hilt_IndiaUpiScanQrCodeFragment {
    public ImageView A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1HS A02;
    public C18030ve A03;
    public AnonymousClass1LU A04;
    public AXS A05;
    public AnonymousClass1QS A06;
    public AZ6 A07;
    public WaQrScannerView A08;
    public C36401np A09;
    public AnonymousClass10I A0A;
    public AnonymousClass00H A0B;
    public String A0C;
    public boolean A0D = true;
    public boolean A0E = true;
    public View A0F;
    public IndiaUpiQrScannerOverlay A0G;
    public C28931bI A0H;
    public C28931bI A0I;

    public void A2A() {
        this.A0I.A04(8);
        Bundle bundle = this.A06;
        AnonymousClass1FL A1B = A1B();
        if (bundle != null && (A1B instanceof IndiaUpiQrTabActivity)) {
            IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) A1B;
            int i = bundle.getInt("extra_payments_entry_type");
            IndiaUpiQrScannerOverlay indiaUpiQrScannerOverlay = this.A0G;
            indiaUpiQrScannerOverlay.A00 = this.A06.A02("p2p_context").A0D();
            indiaUpiQrScannerOverlay.invalidate();
            Context A1n = A1n();
            if (indiaUpiQrTabActivity.A4d() && !this.A06.A02("p2p_context").A0D()) {
                String string = A15().getString("referral_screen");
                if (A00(this)) {
                    AnonymousClass1FL A1B2 = A1B();
                    if (!(A1B2 instanceof IndiaUpiQrTabActivity) || !((IndiaUpiQrTabActivity) A1B2).A4c()) {
                        AXS axs = this.A05;
                        synchronized (axs) {
                            try {
                                AnonymousClass1QD r2 = axs.A01;
                                JSONObject A0c = AnonymousClass8BY.A0c(r2);
                                A0c.put("chatListQrScanOnboardingSheetDismissed", true);
                                AnonymousClass8BT.A1G(r2, A0c);
                            } catch (JSONException e) {
                                Log.w("PAY: IndiaUpiPaymentSharedPrefs storeChatListQrScanOnboardingSheetDismissed threw: ", e);
                            }
                        }
                    } else {
                        this.A0D = false;
                    }
                    Intent A042 = AnonymousClass8BS.A04(A1n);
                    A042.putExtra("extra_payments_entry_type", i);
                    A042.putExtra("referral_screen", string);
                    A042.putExtra("extra_referral_screen", string);
                    A042.putExtra("extra_skip_value_props_display", false);
                    A042.putExtra("extra_show_bottom_sheet_props", true);
                    A042.putExtra("extra_scan_qr_onboarding_only", true);
                    A042.putExtra("extra_deep_link_url", indiaUpiQrTabActivity.getIntent().getParcelableExtra("actual_deep_link"));
                    indiaUpiQrTabActivity.CNh(A042, 1025);
                    return;
                }
                String A1H = A1H(2131895396);
                TextView A0M = AnonymousClass3MX.A0M(this.A0I);
                A0M.setText(this.A09.A05(A1n, new C21422Ajp(45), A1H, "learn-more"));
                A0M.setOnClickListener(new AnonymousClass78G(this, A0M, indiaUpiQrTabActivity, string, i, 0));
                this.A0I.A04(0);
                return;
            }
            return;
        }
        return;
    }

    public void A26() {
        this.A0G.setVisibility(8);
        View view = this.A0F;
        C72463Mc.A0x(A1n(), AnonymousClass3MZ.A09(this), view, 2130968798, 2131099872);
        this.A0F.setVisibility(0);
    }

    public void A27() {
        this.A08.setVisibility(8);
        this.A0G.setVisibility(8);
        this.A0F.setVisibility(0);
    }

    public void A28() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 11393) && this.A06.A02("p2p_context").A0D()) {
            AnonymousClass1FL A1B = A1B();
            if ((A1B instanceof IndiaUpiQrTabActivity) && ((IndiaUpiQrTabActivity) A1B).A4d()) {
                this.A0H.A04(0);
                AnonymousClass3MX.A0M(this.A0H).setText(2131895397);
                AnonymousClass3MX.A1A(A14(), this.A0H.A02(), 2131103058);
                this.A0H.A05(new AFP(this, 48));
            }
        }
    }

    public void A29() {
        this.A08.setVisibility(0);
        IndiaUpiQrScannerOverlay indiaUpiQrScannerOverlay = this.A0G;
        indiaUpiQrScannerOverlay.A00 = this.A06.A02("p2p_context").A0D();
        indiaUpiQrScannerOverlay.invalidate();
        this.A0G.setVisibility(0);
        this.A0F.setVisibility(8);
    }

    public static boolean A00(IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment) {
        boolean z;
        AnonymousClass1FL A1B = indiaUpiScanQrCodeFragment.A1B();
        if ((A1B instanceof IndiaUpiQrTabActivity) && ((IndiaUpiQrTabActivity) A1B).A4c()) {
            return indiaUpiScanQrCodeFragment.A0D;
        }
        AXS axs = indiaUpiScanQrCodeFragment.A05;
        synchronized (axs) {
            z = false;
            try {
                String A062 = axs.A01.A06();
                if (!TextUtils.isEmpty(A062)) {
                    z = C17880vN.A16(A062).optBoolean("chatListQrScanOnboardingSheetDismissed", false);
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs isChatListQrScanOnboardingSheetShown threw: ", e);
            }
        }
        return !z;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A092 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131627280);
        if (C18020vd.A05(C18040vf.A02, this.A03, 12667)) {
            ((WaQrScannerView) AnonymousClass1HF.A06(A092, 2131434258)).setShouldUseGoogleVisionScanner(true);
        }
        return A092;
    }

    public void A1t() {
        super.A1t();
        if (this.A08.getVisibility() == 0) {
            this.A08.setVisibility(4);
        }
        ((C192489oU) this.A0B.get()).A01(4);
    }

    public void A1u() {
        AnonymousClass1FL A1B;
        super.A1u();
        if (this.A08.getVisibility() == 4 && (A1B = A1B()) != null && !A1B.isFinishing()) {
            this.A08.setVisibility(0);
        }
    }

    public void A21(Bundle bundle, View view) {
        boolean z;
        IndiaUpiQrScannerOverlay indiaUpiQrScannerOverlay = (IndiaUpiQrScannerOverlay) AnonymousClass1HF.A06(view, 2131433364);
        this.A0G = indiaUpiQrScannerOverlay;
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof IndiaUpiQrTabActivity) {
            z = ((IndiaUpiQrTabActivity) A1B).A4d();
        } else {
            z = false;
        }
        indiaUpiQrScannerOverlay.A01 = z;
        if (z) {
            if (C18020vd.A05(C18040vf.A02, indiaUpiQrScannerOverlay.getAbProps(), 10659)) {
                AnonymousClass3MW.A0J(indiaUpiQrScannerOverlay.A03, 2131433366).setText(indiaUpiQrScannerOverlay.getContext().getString(2131895394));
                C28931bI r3 = indiaUpiQrScannerOverlay.A04;
                AnonymousClass3MW.A0J(r3.A02(), 2131431777).setText(indiaUpiQrScannerOverlay.getContext().getString(2131895395));
                r3.A04(0);
            }
        }
        this.A08 = (WaQrScannerView) AnonymousClass1HF.A06(view, 2131434258);
        this.A0F = AnonymousClass1HF.A06(view, 2131435338);
        this.A0I = C28931bI.A00(view, 2131431460);
        this.A0H = C28931bI.A00(view, 2131428317);
        this.A08.setQrScannerCallback(new C21007Acz(this));
        View A062 = AnonymousClass1HF.A06(view, 2131434257);
        A062.setVisibility(0);
        AFP.A00(A062, this, 46);
        ImageView A0G2 = AnonymousClass3MW.A0G(view, 2131434256);
        this.A00 = A0G2;
        AFP.A00(A0G2, this, 47);
        if (!A00(this)) {
            A2A();
        }
        A27();
        A28();
    }
}
