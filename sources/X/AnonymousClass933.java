package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.Hilt_IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.933  reason: invalid class name */
public abstract class AnonymousClass933 extends AnonymousClass91S implements BDE, C72073Kn, C22564BCz, BCD, C22466B8y, BBQ {
    public AnonymousClass1VW A00;
    public C219217x A01;
    public AnonymousClass1KI A02;
    public C20284AEs A03;
    public AnonymousClass1KH A04;
    public AW0 A05;
    public AnonymousClass1LU A06;
    public C1418477e A07;
    public C1418477e A08;
    public C191339mR A09;
    public C33701jF A0A;
    public PaymentBottomSheet A0B = new PaymentBottomSheet();
    public A8C A0C;
    public A43 A0D;
    public C19997A2l A0E;
    public AnonymousClass4VT A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public final C180609Nf A0L = new C175378yc(this, 3);
    public final AnonymousClass1QE A0M = AnonymousClass1QE.A00("IndiaUpiBaseRequestPaymentActivity", "payment-settings", "IN");

    public int BR6(C20284AEs aEs, int i) {
        return 0;
    }

    public void Blj(ViewGroup viewGroup) {
    }

    public void Bw1(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public void C0M(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public void C0O(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public void C0P(int i) {
        String str;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        this.A0t = str;
    }

    public void C95(PaymentBottomSheet paymentBottomSheet, PaymentDescriptionRow paymentDescriptionRow) {
    }

    public boolean CMG(C20284AEs aEs) {
        return true;
    }

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public static void A0V(AnonymousClass10E r1, AnonymousClass1KI r2, AnonymousClass933 r3) {
        r3.A02 = r2;
        r3.A0H = C000200d.A00(r1.A87);
        r3.A0G = C000200d.A00(r1.AcC);
        r3.A0A = (C33701jF) r1.A8I.get();
        r3.A0E = r1.AHJ();
    }

    public void A5F() {
        String str;
        if (!this.A01.A0I()) {
            AnonymousClass74O.A06(this);
            return;
        }
        int A012 = this.A0E.A01();
        if (A012 == 1) {
            A3t(new C20446ALj(this, 3), 2131893724, 2131897650, 2131888080);
        } else if (A012 != 2) {
            AnonymousClass8pS r2 = (AnonymousClass8pS) this.A03.A08;
            if (r2 == null || !"OD_UNSECURED".equals(r2.A0A) || this.A0J) {
                C175838zM r1 = this.A07;
                if (r2 != null) {
                    str = r2.A09;
                } else {
                    str = null;
                }
                r1.A02(str);
                return;
            }
            BhQ(2131897651);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0E(2131893609);
            A002.A0D(2131897649);
            C20154A9q.A00(A002, this, 12, 2131897415);
            C20154A9q.A01(A002, this, 13, 2131897418);
            A002.A0T(false);
            A002.A0C();
        }
    }

    public void A5G(C20284AEs aEs, HashMap hashMap) {
        C20284AEs aEs2 = aEs;
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = (IndiaUpiPauseMandateActivity) this;
        A7U a7u = indiaUpiPauseMandateActivity.A0M;
        AnonymousClass1KB r15 = indiaUpiPauseMandateActivity.A05;
        AnonymousClass190 r14 = indiaUpiPauseMandateActivity.A03;
        C196259ui r5 = indiaUpiPauseMandateActivity.A04;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(indiaUpiPauseMandateActivity);
        C30931ek r3 = indiaUpiPauseMandateActivity.A0A;
        C31061ex r2 = indiaUpiPauseMandateActivity.A0N;
        C175758zE r1 = indiaUpiPauseMandateActivity.A06;
        A7U a7u2 = a7u;
        AXS axs = indiaUpiPauseMandateActivity.A0N;
        C175848zN r12 = new C175848zN(indiaUpiPauseMandateActivity, r14, r15, A0M2, a7u2, axs, AnonymousClass8BT.A0S(indiaUpiPauseMandateActivity), r5, r2, r1, r3);
        indiaUpiPauseMandateActivity.CNA(2131895077);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = indiaUpiPauseMandateActivity.A05;
        long A072 = AnonymousClass8BY.A07(indiaUpiPauseMandateActivity.A01);
        long A073 = AnonymousClass8BY.A07(indiaUpiPauseMandateActivity.A00);
        String str = indiaUpiPauseMandateActivity.A06;
        if (aEs == null) {
            aEs2 = indiaUpiPauseMandateViewModel.A00;
        }
        AW0 aw0 = indiaUpiPauseMandateViewModel.A01;
        AYQ ayq = new AYQ(indiaUpiPauseMandateViewModel, A072, A073);
        ArrayList A0w = AnonymousClass8BU.A0w("PAY: pausePayeeMandate called");
        C17890vO.A11("action", "upi-pause-mandate", A0w);
        C175848zN.A01(aw0, r12, A0w);
        C170318pf r10 = (C170318pf) aw0.A0A;
        C17960vV.A07(r10);
        C175848zN.A02((AnonymousClass9O4) null, r10, str, A0w, true);
        C175848zN.A00(aEs2, r12, "upi-pause-mandate", hashMap, A0w);
        C29621ca[] A032 = C175848zN.A03(aw0, r12);
        AnonymousClass8BT.A1U("pause-start-ts", A0w, A072 / 1000);
        AnonymousClass8BT.A1U("pause-end-ts", A0w, A073 / 1000);
        C17890vO.A11("receiver-name", (String) C20061A5k.A01(r10.A0B), A0w);
        C175758zE r13 = r12.A07;
        if (r13 != null) {
            r13.A00("U66", A0w);
        }
        C196259ui A042 = C197889xR.A04(r12, "upi-pause-mandate");
        r12.A01.A0I(new C175978za(r12.A00, r12.A02, r12.A06, A042, (C22450B8i) ayq, r12, 7), AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A0w, 0), A032), "set", 0);
    }

    public void A5H(PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A03, (UserJid) null, (ADQ) null, this.A0t, this.A0a, this.A0J ^ true ? 1 : 0);
        A002.A0G = this;
        A002.A0H = this;
        paymentBottomSheet.A02 = A002;
        CMk(paymentBottomSheet, "ConfirmPaymentFragment");
    }

    public void A5I(PaymentBottomSheet paymentBottomSheet) {
        paymentBottomSheet.A02 = AnonymousClass8BY.A0M(this.A03, this);
        CMk(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.whatsapp.payments.ui.Hilt_IndiaUpiForgotPinDialogFragment, com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment] */
    public void A5J(PaymentBottomSheet paymentBottomSheet) {
        C20284AEs aEs = this.A03;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelable("extra_bank_account", aEs);
        ? hilt_IndiaUpiForgotPinDialogFragment = new Hilt_IndiaUpiForgotPinDialogFragment();
        hilt_IndiaUpiForgotPinDialogFragment.A1R(A0D2);
        hilt_IndiaUpiForgotPinDialogFragment.A07 = this;
        paymentBottomSheet.A02 = hilt_IndiaUpiForgotPinDialogFragment;
        CMk(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
    }

    public void A5K(PaymentBottomSheet paymentBottomSheet, String str) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            paymentBottomSheet.A01 = null;
        }
        A41(str);
    }

    public void BCl(ViewGroup viewGroup) {
        C196219ue r4;
        String A072;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
            View A0A2 = AnonymousClass3MX.A0A(indiaUpiMandatePaymentActivity.getLayoutInflater(), viewGroup, 2131624625);
            View A062 = AnonymousClass1HF.A06(A0A2, 2131435591);
            TextView A0J2 = AnonymousClass3MW.A0J(A0A2, 2131435592);
            TextView A0J3 = AnonymousClass3MW.A0J(A0A2, 2131430469);
            TextView A0J4 = AnonymousClass3MW.A0J(A0A2, 2131430470);
            TextView A0J5 = AnonymousClass3MW.A0J(A0A2, 2131431015);
            TextView A0J6 = AnonymousClass3MW.A0J(A0A2, 2131436331);
            View A063 = AnonymousClass1HF.A06(A0A2, 2131428264);
            AW0 aw0 = indiaUpiMandatePaymentActivity.A03.A07;
            AnonymousClass8pG r3 = aw0.A0A;
            if ((r3 instanceof C170318pf) && (r4 = ((C170318pf) r3).A0H) != null) {
                if (A8C.A05(r4.A0E)) {
                    A062.setVisibility(0);
                    A0J2.setVisibility(0);
                    A8C a8c = indiaUpiMandatePaymentActivity.A0C;
                    long j = r4.A02;
                    C18000vb r12 = a8c.A02;
                    AnonymousClass11Y r11 = AnonymousClass11X.A00;
                    A0J2.setText(r11.A0B(r12, j));
                    A0J3.setText(2131897564);
                    A8C a8c2 = indiaUpiMandatePaymentActivity.A0C;
                    A072 = r11.A0B(a8c2.A02, r4.A01);
                } else {
                    A062.setVisibility(8);
                    A0J2.setVisibility(8);
                    A0J3.setText(2131897505);
                    A072 = indiaUpiMandatePaymentActivity.A0C.A07(r4.A01);
                }
                A0J4.setText(A072);
                A0J5.setText(indiaUpiMandatePaymentActivity.A0C.A09(r4.A0E));
                A0J6.setText(indiaUpiMandatePaymentActivity.A0C.A08(aw0.A09, r4.A0G));
                if (A8C.A05(r4.A0E)) {
                    A063.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        View A0A3 = AnonymousClass3MX.A0A(getLayoutInflater(), viewGroup, 2131624626);
        if (this.A05 != null) {
            AnonymousClass3MW.A0J(A0A3, 2131427786).setText(this.A02.A01("INR").BLc(this.A00, this.A05.A09));
        }
    }

    public String BPC(C20284AEs aEs, int i) {
        int i2;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            i2 = 2131897489;
        } else {
            i2 = 2131894026;
        }
        return getString(i2);
    }

    public String BQB(C20284AEs aEs) {
        return A56.A00(aEs, this.A0H);
    }

    public String BUs() {
        C1418477e A0D2 = this.A0N.A0D();
        if (C20061A5k.A02(A0D2)) {
            return null;
        }
        return C17880vN.A0q(this, C20061A5k.A01(A0D2), AnonymousClass3MW.A1a(), 0, 2131891338);
    }

    public boolean Bfm() {
        AnonymousClass8pI r0 = this.A0B;
        if (r0 == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    public void BpA() {
        this.A0B.A2K();
    }

    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r9, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        A5K(this.A0B, "ConfirmPaymentFragment");
        String[] split = this.A0Q.A03().getString("payments_sent_payment_with_account", "").split(";");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (split[i].equalsIgnoreCase(this.A03.A0A)) {
                this.A0K = true;
                break;
            } else {
                i++;
            }
        }
        AnonymousClass8pS r0 = (AnonymousClass8pS) this.A03.A08;
        if (r0 == null || !C170278pb.A03(r0) || this.A0K) {
            A5F();
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A0B = paymentBottomSheet2;
        A5J(paymentBottomSheet2);
    }

    public void BqB() {
        Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiDebitCardVerificationActivity.class);
        A072.putExtra("extra_bank_account", this.A03);
        A4v(A072);
        A072.putExtra("extra_previous_screen", "setup_pin_prompt");
        CNh(A072, 1016);
    }

    public void BqE() {
        A5K(this.A0B, "IndiaUpiForgotPinDialogFragment");
        AnonymousClass1QD r2 = this.A0Q;
        StringBuilder A0f = AnonymousClass8BX.A0f(r2);
        A0f.append(";");
        r2.A0M(AnonymousClass000.A0y(this.A03.A0A, A0f));
        this.A0K = true;
        A5F();
    }

    public void Bus(ViewGroup viewGroup, C20284AEs aEs) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            AnonymousClass3MW.A0G(AnonymousClass3MX.A0A(getLayoutInflater(), viewGroup, 2131625609), 2131434229).setImageResource(A43.A00(AXS.A02(this), (String) null).A00);
            return;
        }
        findViewById(2131430951);
        A43.A00(AXS.A02(this), (String) null);
    }

    public void Buv() {
        Intent A032 = IndiaUpiPinPrimerFullSheetActivity.A03(this, (AnonymousClass8pN) this.A03, this.A0b, true);
        A4v(A032);
        CNh(A032, 1017);
    }

    public void Buw() {
        this.A0B.A2K();
    }

    public void C0G(PaymentBottomSheet paymentBottomSheet) {
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(this.A0I);
        A002.A05 = new C20829Aa7(this, 1);
        A002.A03 = this;
        A002.A1V(paymentBottomSheet.A02, 0);
        paymentBottomSheet.A2L(A002);
    }

    public void C0J(C20284AEs aEs) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            this.A03 = aEs;
        }
    }

    public void C3p(boolean z) {
        if (z) {
            A5H(this.A0B);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        PaymentBottomSheet paymentBottomSheet;
        String str;
        if (i != 155) {
            switch (i) {
                case 1015:
                    return;
                case 1016:
                    if (i2 == -1 && intent != null) {
                        C20284AEs aEs = (C20284AEs) intent.getParcelableExtra("extra_bank_account");
                        if (aEs != null) {
                            this.A03 = aEs;
                        }
                        AnonymousClass1QD r2 = this.A0Q;
                        StringBuilder A0f = AnonymousClass8BX.A0f(r2);
                        A0f.append(";");
                        r2.A0M(AnonymousClass000.A0y(this.A03.A0A, A0f));
                        paymentBottomSheet = this.A0B;
                        str = "IndiaUpiPinPrimerDialogFragment";
                        break;
                    } else {
                        return;
                    }
                    break;
                case 1017:
                    if (i2 == -1) {
                        AnonymousClass1QD r22 = this.A0Q;
                        StringBuilder A0f2 = AnonymousClass8BX.A0f(r22);
                        A0f2.append(";");
                        r22.A0M(AnonymousClass000.A0y(this.A03.A0A, A0f2));
                        paymentBottomSheet = this.A0B;
                        str = "IndiaUpiForgotPinDialogFragment";
                        break;
                    } else {
                        return;
                    }
                case 1018:
                    C1418477e r0 = this.A07;
                    if (r0 == null || r0.A00 == null) {
                        CNA(2131895077);
                        A0c(this.A05, this);
                        return;
                    }
                    A5H(this.A0B);
                    return;
                default:
                    super.onActivityResult(i, i2, intent);
                    return;
            }
            A5K(paymentBottomSheet, str);
            Intent A092 = AnonymousClass8BW.A09(this, this.A03, IndiaUpiPinSetUpCompletedActivity.class);
            A092.putExtra("on_settings_page", false);
            CNh(A092, 1018);
        } else if (i2 == -1) {
            A5F();
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 34) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131893826);
        C73203Rj.A06(A002);
        A002.A00.A0O(C20160A9w.A00(this, 14));
        return A002.create();
    }

    public static void A0c(AW0 aw0, AnonymousClass933 r5) {
        C170318pf A0C2 = AnonymousClass8BS.A0C(aw0);
        String str = A0C2.A0R;
        if (!C18020vd.A05(C18040vf.A02, r5.A0E, 2700) || A0C2.A0H == null) {
            AnonymousClass8BU.A0U(r5.A0Q).BWW().CRn(AnonymousClass8BX.A0K(str, "upiHandle"), new AXX(0, str, r5));
            return;
        }
        r5.A0M.A06("skipping verifyReceiver for mandates");
        r5.A08 = AnonymousClass8BW.A0K(str, "upiHandle");
        r5.A07 = A0C2.A0B;
        r5.A5H(r5.A0B);
    }

    public /* synthetic */ int BPB(C20284AEs aEs) {
        return 0;
    }

    public int BQA() {
        return 2131894029;
    }

    public /* synthetic */ String Bae() {
        return null;
    }

    public void Blk(ViewGroup viewGroup) {
        ImageView A0E2 = AnonymousClass8BY.A0E(getLayoutInflater(), viewGroup, 2131624613);
        A0E2.setImageResource(2131231814);
        AFO.A00(A0E2, this, 44);
    }

    public void Blm(ViewGroup viewGroup) {
        View inflate = getLayoutInflater().inflate(2131625613, viewGroup, true);
        ImageView A0G2 = AnonymousClass3MW.A0G(inflate, 2131433642);
        TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131433641);
        TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131433643);
        AnonymousClass1HF.A06(inflate, 2131430710).setVisibility(0);
        AFO.A00(inflate, this, 43);
        this.A00.A09(A0G2, 2131231047);
        AnonymousClass8BR.A1E(A0J2, AnonymousClass8BT.A0q(this.A07));
        AnonymousClass3MY.A0y(this, A0J3, new Object[]{this.A08}, 2131891338);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [X.9NY, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r2.A02 == null) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwk(X.A7B r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x005a
            X.1QE r1 = r7.A0M
            java.lang.String r0 = "onListKeys contains non empty keys"
            r1.A06(r0)
            X.9ui r1 = r7.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.AEs r6 = r7.A03
            r1 = r7
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 == 0) goto L_0x0078
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r5 = r1.A05
            if (r6 != 0) goto L_0x0023
            X.AEs r6 = r5.A00
        L_0x0023:
            X.AW0 r4 = r5.A01
            X.8pG r3 = r4.A0A
            X.8pf r3 = (X.C170318pf) r3
            X.8pb r2 = r6.A08
            X.C17960vV.A07(r2)
            X.8pS r2 = (X.AnonymousClass8pS) r2
            r0 = 0
            X.9NY r1 = new X.9NY
            r1.<init>()
            r1.A00 = r0
            r1.A06 = r9
            java.lang.String r0 = r6.A0B
            r1.A05 = r0
            X.77e r0 = r2.A07
            r1.A02 = r0
            r1.A03 = r3
            X.77e r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A08 = r0
            java.lang.String r0 = r3.A0R
            r1.A07 = r0
            X.1KN r0 = r4.A09
            r1.A01 = r0
            X.1wy r0 = r5.A02
            r0.A0F(r1)
        L_0x0059:
            return
        L_0x005a:
            if (r8 == 0) goto L_0x0059
            int r2 = r8.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C20752AXh.A01(r7, r1, r2, r0)
            if (r0 != 0) goto L_0x0059
            X.9ui r0 = r7.A04
            boolean r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x00f3
            X.AnonymousClass91U.A1b(r7)
            X.AEs r0 = r7.A03
            r7.A59(r0)
            return
        L_0x0078:
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.8GL r3 = r1.A03
            if (r6 != 0) goto L_0x0080
            X.AEs r6 = r3.A05
        L_0x0080:
            X.AW0 r4 = r3.A07
            X.8pG r5 = r4.A0A
            X.8pf r5 = (X.C170318pf) r5
            X.8pb r2 = r6.A08
            X.1QE r1 = r3.A0L
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.8pS r1 = X.AnonymousClass8BU.A0N(r1, r2, r0)
            r0 = 0
            X.9hj r2 = X.C188629hj.A00(r0)
            r2.A0A = r9
            java.lang.String r0 = r6.A0B
            r2.A09 = r0
            X.77e r0 = r1.A07
            r2.A04 = r0
            r2.A05 = r5
            X.77e r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r2.A0C = r0
            java.lang.String r0 = r5.A0R
            r2.A0B = r0
            int r1 = r3.A00
            r0 = 8
            if (r0 == r1) goto L_0x00d4
            r0 = 1
            if (r0 == r1) goto L_0x00d4
            r0 = 4
            if (r0 == r1) goto L_0x00d4
            r0 = 9
            if (r0 == r1) goto L_0x00d4
            r0 = 7
            if (r0 == r1) goto L_0x00d4
            r0 = 3
            if (r0 == r1) goto L_0x00c6
            r0 = 6
            if (r0 != r1) goto L_0x00ce
        L_0x00c6:
            java.lang.String r0 = r3.A0A
            r5.A0V = r0
        L_0x00ca:
            X.1KN r0 = r4.A09
            r2.A02 = r0
        L_0x00ce:
            X.1wy r0 = r3.A09
            r0.A0F(r2)
            return
        L_0x00d4:
            X.9ue r0 = r5.A0H
            if (r0 == 0) goto L_0x00ee
            X.9O4 r1 = r0.A0C
            if (r1 == 0) goto L_0x00ee
            X.77e r0 = r1.A04
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r5.A0V = r0
            X.77e r0 = r1.A03
            if (r0 == 0) goto L_0x00ee
            X.1KN r0 = r1.A00()
            r2.A02 = r0
        L_0x00ee:
            X.1KN r0 = r2.A02
            if (r0 != 0) goto L_0x00ce
            goto L_0x00ca
        L_0x00f3:
            X.1QE r2 = r7.A0M
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onListKeys: "
            r1.append(r0)
            if (r9 == 0) goto L_0x0110
            java.lang.Integer r0 = X.AnonymousClass8BT.A0j(r9)
        L_0x0104:
            r1.append(r0)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            r7.A56()
            return
        L_0x0110:
            r0 = 0
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass933.Bwk(X.A7B, java.lang.String):void");
    }

    public void C0I(C20284AEs aEs) {
        this.A03 = aEs;
    }

    public /* synthetic */ boolean CLs(C20284AEs aEs, String str, int i) {
        return false;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17880vN.A0V(this.A0G).registerObserver(this.A0L);
        this.A0F = AnonymousClass8BY.A0P(this, this.A05, this.A05, this.A0D, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        C17880vN.A0V(this.A0G).unregisterObserver(this.A0L);
    }
}
