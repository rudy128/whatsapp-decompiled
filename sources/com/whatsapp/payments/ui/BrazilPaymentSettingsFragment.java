package com.whatsapp.payments.ui;

import X.A3V;
import X.A54;
import X.A5H;
import X.A5V;
import X.A5Y;
import X.ADJ;
import X.AXA;
import X.AXR;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass17M;
import X.AnonymousClass1KI;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1QD;
import X.AnonymousClass1XH;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8Dk;
import X.AnonymousClass8k7;
import X.AnonymousClass8pJ;
import X.AnonymousClass8pM;
import X.AnonymousClass8pV;
import X.AnonymousClass96B;
import X.AnonymousClass9R4;
import X.AnonymousClass9RN;
import X.BBX;
import X.BCV;
import X.BD4;
import X.C108945cZ;
import X.C170278pb;
import X.C170628qP;
import X.C170648qR;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C184809bY;
import X.C188919iD;
import X.C191079lz;
import X.C191529mk;
import X.C194439rj;
import X.C194929sW;
import X.C195929uA;
import X.C19880zA;
import X.C20110A7s;
import X.C20112A7u;
import X.C20284AEs;
import X.C20642ATa;
import X.C20749AXe;
import X.C221618v;
import X.C29431cG;
import X.C30921ej;
import X.C33331ie;
import X.C60442o2;
import X.C70513Bj;
import X.C72463Mc;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BrazilPaymentSettingsFragment extends Hilt_BrazilPaymentSettingsFragment implements BBX {
    public C19880zA A00;
    public AnonymousClass1L9 A01;
    public C170648qR A02;
    public AnonymousClass1KI A03;
    public AnonymousClass1LU A04;
    public AXR A05;
    public C33331ie A06;
    public C20110A7s A07;
    public C30921ej A08;
    public C191529mk A09;
    public C191079lz A0A;
    public A54 A0B;
    public C170628qP A0C;
    public BD4 A0D;
    public C184809bY A0E;
    public A5H A0F;
    public C195929uA A0G;
    public C20749AXe A0H;
    public A5Y A0I;
    public AnonymousClass96B A0J;
    public C188919iD A0K;
    public AnonymousClass00H A0L = C221618v.A00(AnonymousClass17M.class);

    public void A2J(int i) {
        String str;
        if (i == 2) {
            AnonymousClass96B r0 = this.A0J;
            if (r0 != null) {
                String str2 = r0.A01;
                Integer num = r0.A00;
                String A012 = A5Y.A01(this.A0I, "generic_context", true);
                Intent A032 = AnonymousClass8BS.A03(A1n());
                if (A012 == null) {
                    A012 = "brpay_p_add_credential_router";
                }
                A032.putExtra("screen_name", A012);
                AnonymousClass8k7.A03(A032, "referral_screen", "push_provisioning");
                AnonymousClass8k7.A03(A032, "credential_push_data", str2);
                switch (num.intValue()) {
                    case 1:
                        str = "VISA";
                        break;
                    case 2:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "MASTERCARD";
                        break;
                }
                AnonymousClass8k7.A03(A032, "credential_card_network", str);
                AnonymousClass8k7.A03(A032, "onboarding_context", "generic_context");
                A1k(A032);
                return;
            }
            Log.e("BrazilPaymentSettingsViewModel instance is null and cannot continue to push prov");
            return;
        }
        super.A2J(i);
    }

    public void Bl5(boolean z) {
        A2O((String) null, "payment_home.add_payment_method");
    }

    public void C0I(C20284AEs aEs) {
    }

    public boolean CMD() {
        return true;
    }

    public static void A00(BrazilPaymentSettingsFragment brazilPaymentSettingsFragment, String str, String str2) {
        Intent A032 = AnonymousClass8BS.A03(brazilPaymentSettingsFragment.A1n());
        A032.putExtra("screen_name", str2);
        AnonymousClass8k7.A03(A032, "onboarding_context", "generic_context");
        AnonymousClass8k7.A03(A032, "referral_screen", str);
        C60442o2.A00(A032, brazilPaymentSettingsFragment.A0E.A00.A00, "payment_settings");
        brazilPaymentSettingsFragment.startActivityForResult(A032, 2);
    }

    public void A2I() {
        if (C18020vd.A05(C18040vf.A02, this.A0Z.A02, 1359)) {
            C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
            A032.A07("hc_entrypoint", "wa_payment_hub_support");
            A032.A07("app_type", "consumer");
            this.A0D.BiM(A032, 39, "payment_home", (String) null, 1);
            A1k(AnonymousClass8BR.A07(A14(), BrazilPaymentCareTransactionSelectorActivity.class));
            return;
        }
        super.A2I();
    }

    public void CHl(boolean z) {
        View view = this.A0B;
        if (view != null) {
            FrameLayout A0P = C108945cZ.A0P(view, 2131427518);
            A5V a5v = this.A0g;
            int i = 0;
            if (a5v != null) {
                if (a5v.A08.A04() != null) {
                    this.A0P.A05(AnonymousClass9RN.A00(this.A0L, this.A0g.A08.A04()));
                }
                ArrayList A042 = this.A0P.A04();
                if (!A042.isEmpty()) {
                    A0P.removeAllViews();
                    AnonymousClass8Dk r4 = new AnonymousClass8Dk(A14());
                    r4.A00(new C194439rj(new C20642ATa(A0P, this), (C70513Bj) C29431cG.A0s(A042).get(0), A042.size()));
                    A0P.addView(r4);
                    int size = A042.size();
                    Set set = ((AnonymousClass17M) this.A0L.get()).A00;
                    if (size > 1) {
                        set.add(this);
                    } else {
                        set.remove(this);
                    }
                }
            }
            if (!z) {
                i = 8;
            }
            A0P.setVisibility(i);
        }
    }

    public void A1r() {
        super.A1r();
        ((AnonymousClass17M) this.A0L.get()).A00.remove(this);
    }

    public void A1u() {
        super.A1u();
        A5V a5v = this.A0g;
        if (a5v != null) {
            a5v.A04();
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 2 && i2 == -1) {
            A1k(AnonymousClass8BR.A07(A1n(), BrazilFbPayHubActivity.class));
        }
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        super.A1z(bundle);
        C170648qR r2 = this.A02;
        String str = null;
        if (!r2.A0C() || !r2.A0D()) {
            r2.A0B((BCV) null, "payment_settings", true);
        }
        C18030ve r1 = this.A02;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r1, 698)) {
            this.A0C.A0B();
        }
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null) {
            Uri uri = (Uri) bundle2.getParcelable("extra_deep_link_url");
            if (uri != null && AnonymousClass9R4.A00(uri, this.A0H)) {
                AnonymousClass1XH.A01(this, (Integer) null, 2131887208, (Integer) null, (Object[]) null);
            }
            str2 = bundle2.getString("notification-type", (String) null);
            str = bundle2.getString("step-up-id", (String) null);
        }
        A5V a5v = this.A0g;
        if (a5v != null) {
            a5v.A07(str2, str);
        }
        this.A19 = new AXA(this, 0);
        if (!this.A0I.A03.A03()) {
            AnonymousClass1QD r22 = this.A0W;
            if ((!r22.A03().contains("payment_account_recoverable") || !r22.A03().contains("payment_account_recoverable_time_ms")) && C18020vd.A05(r4, this.A02, 2000)) {
                this.A0A.A00(A1n());
            }
        }
        C18070vi.A0d(this.A02, 0);
    }

    public void CAu() {
        Intent A032 = AnonymousClass8BS.A03(A1D());
        A032.putExtra("screen_name", "brpay_p_doc_upload_intro");
        startActivityForResult(A032, 1);
    }

    public void CR0(List list) {
        super.CR0(list);
        if (A1b() && A1B() != null && this.A0J != null && this.A08.A00() != null) {
            C18030ve r2 = this.A08.A00().A00;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 12355) && C18020vd.A05(r1, r2, 12354)) {
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C20284AEs A0P = AnonymousClass8BR.A0P(it);
                    if (A0P instanceof AnonymousClass8pM) {
                        C170278pb r5 = A0P.A08;
                        if (r5 instanceof AnonymousClass8pJ) {
                            AnonymousClass8pV r52 = (AnonymousClass8pV) r5;
                            ADJ adj = (ADJ) r52.A03.get("pix_key_type");
                            ADJ adj2 = (ADJ) r52.A03.get("pix_key");
                            ADJ adj3 = (ADJ) r52.A03.get("pix_display_name");
                            if (!(adj == null || adj2 == null || adj3 == null)) {
                                A13.add(new C194929sW(adj.A00, adj2.A00, adj3.A00, A0P.A0A));
                            }
                        }
                    }
                }
                PaymentMethodRow paymentMethodRow = new PaymentMethodRow(A14());
                C72463Mc.A0x(A1n(), AnonymousClass3MZ.A09(this), paymentMethodRow, 2130970830, 2131102245);
                this.A06.removeAllViews();
                paymentMethodRow.A00.setImageResource(2131232823);
                if (A13.isEmpty()) {
                    paymentMethodRow.A03.setText(A1H(2131887390));
                    paymentMethodRow.A04.A01();
                    AnonymousClass3Ma.A1D(paymentMethodRow, this, 27);
                    this.A06.addView(paymentMethodRow);
                } else {
                    C194929sW r22 = (C194929sW) A13.get(0);
                    paymentMethodRow.A03.setText(r22.A01);
                    String str = r22.A02;
                    String str2 = r22.A03;
                    C17960vV.A07(str2);
                    paymentMethodRow.setAccountId(A3V.A01(str, str2));
                    paymentMethodRow.A05.setImageResource(2131231878);
                    paymentMethodRow.A05.setVisibility(0);
                    paymentMethodRow.A04.A01();
                    AnonymousClass3MY.A1E(paymentMethodRow, this, r22, 17);
                    TransactionsExpandableView transactionsExpandableView = new TransactionsExpandableView(A14());
                    C72463Mc.A0x(A1n(), AnonymousClass3MZ.A09(this), transactionsExpandableView, 2130970830, 2131102245);
                    transactionsExpandableView.setTitle(A1H(2131894612));
                    transactionsExpandableView.setCustomEmptyView(paymentMethodRow);
                    transactionsExpandableView.A01(AnonymousClass000.A13());
                    this.A06.addView(transactionsExpandableView);
                }
                this.A06.setVisibility(0);
                this.A01.setVisibility(0);
            }
        }
    }
}
