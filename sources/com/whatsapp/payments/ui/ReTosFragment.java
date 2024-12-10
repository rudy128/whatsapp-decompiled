package com.whatsapp.payments.ui;

import X.AFQ;
import X.AXN;
import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1QE;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C175448yj;
import X.C17880vN;
import X.C18030ve;
import X.C20110A7s;
import X.C21422Ajp;
import X.C29621ca;
import X.C31061ex;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

public abstract class ReTosFragment extends Hilt_ReTosFragment {
    public Button A00;
    public ProgressBar A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public C31061ex A04;
    public C20110A7s A05;
    public final AnonymousClass1QE A06 = AnonymousClass1QE.A00("ReTosFragment", "onboarding", "COMMON");

    public void A2M() {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("is_consumer", true);
        A0D.putBoolean("is_merchant", false);
        A1R(A0D);
    }

    public /* synthetic */ void A2N() {
        A2D(false);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        C31061ex r5 = this.A04;
        boolean z = A15().getBoolean("is_consumer");
        boolean z2 = A15().getBoolean("is_merchant");
        AXN axn = new AXN(this, 6);
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass8BT.A1T("version", A13, 2);
        if (z) {
            AnonymousClass8BT.A1T("consumer", A13, 1);
        }
        if (z2) {
            AnonymousClass8BT.A1T("merchant", A13, 1);
        }
        C29621ca A0k = AnonymousClass8BR.A0k("accept_pay", AnonymousClass8BT.A1b(A13, 0));
        r5.A0J(new C175448yj(r5.A02.A00, axn, AnonymousClass8BR.A0a(r5.A0I), r5, r5.A00, z, z2), A0k, "set", "urn:xmpp:whatsapp:account", 0);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SpannableString A042;
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626744);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(A09, 2131434671);
        AnonymousClass3Ma.A1K(A0V, this.A02);
        AnonymousClass3Ma.A1L(this.A03, A0V);
        Context context = A0V.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        if (brazilReTosFragment.A15().getBoolean("is_merchant")) {
            C36401np r13 = brazilReTosFragment.A01;
            String A1H = brazilReTosFragment.A1H(2131887385);
            String[] strArr = new String[3];
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/merchant-terms/", strArr, 0);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.facebook.com/legal/commerce_product_merchant_agreement", strArr, 1);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.cielo.com.br/contrato-de-credenciamento-consolidado/", strArr, 2);
            Runnable[] runnableArr = new Runnable[3];
            C21422Ajp.A00(runnableArr, 34, 0);
            C21422Ajp.A00(runnableArr, 35, 1);
            C21422Ajp.A00(runnableArr, 36, 2);
            A042 = r13.A04(context, A1H, runnableArr, new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, strArr);
        } else {
            String[] strArr2 = new String[5];
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments", strArr2, 0);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy", strArr2, 1);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.facebook.com/payments_terms", strArr2, 2);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.facebook.com/policy.php", strArr2, 3);
            AnonymousClass8BW.A17(brazilReTosFragment.A00, "https://www.cielo.com.br/termos-fb-pay", strArr2, 4);
            Runnable[] runnableArr2 = new Runnable[5];
            C21422Ajp.A00(runnableArr2, 29, 0);
            C21422Ajp.A00(runnableArr2, 30, 1);
            C21422Ajp.A00(runnableArr2, 31, 2);
            C21422Ajp.A00(runnableArr2, 32, 3);
            C21422Ajp.A00(runnableArr2, 33, 4);
            A042 = brazilReTosFragment.A01.A04(context, brazilReTosFragment.A1H(2131887386), runnableArr2, new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, strArr2);
        }
        A0V.setText(A042);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(A09, 2131434181);
        Button button = (Button) AnonymousClass1HF.A06(A09, 2131434670);
        this.A00 = button;
        AFQ.A00(button, this, 30);
        return A09;
    }
}
