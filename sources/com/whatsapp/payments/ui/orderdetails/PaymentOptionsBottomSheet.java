package com.whatsapp.payments.ui.orderdetails;

import X.A2H;
import X.AEZ;
import X.AFR;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.B98;
import X.BD4;
import X.C108945cZ;
import X.C139436yq;
import X.C161698Hj;
import X.C17880vN;
import X.C18030ve;
import X.C183389Yb;
import X.C184949bm;
import X.C187439fo;
import X.C20087A6p;
import X.C20112A7u;
import X.C20157A9t;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PaymentOptionsBottomSheet extends Hilt_PaymentOptionsBottomSheet {
    public A2H A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public C20157A9t A03 = new Object();
    public BD4 A04;
    public B98 A05;
    public String A06;
    public RecyclerView A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public void A2I(C139436yq r2) {
        r2.A01(false);
    }

    public static void A01(PaymentOptionsBottomSheet paymentOptionsBottomSheet, Integer num, String str, int i) {
        String str2;
        if (paymentOptionsBottomSheet.A0A) {
            C20112A7u A022 = C20112A7u.A02();
            A022.A07("transaction_type", "purchase");
            if ("WhatsappPay".equals(str)) {
                str2 = "native";
            } else if ("CustomPaymentInstructions".equals(str)) {
                str2 = "cpi";
            } else {
                if ("pix".equals(str)) {
                    A022.A07("payment_type", "pix");
                }
                C20087A6p.A02(A022, paymentOptionsBottomSheet.A04, num, "payment_options_prompt", paymentOptionsBottomSheet.A08, i);
            }
            A022.A07("payment_type", str2);
            C20087A6p.A02(A022, paymentOptionsBottomSheet.A04, num, "payment_options_prompt", paymentOptionsBottomSheet.A08, i);
        }
    }

    public void A21(Bundle bundle, View view) {
        C187439fo r14;
        Bundle bundle2 = bundle;
        View view2 = view;
        super.A21(bundle2, view2);
        if (bundle == null) {
            this.A06 = A15().getString("selected_payment_method", "WhatsappPay");
            this.A09 = A15().getParcelableArrayList("payment_method_list");
            this.A08 = A15().getString("referral_screen");
            bundle2 = A15();
        } else {
            this.A06 = bundle2.getString("selected_payment_method", "WhatsappPay");
            this.A09 = bundle2.getParcelableArrayList("payment_method_list");
            this.A08 = bundle2.getString("referral_screen");
        }
        this.A0A = bundle2.getBoolean("should_log_event");
        AFR.A00(AnonymousClass8BS.A06(view2), this, 6);
        C161698Hj r4 = new C161698Hj(this.A01, this.A02);
        String str = this.A06;
        List<AEZ> list = this.A09;
        C183389Yb r0 = new C183389Yb(this);
        A2H a2h = this.A00;
        r4.A00 = str;
        List list2 = r4.A03;
        list2.clear();
        C184949bm r12 = new C184949bm(r0, r4);
        for (AEZ aez : list) {
            String str2 = aez.A0A;
            if ("WhatsappPay".equals(str2)) {
                r14 = new C187439fo((A2H) null, aez, r12, 0, "WhatsappPay".equals(str));
            } else {
                r14 = new C187439fo(a2h, aez, r12, 1, str.equals(str2));
            }
            list2.add(r14);
        }
        RecyclerView A0U = C108945cZ.A0U(view2, 2131433613);
        this.A07 = A0U;
        A0U.setAdapter(r4);
        AFR.A00(AnonymousClass1HF.A06(view2, 2131429535), this, 7);
        A01(this, (Integer) null, this.A06, 0);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C20157A9t a9t = this.A03;
        if (a9t != null) {
            a9t.onDismiss(dialogInterface);
        }
    }

    public static PaymentOptionsBottomSheet A00(String str, String str2, List list, boolean z) {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("selected_payment_method", str);
        A0D.putParcelableArrayList("payment_method_list", C17880vN.A10(list));
        A0D.putString("referral_screen", str2);
        A0D.putBoolean("should_log_event", z);
        PaymentOptionsBottomSheet paymentOptionsBottomSheet = new PaymentOptionsBottomSheet();
        paymentOptionsBottomSheet.A1R(A0D);
        return paymentOptionsBottomSheet;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626340);
    }

    public void A1s() {
        super.A1s();
        this.A05 = null;
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putString("selected_payment_method", this.A06);
        bundle.putParcelableArrayList("payment_method_list", C17880vN.A10(this.A09));
        bundle.putString("referral_screen", this.A08);
        bundle.putBoolean("should_log_event", this.A0A);
    }
}
