package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.InstallmentBottomSheetFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AZm  reason: case insensitive filesystem */
public class C20809AZm implements C22564BCz {
    public final /* synthetic */ C21132Af0 A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C19962A0v A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ ConfirmPaymentFragment A04;
    public final /* synthetic */ PaymentBottomSheet A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r15, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        C21132Af0 af0 = this.A00;
        C20274AEh aEh2 = aEh;
        AnonymousClass8pI r7 = r15;
        C20284AEs aEs2 = aEs;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (af0 != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A03;
            brazilPaymentActivity.CNA(2131895077);
            C20107A7l a7l = brazilPaymentActivity.A0V;
            af0.A0A(new C21117Ael(brazilPaymentActivity, new C20852AaU(aEh2, r7, aEs2, this, paymentBottomSheet2), a7l, 3), a7l.A00.A05);
            return;
        }
        A00(aEh, r15, aEs2, (AnonymousClass34B) null, this, paymentBottomSheet2);
    }

    public void C0J(C20284AEs aEs) {
    }

    public void C95(PaymentBottomSheet paymentBottomSheet, PaymentDescriptionRow paymentDescriptionRow) {
    }

    public C20809AZm(C21132Af0 af0, AnonymousClass1KN r2, C19962A0v a0v, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str, String str2) {
        this.A03 = brazilPaymentActivity;
        this.A00 = af0;
        this.A05 = paymentBottomSheet;
        this.A02 = a0v;
        this.A01 = r2;
        this.A07 = str;
        this.A04 = confirmPaymentFragment;
        this.A06 = str2;
    }

    public static void A00(C20274AEh aEh, AnonymousClass8pI r15, C20284AEs aEs, AnonymousClass34B r17, C20809AZm aZm, PaymentBottomSheet paymentBottomSheet) {
        C20809AZm aZm2 = aZm;
        BrazilPaymentActivity brazilPaymentActivity = aZm2.A03;
        C19962A0v a0v = aZm2.A02;
        AnonymousClass1KN r7 = aZm2.A01;
        BD4 bd4 = brazilPaymentActivity.A0L;
        String str = aZm2.A07;
        C20112A7u A012 = C20087A6p.A01(brazilPaymentActivity.A05, r7, a0v, brazilPaymentActivity.A0m);
        C17960vV.A07(bd4);
        C20274AEh aEh2 = aEh;
        if (aEh != null) {
            A012.A06("num_installments", aEh.A01);
            A012.A08("has_installments_fees", false);
        }
        bd4.BiM(A012, 47, "payment_confirm_prompt", str, 1);
        C20284AEs aEs2 = aEs;
        if (r15 != null) {
            if (BrazilPaymentActivity.A12(aEs2, r15.A08())) {
                PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
                if (paymentBottomSheet != null) {
                    aZm2.C0G(paymentBottomSheet2);
                    return;
                }
                return;
            }
            C21432Ajz.A00(brazilPaymentActivity.A05, aZm2, r15, 7);
        }
        C170278pb r0 = aEs2.A08;
        C17960vV.A07(r0);
        if (((AnonymousClass8pY) r0).A0a) {
            brazilPaymentActivity.A0Q.A01().A03((C22442B7y) null, aEs2);
            aZm2.A05.A28();
            AnonymousClass34B r9 = r17;
            if (Build.VERSION.SDK_INT < 23 || !brazilPaymentActivity.A0P.A05() || brazilPaymentActivity.A0P.A02() != 1) {
                BrazilPaymentActivity.A0w(aEh2, r7, aEs2, r9, brazilPaymentActivity, r7.toString(), brazilPaymentActivity.A0t);
                return;
            }
            BrazilPaymentActivity.A0v(aEh2, r7, aEs2, r9, brazilPaymentActivity, r7.toString(), brazilPaymentActivity.A0t);
            return;
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, brazilPaymentActivity.A0E, 1927);
        String str2 = aEs2.A0A;
        brazilPaymentActivity.CNA(2131893634);
        if (A052) {
            BrazilPaymentActivity.A0z(brazilPaymentActivity, str2);
            brazilPaymentActivity.A0Y.A01(new C20868Aak(brazilPaymentActivity, 0), new C20900AbG(brazilPaymentActivity, 2), new C20908AbO(brazilPaymentActivity, 1), str2, "payment_method_details").A09(new C21114Aei(4, str2, brazilPaymentActivity));
            return;
        }
        BrazilPaymentActivity.A0z(brazilPaymentActivity, str2);
        AnonymousClass11P r8 = brazilPaymentActivity.A05;
        AnonymousClass1KB r6 = brazilPaymentActivity.A05;
        AnonymousClass11S r72 = brazilPaymentActivity.A02;
        AnonymousClass1OZ A0M = AnonymousClass8BT.A0M(brazilPaymentActivity);
        C30931ek r1 = brazilPaymentActivity.A0Z;
        AnonymousClass1QS r14 = brazilPaymentActivity.A0Q;
        new C191909nO(brazilPaymentActivity, r6, r72, r8, brazilPaymentActivity.A08, A0M, brazilPaymentActivity.A0D, AnonymousClass8BT.A0S(brazilPaymentActivity), brazilPaymentActivity.A0N, r14, brazilPaymentActivity.A0N, r1, str2).A00(new AY5(brazilPaymentActivity, str2));
    }

    public void Bw1(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
        String str = this.A07;
        int i3 = ((C20264ADw) list.get(i)).A00;
        C20112A7u A022 = C20112A7u.A02();
        A022.A06("num_installments", i3);
        C20087A6p.A03(A022, this.A03.A0L, "installments_selection_prompt", str);
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelableArrayList("arg_installment_list", (ArrayList) list);
        A0D.putInt("arg_selected_position", i);
        A0D.putString("arg_referral_screen", str);
        A0D.putInt("arg_max_installment_count", i2);
        InstallmentBottomSheetFragment installmentBottomSheetFragment = new InstallmentBottomSheetFragment();
        installmentBottomSheetFragment.A1R(A0D);
        installmentBottomSheetFragment.A1V(this.A04, 0);
        paymentBottomSheet.A2L(installmentBottomSheetFragment);
    }

    public void C0G(PaymentBottomSheet paymentBottomSheet) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        C19962A0v a0v = this.A02;
        AnonymousClass1KN r2 = this.A01;
        C20087A6p.A02(C20087A6p.A01(brazilPaymentActivity.A05, r2, a0v, brazilPaymentActivity.A0m), brazilPaymentActivity.A0L, 84, "payment_confirm_prompt", (String) null, 1);
        brazilPaymentActivity.A04.A09(new C21119Aen(this, this.A04, paymentBottomSheet, this.A06));
    }

    public void C0M(PaymentBottomSheet paymentBottomSheet, int i) {
        PaymentRailPickerFragment A002 = PaymentRailPickerFragment.A00(i, "p2p".equals(this.A03.A0t));
        A002.A1V(this.A04, 0);
        paymentBottomSheet.A2L(A002);
    }

    public void C0P(int i) {
        String str;
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        brazilPaymentActivity.A0t = str;
    }

    public void C0O(PaymentBottomSheet paymentBottomSheet, int i) {
        String str;
        Bundle A0D = C17880vN.A0D();
        if (i != 0) {
            str = "friendsAndFamily";
        } else {
            str = "goodAndServices";
        }
        A0D.putString("arg_type", str);
        BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
        brazilPaymentTypePickerFragment.A1R(A0D);
        brazilPaymentTypePickerFragment.A1V(this.A04, 0);
        paymentBottomSheet.A2L(brazilPaymentTypePickerFragment);
    }
}
