package com.whatsapp.payments.ui;

import X.A8e;
import X.ADQ;
import X.AFT;
import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8pI;
import X.AnonymousClass8pQ;
import X.AnonymousClass8pY;
import X.AnonymousClass93W;
import X.BDE;
import X.C108945cZ;
import X.C108955ca;
import X.C170278pb;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C20284AEs;
import X.C22466B8y;
import X.C22564BCz;
import X.C22941Dw;
import X.C24751Ln;
import X.C28931bI;
import X.C62862s7;
import X.C72453Mb;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public class ConfirmPaymentFragment extends Hilt_ConfirmPaymentFragment implements C22466B8y {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public C18000vb A09;
    public C24751Ln A0A;
    public AnonymousClass8pI A0B;
    public C20284AEs A0C;
    public C18030ve A0D;
    public AnonymousClass1QO A0E;
    public AnonymousClass1QS A0F;
    public BDE A0G;
    public C22564BCz A0H;
    public AnonymousClass93W A0I;
    public ADQ A0J;
    public PaymentMethodRow A0K;
    public C28931bI A0L;
    public WDSButton A0M;
    public AnonymousClass00H A0N;
    public Integer A0O;
    public String A0P;
    public String A0Q;
    public List A0R;
    public View A0S;
    public ViewGroup A0T;
    public TextView A0U;
    public WaImageView A0V;
    public WaTextView A0W;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.payments.ui.ConfirmPaymentFragment, com.whatsapp.payments.ui.Hilt_ConfirmPaymentFragment, androidx.fragment.app.Fragment] */
    public static ConfirmPaymentFragment A00(C20284AEs aEs, UserJid userJid, ADQ adq, String str, String str2, int i) {
        ? hilt_ConfirmPaymentFragment = new Hilt_ConfirmPaymentFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelable("arg_payment_method", aEs);
        if (userJid != null) {
            AnonymousClass3MY.A15(A0D2, userJid, "arg_jid");
        }
        A0D2.putInt("arg_payment_type", i);
        A0D2.putString("arg_transaction_type", str);
        A0D2.putParcelable("arg_order_payment_installment_content", adq);
        A0D2.putString("arg_merchant_code", str2);
        hilt_ConfirmPaymentFragment.A1R(A0D2);
        return hilt_ConfirmPaymentFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C20284AEs r6, com.whatsapp.payments.ui.ConfirmPaymentFragment r7, X.ADQ r8, java.lang.Integer r9) {
        /*
            android.view.ViewGroup r0 = r7.A0T
            r1 = 8
            r0.setVisibility(r1)
            X.1bI r0 = r7.A0L
            r0.A04(r1)
            X.BDE r1 = r7.A0G
            if (r1 == 0) goto L_0x011b
            int r0 = r7.A01
            java.lang.String r2 = r1.BPC(r6, r0)
            X.BDE r0 = r7.A0G
            int r1 = r0.BPB(r6)
            if (r1 == 0) goto L_0x0023
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0M
            r0.setIcon((int) r1)
        L_0x0023:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0M
            r0.setText(r2)
            if (r8 == 0) goto L_0x0113
            if (r9 == 0) goto L_0x0113
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0113
            int r1 = r6.A05()
            r0 = 4
            if (r1 == r0) goto L_0x003e
            r0 = 6
            if (r1 != r0) goto L_0x0113
            int r0 = r7.A00
            if (r0 != 0) goto L_0x0113
        L_0x003e:
            boolean r0 = r6 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x0113
            X.0ve r2 = r7.A0D
            r1 = 4443(0x115b, float:6.226E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0113
            X.8pK r6 = (X.AnonymousClass8pK) r6
            int r0 = r6.A01
            java.lang.String r3 = X.C20085A6m.A03(r0)
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x0118
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0118
            java.util.Iterator r2 = r1.iterator()
        L_0x0064:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = r2.next()
            X.ADx r1 = (X.C20265ADx) r1
            java.lang.String r0 = r1.A00
            java.lang.String r0 = X.C108975cc.A0d(r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0064
            java.util.List r6 = r1.A01
        L_0x007e:
            r7.A0R = r6
            if (r6 == 0) goto L_0x0113
            int r5 = r9.intValue()
            X.0vb r4 = r7.A09
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            int r2 = r6.size()
            r1 = 0
        L_0x0091:
            r3 = 0
            if (r1 >= r2) goto L_0x00af
            if (r1 != r5) goto L_0x0114
            java.lang.Object r0 = r6.get(r1)
            X.ADw r0 = (X.C20264ADw) r0
            X.ARR r0 = r0.A01
            if (r0 == 0) goto L_0x0114
            X.1KN r0 = r0.A02
            if (r0 == 0) goto L_0x0114
            java.math.BigDecimal r1 = r0.A00
            X.1KJ r0 = X.AnonymousClass1KL.A0A
            X.C17960vV.A07(r0)
            java.lang.String r3 = r0.BLd(r4, r1)
        L_0x00af:
            java.util.List r0 = r7.A0R
            java.lang.Object r0 = r0.get(r5)
            X.ADw r0 = (X.C20264ADw) r0
            int r0 = r0.A00
            if (r3 == 0) goto L_0x0113
            android.content.res.Resources r5 = X.AnonymousClass3MZ.A09(r7)
            r4 = 2131888707(0x7f120a43, float:1.9412057E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = 0
            X.AnonymousClass8BS.A1B(r0, r3, r1)
            java.lang.String r1 = r5.getString(r4, r1)
            com.whatsapp.WaTextView r0 = r7.A0W
            r0.setText(r1)
            android.view.ViewGroup r0 = r7.A0T
            r0.setVisibility(r2)
            X.1bI r0 = r7.A0L
            r0.A04(r2)
            X.1bI r0 = r7.A0L
            android.view.View r1 = r0.A02()
            r0 = 2131436319(0x7f0b231f, float:1.8494505E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131430185(0x7f0b0b29, float:1.8482064E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            X.BDE r0 = r7.A0G
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r0.Bae()
            if (r0 == 0) goto L_0x0108
            X.BDE r0 = r7.A0G
            java.lang.String r0 = r0.Bae()
            r2.setText(r0)
        L_0x0108:
            r1.setText(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0M
            r0 = 2131891371(0x7f1214ab, float:1.941746E38)
            r1.setText(r0)
        L_0x0113:
            return
        L_0x0114:
            int r1 = r1 + 1
            goto L_0x0091
        L_0x0118:
            r6 = 0
            goto L_0x007e
        L_0x011b:
            java.lang.String r2 = ""
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.ConfirmPaymentFragment.A01(X.AEs, com.whatsapp.payments.ui.ConfirmPaymentFragment, X.ADQ, java.lang.Integer):void");
    }

    public void A26(int i) {
        String str;
        this.A01 = i;
        this.A03.setVisibility(0);
        TextView textView = this.A0U;
        if (i == 0) {
            textView.setText(2131887599);
            this.A0V.setImageResource(2131232303);
            str = "p2m";
        } else {
            textView.setText(2131895765);
            this.A0V.setImageResource(2131231949);
            str = "p2p";
        }
        this.A0Q = str;
        C22564BCz bCz = this.A0H;
        if (bCz != null) {
            bCz.C0P(i);
        }
    }

    public void C0I(C20284AEs aEs) {
        boolean z;
        String str;
        int BQA;
        AnonymousClass8pY r0;
        this.A0C = aEs;
        AFT.A00(this.A0M, this, aEs, 8);
        if (aEs.A05() == 6 && (r0 = (AnonymousClass8pY) aEs.A08) != null) {
            this.A00 = r0.A03;
        }
        BDE bde = this.A0G;
        if (bde != null) {
            z = bde.CMG(aEs);
            if (z && (BQA = bde.BQA()) != 0) {
                this.A0K.A01.setText(BQA);
            }
        } else {
            z = false;
        }
        this.A0K.A01.setVisibility(C72453Mb.A07(z ? 1 : 0));
        BDE bde2 = this.A0G;
        String str2 = null;
        if (bde2 != null) {
            str = bde2.BQB(aEs);
        } else {
            str = null;
        }
        PaymentMethodRow paymentMethodRow = this.A0K;
        if (TextUtils.isEmpty(str)) {
            str = AnonymousClass8BR.A0c(this.A0N).A03(aEs, true);
        }
        paymentMethodRow.A03.setText(str);
        BDE bde3 = this.A0G;
        if ((bde3 == null || (str2 = bde3.BUs()) == null) && !(aEs instanceof AnonymousClass8pQ)) {
            C170278pb r02 = aEs.A08;
            C17960vV.A07(r02);
            if (!r02.A0A()) {
                str2 = A1H(2131893673);
            }
        }
        this.A0K.A03(str2, false);
        BDE bde4 = this.A0G;
        if (bde4 == null || !bde4.CMH()) {
            if (aEs instanceof AnonymousClass8pQ) {
                String str3 = ((AnonymousClass8pQ) aEs).A02;
                if (!TextUtils.isEmpty(str3)) {
                    this.A0I.A01(this.A0K.A00, str3);
                }
            }
            A8e.A07(aEs, this.A0K);
        } else {
            bde4.CMg(aEs, this.A0K);
        }
        BDE bde5 = this.A0G;
        if (bde5 != null) {
            boolean CLs = bde5.CLs(aEs, this.A0P, this.A01);
            PaymentMethodRow paymentMethodRow2 = this.A0K;
            if (CLs) {
                paymentMethodRow2.A04(false);
                this.A0K.A03(A1H(2131893672), false);
            } else {
                paymentMethodRow2.A04(true);
            }
        }
        A01(aEs, this, this.A0J, this.A0O);
        BDE bde6 = this.A0G;
        if (bde6 != null) {
            bde6.Blk(this.A05);
            FrameLayout frameLayout = this.A04;
            if (frameLayout != null) {
                this.A0G.Bus(frameLayout, aEs);
            }
            int BR6 = this.A0G.BR6(aEs, this.A01);
            TextView textView = this.A07;
            if (BR6 != 0) {
                textView.setText(BR6);
            } else {
                textView.setVisibility(8);
                this.A02.setVisibility(8);
            }
        }
        C22564BCz bCz = this.A0H;
        if (bCz != null) {
            bCz.C0J(aEs);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(2131624622, viewGroup, false);
        this.A05 = C108945cZ.A0P(inflate, 2131436254);
        this.A0K = (PaymentMethodRow) AnonymousClass1HF.A06(inflate, 2131433594);
        ViewGroup A0C2 = AnonymousClass3MW.A0C(inflate, 2131436351);
        this.A0M = AnonymousClass3MW.A0q(inflate, 2131429352);
        this.A04 = C108945cZ.A0P(inflate, 2131430967);
        this.A07 = AnonymousClass3MW.A0J(inflate, 2131430270);
        this.A06 = (ProgressBar) AnonymousClass1HF.A06(inflate, 2131429353);
        this.A02 = AnonymousClass1HF.A06(inflate, 2131430272);
        inflate.findViewById(2131427433).setVisibility(8);
        AnonymousClass3MY.A1B(inflate, 2131433574, 8);
        this.A0T = AnonymousClass3MW.A0C(inflate, 2131431702);
        this.A0W = AnonymousClass3MW.A0T(inflate, 2131431703);
        this.A0L = C28931bI.A00(inflate, 2131427788);
        C20284AEs aEs = this.A0C;
        C170278pb r4 = aEs.A08;
        if ((r4 instanceof AnonymousClass8pY) && aEs.A05() == 6 && "p2p".equals(this.A0Q)) {
            ((AnonymousClass8pY) r4).A03 = 1;
        }
        C0I(aEs);
        this.A03 = AnonymousClass1HF.A06(inflate, 2131433684);
        this.A0U = AnonymousClass3MW.A0J(inflate, 2131433683);
        this.A0V = AnonymousClass3MW.A0R(inflate, 2131433685);
        this.A0S = AnonymousClass1HF.A06(inflate, 2131433636);
        this.A08 = AnonymousClass3MW.A0J(inflate, 2131433637);
        Fragment fragment = this.A0E;
        AFT.A00(inflate.findViewById(2131433578), this, fragment, 3);
        AFT.A00(A0C2, this, fragment, 4);
        AFT.A00(inflate.findViewById(2131433684), this, fragment, 5);
        AFT.A00(inflate.findViewById(2131433636), this, fragment, 6);
        AFT.A00(inflate.findViewById(2131431702), this, fragment, 7);
        if (this.A0G != null) {
            ViewGroup A0D2 = AnonymousClass3MW.A0D(inflate, 2131429421);
            if (A0D2 != null) {
                this.A0G.Blm(A0D2);
            }
            this.A0G.Blj(A0C2);
            View findViewById = inflate.findViewById(2131433578);
            if (findViewById != null) {
                if (!this.A0G.CN3()) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
            ViewGroup A0D3 = AnonymousClass3MW.A0D(inflate, 2131430762);
            if (A0D3 != null) {
                this.A0G.BCl(A0D3);
            }
        }
        return inflate;
    }

    public void A1s() {
        super.A1s();
        this.A04 = null;
    }

    public void A1u() {
        AnonymousClass8pI r0;
        BDE bde;
        super.A1u();
        UserJid A022 = C22941Dw.A02(A15().getString("arg_jid"));
        if (A022 != null) {
            r0 = C62862s7.A00(this.A0A, AnonymousClass8BR.A0R(this.A0F), A022);
        } else {
            r0 = null;
        }
        this.A0B = r0;
        int A052 = this.A0C.A05();
        View view = this.A0S;
        if (A052 == 6) {
            view.setVisibility(0);
            if (this.A0C.A08 != null) {
                int i = this.A00;
                TextView textView = this.A08;
                int i2 = 2131893704;
                if (i == 0) {
                    i2 = 2131893702;
                }
                textView.setText(i2);
            }
        } else {
            view.setVisibility(8);
        }
        if ((this.A0E.A0E() || this.A0E.A09()) && (bde = this.A0G) != null && bde.Bfm()) {
            A26(this.A01);
            this.A03.setVisibility(8);
            FrameLayout frameLayout = this.A04;
            if (frameLayout != null) {
                this.A0G.Bus(frameLayout, this.A0C);
            }
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Parcelable parcelable = A15().getParcelable("arg_payment_method");
        C17960vV.A07(parcelable);
        this.A0C = (C20284AEs) parcelable;
        int i = A15().getInt("arg_payment_type");
        C17960vV.A07(Integer.valueOf(i));
        this.A01 = i;
        this.A0Q = C108955ca.A0s(A15(), "arg_transaction_type");
        this.A0J = (ADQ) A15().getParcelable("arg_order_payment_installment_content");
        this.A0P = A15().getString("arg_merchant_code");
        Integer num = null;
        if (this.A0J != null) {
            num = AnonymousClass3MY.A0f();
        }
        this.A0O = num;
    }
}
