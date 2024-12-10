package com.whatsapp.payments.ui;

import X.A2J;
import X.A6X;
import X.AFT;
import X.ARR;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21K;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BS;
import X.AnonymousClass8Gd;
import X.B12;
import X.B3X;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C198179xu;
import X.C20157A9t;
import X.C20279AEn;
import X.C20285AEt;
import X.C20339AGv;
import X.C21422Ajp;
import X.C22228Azi;
import X.C22931Dv;
import X.C24141Ja;
import X.C36401np;
import X.C72473Md;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class BrazilHostedPaymentPageBottomSheet extends Hilt_BrazilHostedPaymentPageBottomSheet {
    public AnonymousClass1KB A00;
    public AnonymousClass11C A01;
    public ARR A02;
    public C18030ve A03;
    public AnonymousClass1BI A04;
    public C20157A9t A05 = new Object();
    public AnonymousClass8Gd A06;
    public BrazilHostedPaymentPageViewModel A07;
    public A6X A08;
    public C36401np A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public void A21(Bundle bundle, View view) {
        String str;
        AnonymousClass21K r1;
        int i;
        A2J a2j;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        AnonymousClass3Ma.A19(AnonymousClass8BS.A06(view2), this, 42);
        AnonymousClass3MY.A0y(A14(), AnonymousClass3MW.A0J(view2, 2131428399), new Object[]{this.A0E}, 2131887361);
        AnonymousClass3MY.A0y(A14(), AnonymousClass3MW.A0J(view2, 2131433672), new Object[]{this.A0E}, 2131887362);
        AnonymousClass3MW.A0J(view2, 2131436317).setText(this.A0F);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view2, 2131428404);
        C36401np r7 = this.A09;
        if (r7 != null) {
            Runnable[] runnableArr = new Runnable[3];
            C21422Ajp.A00(runnableArr, 22, 0);
            C21422Ajp.A00(runnableArr, 23, 1);
            C21422Ajp.A00(runnableArr, 24, 2);
            A0V.setText(r7.A04(A0V.getContext(), C17880vN.A0q(A14(), this.A0E, new Object[1], 0, 2131887360), runnableArr, new String[]{"wa-tos", "wa-privacy-policy", "fb-tos"}, new String[]{"https://www.whatsapp.com/legal/merchant-terms/", "https://www.whatsapp.com/legal/payments/privacy-policy", "https://transparency.fb.com/es-la/policies/other-policies/terms-of-service"}));
            C72473Md.A1C(A0V);
            AnonymousClass3Ma.A1L(A0V.getAbProps(), A0V);
            if ("Cielo".equals(this.A0E)) {
                AnonymousClass3MW.A0G(view2, 2131428400).setImageResource(2131231128);
                AnonymousClass1HF.A06(view2, 2131428401).setBackground((Drawable) null);
            }
            WDSButton wDSButton = (WDSButton) C18070vi.A05(view2, 2131428403);
            AFT.A00(wDSButton, this, new B3X(this), 1);
            BrazilHostedPaymentPageViewModel brazilHostedPaymentPageViewModel = this.A07;
            if (brazilHostedPaymentPageViewModel != null) {
                C20339AGv.A00(A1G(), brazilHostedPaymentPageViewModel.A00, new B12(this, wDSButton), 33);
                BrazilHostedPaymentPageViewModel brazilHostedPaymentPageViewModel2 = this.A07;
                if (brazilHostedPaymentPageViewModel2 != null) {
                    C20339AGv.A00(A1G(), brazilHostedPaymentPageViewModel2.A01, new C22228Azi(this), 33);
                    AnonymousClass8Gd r3 = this.A06;
                    if (r3 != null) {
                        A6X a6x = this.A08;
                        if (a6x != null) {
                            AnonymousClass1BI r6 = this.A04;
                            if (C18020vd.A05(C18040vf.A02, r3.A06, 8038)) {
                                C198179xu r0 = (C198179xu) r3.A03.A06();
                                C20279AEn aEn = null;
                                if (r0 == null || (a2j = (A2J) r0.A01) == null) {
                                    r1 = null;
                                    i = -1;
                                } else {
                                    r1 = a2j.A05;
                                    if (r1 != null) {
                                        i = ((AnonymousClass206) r1).A0u;
                                        C20285AEt BPK = r1.BPK();
                                        if (BPK != null) {
                                            aEn = BPK.A02;
                                        }
                                    }
                                    i = -1;
                                }
                                if (r6 != null && aEn != null) {
                                    String str2 = aEn.A05;
                                    if (str2 == null || str2.length() == 0) {
                                        aEn.A05 = C17890vO.A0Q();
                                        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.FMessage");
                                        AnonymousClass205 r02 = ((AnonymousClass206) r1).A0v;
                                        C18070vi.A0X(r02);
                                        r3.CQb(aEn, r02, r1);
                                    }
                                    a6x.A03(r6, r1.BPK(), (Integer) null, aEn.A05, "hpp", (List) null, 4, i, 1, false, true, true, false);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        str = "orderDetailsMessageLogging";
                    } else {
                        return;
                    }
                }
            }
            C18070vi.A11("brazilHostedPaymentPageViewModel");
            throw null;
        }
        str = "linkifier";
        C18070vi.A11(str);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        this.A05.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public final AnonymousClass1KB A2K() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A07 = (BrazilHostedPaymentPageViewModel) AnonymousClass3MW.A0N(this).A00(BrazilHostedPaymentPageViewModel.class);
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof BrazilOrderDetailsActivity) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilOrderDetailsActivity");
            this.A06 = (AnonymousClass8Gd) AnonymousClass3MW.A0N(A1B).A00(AnonymousClass8Gd.class);
        }
        Bundle A15 = A15();
        this.A0E = A15.getString("psp_name");
        this.A0F = A15.getString("total_amount");
        C22931Dv r0 = AnonymousClass1BI.A00;
        this.A04 = C22931Dv.A01(A15.getString("merchant_jid"));
        this.A02 = (ARR) C24141Ja.A00(A15, ARR.class, "payment_money");
        this.A0C = A15.getString("order_id");
        this.A0B = A15.getString("message_id");
        this.A0D = A15.getString("payment_config");
        this.A0A = A15.getString("max_installment_count");
    }

    public int A2F() {
        return 2131626364;
    }
}
