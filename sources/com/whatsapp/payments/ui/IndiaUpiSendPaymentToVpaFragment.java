package com.whatsapp.payments.ui;

import X.A12;
import X.A7U;
import X.AEC;
import X.AFQ;
import X.AOI;
import X.AX3;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1L4;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QR;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass8Gf;
import X.AnonymousClass90Z;
import X.AnonymousClass9AL;
import X.AnonymousClass9B1;
import X.C108985cd;
import X.C1418477e;
import X.C161578Ga;
import X.C175788zH;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C191759n8;
import X.C196199uc;
import X.C197269wQ;
import X.C19740yt;
import X.C197929xV;
import X.C19967A1c;
import X.C20008A2y;
import X.C20061A5k;
import X.C20337AGt;
import X.C20752AXh;
import X.C30931ek;
import X.C31061ex;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.LinkedHashSet;

public class IndiaUpiSendPaymentToVpaFragment extends Hilt_IndiaUpiSendPaymentToVpaFragment {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public AnonymousClass1KB A03;
    public C18000vb A04;
    public AnonymousClass1QR A05;
    public AnonymousClass1KI A06;
    public C18030ve A07;
    public A12 A08;
    public C196199uc A09;
    public C20752AXh A0A;
    public A7U A0B;
    public AXS A0C;
    public C31061ex A0D;
    public C175788zH A0E;
    public AZ6 A0F;
    public C191759n8 A0G;
    public C20008A2y A0H;
    public AnonymousClass90Z A0I;
    public C30931ek A0J;
    public AnonymousClass1L4 A0K;
    public AnonymousClass10I A0L;
    public WDSButton A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public boolean A0Q;
    public C1418477e A0R;
    public C161578Ga A0S;
    public WDSButton A0T;
    public final AnonymousClass1QE A0U = AnonymousClass1QE.A00("IndiaUpiSendPaymentToVpaDialogFragment", "payment", "IN");

    public static void A00(UserJid userJid, C1418477e r9, IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        C191759n8 r1 = indiaUpiSendPaymentToVpaFragment.A0G;
        if (r1 != null) {
            PaymentBottomSheet paymentBottomSheet = r1.A01;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A28();
            }
            r1.A06.A00(r1.A02, new AOI(r1, r9, 2), userJid, r9, false, false);
        }
    }

    public static void A02(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        int i;
        int length;
        String lowerCase = C108985cd.A0h(indiaUpiSendPaymentToVpaFragment.A00).toLowerCase(indiaUpiSendPaymentToVpaFragment.A04.A0N());
        if (!AnonymousClass8BU.A1V(lowerCase, C197269wQ.A00)) {
            if (C197929xV.A00(lowerCase)) {
                indiaUpiSendPaymentToVpaFragment.A0R = AnonymousClass8BX.A0K(lowerCase, "upiAlias");
                String A002 = AXS.A00(indiaUpiSendPaymentToVpaFragment.A0C);
                if (!C20061A5k.A02(indiaUpiSendPaymentToVpaFragment.A0R) && ((String) C20061A5k.A01(indiaUpiSendPaymentToVpaFragment.A0R)).equalsIgnoreCase(A002)) {
                    i = 2131893721;
                } else if (indiaUpiSendPaymentToVpaFragment.A09.A04(indiaUpiSendPaymentToVpaFragment.A0R)) {
                    A00((UserJid) null, indiaUpiSendPaymentToVpaFragment.A0R, indiaUpiSendPaymentToVpaFragment);
                    return;
                } else {
                    indiaUpiSendPaymentToVpaFragment.A0S.A0T(indiaUpiSendPaymentToVpaFragment.A0R, (C1418477e) null);
                }
            } else {
                i = 2131893644;
            }
            A03(indiaUpiSendPaymentToVpaFragment, new C19967A1c(i));
            return;
        } else if (TextUtils.isEmpty(lowerCase) || (length = lowerCase.length()) < 8 || length > 10) {
            i = 2131893641;
            A03(indiaUpiSendPaymentToVpaFragment, new C19967A1c(i));
            return;
        } else {
            C20008A2y a2y = indiaUpiSendPaymentToVpaFragment.A0H;
            LinkedHashSet A14 = C17880vN.A14();
            for (AEC aec : a2y.A00) {
                Object obj = aec.A00.A00;
                C17960vV.A07(obj);
                A14.add(obj);
            }
            if (A14.contains(lowerCase)) {
                i = 2131893720;
                A03(indiaUpiSendPaymentToVpaFragment, new C19967A1c(i));
                return;
            }
            indiaUpiSendPaymentToVpaFragment.A0S.A0T((C1418477e) null, AnonymousClass8BX.A0K(lowerCase, "upiAlias"));
        }
        indiaUpiSendPaymentToVpaFragment.A0F.BiL(C17880vN.A0l(), "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P, 1);
    }

    public static void A03(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment, C19967A1c a1c) {
        AnonymousClass1QE r2 = indiaUpiSendPaymentToVpaFragment.A0U;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("showErrorText: ");
        AnonymousClass8BV.A1F(r2, A10, a1c.A00);
        indiaUpiSendPaymentToVpaFragment.A02.setVisibility(0);
        indiaUpiSendPaymentToVpaFragment.A02.setText(a1c.A00(indiaUpiSendPaymentToVpaFragment.A14()));
        AnonymousClass1FL A1B = indiaUpiSendPaymentToVpaFragment.A1B();
        if (A1B != null) {
            AnonymousClass1HF.A0L(C19740yt.A03(A1B, AnonymousClass1YL.A00(A1B, 2130970925, 2131102369)), indiaUpiSendPaymentToVpaFragment.A00);
        }
        indiaUpiSendPaymentToVpaFragment.A0F.BiL(AnonymousClass8BS.A0V(), "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P, 0);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A08.A01(new AX3(this, 4));
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625622);
    }

    public static void A01(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        int i;
        C1418477e A0L2 = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), C108985cd.A0h(indiaUpiSendPaymentToVpaFragment.A00).toLowerCase(indiaUpiSendPaymentToVpaFragment.A04.A0N()));
        indiaUpiSendPaymentToVpaFragment.A0R = A0L2;
        if (!C197929xV.A00((String) A0L2.A00)) {
            i = 2131893643;
        } else {
            String A002 = AXS.A00(indiaUpiSendPaymentToVpaFragment.A0C);
            if (!C20061A5k.A02(indiaUpiSendPaymentToVpaFragment.A0R) && ((String) C20061A5k.A01(indiaUpiSendPaymentToVpaFragment.A0R)).equalsIgnoreCase(A002)) {
                i = 2131893721;
            } else if (indiaUpiSendPaymentToVpaFragment.A09.A04(indiaUpiSendPaymentToVpaFragment.A0R)) {
                A00((UserJid) null, indiaUpiSendPaymentToVpaFragment.A0R, indiaUpiSendPaymentToVpaFragment);
                return;
            } else {
                indiaUpiSendPaymentToVpaFragment.A0S.A0T(indiaUpiSendPaymentToVpaFragment.A0R, (C1418477e) null);
                indiaUpiSendPaymentToVpaFragment.A0F.BiL(C17880vN.A0l(), "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P, 1);
                return;
            }
        }
        A03(indiaUpiSendPaymentToVpaFragment, new C19967A1c(i));
    }

    public void A1s() {
        super.A1s();
        this.A0E = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0T = null;
        this.A0M = null;
    }

    public void A1u() {
        super.A1u();
        if (this.A08.A02()) {
            A12.A00(A1B());
        }
    }

    public void A21(Bundle bundle, View view) {
        EditText editText;
        int i;
        Context A1n = A1n();
        AnonymousClass1KB r2 = this.A03;
        AnonymousClass1OZ A0U2 = C17880vN.A0U(this.A0N);
        C30931ek r10 = this.A0J;
        this.A0E = new C175788zH(A1n, r2, this.A06, A0U2, this.A09, this.A0B, AnonymousClass8BR.A0a(this.A0O), this.A0D, this.A0I, r10);
        C161578Ga r4 = (C161578Ga) AnonymousClass8BR.A0C(new AnonymousClass8Gf(this, 1), this).A00(C161578Ga.class);
        this.A0S = r4;
        int A002 = C18020vd.A00(C18040vf.A02, r4.A04, 2492);
        C17890vO.A0u(new AnonymousClass9B1(r4.A03, r4, A002), r4.A05);
        this.A00 = (EditText) AnonymousClass1HF.A06(view, 2131427420);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(view, 2131434180);
        this.A02 = AnonymousClass3MW.A0J(view, 2131430532);
        this.A0T = AnonymousClass3MW.A0q(view, 2131429140);
        this.A0M = AnonymousClass3MW.A0q(view, 2131434062);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131436243);
        this.A0M.setEnabled(false);
        boolean A003 = C197269wQ.A00(this.A07, this.A0C.A0G());
        this.A0Q = A003;
        if (A003) {
            A0J2.setText(2131897456);
            editText = this.A00;
            i = 2131897455;
        } else {
            A0J2.setText(2131897457);
            editText = this.A00;
            i = 2131897454;
        }
        editText.setHint(i);
        AnonymousClass9AL.A00(this.A00, this, 6);
        AFQ.A00(this.A0T, this, 3);
        AFQ.A00(this.A0M, this, 4);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            C1418477e r22 = (C1418477e) bundle2.getParcelable("extra_payment_handle");
            if (!C20061A5k.A02(r22)) {
                EditText editText2 = this.A00;
                Object obj = r22.A00;
                C17960vV.A07(obj);
                AnonymousClass8BR.A1E(editText2, obj);
                if (this.A0Q) {
                    A02(this);
                } else {
                    A01(this);
                }
            }
            this.A0P = bundle2.getString("extra_referral_screen");
        }
        this.A0F.BiL((Integer) null, "enter_user_payment_id", this.A0P, 0);
        C20337AGt.A01(A1G(), this.A0S.A00, this, 36);
        C20337AGt.A01(A1G(), this.A0S.A02, this, 37);
        C20337AGt.A01(A1G(), this.A0S.A01, this, 38);
    }
}
