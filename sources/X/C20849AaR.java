package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import java.util.HashMap;

/* renamed from: X.AaR  reason: case insensitive filesystem */
public final /* synthetic */ class C20849AaR implements B98 {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ AnonymousClass1BI A01;
    public final /* synthetic */ BrazilOrderDetailsActivity A02;
    public final /* synthetic */ ADQ A03;
    public final /* synthetic */ C191559mn A04;
    public final /* synthetic */ C191559mn A05;
    public final /* synthetic */ AnonymousClass21K A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;

    public final void BAD(String str) {
        C20251ADj aDj;
        String str2;
        Object obj;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A02;
        ARR arr = this.A00;
        AnonymousClass21K r1 = this.A06;
        ADQ adq = this.A03;
        C191559mn r6 = this.A04;
        AnonymousClass1BI r9 = this.A01;
        String str3 = this.A07;
        C191559mn r5 = this.A05;
        HashMap hashMap = this.A08;
        String str4 = str;
        switch (str4.hashCode()) {
            case -2032781930:
                if (str4.equals("WhatsappPay")) {
                    BrazilOrderDetailsActivity.A0c(arr, brazilOrderDetailsActivity, adq, r1, "payment_options_prompt");
                    return;
                }
                break;
            case -1890748409:
                if (str4.equals("checkout_lite")) {
                    brazilOrderDetailsActivity.A4v(hashMap);
                    BrazilOrderDetailsActivity.A0r(brazilOrderDetailsActivity, r1, 5);
                    return;
                }
                break;
            case -1383481471:
                if (str4.equals("boleto")) {
                    C17960vV.A07(r9);
                    brazilOrderDetailsActivity.A4t(r9, hashMap);
                    BrazilOrderDetailsActivity.A0r(brazilOrderDetailsActivity, r1, 8);
                    return;
                }
                break;
            case -611537030:
                if (str4.equals("CustomPaymentInstructions")) {
                    for (AEZ aez : r6.A05) {
                        if (aez.A0A.equals(str4)) {
                            C17960vV.A07(r9);
                            BrazilOrderDetailsActivity.A0q(r9, brazilOrderDetailsActivity, aez.A06, "payment_options_prompt", str3, BrazilOrderDetailsActivity.A0t(r1));
                        }
                    }
                    return;
                }
                break;
            case 103528:
                if (str4.equals("hpp")) {
                    C17960vV.A07(r9);
                    C198179xu r0 = brazilOrderDetailsActivity.A0H;
                    if (r0 == null || (obj = r0.A01) == null) {
                        str2 = null;
                    } else {
                        str2 = ((A2J) obj).A07;
                    }
                    C17960vV.A07(str3);
                    BrazilOrderDetailsActivity.A0V(arr, r9, brazilOrderDetailsActivity, str2, str3);
                    return;
                }
                break;
            case 111007:
                if (str4.equals("pix")) {
                    if (r5 != null && (aDj = r5.A03) != null) {
                        String str5 = aDj.A01;
                        if ("pix_static_code".equals(str5) || "pix_dynamic_code".equals(str5)) {
                            BDZ bdz = aDj.A00;
                            if (bdz instanceof C20934Abo) {
                                C17960vV.A07(r9);
                                C17960vV.A07(str3);
                                C17960vV.A07(arr);
                                BrazilOrderDetailsActivity.A0Q(arr, r9, brazilOrderDetailsActivity, (C20934Abo) bdz, str3, "payment_options_prompt", BrazilOrderDetailsActivity.A0t(r1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        AnonymousClass8BS.A1F("BrazilOrderDetailsActivity", "Bottom sheet click callback - This payment method is not supported");
    }

    public /* synthetic */ C20849AaR(ARR arr, AnonymousClass1BI r2, BrazilOrderDetailsActivity brazilOrderDetailsActivity, ADQ adq, C191559mn r5, C191559mn r6, AnonymousClass21K r7, String str, HashMap hashMap) {
        this.A02 = brazilOrderDetailsActivity;
        this.A00 = arr;
        this.A06 = r7;
        this.A03 = adq;
        this.A04 = r5;
        this.A01 = r2;
        this.A07 = str;
        this.A05 = r6;
        this.A08 = hashMap;
    }
}
