package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentTwoFactorNudgeFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentIncentiveViewFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aah  reason: case insensitive filesystem */
public class C20865Aah implements BDw {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public C20865Aah(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void Bl4() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A4t(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0a) || !indiaUpiSendPaymentActivity.A0O.A0A(AXS.A02(indiaUpiSendPaymentActivity))) {
            indiaUpiSendPaymentActivity.A5O(indiaUpiSendPaymentActivity, (String) null, false);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C20812AZp(this, paymentBottomSheet, 2));
        indiaUpiSendPaymentActivity.CMk(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
    }

    public void BlN(String str) {
        AQ2 aq2;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C1768896a r2 = indiaUpiSendPaymentActivity.A0A;
        boolean z = !str.isEmpty();
        r2.A00.setEnabled(z);
        r2.A00.setClickable(z);
        if (indiaUpiSendPaymentActivity.A0U != null && (aq2 = indiaUpiSendPaymentActivity.A09) != null) {
            aq2.BD6(new C184389as(2, new C193189pg(C108975cc.A0b(indiaUpiSendPaymentActivity, IndiaUpiSendPaymentActivity.A03(indiaUpiSendPaymentActivity, str), new Object[1], 2131898584))));
        }
    }

    public void Bt0(String str) {
        String str2;
        String str3;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0S.BiL(AnonymousClass8BS.A0V(), "max_amount_shake", indiaUpiSendPaymentActivity.A0g, 0);
        if (C18020vd.A05(C18040vf.A02, indiaUpiSendPaymentActivity.A0E, 1933)) {
            if (indiaUpiSendPaymentActivity.A0B.A00.A00.compareTo(new BigDecimal(indiaUpiSendPaymentActivity.A06.A04(AnonymousClass18O.A1F))) == 0) {
                str2 = "-10022";
                str3 = "MAX_AMOUNT_2K_INLINE";
            } else {
                str2 = "-10020";
                str3 = "MAX_AMOUNT_100K";
            }
            IndiaUpiSendPaymentActivity.A0t(indiaUpiSendPaymentActivity, str2, str3);
        }
    }

    public void BvH() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C19962A0v a0v = indiaUpiSendPaymentActivity.A0U;
        if (a0v != null && a0v.A01 != null) {
            indiaUpiSendPaymentActivity.overridePendingTransition(0, 0);
            C19962A0v a0v2 = indiaUpiSendPaymentActivity.A0U;
            AZ6 az6 = indiaUpiSendPaymentActivity.A0S;
            Bundle A0D = C17880vN.A0D();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(az6, a0v2);
            paymentIncentiveViewFragment.A1R(A0D);
            paymentIncentiveViewFragment.A04 = new AnonymousClass9YI(paymentIncentiveViewFragment);
            indiaUpiSendPaymentActivity.CMl(paymentIncentiveViewFragment);
        }
    }

    public void C0E() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (C22971Dz.A0e(indiaUpiSendPaymentActivity.A0G) && indiaUpiSendPaymentActivity.A00 == 0) {
            indiaUpiSendPaymentActivity.A4f((Bundle) null);
        } else if (indiaUpiSendPaymentActivity.A5d() && (!indiaUpiSendPaymentActivity.A4y())) {
            AnonymousClass8BT.A16(indiaUpiSendPaymentActivity, IndiaUpiInteropSendToUpiActivity.class);
        }
    }

    public void C0F() {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(indiaUpiSendPaymentActivity.A0j);
        A002.A05 = new C20831Aa9(indiaUpiSendPaymentActivity, A002);
        A002.A03 = new C20811AZo(indiaUpiSendPaymentActivity);
        paymentBottomSheet.A02 = A002;
        indiaUpiSendPaymentActivity.CMk(paymentBottomSheet, String.valueOf(18));
    }

    public void C0K() {
        this.A00.A4t(64, "enter_user_payment_id");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.9NF[]} */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.9NF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3O(X.AnonymousClass1KN r14) {
        /*
            r13 = this;
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r13.A00
            X.90Z r3 = r0.A0V
            int r2 = r0.A00
            java.lang.String r1 = "request_payment"
            r3.Bix(r1, r2)
            X.AEs r1 = r0.A0B
            if (r1 == 0) goto L_0x00fd
            X.AXS r1 = r0.A0N
            boolean r1 = r1.A0S()
            if (r1 != 0) goto L_0x00fd
            X.A6g r4 = r0.A0O
            X.AEs r3 = r0.A0B
            java.lang.String r2 = r0.A0a
            boolean r1 = r0.A0x
            r7 = 0
            boolean r1 = r4.A09(r3, r2, r7, r1)
            if (r1 == 0) goto L_0x002a
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.A0V(r14, r14, r0)
            return
        L_0x002a:
            r0.A09 = r14
            boolean r1 = r0.A4y()
            if (r1 == 0) goto L_0x0063
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r4.<init>()
            X.AEs r5 = r0.A0B
            boolean r1 = r0.A0o
            r10 = r1 ^ 1
            java.lang.String r8 = r0.A0t
            r6 = 0
            java.lang.String r9 = r0.A0a
            r7 = r6
            com.whatsapp.payments.ui.ConfirmPaymentFragment r3 = com.whatsapp.payments.ui.ConfirmPaymentFragment.A00(r5, r6, r7, r8, r9, r10)
            X.1KI r2 = r0.A07
            java.lang.String r1 = "INR"
            X.1KJ r2 = r2.A01(r1)
            X.AZf r1 = new X.AZf
            r1.<init>(r2, r0, r4)
            r3.A0G = r1
            X.AZj r1 = new X.AZj
            r1.<init>(r0)
            r3.A0H = r1
            r4.A02 = r3
            r0.CMl(r4)
            return
        L_0x0063:
            X.1QE r6 = r0.A0i
            r1 = 1
            X.9NF[] r5 = new X.AnonymousClass9NF[r1]
            com.whatsapp.jid.UserJid r1 = r0.A0J
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x00db
            java.lang.String r3 = r1.toString()
        L_0x0072:
            java.lang.String r2 = "receiver_jid"
            r1 = 2
            X.C18070vi.A0d(r3, r1)
            X.9NF r1 = new X.9NF
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
            r5[r7] = r1
            r10 = 0
            java.lang.String r1 = "requesting payment "
            r6.A09(r10, r1, r5)
            com.whatsapp.payments.ui.widget.PaymentView r1 = r0.A4b()
            if (r1 == 0) goto L_0x00dd
            X.77d r1 = r1.getStickerIfSelected()
            if (r1 == 0) goto L_0x00dd
            r1 = 2131895077(0x7f122325, float:1.9424977E38)
            r0.CNA(r1)
            X.2rZ r6 = r0.A0S
            com.whatsapp.payments.ui.widget.PaymentView r1 = r0.A0J
            X.C17960vV.A05(r1)
            X.77d r11 = r1.getStickerIfSelected()
            X.C17960vV.A07(r11)
            X.1BI r8 = r0.A0G
            X.C17960vV.A07(r8)
            com.whatsapp.jid.UserJid r9 = r0.A0J
            long r1 = r0.A02
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00be
            X.00H r3 = r0.A0d
            X.206 r10 = X.AnonymousClass1W2.A02(r3, r1)
        L_0x00be:
            com.whatsapp.payments.ui.widget.PaymentView r1 = r0.A0J
            java.lang.Integer r12 = r1.getStickerSendOrigin()
            X.AEX r7 = r1.getPaymentBackground()
            X.Af0 r3 = r6.A01(r7, r8, r9, r10, r11, r12)
            r2 = 18
            X.Af1 r1 = new X.Af1
            r1.<init>(r14, r13, r2)
            X.1KB r0 = r0.A05
            java.util.concurrent.Executor r0 = r0.A05
            r3.A0A(r1, r0)
            return
        L_0x00db:
            r3 = r4
            goto L_0x0072
        L_0x00dd:
            com.whatsapp.payments.ui.widget.PaymentView r1 = r0.A0J
            if (r1 == 0) goto L_0x00e5
            java.lang.String r4 = r1.getPaymentNote()
        L_0x00e5:
            com.whatsapp.payments.ui.widget.PaymentView r1 = r0.A0J
            if (r1 == 0) goto L_0x00ed
            java.util.List r10 = r1.getMentionedJids()
        L_0x00ed:
            X.10I r2 = r0.A05
            r1 = 3
            X.AnonymousClass8BU.A1E(r2, r13, r10, r4, r1)
            r0.CEx()
            r0.A4o()
            r0.A4d()
            return
        L_0x00fd:
            r13.Bl4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20865Aah.C3O(X.1KN):void");
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentTwoFactorNudgeFragment, com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment, androidx.fragment.app.DialogFragment] */
    public void C57(AnonymousClass1KN r12) {
        AnonymousClass1KN r6;
        C20112A7u a7u;
        BigDecimal bigDecimal;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0U != null) {
            BigDecimal bigDecimal2 = r12.A00;
            r6 = AnonymousClass2TQ.A00(IndiaUpiSendPaymentActivity.A03(indiaUpiSendPaymentActivity, bigDecimal2.toEngineeringString()), 2);
            r6.getClass();
            AEP aep = indiaUpiSendPaymentActivity.A0U;
            aep.A00 = AnonymousClass8BV.A0r(bigDecimal2.toEngineeringString(), "fxBaseAmt", C17880vN.A16(aep.A00));
        } else {
            r6 = r12;
        }
        indiaUpiSendPaymentActivity.A0V.Bix("send_payment", indiaUpiSendPaymentActivity.A00);
        boolean z = true;
        if (indiaUpiSendPaymentActivity.A0X) {
            a7u = C20112A7u.A01();
            a7u.A06("is_alias_resolved", 1);
            if (!TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0S)) {
                a7u.A07("receiver_platform", indiaUpiSendPaymentActivity.A0S);
            }
        } else {
            a7u = null;
        }
        indiaUpiSendPaymentActivity.A5X(a7u, "new_payment", 5);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0N.A0S()) {
            Bl4();
            return;
        }
        if (!indiaUpiSendPaymentActivity.A0O.A09(indiaUpiSendPaymentActivity.A0B, indiaUpiSendPaymentActivity.A0a, false, indiaUpiSendPaymentActivity.A0x)) {
            if (indiaUpiSendPaymentActivity.A0J) {
                if (indiaUpiSendPaymentActivity.A00 != 5) {
                    indiaUpiSendPaymentActivity.A0I = true;
                    IndiaUpiSendPaymentActivity.A0d(indiaUpiSendPaymentActivity);
                    return;
                } else if (indiaUpiSendPaymentActivity.A0U != null) {
                    C18030ve r1 = indiaUpiSendPaymentActivity.A0E;
                    BigDecimal bigDecimal3 = C20092A6u.A00;
                    if (new BigDecimal(IndiaUpiSendPaymentActivity.A03(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0U.A08)).compareTo(new BigDecimal(Integer.toString(AnonymousClass8BX.A04(r1)))) > 0) {
                        AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 39);
                    }
                } else {
                    String A002 = C199159zX.A00(indiaUpiSendPaymentActivity);
                    if (!AnonymousClass1EG.A0H(A002) && r6.A00.compareTo(new BigDecimal(A002)) > 0) {
                        int i = 41;
                        if (indiaUpiSendPaymentActivity.A0o) {
                            i = 40;
                        }
                        AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, i);
                        return;
                    } else if (!indiaUpiSendPaymentActivity.A0o && (bigDecimal = indiaUpiSendPaymentActivity.A0G) != null && r6.A00.compareTo(bigDecimal) > 0) {
                        AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 39);
                        return;
                    }
                }
            }
            C20284AEs aEs = indiaUpiSendPaymentActivity.A0B;
            AnonymousClass8pS r0 = (AnonymousClass8pS) aEs.A08;
            if (r0 != null && !C170278pb.A03(r0)) {
                IndiaUpiPinPrimerDialogFragment A0M = AnonymousClass8BY.A0M(aEs, indiaUpiSendPaymentActivity);
                PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                paymentBottomSheet.A02 = A0M;
                indiaUpiSendPaymentActivity.CMk(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
                C17880vN.A1F(AnonymousClass8BU.A07(indiaUpiSendPaymentActivity.A0Q), "payments_upi_pin_primer_dialog_shown", true);
                return;
            } else if (indiaUpiSendPaymentActivity.A0Q.A03().getBoolean("payments_upi_pin_primer_dialog_shown", false)) {
                C17880vN.A1F(AnonymousClass8BU.A07(indiaUpiSendPaymentActivity.A0Q), "payments_upi_pin_primer_dialog_shown", false);
            } else {
                C18030ve r13 = indiaUpiSendPaymentActivity.A0E;
                C18040vf r9 = C18040vf.A02;
                int A003 = C18020vd.A00(r9, r13, 1124);
                String[] split = indiaUpiSendPaymentActivity.A0Q.A03().getString("payments_sent_payment_with_account", "").split(";");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (split[i2].equalsIgnoreCase(indiaUpiSendPaymentActivity.A0B.A0A)) {
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!C18020vd.A05(r9, indiaUpiSendPaymentActivity.A0E, 11839) && !(!indiaUpiSendPaymentActivity.A0D.A02().isEmpty()) && z && A003 > 0 && indiaUpiSendPaymentActivity.A0Q.A03().getInt("payments_two_factor_nudge_count", 0) < A003) {
                    AnonymousClass1QD r14 = indiaUpiSendPaymentActivity.A0Q;
                    if (AnonymousClass11P.A01(r14.A01) - C17890vO.A05(r14.A03(), "payments_last_two_factor_nudge_time") > TimeUnit.HOURS.toMillis(24)) {
                        ? hilt_IndiaUpiPaymentTwoFactorNudgeFragment = new Hilt_IndiaUpiPaymentTwoFactorNudgeFragment();
                        hilt_IndiaUpiPaymentTwoFactorNudgeFragment.A02 = indiaUpiSendPaymentActivity;
                        indiaUpiSendPaymentActivity.CMl(hilt_IndiaUpiPaymentTwoFactorNudgeFragment);
                        return;
                    }
                }
            }
        }
        IndiaUpiSendPaymentActivity.A0V(r6, r12, indiaUpiSendPaymentActivity);
    }

    public void C58() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A4k(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
    }

    public void C5B() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = indiaUpiSendPaymentActivity.A06.A0O(indiaUpiSendPaymentActivity.A08);
        indiaUpiSendPaymentActivity.BhU(A1a, 0, 2131893816);
    }

    public void C8L(boolean z) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C19962A0v a0v = indiaUpiSendPaymentActivity.A0U;
        AZ6 az6 = indiaUpiSendPaymentActivity.A0S;
        if (z) {
            AnonymousClass91U.A1a(indiaUpiSendPaymentActivity, az6, a0v, 49);
        } else {
            AnonymousClass91U.A1a(indiaUpiSendPaymentActivity, az6, a0v, 48);
        }
        indiaUpiSendPaymentActivity.A5M();
    }

    public void CMi(DialogFragment dialogFragment) {
        this.A00.CMl(dialogFragment);
    }

    public void Buo(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
            indiaUpiSendPaymentActivity.A4j(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
        }
    }
}
