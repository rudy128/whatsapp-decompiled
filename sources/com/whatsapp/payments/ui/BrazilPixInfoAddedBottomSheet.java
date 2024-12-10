package com.whatsapp.payments.ui;

import X.AFO;
import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1FD;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BX;
import X.C171858sO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C20031A4a;
import X.C20112A7u;
import X.C21960AvO;
import X.C21961AvP;
import X.C21962AvQ;
import X.C21963AvR;
import X.C21964AvS;
import X.C63572tK;
import X.C72463Mc;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.util.Log;

public final class BrazilPixInfoAddedBottomSheet extends Hilt_BrazilPixInfoAddedBottomSheet {
    public int A00 = -1;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public String A07;
    public BrazilAddPixKeyViewModel A08;
    public String A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new C21960AvO(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C21961AvP(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C21962AvQ(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C21963AvR(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C21964AvS(this));

    public void A21(Bundle bundle, View view) {
        TextView A0J;
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("payment_account_type", -1);
            String A0y = AnonymousClass8BR.A0y(bundle2);
            String str = "";
            if (A0y == null) {
                A0y = str;
            }
            this.A07 = A0y;
            String string = bundle2.getString("campaign_id");
            if (string != null) {
                str = string;
            }
            this.A09 = str;
        }
        AnonymousClass3MW.A0J(view, 2131436208).setText(2131894606);
        AnonymousClass3MW.A0J(view, 2131431714).setText(2131894605);
        if (C18070vi.A18(this.A07, "biz_profile") || C18070vi.A18(this.A07, "quick_reply")) {
            C72463Mc.A13(view, 2131433187);
            A0J = AnonymousClass3MW.A0J(view, 2131435158);
            A0J.setText(2131898925);
            i = 2;
        } else {
            AFO.A00(AnonymousClass1HF.A06(view, 2131433187), this, 3);
            A0J = AnonymousClass3MW.A0J(view, 2131435158);
            A0J.setText(2131894603);
            i = 4;
        }
        AFO.A00(A0J, this, i);
        A00(this, (Integer) null, 0, this.A00);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A08;
        if (brazilAddPixKeyViewModel == null) {
            C18070vi.A11("brazilAddPixKeyViewModel");
            throw null;
        }
        brazilAddPixKeyViewModel.A00.A0E("dismissed");
        super.onDismiss(dialogInterface);
    }

    public static final void A00(BrazilPixInfoAddedBottomSheet brazilPixInfoAddedBottomSheet, Integer num, int i, int i2) {
        if (C18020vd.A05(C18040vf.A02, (C18020vd) brazilPixInfoAddedBottomSheet.A0A.getValue(), 7544)) {
            C20112A7u A022 = C20112A7u.A02();
            if (i2 == 6) {
                A022.A07("payment_method", "pix");
                String str = brazilPixInfoAddedBottomSheet.A09;
                if (!(str == null || str.length() == 0)) {
                    A022.A07("campaign_id", str);
                }
            } else {
                Log.e("Unsupported action");
            }
            C171858sO r1 = new C171858sO();
            C20031A4a.A00(r1, (C20031A4a) brazilPixInfoAddedBottomSheet.A0C.getValue());
            C63572tK r0 = C63572tK.A0E;
            r1.A0R = "BR";
            AnonymousClass8BR.A1H(r1, A022);
            AnonymousClass8BX.A19(r1, num, "payment_method_added_prompt", i);
            String str2 = brazilPixInfoAddedBottomSheet.A07;
            if (str2 != null) {
                r1.A0a = str2;
            }
            r1.A0Y = "add_non_native_p2m_payment_method";
            ((AnonymousClass18K) brazilPixInfoAddedBottomSheet.A0E.getValue()).CC7(r1);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        AnonymousClass1FD r0 = this;
        if (A1B instanceof BrazilPaymentPixOnboardingActivity) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity");
            r0 = (BrazilPaymentPixOnboardingActivity) A1B;
        }
        this.A08 = AnonymousClass8BX.A0L(r0);
    }

    public int A2F() {
        return 2131626389;
    }
}
