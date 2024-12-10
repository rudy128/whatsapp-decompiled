package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.Hilt_IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.91R  reason: invalid class name */
public abstract class AnonymousClass91R extends AnonymousClass92w implements BBD, BCD, BBQ, C22371B5a {
    public int A00;
    public AnonymousClass1VW A01;
    public C37451pZ A02;
    public C27201Vd A03;
    public C219217x A04;
    public AnonymousClass1CJ A05;
    public AnonymousClass1KJ A06;
    public AnonymousClass1KI A07;
    public AnonymousClass1LU A08;
    public AnonymousClass34B A09;
    public C20323AGf A0A;
    public C20110A7s A0B;
    public C33701jF A0C;
    public C175828zL A0D;
    public C175788zH A0E;
    public C187359fg A0F;
    public C190709lO A0G;
    public C177749Ak A0H;
    public A1F A0I;
    public PaymentView A0J;
    public A43 A0K;
    public C19997A2l A0L;
    public AnonymousClass4VT A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public String A0S;
    public String A0T = "";
    public String A0U;
    public String A0V;
    public String A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public C20040A4j A0e;
    public boolean A0f;
    public AnonymousClass1KN A0g;
    public String A0h;
    public final AnonymousClass1QE A0i = AnonymousClass1QE.A00("IndiaUpiPaymentActivity", "payment", "IN");
    public final C180609Nf A0j = new C175378yc(this, 4);

    public static C20112A7u A10(C20112A7u a7u, AnonymousClass91R r3) {
        boolean z = false;
        if (a7u == null) {
            a7u = C20112A7u.A01();
        }
        if (r3.A4y() && r3.A0w) {
            z = true;
        }
        a7u.A08("interop_chat_bubble_eligible", z);
        return a7u;
    }

    public void A4f(Bundle bundle) {
        this.A0J = null;
        this.A0i = null;
        super.A4f(bundle);
    }

    public View A5F(LayoutInflater layoutInflater) {
        if (this.A0j.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(2131625656, (ViewGroup) null);
        AnonymousClass8BU.A15(inflate, 2131429075, AnonymousClass3Ma.A00(this, 2130971195, 2131102531));
        return inflate;
    }

    public C62212r1 A5G(AnonymousClass1KN r5, int i) {
        C198769ys r2;
        if (i == 0 && (r2 = this.A0T.A01().A01) != null) {
            if (r5.A00.compareTo(((ARR) r2.A09.A00).A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A5S(C20284AEs aEs, ARR arr, PaymentBottomSheet paymentBottomSheet, Boolean bool) {
    }

    public void A5U(AnonymousClass8pF r18, AnonymousClass8pF r19, A7B a7b, String str, boolean z) {
        String str2;
        boolean z2;
        int i;
        boolean z3 = true;
        AnonymousClass8pF r6 = r18;
        boolean A1W = AnonymousClass000.A1W(r6);
        AnonymousClass8pF r1 = r19;
        boolean A1W2 = AnonymousClass000.A1W(r1);
        A7B a7b2 = a7b;
        C171858sO A052 = this.A0S.A05(a7b2, 21);
        if (a7b == null) {
            if (A1W) {
                i = 3;
            } else if (A1W2) {
                i = 4;
            }
            A052.A0D = Integer.valueOf(i);
        }
        C170278pb r0 = this.A0B.A08;
        if (r0 != null) {
            str2 = ((AnonymousClass8pS) r0).A0B;
        } else {
            str2 = "";
        }
        A052.A0O = str2;
        AnonymousClass1QE r2 = this.A0i;
        AnonymousClass8BX.A1D(r2, A052, "PaymentWamEvent checkpin event:", AnonymousClass000.A10());
        A052.A0b = "precheck";
        AZ6.A02(A052, this);
        if (a7b == null && r18 == null && r19 == null) {
            String str3 = str;
            if (str != null) {
                r2.A06("onPrecheck success, sending payment");
                this.A0s = str3;
                if (A1C(this)) {
                    this.A0a = true;
                    if (!this.A0Y) {
                        return;
                    }
                    if (this.A0c) {
                        Intent A0A2 = C17880vN.A0A();
                        A15(A0A2, this);
                        C72453Mb.A16(this, A0A2);
                        return;
                    }
                    Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiPaymentSettingsActivity.class);
                    A15(A072, this);
                    finish();
                    startActivity(A072);
                    return;
                }
                this.A0A.A00.A0A(new C21116Aek(this, A5c(), z), this.A05.A05);
                return;
            }
        }
        CEx();
        this.A0b = false;
        if (a7b == null) {
            if (r19 != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("onPrecheck received receiver vpa update: jid: ");
                A10.append(r1.A03);
                A10.append("vpa: ");
                A10.append(r1.A01);
                A10.append("vpaId: ");
                AnonymousClass8BV.A1E(r2, r1.A02, A10);
                this.A0J = r1.A03;
                this.A0J = r1.A01;
                this.A0i = r1.A02;
                z2 = !A5f(r1);
            } else {
                z2 = false;
            }
            if (r18 != null) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("onPrecheck received sender vpa update: jid");
                A102.append(r6.A03);
                A102.append("vpa: ");
                A102.append(r6.A01);
                A102.append("vpaId: ");
                AnonymousClass8BV.A1E(r2, r6.A02, A102);
            } else if (z2) {
                z3 = false;
            } else {
                return;
            }
            CEx();
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            int i2 = 2131893964;
            if (z3) {
                i2 = 2131894249;
            }
            A002.A0D(i2);
            C20154A9q.A00(A002, this, 33, 2131898593);
            C20154A9q.A01(A002, this, 36, 2131892908);
            A002.A0C();
            return;
        }
        int i3 = a7b2.A00;
        if (i3 == 2896004 || i3 == 2896003) {
            C20087A6p.A03(C20087A6p.A00(this.A05, (AnonymousClass1KN) null, this.A0U, (String) null, false), this.A0S, "incentive_unavailable", "payment_confirm_prompt");
            this.A01 = 7;
            A4l((String) null);
            this.A0F = false;
            this.A0B.A07(this, (DialogInterface.OnDismissListener) null, C20160A9w.A00(this, 21), (DialogInterface.OnDismissListener) null, (String) null, a7b2.A00).show();
            return;
        }
        C20040A4j a4j = this.A0e;
        C17960vV.A0C(true);
        a4j.A01(this, a7b2, new C187369fh((AnonymousClass1KN) null, this.A0F, (String) AnonymousClass8BT.A0q(this.A0H), (String) null, (String) null), "pay-precheck");
    }

    private C010105w A0y(Bundle bundle) {
        this.A0S.A0C(0, AnonymousClass8BS.A0V(), "payment_confirm_prompt", this.A0g, this.A0m, this.A0l, AnonymousClass8BT.A1X(this));
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0E(2131893221);
        C20154A9q.A00(A002, this, 35, 2131899286);
        A002.A0T(false);
        if (bundle != null) {
            A002.A0S(this.A08.A02(bundle, getString(2131893220)));
        }
        return A002.create();
    }

    public static C20112A7u A0z(AnonymousClass1KN r3, C19962A0v a0v, AnonymousClass91R r5) {
        if (C20061A5k.A02(r5.A0G) || !r5.A0W.A0o(r5.A0J)) {
            return C20087A6p.A00(r5.A05, r3, a0v, (String) null, true);
        }
        return C176058zi.A00();
    }

    public static String A11(AnonymousClass91R r2) {
        C1418477e r0;
        if (!C20061A5k.A02(r2.A0H)) {
            r0 = r2.A0H;
        } else if (r2.A08 != null && !r2.A4y()) {
            return r2.A06.A0O(r2.A08);
        } else {
            r0 = r2.A0J;
        }
        return (String) AnonymousClass8BT.A0q(r0);
    }

    public static String A12(AnonymousClass91R r4) {
        if (!TextUtils.isEmpty(r4.A0Y)) {
            AnonymousClass1QE r2 = r4.A0i;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("getSeqNum/incomingPayRequestId");
            AnonymousClass8BV.A1E(r2, r4.A0Y, A10);
            return r4.A0Y;
        } else if (!TextUtils.isEmpty(r4.A0s)) {
            AnonymousClass1QE r22 = r4.A0i;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("getSeqNum/transactionId");
            AnonymousClass8BV.A1E(r22, r4.A0s, A102);
            return r4.A0s;
        } else {
            String A012 = AXS.A01(r4);
            AnonymousClass1QE r23 = r4.A0i;
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("getSeqNum/seqNum generated:");
            AnonymousClass8BV.A1E(r23, C20088A6q.A00(A012), A103);
            return A012;
        }
    }

    private void A13() {
        if (!this.A04.A0I()) {
            this.A0V.Bix("request_phone_number_permission", this.A00);
            AnonymousClass74O.A06(this);
            return;
        }
        int A012 = this.A0L.A01();
        if (A012 == 1) {
            A3t(new C20446ALj(this, 4), 2131893724, 2131897650, 2131888080);
        } else if (A012 != 2) {
            AnonymousClass8pS r0 = (AnonymousClass8pS) this.A0B.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0A) || this.A0o) {
                this.A04.A00("pay-entry-ui");
                CNA(2131895077);
                this.A0F = true;
                if (!C18020vd.A05(C18040vf.A02, this.A0E, 10307) && A1C(this)) {
                    A14();
                    A5Z(A5G(this.A09, this.A01), false);
                    this.A0b = true;
                }
                A59(this.A0B);
                return;
            }
            BhQ(2131897651);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0E(2131893609);
            A002.A0D(2131897649);
            C20154A9q.A00(A002, this, 32, 2131897415);
            C20154A9q.A01(A002, this, 34, 2131897418);
            A002.A0T(false);
            A002.A0C();
        }
    }

    private void A14() {
        C170278pb r1 = this.A0B.A08;
        AnonymousClass1QE r2 = this.A0i;
        AnonymousClass8pS A0N2 = AnonymousClass8BU.A0N(r2, r1, "onListKeys: Cannot get IndiaUpiMethodData");
        this.A0P.A0V = A12(this);
        C170318pf r12 = this.A0P;
        r12.A0K = this.A0I;
        r12.A0T = AXS.A00(this.A0N);
        this.A0P.A0U = this.A0N.A0J();
        C1418477e r0 = this.A0J;
        if (r0 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("vpa is null, while fetching list-keys, vpaId: ");
            AnonymousClass8BV.A1E(r2, this.A0i, A10);
        } else {
            this.A0P.A0R = AnonymousClass8BS.A0h(r0);
        }
        C170318pf r22 = this.A0P;
        r22.A0O = this.A0a;
        r22.A0P = this.A0d;
        r22.A0S = this.A0i;
        r22.A05 = AnonymousClass8BS.A01(this);
        this.A0P.A0D = A0N2.A05;
    }

    public static void A15(Intent intent, AnonymousClass91R r5) {
        r5.A0P.A0M = AnonymousClass8BW.A0c(r5);
        intent.putExtra("extra_country_transaction_data", r5.A0P);
        intent.putExtra("extra_transaction_send_amount", r5.A09);
        intent.putExtra("extra_payment_method", r5.A0B);
        intent.putExtra("extra_open_transaction_confirmation_fragment", true);
        intent.putExtra("extra_interop_description", AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, r5.A0T, "interopNote"));
        intent.putExtra("extra_encrypted_interop_description", r5.A0U);
        intent.putExtra("referral_screen", r5.A0g);
        intent.putExtra("extra_receiver_vpa", r5.A0J);
        intent.putExtra("extra_payment_upi_number", r5.A0I);
        r5.A4v(intent);
    }

    public static void A16(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass91R r3, Object obj) {
        r3.A05 = (AnonymousClass1CJ) obj;
        r3.A03 = (C27201Vd) r1.A2j.get();
        r3.A01 = (AnonymousClass1VW) r1.A2d.get();
        r3.A0K = (A43) r1.AW8.get();
        r3.A04 = (C219217x) r1.ABj.get();
        r3.A07 = (AnonymousClass1KI) r1.A80.get();
        r3.A0P = C000200d.A00(r1.A87);
        r3.A0O = C000200d.A00(r1.AcC);
        r3.A0C = (C33701jF) r1.A8I.get();
        r3.A0B = r2.A8N();
        r3.A0N = C000200d.A00(r2.ACL);
        r3.A0L = r1.AHJ();
        r3.A0R = C000200d.A00(r1.AW6);
        r3.A0Q = C000200d.A00(r2.ACO);
    }

    public static void A17(C20284AEs aEs, AnonymousClass91R r4) {
        String str;
        C20284AEs aEs2 = r4.A0B;
        if (aEs2 != aEs) {
            if (C20080A6g.A02(aEs2, r4.A0t)) {
                str = "add_credential_prompt";
            } else {
                str = "available_payment_methods_prompt";
            }
            r4.A4t(63, str);
        }
        r4.A0B = aEs;
        PaymentView paymentView = r4.A0J;
        if (paymentView != null) {
            paymentView.setBankLogo(aEs.A06());
            r4.A0J.setPaymentMethodText(AnonymousClass8BR.A0c(r4.A0P).A03(r4.A0B, true));
        }
    }

    public static void A18(AW0 aw0, AnonymousClass91R r5, boolean z) {
        String str;
        Intent A072 = AnonymousClass8BR.A07(r5, IndiaUpiPaymentTransactionDetailsActivity.class);
        AnonymousClass1R2.A0E(A072, AnonymousClass205.A01(aw0.A0C, aw0.A0L, aw0.A0Q));
        A072.putExtra("extra_transaction_id", aw0.A0K);
        A072.putExtra("extra_transaction_ref", r5.A0h);
        A072.putExtra("extra_mapper_alias_resolved", r5.A0X);
        A072.putExtra("extra_receiver_platform", r5.A0S);
        if (r5.A0f) {
            A072.setFlags(33554432);
            A072.putExtra("extra_return_after_completion", true);
            str = "external_app";
        } else {
            str = r5.A0g;
        }
        A072.putExtra("referral_screen", str);
        A072.putExtra("extra_payment_flow_entry_point", r5.A01);
        if (z) {
            A072.setFlags(67108864);
        }
        A072.putExtra("extra_action_bar_display_close", true);
        r5.A3q(A072, true);
        r5.CEx();
        r5.A4o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.getStickerIfSelected() == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1A(X.AnonymousClass91R r7, boolean r8, boolean r9) {
        /*
            X.A7U r0 = r7.A0M
            java.util.HashMap r6 = r0.A06
            if (r6 != 0) goto L_0x000c
            java.lang.String r0 = "IndiaUpiPaymentActivity/sendToWhatsAppUser: CredentialBlobs is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000b:
            return
        L_0x000c:
            X.90Z r2 = r7.A0V
            java.lang.String r1 = "send_p2p"
            int r0 = r7.A00
            r2.Bix(r1, r0)
            X.90Z r3 = r7.A0V
            com.whatsapp.payments.ui.widget.PaymentView r0 = r7.A4b()
            if (r0 == 0) goto L_0x0024
            X.77d r0 = r0.getStickerIfSelected()
            r2 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            int r1 = r7.A00
            java.lang.String r0 = "is_sticker"
            r3.A06(r0, r2, r1)
            X.AEs r0 = r7.A0B
            if (r0 == 0) goto L_0x000b
            X.1QE r2 = r7.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sending payment to: "
            r1.append(r0)
            X.1BI r0 = r7.A0G
            X.AnonymousClass8BV.A1D(r2, r0, r1)
            X.8pf r5 = r7.A0P
            X.7Ik r4 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            X.A7U r2 = r7.A0M
            java.lang.String r1 = "MPIN"
            r0 = 6
            java.lang.String r1 = r2.A07(r1, r6, r0)
            java.lang.String r0 = "pin"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r4, r3, r1, r0)
            r5.A0E = r0
            X.8pf r1 = r7.A0P
            java.lang.String r0 = r7.A0a
            r1.A0O = r0
            X.77e r0 = r7.A0J
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A0R = r0
            if (r8 == 0) goto L_0x006c
            r7.A4h(r1)
        L_0x006c:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r7.A0J
            if (r0 != 0) goto L_0x0087
            java.lang.String r3 = ""
        L_0x0072:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r7.A0J
            if (r0 == 0) goto L_0x0085
            java.util.List r2 = r0.getMentionedJids()
        L_0x007a:
            X.10I r1 = r7.A05
            X.9B8 r0 = new X.9B8
            r0.<init>(r7, r3, r2, r9)
            X.C17890vO.A0u(r0, r1)
            return
        L_0x0085:
            r2 = 0
            goto L_0x007a
        L_0x0087:
            java.lang.String r3 = r0.getPaymentNote()
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91R.A1A(X.91R, boolean, boolean):void");
    }

    public static boolean A1B(AnonymousClass92s r3) {
        return r3.A0P.A0N(r3.A0E, r3.A0F);
    }

    public ConfirmPaymentFragment A5H(AnonymousClass1KN r23, AnonymousClass1KN r24, AnonymousClass1KN r25, PaymentBottomSheet paymentBottomSheet) {
        C1418377d r16;
        AEX aex;
        AnonymousClass206 r15;
        Integer num;
        C21132Af0 A012;
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        PaymentView paymentView = this.A0J;
        if (paymentView != null) {
            r16 = paymentView.getStickerIfSelected();
        } else {
            r16 = null;
        }
        if (paymentView != null) {
            aex = paymentView.getPaymentBackground();
        } else {
            aex = null;
        }
        if (r16 == null && aex == null) {
            A012 = null;
        } else {
            C62542rZ r11 = this.A0S;
            AnonymousClass1BI r13 = this.A0G;
            C17960vV.A07(r13);
            UserJid userJid = this.A0J;
            long j = this.A02;
            if (j != 0) {
                r15 = AnonymousClass1W2.A02(this.A0d, j);
            } else {
                r15 = null;
            }
            PaymentView paymentView2 = this.A0J;
            if (paymentView2 != null) {
                num = paymentView2.getStickerSendOrigin();
            } else {
                num = null;
            }
            A012 = r11.A01(aex, r13, userJid, r15, r16, num);
        }
        this.A09 = null;
        this.A0W = null;
        AnonymousClass1KJ A013 = this.A07.A01("INR");
        C19962A0v a0v = null;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A0B, (UserJid) null, (ADQ) null, this.A0t, this.A0a, !this.A0o ? 1 : 0);
        AnonymousClass1KN r6 = r25;
        if (!(r25 != null || (paymentIncentiveViewModel = this.A0X) == null || paymentIncentiveViewModel.A02.A06() == null)) {
            a0v = (C19962A0v) ((C198179xu) this.A0X.A02.A06()).A01;
        }
        AnonymousClass1KN r5 = r23;
        A002.A0G = new C20804AZh(A013, r5, r6, r24, a0v, A002, this, paymentBottomSheet);
        A002.A0H = new C20808AZl(A012, r5, a0v, A002, this);
        return A002;
    }

    public List A5I() {
        if (this instanceof IndiaUpiSendPaymentActivity) {
            throw AnonymousClass04E.createAndThrow();
        } else if (!(this instanceof AnonymousClass92s)) {
            return null;
        } else {
            AnonymousClass92s r4 = (AnonymousClass92s) this;
            List<C20251ADj> list = r4.A0F;
            if (list != null) {
                for (C20251ADj aDj : list) {
                    if (aDj.A01.equals("payment_gateway")) {
                        BDZ bdz = aDj.A00;
                        bdz.getClass();
                        return ((C20936Abq) bdz).A03;
                    }
                }
            }
            return r4.A0G;
        }
    }

    public void A5J() {
        int size = this.A0j.size();
        List list = this.A0j;
        if (size == 1) {
            AnonymousClass8pS r0 = (AnonymousClass8pS) AnonymousClass8BR.A0Q(list, 0).A08;
            if (r0 == null || C170278pb.A03(r0)) {
                if (C18020vd.A05(C18040vf.A02, this.A0P.A02, 10405)) {
                    CNh(AnonymousClass8BW.A09(this, AnonymousClass8BR.A0Q(this.A0j, 0), IndiaUpiCheckBalanceActivity.class), 1015);
                } else {
                    C194579rx r4 = new C194579rx("upi_p2p_check_balance", (String) null, (Map) null);
                    HashMap A11 = C17880vN.A11();
                    A11.put("credential_id", AnonymousClass8BR.A0Q(this.A0j, 0).A0A);
                    this.A05.A07(0, 2131895077);
                    ((C191129m4) this.A0k.get()).A00(new C20900AbG(this, 6), new C20903AbJ(this, 2), r4, "available_payment_methods_prompt", A11);
                }
            } else {
                AnonymousClass4Yv.A01(this, 29);
                return;
            }
        } else {
            Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiPaymentMethodSelectionActivity.class);
            A072.putExtra("bank_accounts", (Serializable) list);
            startActivityForResult(A072, 1015);
        }
        A4t(62, "available_payment_methods_prompt");
    }

    public void A5K() {
        if (this instanceof IndiaUpiSendPaymentActivity) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
            if (IndiaUpiSendPaymentActivity.A0x(indiaUpiSendPaymentActivity)) {
                AnonymousClass1KN r2 = indiaUpiSendPaymentActivity.A09;
                indiaUpiSendPaymentActivity.CNA(2131895077);
                C21432Ajz.A00(indiaUpiSendPaymentActivity.A05, indiaUpiSendPaymentActivity, r2, 26);
            }
        }
    }

    public void A5L() {
        AZ6 az6;
        String str;
        String str2;
        int i;
        int i2;
        C20112A7u A002 = C20087A6p.A00(this.A05, (AnonymousClass1KN) null, this.A0U, (String) null, true);
        if (this.A0X) {
            if (A002 == null) {
                A002 = C20112A7u.A02();
            }
            C20112A7u.A04(A002, this);
        }
        if (this.A0I != null) {
            if (TextUtils.isEmpty(this.A0g)) {
                this.A0g = "chat";
            }
            az6 = this.A0S;
            i2 = 53;
            str2 = this.A0g;
            i = 1;
            str = "new_payment";
        } else {
            az6 = this.A0S;
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            str2 = this.A0g;
            i = 0;
            i2 = null;
        }
        az6.BiM(A002, i2, str, str2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r3 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5M() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 == 0) goto L_0x001f
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_receiver_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A03(r0)
            r7.A0F = r1
            X.1Nf r0 = r7.A06
            X.1E7 r0 = r0.A01(r1)
            r7.A08 = r0
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity
            if (r0 == 0) goto L_0x0045
            r2 = r7
            X.92s r2 = (X.AnonymousClass92s) r2
            X.205 r0 = r2.A07
            X.1BI r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            r2.A0F = r0
            if (r0 == 0) goto L_0x0043
            boolean r0 = r2.A4y()
            if (r0 != 0) goto L_0x0043
            X.1Nf r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r2.A0F
            X.1E7 r0 = r1.A01(r0)
        L_0x0040:
            r2.A08 = r0
            return
        L_0x0043:
            r0 = 0
            goto L_0x0040
        L_0x0045:
            X.1BI r0 = r7.A0G
            if (r0 != 0) goto L_0x0069
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            r7.A0G = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_receiver_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            r7.A0J = r0
        L_0x0069:
            X.1BI r1 = r7.A0G
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.jid.UserJid r0 = r7.A0J
        L_0x0073:
            r7.A0F = r0
            boolean r3 = r7.A5c()
            X.1QO r2 = r7.A0P
            com.whatsapp.jid.UserJid r1 = r7.A0H
            java.lang.String r0 = r7.A0g
            boolean r0 = r2.A0K(r1, r0)
            if (r0 == 0) goto L_0x0088
            r0 = 1
            if (r3 == 0) goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            r6 = 1
            if (r0 == 0) goto L_0x00a0
            X.1CJ r1 = r7.A05
            com.whatsapp.jid.UserJid r0 = r7.A0H
            X.1BI r0 = X.C22971Dz.A00(r0)
            boolean r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x00a0
            r7.A0w = r6
            com.whatsapp.jid.UserJid r0 = r7.A0H
            r7.A0F = r0
        L_0x00a0:
            boolean r0 = r7.A4y()
            if (r0 == 0) goto L_0x00dd
            r4 = 0
        L_0x00a7:
            r7.A08 = r4
            com.whatsapp.payments.ui.widget.PaymentView r3 = r7.A0J
            if (r3 == 0) goto L_0x001e
            X.77e r0 = r7.A0H
            java.lang.Object r5 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L_0x00eb
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r5 = r7.BXz()
        L_0x00c1:
            boolean r2 = r7.A5d()
            r3.A18 = r5
            android.widget.TextSwitcher r0 = r3.A0E
            r0.setText(r5)
            android.widget.ImageView r1 = r3.A06
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
            X.1pZ r1 = r3.A0S
            com.whatsapp.components.button.ThumbnailButton r0 = r3.A0Q
            r1.A07(r0, r4)
            return
        L_0x00dd:
            X.1Nf r1 = r7.A06
            com.whatsapp.jid.UserJid r0 = r7.A0F
            X.1E7 r4 = r1.A01(r0)
            goto L_0x00a7
        L_0x00e6:
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r1)
            goto L_0x0073
        L_0x00eb:
            r2 = 2131894028(0x7f121f0c, float:1.942285E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.77e r0 = r7.A0J
            java.lang.Object r0 = r0.A00
            X.C17960vV.A07(r0)
            java.lang.String r1 = X.C108975cc.A0b(r7, r0, r1, r2)
            com.whatsapp.payments.ui.widget.PaymentView r4 = r7.A0J
            boolean r3 = r7.A5d()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0130
            r4.A18 = r5
            android.widget.TextView r0 = r4.A0F
            r0.setText(r1)
        L_0x010e:
            android.widget.TextSwitcher r2 = r4.A0E
            r1 = 2131894027(0x7f121f0b, float:1.9422847E38)
            java.lang.String r0 = r4.A18
            android.text.SpannableStringBuilder r0 = com.whatsapp.payments.ui.widget.PaymentView.A00(r4, r0, r1)
            r2.setText(r0)
            android.widget.ImageView r1 = r4.A06
            int r0 = X.C72453Mb.A07(r3)
            r1.setVisibility(r0)
            X.1VW r2 = r4.A0R
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A0Q
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r2.A09(r1, r0)
            return
        L_0x0130:
            r4.A18 = r1
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91R.A5M():void");
    }

    public void A5N(Context context) {
        if (this.A0O.A0A(AXS.A02(this))) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C20813AZq(context, this, paymentBottomSheet));
            CMk(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
            return;
        }
        A5O(context, (String) null, false);
    }

    public /* synthetic */ void A5P(Fragment fragment) {
        if (((this instanceof IndiaWebViewUpiP2mHybridActivity) || (this instanceof IndiaUpiQuickBuyActivity)) && (fragment instanceof PaymentBottomSheet)) {
            ((PaymentBottomSheet) fragment).A01 = null;
        }
    }

    public /* synthetic */ void A5Q(Fragment fragment) {
        PaymentBottomSheet paymentBottomSheet;
        A9Q a9q;
        if (this instanceof IndiaWebViewUpiP2mHybridActivity) {
            if (fragment instanceof PaymentBottomSheet) {
                paymentBottomSheet = (PaymentBottomSheet) fragment;
                paymentBottomSheet.A01 = C20160A9w.A00(this, 27);
                a9q = new A9Q(this, 26);
            } else {
                return;
            }
        } else if (this instanceof IndiaUpiQuickBuyActivity) {
            AnonymousClass92s r2 = (AnonymousClass92s) this;
            if (fragment instanceof PaymentBottomSheet) {
                paymentBottomSheet = (PaymentBottomSheet) fragment;
                if (!AnonymousClass8BT.A1X(r2) || r2.A0I) {
                    r2.A5p(false);
                    paymentBottomSheet.A01 = C20160A9w.A00(r2, 26);
                    return;
                }
                paymentBottomSheet.A01 = C20160A9w.A00(r2, 25);
                a9q = new A9Q(r2, 25);
            } else {
                return;
            }
        } else {
            return;
        }
        paymentBottomSheet.A00 = a9q;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [androidx.fragment.app.Fragment, com.whatsapp.payments.ui.Hilt_IndiaUpiForgotPinDialogFragment, com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment] */
    public void A5R(AnonymousClass1KN r14) {
        int i;
        this.A0V.Bix("confirm_payment", this.A00);
        this.A09 = r14;
        C20112A7u A0z = A0z(r14, this.A0U, this);
        if ("p2m".equals(this.A0t)) {
            A0z = this.A0S.A08(this.A0B, A0z);
            i = 4;
        } else {
            i = 47;
        }
        if (this.A0X) {
            if (A0z == null) {
                A0z = C20112A7u.A02();
            }
            C20112A7u.A04(A0z, this);
        }
        C171858sO A062 = this.A0S.A06(A10(A0z, this), 1, Integer.valueOf(i), "payment_confirm_prompt", this.A0g, this.A0m, this.A0l, false);
        A062.A06 = Boolean.valueOf("p2m".equals(this.A0t));
        A062.A00 = true;
        A062.A01 = true;
        AZ6.A02(A062, this);
        AnonymousClass8pS r6 = (AnonymousClass8pS) this.A0B.A08;
        String[] split = this.A0Q.A03().getString("payments_sent_payment_with_account", "").split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (split[i2].equalsIgnoreCase(this.A0B.A0A)) {
                this.A0Z = true;
                break;
            } else {
                i2++;
            }
        }
        if (r6 == null || !Boolean.TRUE.equals(r6.A04.A00) || this.A0Z) {
            A13();
            return;
        }
        C20284AEs aEs = this.A0B;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelable("extra_bank_account", aEs);
        ? hilt_IndiaUpiForgotPinDialogFragment = new Hilt_IndiaUpiForgotPinDialogFragment();
        hilt_IndiaUpiForgotPinDialogFragment.A1R(A0D2);
        hilt_IndiaUpiForgotPinDialogFragment.A07 = this;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = hilt_IndiaUpiForgotPinDialogFragment;
        CMk(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
        A5Q(paymentBottomSheet);
    }

    public void A5T(ARR arr) {
        if (!(this instanceof IndiaUpiSendPaymentActivity) && !(this instanceof IndiaUpiInterOpHybridActivity) && !(this instanceof IndiaWebViewUpiP2mHybridActivity)) {
            AnonymousClass92s r2 = (AnonymousClass92s) this;
            if (r2.A0F != null && r2.A0C != null && !A1B(r2)) {
                C21432Ajz.A00(r2.A05, r2, arr, 17);
            }
        }
    }

    public void A5W(A7B a7b) {
        this.A0V.A05("network_op_error_code", (long) this.A04.A00, this.A00);
        AnonymousClass90Z r5 = this.A0V;
        int i = this.A00;
        r5.A05("error_code", (long) a7b.A00, i);
        r5.A02(i, 3);
        CEx();
        C19967A1c A022 = this.A01.A02(this.A04, 0);
        if (A022.A00 == 2131893805 && A5c()) {
            A022.A00 = 2131893804;
        }
        A5a(A022, String.valueOf(a7b.A00), new Object[0]);
    }

    public void A5X(C20112A7u a7u, String str, int i) {
        C171858sO A062 = this.A0S.A06(a7u, 1, Integer.valueOf(i), str, this.A0g, this.A0m, this.A0l, false);
        A062.A06 = Boolean.valueOf(AnonymousClass8BT.A1X(this));
        A062.A00 = true;
        A062.A01 = true;
        AZ6.A02(A062, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4.A00(X.AnonymousClass11P.A00(r3.A05)) != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5Y(X.C19962A0v r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.A4y()
            if (r0 != 0) goto L_0x0018
            int r2 = r4.A00
        L_0x000a:
            r3.A01 = r2
            r3.A0U = r4
        L_0x000e:
            X.9ys r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A0F
        L_0x0014:
            r3.A4l(r0)
            return
        L_0x0018:
            java.lang.String r0 = r3.A0Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            X.11P r0 = r3.A05
            long r0 = X.AnonymousClass11P.A00(r0)
            int r1 = r4.A00(r0)
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x000a
        L_0x002e:
            r0 = 6
            r3.A01 = r0
            if (r4 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91R.A5Y(X.A0v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0Y) != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5Z(X.C62212r1 r38, boolean r39) {
        /*
            r37 = this;
            r0 = r37
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity
            r16 = r38
            if (r1 == 0) goto L_0x0049
            boolean r1 = r0.A4y()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r0.A0Y
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r30 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r30 = 0
        L_0x001a:
            java.lang.String r2 = r0.A0T
            X.9fg r1 = r0.A0F
            java.lang.String r1 = X.AnonymousClass9R9.A00(r1, r2)
            r0.A0U = r1
            if (r39 != 0) goto L_0x0095
            if (r38 != 0) goto L_0x0095
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r4 = r0.A0X
            if (r4 == 0) goto L_0x0095
            X.1ig r1 = r4.A06
            X.9ys r3 = r1.A02()
            X.A03 r2 = r1.A03()
            X.9uQ r1 = r4.A04
            boolean r1 = r1.A03(r3, r2)
            if (r1 == 0) goto L_0x0095
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = r0.A0X
            com.whatsapp.jid.UserJid r2 = r0.A0F
            X.10I r1 = r3.A07
            r0 = 3
            X.C21433Ak0.A00(r1, r3, r2, r0)
        L_0x0048:
            return
        L_0x0049:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity
            if (r1 != 0) goto L_0x0048
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r1 == 0) goto L_0x00d5
            X.92s r0 = (X.AnonymousClass92s) r0
            X.AEP r1 = r0.A0U
            r4 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r1.A00
        L_0x005a:
            X.9lO r9 = r0.A0G
            X.AEs r11 = r0.A0B
            X.C17960vV.A07(r11)
            com.whatsapp.jid.UserJid r13 = r0.A0F
            X.1KN r10 = r0.A09
            java.lang.String r7 = r0.A0t
            X.8pf r15 = r0.A0P
            java.lang.String r6 = r0.A0C
            long r1 = r0.A00
            java.lang.String r5 = r0.A0m
            java.lang.String r3 = r0.A0D
            X.77e r14 = r0.A0H
            r30 = 0
            X.AES r12 = r0.A01
            r28 = 1
            r19 = 0
            r23 = r19
            r25 = r19
            r20 = r19
            r24 = r4
            r26 = r1
            r29 = r28
            r31 = r30
            r21 = r5
            r22 = r3
            r17 = r7
            r18 = r6
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            return
        L_0x0095:
            X.AEP r1 = r0.A0U
            if (r1 == 0) goto L_0x00d3
            java.lang.String r3 = r1.A00
        L_0x009b:
            X.9lO r9 = r0.A0G
            X.AEs r11 = r0.A0B
            X.C17960vV.A07(r11)
            com.whatsapp.jid.UserJid r13 = r0.A0F
            X.1KN r10 = r0.A09
            java.lang.String r4 = r0.A0t
            boolean r2 = r0.A0x
            boolean r1 = r0.A0z
            X.8pf r15 = r0.A0P
            X.77e r14 = r0.A0H
            java.lang.String r0 = r0.A0U
            boolean r31 = X.C20063A5m.A01(r11)
            r12 = 0
            r26 = 0
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r25 = r12
            r18 = r12
            r24 = r3
            r28 = r2
            r29 = r1
            r23 = r0
            r17 = r4
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            return
        L_0x00d3:
            r3 = 0
            goto L_0x009b
        L_0x00d5:
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.AEP r1 = r0.A0U
            r10 = 0
            if (r1 == 0) goto L_0x0196
            java.lang.String r1 = r1.A00
            r17 = r1
        L_0x00e0:
            boolean r1 = A1B(r0)
            if (r1 == 0) goto L_0x00fd
            X.8pf r6 = r0.A0P
            X.AEo r1 = r6.A02
            X.C17960vV.A07(r1)
            java.lang.String r5 = r0.A0A
            X.C17960vV.A07(r5)
            java.lang.String r4 = r1.A02
            long r2 = r1.A00
            X.AEo r1 = new X.AEo
            r1.<init>(r2, r5, r4)
            r6.A02 = r1
        L_0x00fd:
            X.9lO r1 = r0.A0G
            r36 = r1
            X.AEs r15 = r0.A0B
            X.C17960vV.A07(r15)
            com.whatsapp.jid.UserJid r13 = r0.A0F
            X.1KN r12 = r0.A09
            java.lang.String r11 = r0.A0t
            X.8pf r9 = r0.A0P
            java.lang.Integer r1 = r0.A5r()
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            if (r1 != r3) goto L_0x0180
            boolean r1 = A1B(r0)
        L_0x011a:
            if (r1 == 0) goto L_0x0191
            java.lang.String r8 = r0.A0A
        L_0x011e:
            java.lang.Integer r1 = r0.A5r()
            if (r1 != r3) goto L_0x016f
            boolean r1 = A1B(r0)
        L_0x0128:
            if (r1 == 0) goto L_0x012e
            X.Aa6 r1 = r0.A09
            java.lang.String r10 = r1.A0B
        L_0x012e:
            X.Aa6 r3 = r0.A09
            java.lang.String r7 = r3.A09
            long r1 = r3.A00
            java.lang.String r6 = r0.A0m
            java.lang.String r5 = r3.A0C
            java.util.List r4 = r0.A0G
            X.77e r3 = r0.A0H
            X.AEs r14 = r0.A0B
            boolean r35 = X.C20063A5m.A01(r14)
            X.AES r0 = r0.A01
            r32 = 1
            r34 = 0
            r27 = 0
            r20 = r16
            r21 = r11
            r22 = r8
            r23 = r10
            r24 = r7
            r25 = r6
            r26 = r5
            r28 = r17
            r29 = r4
            r30 = r1
            r33 = r32
            r16 = r0
            r17 = r13
            r18 = r3
            r19 = r9
            r13 = r36
            r14 = r12
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35)
            return
        L_0x016f:
            java.lang.Integer r2 = r0.A5r()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r2 != r1) goto L_0x012e
            X.1QO r2 = r0.A0P
            java.util.List r1 = r0.A0F
            boolean r1 = r2.A0P(r1)
            goto L_0x0128
        L_0x0180:
            java.lang.Integer r2 = r0.A5r()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r2 != r1) goto L_0x0191
            X.1QO r2 = r0.A0P
            java.util.List r1 = r0.A0F
            boolean r1 = r2.A0P(r1)
            goto L_0x011a
        L_0x0191:
            X.Aa6 r1 = r0.A09
            java.lang.String r8 = r1.A0B
            goto L_0x011e
        L_0x0196:
            r17 = r10
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91R.A5Z(X.2r1, boolean):void");
    }

    public boolean A5c() {
        PaymentView paymentView = this.A0J;
        if (paymentView == null || paymentView.A00 != 1) {
            return false;
        }
        return true;
    }

    public boolean A5e(C20284AEs aEs, String str) {
        if (C20080A6g.A02(aEs, this.A0t) || this.A0O.A09(aEs, str, A5c(), this.A0x)) {
            return true;
        }
        return false;
    }

    public boolean A5f(AnonymousClass8pF r16) {
        AnonymousClass8pF r2 = r16;
        if (!r2.A03 || r2.A04) {
            return false;
        }
        CEx();
        if (!r2.A05) {
            AnonymousClass4Yv.A01(this, 15);
            return true;
        } else if (!AnonymousClass8BR.A1P(this)) {
            Intent A042 = AnonymousClass8BS.A04(this);
            A042.putExtra("extra_setup_mode", 1);
            Jid jid = this.A0G;
            if (jid == null && (jid = r2.A03) == null) {
                Log.e("showNodalDisallowAlert, jid and contactData.jid is null");
            } else {
                AnonymousClass3MY.A12(A042, jid, "extra_jid");
            }
            int i = 3;
            if ("payment_composer_icon".equals(this.A0g)) {
                i = 10;
            }
            A042.putExtra("extra_payments_entry_type", i);
            A042.putExtra("extra_is_first_payment_method", true);
            A042.putExtra("extra_skip_value_props_display", false);
            A042.putExtra("extra_receiver_jid", C22971Dz.A06(this.A0F));
            C60442o2.A00(A042, this.A05, "composer");
            A3q(A042, true);
            return true;
        } else {
            C21447AkE A002 = C21447AkE.A00(this, 35);
            A1K a1k = new A1K(this, this, this.A05, this.A09, this.A0Q, (AnonymousClass8FO) AnonymousClass3MW.A0N(this).A00(AnonymousClass8FO.class), (Runnable) null, A002, true, false);
            if (TextUtils.isEmpty(this.A0g)) {
                this.A0g = "chat";
            }
            a1k.A01(this.A0F, (C22376B5f) null, this.A0g);
            return true;
        }
    }

    public void BpA() {
        A41("IndiaUpiPinPrimerDialogFragment");
    }

    public void Buw() {
        A41("IndiaUpiForgotPinDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwk(X.A7B r17, java.lang.String r18) {
        /*
            r16 = this;
            r4 = r16
            X.AZ6 r2 = r4.A0S
            r1 = 1
            X.AEs r0 = r4.A0B
            r3 = r17
            r2.A09(r0, r3, r1)
            r7 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r14 = 0
            if (r0 != 0) goto L_0x0073
            X.1QE r2 = r4.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "starting sendPaymentToVpa for jid: "
            r1.append(r0)
            X.1BI r0 = r4.A0G
            r1.append(r0)
            java.lang.String r0 = " vpa: "
            r1.append(r0)
            X.77e r0 = r4.A0J
            X.AnonymousClass8BV.A1D(r2, r0, r1)
            X.AEs r0 = r4.A0B
            X.8pb r1 = r0.A08
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.8pS r2 = X.AnonymousClass8BU.A0N(r2, r1, r0)
            r4.A14()
            X.9ui r1 = r4.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.AEs r0 = r4.A0B
            java.lang.String r8 = r0.A0B
            X.77e r6 = r2.A07
            X.8pf r1 = r4.A0P
            X.1KN r5 = r4.A09
            java.lang.Object r12 = X.C20284AEs.A02(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = A11(r4)
            X.1E7 r0 = r4.A08
            if (r0 == 0) goto L_0x005f
            java.lang.String r14 = X.AnonymousClass17K.A02(r0)
        L_0x005f:
            java.lang.String r0 = r4.A0Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 6
            if (r0 != 0) goto L_0x0069
            r15 = 5
        L_0x0069:
            java.lang.String r9 = r1.A0T
            java.lang.String r10 = r1.A0R
            java.lang.String r11 = r1.A0V
            r4.A58(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0072:
            return
        L_0x0073:
            if (r17 == 0) goto L_0x0072
            int r2 = r3.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C20752AXh.A01(r4, r1, r2, r0)
            if (r0 != 0) goto L_0x0072
            X.9ui r0 = r4.A04
            boolean r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x0091
            X.AnonymousClass91U.A1b(r4)
            X.AEs r0 = r4.A0B
            r4.A59(r0)
            return
        L_0x0091:
            X.1QE r2 = r4.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onListKeys: "
            r1.append(r0)
            if (r18 == 0) goto L_0x00a2
            java.lang.Integer r14 = X.AnonymousClass8BT.A0j(r7)
        L_0x00a2:
            r1.append(r14)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            r4.A5W(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91R.Bwk(X.A7B, java.lang.String):void");
    }

    public void C5K(A7B a7b) {
        throw new UnsupportedOperationException(this.A0i.A03("onSetPin unsupported"));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 155) {
            if (i == 1000) {
                HashMap hashMap = this.A0M.A06;
                if (i2 != -1 || hashMap == null) {
                    this.A0i.A0A("REQUEST_TOS_UPDATED but found null credentialBlobs", (Throwable) null);
                } else {
                    CEx();
                    CNA(2131895077);
                    A5Z(A5G(this.A09, this.A01), false);
                    return;
                }
            } else if (i != 1001) {
                switch (i) {
                    case 1016:
                        if (i2 == -1 && intent != null) {
                            C20284AEs aEs = (C20284AEs) intent.getParcelableExtra("extra_bank_account");
                            if (aEs != null) {
                                this.A0B = aEs;
                            }
                            AnonymousClass1QD r3 = this.A0Q;
                            StringBuilder A0f2 = AnonymousClass8BX.A0f(r3);
                            A0f2.append(";");
                            r3.A0M(AnonymousClass000.A0y(this.A0B.A0A, A0f2));
                            C20284AEs aEs2 = this.A0B;
                            Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiPinSetUpCompletedActivity.class);
                            A072.putExtra("extra_bank_account", aEs2);
                            A072.putExtra("on_settings_page", false);
                            startActivity(A072);
                            return;
                        }
                        return;
                    case 1017:
                        if (i2 == -1) {
                            AnonymousClass1QD r32 = this.A0Q;
                            StringBuilder A0f3 = AnonymousClass8BX.A0f(r32);
                            A0f3.append(";");
                            r32.A0M(AnonymousClass000.A0y(this.A0B.A0A, A0f3));
                            Intent A092 = AnonymousClass8BW.A09(this, this.A0B, IndiaUpiPinSetUpCompletedActivity.class);
                            A092.putExtra("on_settings_page", false);
                            startActivityForResult(A092, 1018);
                            return;
                        }
                        return;
                    case 1018:
                        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                        paymentBottomSheet.A02 = A5H(this.A09, (AnonymousClass1KN) null, this.A0g, paymentBottomSheet);
                        CMk(paymentBottomSheet, String.valueOf(30));
                        return;
                    default:
                        super.onActivityResult(i, i2, intent);
                        return;
                }
            } else if (i2 == -1) {
                this.A0J = C22941Dw.A02(intent.getStringExtra("extra_receiver_jid"));
                return;
            } else if (!(i2 == 0 && this.A0J == null)) {
                return;
            }
            A4o();
            finish();
        } else if (i2 == -1) {
            A13();
        }
    }

    public void onBackPressed() {
        String str;
        PaymentView paymentView = this.A0J;
        if (paymentView != null && paymentView.A0J()) {
            return;
        }
        if (!C22971Dz.A0e(this.A0G) || this.A00 != 0) {
            A4o();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A5X(C20087A6p.A00(this.A05, (AnonymousClass1KN) null, this.A0U, (String) null, true), str, 1);
            return;
        }
        this.A0J = null;
        A4f((Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        C17880vN.A0V(this.A0O).registerObserver(this.A0j);
        this.A02 = this.A03.A06(this, "india-upi-payment-activity");
        this.A0f = AnonymousClass3MY.A1a(getIntent(), "return-after-pay");
        this.A06 = this.A07.A01("INR");
        C18030ve r6 = this.A0E;
        AnonymousClass1KB r5 = this.A05;
        AnonymousClass1L9 r12 = this.A01;
        AnonymousClass11C r3 = this.A08;
        AnonymousClass1VW r2 = this.A01;
        AnonymousClass1VW r14 = r2;
        this.A0I = new A1F(r12, r5, r14, this.A06, r3, this.A00, r6);
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(this);
        C30931ek r4 = this.A0A;
        A0B a0b = this.A09;
        A7U a7u = this.A0M;
        C31061ex r16 = this.A0N;
        A7U a7u2 = a7u;
        C18030ve r122 = r6;
        AnonymousClass1KB r11 = r5;
        this.A0D = new C175828zL(this, r11, r122, A0M2, a7u2, AnonymousClass8BT.A0S(this), r16, a0b, r4);
        C18030ve r15 = this.A0E;
        AnonymousClass1KB r142 = this.A05;
        AnonymousClass190 r13 = this.A03;
        AnonymousClass11S r123 = this.A02;
        AnonymousClass10I r112 = this.A05;
        AnonymousClass1QS r9 = this.A0Q;
        C30931ek r8 = this.A0A;
        C24751Ln r7 = this.A09;
        A7U a7u3 = this.A0M;
        C31061ex r52 = this.A0N;
        AnonymousClass1KI r42 = this.A07;
        C33351ig r32 = this.A0T;
        C33711jG A0S2 = AnonymousClass8BT.A0S(this);
        A7U a7u4 = a7u3;
        C18030ve r19 = r15;
        AnonymousClass1KI r18 = r42;
        C24751Ln r17 = r7;
        AnonymousClass11S r152 = r123;
        this.A0G = new C190709lO(new C175728zB(this, r13, r142, r152, this.A05, r17, r18, r19, a7u4, this.A0N, A0S2, r52, r9, r32, this.A0V, r8, r112), new C189609jW(this), C21447AkE.A00(this, 36));
        C199410f r0 = C20040A4j.A0E;
        AnonymousClass10I r124 = this.A05;
        C24921Me r113 = this.A06;
        C18000vb r92 = this.A00;
        AnonymousClass1QE r82 = this.A0i;
        C31061ex r72 = this.A0N;
        AnonymousClass1QJ r62 = this.A0O;
        C195859u1 r53 = this.A05;
        A27 a27 = this.A08;
        AnonymousClass1QR r33 = this.A07;
        AnonymousClass10I r23 = r124;
        C195859u1 r182 = r53;
        AnonymousClass1QJ r172 = r62;
        C31061ex r162 = r72;
        AnonymousClass1QR r153 = r33;
        C25181Nf r143 = this.A06;
        C18000vb r132 = r92;
        C24921Me r125 = r113;
        this.A0e = new C20040A4j(r125, r132, r143, r153, r162, r172, r182, a27, r82, this, new AnonymousClass9YR(this), r23);
        this.A0g = AnonymousClass8BV.A0o(this);
        this.A0c = AnonymousClass3MY.A1a(getIntent(), "extra_return_result_and_finish_on_send_money_complete");
        AnonymousClass10I r43 = this.A05;
        AnonymousClass1QS r34 = this.A0Q;
        this.A0A = new C20323AGf(this.A0K, this.A0Q, r34, r43);
        getLifecycle().A05(this.A0A);
        this.A0M = AnonymousClass8BY.A0P(this, this.A05, this.A05, this.A0D, this.A05);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 33) {
            return A0y(bundle);
        }
        return super.onCreateDialog(i, bundle);
    }

    public static void A19(A7B a7b, AnonymousClass91R r4, boolean z) {
        r4.CEx();
        if (a7b == null) {
            r4.A4o();
            r4.A05.CGF(new C70813Cp(23, (Object) r4, z));
        } else if (!C20752AXh.A01(r4, "upi-send-to-vpa", a7b.A00, false)) {
            r4.A5W(a7b);
        }
    }

    public static boolean A1C(AnonymousClass91R r3) {
        if (r3.getIntent().getBooleanExtra("extra_disable_transaction_confirmation_fragment", false)) {
            return false;
        }
        return ((C19954A0l) r3.A0Q.get()).A01(AnonymousClass8BV.A0o(r3), r3.A4y());
    }

    public void A3h(int i) {
        if (i != 2131894016 && i != 2131893799) {
            A4o();
            finish();
        }
    }

    public void A5O(Context context, String str, boolean z) {
        String str2;
        Intent A042 = AnonymousClass8BS.A04(context);
        A042.putExtra("extra_setup_mode", 1);
        if (context instanceof IndiaUpiCheckOrderDetailsActivity) {
            A042.putExtra("extra_payments_entry_type", 11);
            A042.putExtra("extra_order_type", this.A0m);
            A042.putExtra("extra_payment_config_id", this.A0l);
        } else if (context instanceof IndiaUpiInterOpHybridActivity) {
            A4v(A042);
            A042.putExtra("extra_is_interop_add_payment_method", true);
            A042.putExtra("extra_skip_value_props_display", z);
        } else {
            A042.putExtra("extra_payments_entry_type", 6);
        }
        A042.putExtra("extra_is_first_payment_method", !AnonymousClass8BR.A1P(this));
        A042.putExtra("extra_skip_value_props_display", z);
        C1418477e r1 = this.A0G;
        if (r1 != null) {
            A042.putExtra("extra_order_formatted_discount_amount", r1);
        }
        UserJid userJid = this.A0J;
        if (userJid != null) {
            A042.putExtra("extra_receiver_jid", userJid.getRawString());
        }
        A042.putExtra("referral_screen", this.A0g);
        if (C20063A5m.A03(str)) {
            A042.putExtra("extra_payment_method_type", str);
            if ("CREDIT".equals(str)) {
                str2 = "add_credit_card";
            } else {
                str2 = "add_credit_line";
            }
            A042.putExtra("extra_referral_screen", str2);
        }
        C60442o2.A00(A042, this.A05, "payViewAddPayment");
        startActivityForResult(A042, 1008);
    }

    public void A5V(A7B a7b) {
        CEx();
        if (a7b == null) {
            A4o();
            C21447AkE.A01(this.A05, this, 34);
            return;
        }
        C20040A4j a4j = this.A0e;
        String str = this.A0s;
        C17960vV.A0C(true);
        a4j.A01(this, a7b, new C187369fh(this.A09, (UserJid) null, (String) null, str, (String) this.A0J.A00), "upi-accept-collect");
    }

    public void A5a(C19967A1c a1c, String str, Object... objArr) {
        String str2;
        CEx();
        C20112A7u A002 = C20087A6p.A00(this.A05, (AnonymousClass1KN) null, this.A0U, (String) null, true);
        if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            str2 = "order_details";
        } else {
            str2 = "new_payment";
        }
        AZ6 az6 = this.A0S;
        String str3 = this.A0g;
        Integer A0V2 = AnonymousClass8BS.A0V();
        C20087A6p.A02(A002, az6, A0V2, str2, str3, 4);
        C171858sO A072 = this.A0S.A07(4, A0V2, str2, this.A0g);
        A072.A0S = str;
        AZ6.A02(A072, this);
        this.A0F = false;
        int i = a1c.A00;
        if (i == 0) {
            i = 2131894172;
            a1c.A00 = 2131894172;
        } else if (i == 2131893962 || i == 2131893959 || i == 2131893958 || i == 2131893960 || i == 2131893961) {
            objArr = new Object[]{BXz()};
        }
        BhU(objArr, 0, i);
    }

    public void A5b(String str) {
        Intent A072 = AnonymousClass1LU.A07(this);
        A072.putExtra("extra_payments_entry_type", 6);
        A072.putExtra("extra_is_first_payment_method", !AnonymousClass8BR.A1P(this));
        A072.putExtra("extra_skip_value_props_display", AnonymousClass8BR.A1P(this));
        if ("CREDIT".equals(str)) {
            A072.putExtra("extra_referral_screen", "add_credit_card");
            A072.putExtra("extra_payment_method_type", str);
        }
        startActivityForResult(A072, 1008);
    }

    public boolean A5d() {
        PaymentView paymentView;
        if (!AnonymousClass8BR.A1P(this) || (paymentView = this.A0J) == null || paymentView.A00 == 1 || (this instanceof AnonymousClass92s) || !(!A4y())) {
            return false;
        }
        return true;
    }

    public void BqB() {
        A5P(getSupportFragmentManager().A0Q("IndiaUpiPinPrimerDialogFragment"));
        A41("IndiaUpiPinPrimerDialogFragment");
        Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiDebitCardVerificationActivity.class);
        A072.putExtra("extra_bank_account", this.A0B);
        A4v(A072);
        A072.putExtra("extra_previous_screen", "setup_pin_prompt");
        startActivityForResult(A072, 1016);
    }

    public void BqE() {
        A5P(getSupportFragmentManager().A0Q("IndiaUpiForgotPinDialogFragment"));
        A41("IndiaUpiForgotPinDialogFragment");
        AnonymousClass1QD r2 = this.A0Q;
        StringBuilder A0f2 = AnonymousClass8BX.A0f(r2);
        A0f2.append(";");
        r2.A0M(AnonymousClass000.A0y(this.A0B.A0A, A0f2));
        this.A0Z = true;
        A13();
    }

    public void Buv() {
        A5P(getSupportFragmentManager().A0Q("IndiaUpiForgotPinDialogFragment"));
        A41("IndiaUpiForgotPinDialogFragment");
        Intent A032 = IndiaUpiPinPrimerFullSheetActivity.A03(this, (AnonymousClass8pN) this.A0B, this.A0b, true);
        A4v(A032);
        startActivityForResult(A032, 1017);
    }

    public void onDestroy() {
        super.onDestroy();
        C17890vO.A0t(this.A0H);
        this.A02.A02();
        C17880vN.A0V(this.A0O).unregisterObserver(this.A0j);
        AnonymousClass1QE r2 = this.A0i;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onDestroy states: ");
        AnonymousClass8BV.A1D(r2, this.A04, A10);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0i.A06("action bar home");
        if (!C22971Dz.A0e(this.A0G) || this.A00 != 0) {
            A4o();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A4t(1, str);
            return true;
        }
        this.A0J = null;
        A4f((Bundle) null);
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0B = (C20284AEs) bundle.getParcelable("paymentMethodSavedInst");
        String string = bundle.getString("extra_jid");
        C22941Dw r1 = UserJid.Companion;
        this.A0G = r1.A04(string);
        this.A0J = r1.A04(bundle.getString("extra_receiver_jid"));
        this.A0F = bundle.getBoolean("sending_payment");
        this.A0Y = bundle.getString("extra_incoming_pay_request_id");
        this.A01 = bundle.getInt("extra_offer_eligibility_state");
        if (this.A0B != null) {
            this.A0B.A08 = (C170278pb) bundle.getParcelable("countryDataSavedInst");
        }
        C170318pf r0 = (C170318pf) bundle.getParcelable("countryTransDataSavedInst");
        if (r0 != null) {
            this.A0P = r0;
        }
        String string2 = bundle.getString("sendAmountSavedInst");
        if (string2 != null) {
            this.A09 = AnonymousClass8BT.A0H(this.A06, string2);
        }
        AnonymousClass1KN r02 = (AnonymousClass1KN) bundle.getParcelable("ExchangeAmountSavedInst");
        if (r02 != null) {
            this.A0g = r02;
        }
        this.A02 = bundle.getLong("quotedMessageRowIdSavedInst");
        this.A0n = bundle.getString("paymentNoteSavedInst");
        this.A0u = AnonymousClass4aJ.A03(bundle.getString("paymentNoteMentionsSavedInst"));
        this.A0J = (C1418477e) bundle.getParcelable("receiverVpaSavedInst");
        this.A0i = bundle.getString("receiverVpaIdSavedInst");
        this.A0W = bundle.getString("paymentStickerMediaJobIdSavedInst");
        PaymentView paymentView = this.A0J;
        if (paymentView != null) {
            paymentView.A1C = bundle.getString("extra_payment_preset_amount");
        } else {
            this.A0h = bundle.getString("restoredPaymentAmount");
        }
        this.A00 = bundle.getInt("flowInstanceKey");
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1QE r2 = this.A0i;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onResume states: ");
        AnonymousClass8BV.A1D(r2, this.A04, A10);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C170278pb r1;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", C22971Dz.A06(this.A0G));
        bundle.putString("extra_receiver_jid", C22971Dz.A06(this.A0J));
        bundle.putBoolean("sending_payment", this.A0F);
        bundle.putString("extra_incoming_pay_request_id", this.A0Y);
        bundle.putString("extra_request_message_key", this.A0r);
        bundle.putInt("extra_offer_eligibility_state", this.A01);
        C20284AEs aEs = this.A0B;
        if (aEs != null) {
            bundle.putParcelable("paymentMethodSavedInst", aEs);
        }
        C20284AEs aEs2 = this.A0B;
        if (!(aEs2 == null || (r1 = aEs2.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        C170318pf r12 = this.A0P;
        if (r12 != null) {
            bundle.putParcelable("countryTransDataSavedInst", r12);
        }
        AnonymousClass1KN r0 = this.A09;
        if (r0 != null) {
            bundle.putString("sendAmountSavedInst", r0.A00.toString());
        }
        AnonymousClass1KN r13 = this.A0g;
        if (r13 != null) {
            bundle.putParcelable("ExchangeAmountSavedInst", r13);
        }
        long j = this.A02;
        if (j != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j);
        }
        C1418477e r14 = this.A0J;
        if (!C20061A5k.A03(r14)) {
            bundle.putParcelable("receiverVpaSavedInst", r14);
        }
        String str = this.A0i;
        if (str != null) {
            bundle.putString("receiverVpaIdSavedInst", str);
        }
        String str2 = this.A0W;
        if (str2 != null) {
            bundle.putString("paymentStickerMediaJobIdSavedInst", str2);
        }
        PaymentView paymentView = this.A0J;
        if (paymentView != null) {
            String A12 = AnonymousClass3Ma.A12(paymentView.A0l);
            paymentView.A1C = A12;
            paymentView.A19 = A12;
            bundle.putString("extra_payment_preset_amount", A12);
            bundle.putString("paymentNoteSavedInst", this.A0J.getPaymentNote());
            bundle.putString("paymentNoteMentionsSavedInst", AnonymousClass4aJ.A01(this.A0J.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A0J.getPaymentAmountString());
        }
        bundle.putInt("flowInstanceKey", this.A00);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r4;
        int i2;
        C73203Rj A002;
        int i3;
        int i4;
        if (i != 15) {
            if (i == 22) {
                r4 = AnonymousClass4a6.A00(this);
                r4.A0S(AnonymousClass8BV.A0q(this, new Object[1], 2131891337, 0, 2131897291));
                i3 = 2131899286;
                i4 = 24;
            } else if (i == 26) {
                BigDecimal bigDecimal = new BigDecimal(this.A06.A04(AnonymousClass18O.A1D));
                r4 = AnonymousClass4a6.A00(this);
                AnonymousClass8BT.A15(this, r4, new Object[]{AnonymousClass1KL.A0B.BLd(this.A00, bigDecimal)}, 2131897648);
                i3 = 2131899286;
                i4 = 20;
            } else if (i == 33) {
                return A0y((Bundle) null);
            } else {
                if (i != 34) {
                    switch (i) {
                        case 10:
                            A002 = AnonymousClass4a6.A00(this);
                            A002.A0D(2131893831);
                            A002.A0Y(new C20154A9q(this, 37), 2131890512);
                            C20154A9q.A01(A002, this, 26, 2131898766);
                            C20154A9q.A00(A002, this, 27, 2131894173);
                            A002.A0T(true);
                            i2 = 21;
                            break;
                        case 11:
                            A002 = AnonymousClass4a6.A00(this);
                            A002.A0D(2131893944);
                            C20154A9q.A00(A002, this, 28, 2131890512);
                            C20154A9q.A01(A002, this, 29, 2131898766);
                            A002.A0T(true);
                            i2 = 22;
                            break;
                        case 12:
                            A002 = AnonymousClass4a6.A00(this);
                            A002.A0D(2131893945);
                            C20154A9q.A00(A002, this, 30, 2131898593);
                            C20154A9q.A01(A002, this, 31, 2131892908);
                            A002.A0T(true);
                            i2 = 23;
                            break;
                        case 13:
                            this.A0N.A0L();
                            A002 = AnonymousClass4a6.A00(this);
                            A002.A0D(2131893943);
                            C20154A9q.A00(A002, this, 21, 2131898593);
                            C20154A9q.A01(A002, this, 22, 2131892908);
                            A002.A0T(true);
                            i2 = 19;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                } else {
                    r4 = AnonymousClass4a6.A00(this);
                    r4.A0D(2131893826);
                    C20154A9q.A00(r4, this, 25, 2131899286);
                    r4.A0T(true);
                    return r4.create();
                }
            }
            C20154A9q.A00(r4, this, i4, i3);
            r4.A0T(false);
            return r4.create();
        }
        A002 = AnonymousClass4a6.A00(this);
        AnonymousClass8BT.A15(this, A002, new Object[]{this.A06.A0O(this.A08)}, 2131893927);
        C20154A9q.A00(A002, this, 23, 2131899286);
        A002.A0T(false);
        i2 = 20;
        A9Q.A00(r4, this, i2);
        return r4.create();
    }
}
