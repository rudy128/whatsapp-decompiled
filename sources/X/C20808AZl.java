package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.Hilt_IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import java.util.List;

/* renamed from: X.AZl  reason: case insensitive filesystem */
public class C20808AZl implements C22564BCz {
    public final /* synthetic */ C21132Af0 A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C19962A0v A02;
    public final /* synthetic */ ConfirmPaymentFragment A03;
    public final /* synthetic */ AnonymousClass91R A04;

    public void Bw1(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public void C0M(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public void C0O(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public C20808AZl(C21132Af0 af0, AnonymousClass1KN r2, C19962A0v a0v, ConfirmPaymentFragment confirmPaymentFragment, AnonymousClass91R r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = af0;
        this.A02 = a0v;
        this.A03 = confirmPaymentFragment;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2r3, java.lang.Object] */
    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r10, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass91R r5 = this.A04;
        if (AnonymousClass8BT.A1X(r5)) {
            C17880vN.A1E(AnonymousClass8BU.A07(r5.A0Q), "pref_p2m_hybrid_last_used_payment_option", "WhatsappPay");
            ((A0J) r5.A0R.get()).A01(AnonymousClass1R2.A03(r5.getIntent()));
        }
        ? obj = new Object();
        AnonymousClass1KN r1 = this.A01;
        obj.A01(r1);
        obj.A02 = AnonymousClass1KL.A0B;
        r5.A5T(obj.A00());
        if (r5.A5e(aEs, r5.A0a)) {
            if (C18020vd.A05(C18040vf.A02, r5.A0E, 4638)) {
                r5.A5b((String) null);
            } else {
                C0G(paymentBottomSheet);
            }
        } else {
            C21132Af0 af0 = this.A00;
            if (af0 != null) {
                r5.CNA(2131895077);
                C20107A7l a7l = r5.A0V;
                af0.A0A(new C21117Ael(r5, new C20851AaT(this, paymentBottomSheet), a7l, 3), a7l.A00.A05);
                return;
            }
            r5.A5P(paymentBottomSheet);
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A28();
            }
            r5.A5R(r1);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r2.A0P.A0I(r2.A0F, r2.A0a, r2.A0k) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0G(com.whatsapp.payments.ui.PaymentBottomSheet r20) {
        /*
            r19 = this;
            r4 = r19
            X.91R r2 = r4.A04
            X.AEs r1 = r2.A0B
            java.lang.String r0 = r2.A0t
            boolean r7 = X.C20080A6g.A02(r1, r0)
            boolean r0 = X.AnonymousClass8BT.A1X(r2)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r2.A0l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001a:
            X.1QO r5 = r2.A0P
            X.1BI r3 = r2.A0F
            java.lang.String r1 = r2.A0a
            java.lang.String r0 = r2.A0k
            boolean r0 = r5.A0I(r3, r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r6 = 1
        L_0x002a:
            X.1KN r5 = r4.A01
            X.A0v r0 = r4.A02
            X.A7u r3 = X.AnonymousClass91R.A0z(r5, r0, r2)
            if (r6 == 0) goto L_0x003c
            X.AZ6 r1 = r2.A0S
            X.AEs r0 = r2.A0B
            X.A7u r3 = r1.A08(r0, r3)
        L_0x003c:
            X.A7u r9 = X.AnonymousClass91R.A10(r3, r2)
            X.AZ6 r8 = r2.A0S
            r0 = 84
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r7 == 0) goto L_0x007d
            java.lang.String r11 = "add_credential_prompt"
        L_0x004c:
            java.lang.String r12 = r2.A0g
            boolean r17 = X.AnonymousClass8BT.A1X(r2)
            java.lang.String r13 = r2.A0m
            java.lang.String r14 = r2.A0l
            r3 = 0
            r15 = 1
            r16 = r3
            r18 = r3
            r8.BiJ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7 = r20
            if (r6 == 0) goto L_0x0080
            X.2r3 r1 = new X.2r3
            r1.<init>()
            r1.A01(r5)
            X.1KJ r0 = X.AnonymousClass1KL.A0B
            r1.A02 = r0
            X.ARR r4 = r1.A00()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.AEs r0 = r2.A0B
            r2.A5S(r0, r4, r7, r1)
            return
        L_0x007d:
            java.lang.String r11 = "payment_confirm_prompt"
            goto L_0x004c
        L_0x0080:
            java.util.List r0 = r2.A0j
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r1 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r0)
            X.Aa9 r0 = new X.Aa9
            r0.<init>(r2, r1)
            r1.A05 = r0
            X.AZo r0 = new X.AZo
            r0.<init>(r2)
            r1.A03 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A03
            r1.A1V(r0, r3)
            r7.A2L(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20808AZl.C0G(com.whatsapp.payments.ui.PaymentBottomSheet):void");
    }

    public void C0J(C20284AEs aEs) {
        AnonymousClass91R.A17(aEs, this.A04);
    }

    public void C0P(int i) {
        String str;
        AnonymousClass91R r1 = this.A04;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        r1.A0t = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment, com.whatsapp.payments.ui.Hilt_IndiaUpiEditTransactionDescriptionFragment, androidx.fragment.app.Fragment] */
    public void C95(PaymentBottomSheet paymentBottomSheet, PaymentDescriptionRow paymentDescriptionRow) {
        AnonymousClass91R r4 = this.A04;
        String str = r4.A0T;
        ? hilt_IndiaUpiEditTransactionDescriptionFragment = new Hilt_IndiaUpiEditTransactionDescriptionFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_payment_description", str);
        hilt_IndiaUpiEditTransactionDescriptionFragment.A1R(A0D);
        r4.A4t(64, "payment_confirm_prompt");
        hilt_IndiaUpiEditTransactionDescriptionFragment.A09 = new C20864Aag(this, paymentDescriptionRow, 0);
        paymentBottomSheet.A2L(hilt_IndiaUpiEditTransactionDescriptionFragment);
    }
}
