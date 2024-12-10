package com.whatsapp.payments.ui;

import X.A87;
import X.A8I;
import X.AFP;
import X.AYR;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11X;
import X.AnonymousClass1BI;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1QR;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8pS;
import X.C1418477e;
import X.C170278pb;
import X.C170318pf;
import X.C171858sO;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C191099m1;
import X.C19620yd;
import X.C20061A5k;
import X.C20112A7u;
import X.C20284AEs;
import X.C20337AGt;
import X.C21447AkE;
import X.C24921Me;
import X.C25181Nf;
import X.C27231Vg;
import X.C72463Mc;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class IndiaUpiPaymentTransactionConfirmationFragment extends Hilt_IndiaUpiPaymentTransactionConfirmationFragment {
    public TextView A00;
    public TextView A01;
    public LottieAnimationView A02;
    public AnonymousClass1KB A03;
    public C24921Me A04;
    public AnonymousClass11P A05;
    public AnonymousClass118 A06;
    public C18000vb A07;
    public C25181Nf A08;
    public AnonymousClass1QR A09;
    public C18030ve A0A;
    public AZ6 A0B;
    public C191099m1 A0C;
    public C27231Vg A0D;
    public AnonymousClass10I A0E;
    public WDSButton A0F;
    public WDSButton A0G;
    public String A0H;
    public TextView A0I;
    public AnonymousClass1BI A0J;
    public C1418477e A0K;
    public C1418477e A0L;
    public IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel A0M;
    public String A0N;
    public boolean A0O;

    private void A00(int i) {
        Object obj;
        C1418477e r0;
        AnonymousClass1BI r1;
        if (!C20061A5k.A02(this.A0K)) {
            r0 = this.A0K;
        } else if (!this.A0O && (r1 = this.A0J) != null) {
            obj = this.A04.A0I(this.A08.A01(r1));
            AnonymousClass8BT.A18(this.A0I, this, AnonymousClass8BV.A1b(obj), i);
        } else if (!C20061A5k.A02(this.A0L)) {
            r0 = this.A0L;
        } else {
            obj = null;
            AnonymousClass8BT.A18(this.A0I, this, AnonymousClass8BV.A1b(obj), i);
        }
        obj = r0.A00;
        AnonymousClass8BT.A18(this.A0I, this, AnonymousClass8BV.A1b(obj), i);
    }

    public static void A01(IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment, int i) {
        String str;
        C191099m1 r1;
        String str2;
        if (i == 0) {
            indiaUpiPaymentTransactionConfirmationFragment.A00(2131897644);
            indiaUpiPaymentTransactionConfirmationFragment.A02.A09.A0F(0, 89);
            indiaUpiPaymentTransactionConfirmationFragment.A02.A04();
            indiaUpiPaymentTransactionConfirmationFragment.A02.setContentDescription(indiaUpiPaymentTransactionConfirmationFragment.A1H(2131891797));
            str = "PROCESSING";
        } else if (i == 1) {
            int A012 = C72463Mc.A01(indiaUpiPaymentTransactionConfirmationFragment.A1n());
            indiaUpiPaymentTransactionConfirmationFragment.A01.setText(2131897642);
            AnonymousClass8BS.A14(AnonymousClass3MZ.A09(indiaUpiPaymentTransactionConfirmationFragment), indiaUpiPaymentTransactionConfirmationFragment.A01, A012);
            str = "PROCESSING_LONG_WAIT";
        } else if (i != 2) {
            if (!(i != 3 || (r1 = indiaUpiPaymentTransactionConfirmationFragment.A0C) == null || (str2 = indiaUpiPaymentTransactionConfirmationFragment.A0H) == null)) {
                r1.A00(str2);
            }
            str = null;
        } else {
            indiaUpiPaymentTransactionConfirmationFragment.A02.A09.A0F(180, 269);
            indiaUpiPaymentTransactionConfirmationFragment.A02.A09.A0d.setRepeatCount(0);
            indiaUpiPaymentTransactionConfirmationFragment.A02.setContentDescription(indiaUpiPaymentTransactionConfirmationFragment.A1H(2131894106));
            indiaUpiPaymentTransactionConfirmationFragment.A00(2131897640);
            int A002 = AnonymousClass1YL.A00(indiaUpiPaymentTransactionConfirmationFragment.A1n(), 2130968583, 2131099679);
            indiaUpiPaymentTransactionConfirmationFragment.A01.setText(2131897641);
            AnonymousClass8BS.A14(AnonymousClass3MZ.A09(indiaUpiPaymentTransactionConfirmationFragment), indiaUpiPaymentTransactionConfirmationFragment.A01, A002);
            TextView textView = indiaUpiPaymentTransactionConfirmationFragment.A00;
            Context context = indiaUpiPaymentTransactionConfirmationFragment.A06.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            C18000vb r7 = indiaUpiPaymentTransactionConfirmationFragment.A07;
            AnonymousClass11P r8 = indiaUpiPaymentTransactionConfirmationFragment.A05;
            String A072 = AnonymousClass11X.A00.A07(r7, r8.A09(r8.A05()));
            C18000vb r9 = indiaUpiPaymentTransactionConfirmationFragment.A07;
            AnonymousClass11P r82 = indiaUpiPaymentTransactionConfirmationFragment.A05;
            A1a[0] = A87.A03(r7, A072, A8I.A00(r9, r82.A09(r82.A05())));
            AnonymousClass3MY.A0y(context, textView, A1a, 2131896920);
            indiaUpiPaymentTransactionConfirmationFragment.A00.setVisibility(0);
            indiaUpiPaymentTransactionConfirmationFragment.A0G.setVisibility(0);
            indiaUpiPaymentTransactionConfirmationFragment.A0F.setVisibility(0);
            if (C18020vd.A05(C18040vf.A02, indiaUpiPaymentTransactionConfirmationFragment.A0A, 3708)) {
                C27231Vg r2 = indiaUpiPaymentTransactionConfirmationFragment.A0D;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C19620yd.A04);
                r2.A02(Uri.parse(C17880vN.A0t(A10, 2132017243)));
            }
            str = "SUCCESS";
        }
        A02(indiaUpiPaymentTransactionConfirmationFragment, str, 0, 0);
    }

    public static void A02(IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment, String str, int i, int i2) {
        C171858sO BHN = indiaUpiPaymentTransactionConfirmationFragment.A0B.BHN();
        BHN.A08 = Integer.valueOf(i);
        BHN.A0Y = "payment_confirm_prompt";
        BHN.A0b = "payments_transaction_confirmation";
        BHN.A0a = indiaUpiPaymentTransactionConfirmationFragment.A0N;
        if (!AnonymousClass1EG.A0H(str)) {
            C20112A7u A022 = C20112A7u.A02();
            A022.A07("transaction_status", str);
            AnonymousClass8BR.A1H(BHN, A022);
        }
        if (i == 1) {
            BHN.A07 = Integer.valueOf(i2);
        }
        indiaUpiPaymentTransactionConfirmationFragment.A0B.BiH(BHN);
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass8pS r5;
        Bundle bundle2 = this.A06;
        View view2 = view;
        this.A02 = (LottieAnimationView) AnonymousClass1HF.A06(view2, 2131432225);
        TextView A0J2 = AnonymousClass3MW.A0J(view2, 2131427786);
        this.A01 = AnonymousClass3MW.A0J(view2, 2131435610);
        this.A0I = AnonymousClass3MW.A0J(view2, 2131432903);
        this.A0G = AnonymousClass3MW.A0q(view2, 2131436786);
        this.A0F = AnonymousClass3MW.A0q(view2, 2131430125);
        this.A00 = AnonymousClass3MW.A0J(view2, 2131429789);
        if (bundle2 != null) {
            AnonymousClass1KJ r12 = AnonymousClass1KL.A0B;
            C170318pf r1 = (C170318pf) bundle2.getParcelable("extra_country_transaction_data");
            AnonymousClass1KN r13 = (AnonymousClass1KN) bundle2.getParcelable("extra_transaction_send_amount");
            C20284AEs aEs = (C20284AEs) bundle2.getParcelable("extra_payment_method");
            C1418477e r3 = (C1418477e) bundle2.getParcelable("extra_interop_description");
            String string = bundle2.getString("extra_encrypted_interop_description");
            this.A0K = (C1418477e) bundle2.getParcelable("extra_payee_name");
            this.A0L = (C1418477e) bundle2.getParcelable("extra_receiver_vpa");
            this.A0J = AnonymousClass3MX.A0l(bundle2.getString("extra_jid"));
            C1418477e r10 = (C1418477e) bundle2.getParcelable("extra_payment_upi_number");
            String string2 = bundle2.getString("extra_merchant_code");
            String string3 = bundle2.getString("extra_transaction_ref");
            String string4 = bundle2.getString("extra_transaction_ref_url");
            String string5 = bundle2.getString("extra_purpose_code");
            String string6 = bundle2.getString("extra_initiation_mode");
            this.A0H = bundle2.getString("extra_transaction_id");
            String string7 = bundle2.getString("extra_transaction_type");
            this.A0N = AnonymousClass8BR.A0y(bundle2);
            if (aEs != null) {
                C170278pb r52 = aEs.A08;
                C17960vV.A07(r52);
                r5 = (AnonymousClass8pS) r52;
            } else {
                r5 = null;
            }
            AFP.A00(this.A0G, this, 22);
            AFP.A00(this.A0F, this, 23);
            AFP.A00(AnonymousClass8BS.A06(view2), this, 24);
            if (r13 != null && r5 != null && aEs != null) {
                A0J2.setText(r12.BLc(this.A07, r13));
                this.A02.setAnimation("transaction_confirmation_lottie_animation.json");
                boolean z = bundle2.getBoolean("is_interop", true);
                this.A0O = z;
                if (z) {
                    IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = this.A0M;
                    C1418477e r15 = r5.A05;
                    String str = aEs.A0A;
                    String A0j = AnonymousClass8BS.A0j(r12);
                    C1418477e r53 = this.A0K;
                    boolean equals = "p2m".equals(string7);
                    String str2 = this.A0H;
                    C1418477e r0 = this.A0L;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A08 = r1;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A03 = r13;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A05 = r3;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A06 = r53;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A07 = r0;
                    HashMap hashMap = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0E.A06;
                    if (hashMap != null) {
                        C170318pf r18 = r1;
                        C1418477e r17 = r10;
                        C1418477e r16 = r53;
                        indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0G.A00(r13, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A04, r15, r16, r17, r18, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0F, new AYR(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel, 1), str, A0j, string3, string2, string4, string5, string6, str2, string, (String) null, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0A.A01(), hashMap, equals);
                        return;
                    }
                    return;
                }
                C21447AkE.A01(this.A0E, this, 44);
            }
        }
    }

    public void A1K() {
        super.A1K();
        this.A0C = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel.class);
        this.A0M = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
        C20337AGt.A01(A1G(), indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0H.A00, this, 21);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625667);
    }
}
