package com.whatsapp.payments.ui;

import X.A5C;
import X.A5V;
import X.A5Y;
import X.A8e;
import X.AW0;
import X.AXQ;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass181;
import X.AnonymousClass18O;
import X.AnonymousClass1D9;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1KN;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1QD;
import X.AnonymousClass1QG;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1VW;
import X.AnonymousClass1XH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4HD;
import X.AnonymousClass6MW;
import X.AnonymousClass74O;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8DB;
import X.AnonymousClass8GH;
import X.AnonymousClass921;
import X.AnonymousClass96B;
import X.AnonymousClass96S;
import X.AnonymousClass9BQ;
import X.B5Q;
import X.B8b;
import X.B9A;
import X.BBW;
import X.BBY;
import X.BCC;
import X.BD4;
import X.BDt;
import X.C132216mP;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C184889bg;
import X.C192479oS;
import X.C196259ui;
import X.C19962A0v;
import X.C20063A5m;
import X.C20087A6p;
import X.C20112A7u;
import X.C20284AEs;
import X.C20750AXf;
import X.C22941Dw;
import X.C24751Ln;
import X.C24921Me;
import X.C26021Qn;
import X.C27201Vd;
import X.C31051ew;
import X.C31061ex;
import X.C33301ib;
import X.C33311ic;
import X.C33651jA;
import X.C36401np;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class PaymentSettingsFragment extends Hilt_PaymentSettingsFragment implements View.OnClickListener, BDt, BBW, B8b, BBY, B9A {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public RecyclerView A0A;
    public AnonymousClass1KB A0B;
    public AnonymousClass11S A0C;
    public C132216mP A0D;
    public AnonymousClass18O A0E;
    public AnonymousClass181 A0F;
    public AnonymousClass1VW A0G;
    public AnonymousClass1M9 A0H;
    public C24921Me A0I;
    public C27201Vd A0J;
    public AnonymousClass11P A0K;
    public AnonymousClass118 A0L;
    public C26021Qn A0M;
    public AnonymousClass1QR A0N;
    public C24751Ln A0O;
    public AnonymousClass1QG A0P;
    public AnonymousClass1D9 A0Q;
    public AnonymousClass1LU A0R;
    public C33301ib A0S;
    public AnonymousClass1QL A0T;
    public C31051ew A0U;
    public C33311ic A0V;
    public AnonymousClass1QD A0W;
    public C31061ex A0X;
    public AnonymousClass1QJ A0Y;
    public AnonymousClass1QO A0Z;
    public AnonymousClass1QS A0a;
    public C33651jA A0b;
    public AnonymousClass6MW A0c;
    public C19962A0v A0d;
    public AnonymousClass8DB A0e;
    public AXQ A0f;
    public A5V A0g;
    public AnonymousClass8GH A0h;
    public A5C A0i;
    public AnonymousClass96S A0j;
    public C192479oS A0k;
    public AnonymousClass1R2 A0l;
    public C36401np A0m;
    public AnonymousClass10I A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public String A0v;
    public List A0w = AnonymousClass000.A13();
    public List A0x = AnonymousClass000.A13();
    public List A0y = AnonymousClass000.A13();
    public View A0z;
    public View A10;
    public View A11;
    public View A12;
    public View A13;
    public ListView A14;
    public TextView A15;
    public View A16;
    public View A17;
    public RecyclerView A18;
    public B5Q A19;
    public PaymentIncentiveViewModel A1A;
    public TransactionsExpandableView A1B;
    public TransactionsExpandableView A1C;

    public void A1w(int i, int i2, Intent intent) {
        A5V a5v;
        int intExtra;
        String A0k2;
        if (i != 1) {
            if (i != 48) {
                if (i != 150) {
                    if (i != 501) {
                        super.A1w(i, i2, intent);
                        return;
                    }
                    View view = this.A0B;
                    if (intent != null && view != null) {
                        if (i2 == -1) {
                            UserJid A022 = C22941Dw.A02(intent.getStringExtra("extra_invitee_jid"));
                            if (A022 != null) {
                                A0k2 = AnonymousClass3MW.A0x(AnonymousClass3MZ.A09(this), this.A0I.A0O(this.A0H.A0H(A022)), new Object[1], 0, 2131893908);
                            } else {
                                return;
                            }
                        } else if (i2 == 501 && (intExtra = intent.getIntExtra("extra_inviter_count", 0)) > 0) {
                            A0k2 = C72473Md.A0k(AnonymousClass3MZ.A09(this), intExtra, 2131755321);
                        } else {
                            return;
                        }
                        AnonymousClass8BS.A15(view, A0k2, -1);
                    }
                } else if (i2 == -1) {
                    A2N((String) null);
                }
            } else if (i2 == -1) {
                A1D().finish();
            }
        } else if (i2 == -1 && (a5v = this.A0g) != null) {
            a5v.A02();
        }
    }

    public void A2J(int i) {
        if (i == 1) {
            AnonymousClass1XH.A01(this, (Integer) null, 2131891841, (Integer) null, (Object[]) null);
        }
    }

    private void A0D() {
        this.A0n.CGD(new AnonymousClass9BQ(this.A0H, this.A0N, new C184889bg(this.A0J.A06(A1n(), "payment-settings"), this), this), new AnonymousClass1F9[0]);
    }

    public static void A0E(C19962A0v a0v, PaymentSettingsFragment paymentSettingsFragment, String str, String str2) {
        Uri uri;
        boolean z;
        AnonymousClass8GH r3 = paymentSettingsFragment.A0h;
        if (r3 != null) {
            Bundle bundle = paymentSettingsFragment.A06;
            if (bundle != null) {
                uri = (Uri) bundle.getParcelable("extra_deep_link_url");
            } else {
                uri = null;
            }
            if (r3 instanceof IndiaPaymentSettingsViewModel) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) r3;
                BD4 bd4 = indiaPaymentSettingsViewModel.A09;
                if (!(bd4 instanceof AZ6)) {
                    return;
                }
                if ("notify_verification_banner".equals(str2)) {
                    indiaPaymentSettingsViewModel.A0V(0, -1);
                } else if ("recovery_upin_upsell_banner".equals(str2) || "recovery_2fa_upsell_banner".equals(str2)) {
                    indiaPaymentSettingsViewModel.A0W(0, str2);
                } else {
                    C20112A7u A002 = C20087A6p.A00(indiaPaymentSettingsViewModel.A05, (AnonymousClass1KN) null, a0v, str2, false);
                    AZ6 az6 = (AZ6) bd4;
                    boolean A0d2 = indiaPaymentSettingsViewModel.A0d();
                    AZ6.A01(az6.A07(0, (Integer) null, "payment_home", str), C20750AXf.A00(uri, A002), az6, A0d2);
                }
            } else {
                C20112A7u A003 = C20087A6p.A00(r3.A05, (AnonymousClass1KN) null, a0v, str2, false);
                if (A003 == null) {
                    A003 = C20112A7u.A03(new C20112A7u[0]);
                }
                if (r3 instanceof AnonymousClass96B) {
                    z = AnonymousClass8BR.A1S(((AnonymousClass96B) r3).A01);
                } else {
                    z = false;
                }
                A003.A08("isPushProvisioning", z);
                C20087A6p.A03(A003, r3.A09, "payment_home", str);
            }
        }
    }

    public String A2H() {
        if (!(this instanceof IndiaUpiPaymentSettingsFragment)) {
            return null;
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = ((IndiaUpiPaymentSettingsFragment) this).A0Y;
        C17960vV.A07(indiaPaymentSettingsViewModel);
        switch (indiaPaymentSettingsViewModel.A0c()) {
            case 1:
                return "finish_setup";
            case 2:
                return "send_first_payment_banner";
            case 4:
                return "add_upi_number_banner";
            case 5:
                return "notify_verification_banner";
            case 6:
                return "scan_qr_code_banner";
            case 7:
                return "recovery_upin_upsell_banner";
            case 8:
                return "recovery_2fa_upsell_banner";
            case 10:
                return "warm_welcome_banner";
            case 11:
                return "recent_businesses";
            default:
                return null;
        }
    }

    public void A2I() {
        AnonymousClass10I r1 = this.A0n;
        AnonymousClass6MW r0 = this.A0c;
        if (r0 != null && r0.A09() == 1) {
            this.A0c.A0B(false);
        }
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        AnonymousClass1LU r12 = this.A0R;
        AnonymousClass181 r7 = this.A0F;
        AnonymousClass6MW r2 = new AnonymousClass6MW(A0D2, (AnonymousClass1FU) A1D(), this.A0D, this.A0E, r7, this.A01, (C20284AEs) null, (AW0) null, this.A0Q, r12, this.A0Y, "payments:settings");
        this.A0c = r2;
        C17890vO.A0u(r2, r1);
    }

    public void A2L(UserJid userJid, String str) {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            indiaUpiPaymentSettingsFragment.A0O.A01(indiaUpiPaymentSettingsFragment.A1n(), userJid, (C196259ui) null, (BCC) null, indiaUpiPaymentSettingsFragment.A0W.A05());
            AnonymousClass1FL A1B2 = indiaUpiPaymentSettingsFragment.A1B();
            if (A1B2 instanceof AnonymousClass1FU) {
                Intent A072 = AnonymousClass8BR.A07(A1B2, AnonymousClass8BU.A0U(indiaUpiPaymentSettingsFragment.A0a).BYz());
                indiaUpiPaymentSettingsFragment.A0k.A01(A072);
                A072.putExtra("extra_payment_preset_amount", str);
                AnonymousClass3MY.A12(A072, userJid, "extra_jid");
                A072.putExtra("extra_is_pay_money_only", !indiaUpiPaymentSettingsFragment.A0a.A06.A00.A09(AnonymousClass18O.A0V));
                A072.putExtra("referral_screen", "send_again_contact");
                ((AnonymousClass1FU) A1B2).A3q(A072, true);
                return;
            }
            Log.e("India Payment's contact picker activity is null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A06(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2M(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0024
            r6 = r8
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r6 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r6
            X.0ve r2 = r6.A02
            r1 = 7964(0x1f1c, float:1.116E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x010a
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = r6.A0Y
            X.C17960vV.A07(r0)
            int r1 = r0.A0c()
            r0 = 36
            r2 = 0
            r7 = 1
            switch(r1) {
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f7;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00e8;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00a3;
                case 9: goto L_0x010a;
                case 10: goto L_0x00d0;
                case 11: goto L_0x0071;
                default: goto L_0x0023;
            }
        L_0x0023:
            return
        L_0x0024:
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x0023
            r4 = r8
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r4 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r4
            X.96B r1 = r4.A0J
            X.C17960vV.A07(r1)
            X.A5C r0 = r4.A0i
            if (r0 == 0) goto L_0x006f
            int r0 = r0.A01
        L_0x0036:
            int r1 = r1.A0c(r0)
            r0 = 1
            java.lang.String r3 = "payment_home.get_started"
            if (r1 == r0) goto L_0x0145
            r0 = 2
            java.lang.String r2 = "generic_context"
            if (r1 == r0) goto L_0x013a
            r0 = 3
            if (r1 == r0) goto L_0x0132
            r0 = 4
            if (r1 != r0) goto L_0x0023
            X.0zA r0 = r4.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0023
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            X.BD4 r1 = r4.A0D
            java.lang.String r0 = "payment_home"
            X.AnonymousClass8BU.A1C(r1, r3, r0, r2)
            X.0zA r0 = r4.A00
            r0.A03()
            r4.A14()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x006f:
            r0 = 0
            goto L_0x0036
        L_0x0071:
            X.8GH r0 = r6.A0h
            java.lang.String r5 = "recent_businesses"
            X.BD4 r4 = r0.A09
            X.8sO r3 = X.AnonymousClass8BV.A0D(r4, r7)
            java.lang.String r2 = "payment_home"
            r3.A0b = r2
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            r0 = 0
            r1[r0] = r2
            r1[r7] = r5
            java.lang.String r0 = "%s.%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.A0a = r0
            X.A7u r1 = X.C20112A7u.A01()
            java.lang.String r0 = "section"
            r1.A07(r0, r5)
            X.AnonymousClass8BR.A1H(r3, r1)
            r4.BiH(r3)
            r6.A2R()
            return
        L_0x00a3:
            X.8GH r1 = r6.A0h
            java.lang.String r0 = "recovery_2fa_upsell_banner"
            r1.A0W(r7, r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A03(r6)
            return
        L_0x00ae:
            X.8GH r1 = r6.A0h
            java.lang.String r0 = "recovery_upin_upsell_banner"
            r1.A0W(r7, r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A04(r6)
            return
        L_0x00b9:
            X.8GH r1 = r6.A0h
            r0 = 97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Y(r2, r0, r9)
            X.1QL r0 = r6.A0T
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x00d9
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A07(r6)
            return
        L_0x00d0:
            X.8GH r1 = r6.A0h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Z(r2, r0, r9)
        L_0x00d9:
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A06(r6)
            return
        L_0x00dd:
            X.8GH r1 = r6.A0h
            r0 = 139(0x8b, float:1.95E-43)
            r1.A0V(r7, r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A01(r6)
            return
        L_0x00e8:
            X.8GH r2 = r6.A0h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.A0v r0 = r6.A0d
            r2.A0Z(r0, r1, r9)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A02(r6)
            return
        L_0x00f7:
            r6.A2N(r9)
            return
        L_0x00fb:
            X.8GH r1 = r6.A0h
            r0 = 85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Z(r2, r0, r9)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A05(r6)
            return
        L_0x010a:
            java.util.Locale r0 = X.C26166Ctg.A03()
            java.lang.String r2 = r0.getLanguage()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://youtu.be/"
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A00(r6, r2)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r6.A1k(r0)
            return
        L_0x0132:
            java.lang.String r1 = "payment_home.recover_payments_registration"
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment.A00(r4, r1, r0)
            return
        L_0x013a:
            X.A5Y r1 = r4.A0I
            r0 = 0
            java.lang.String r0 = X.A5Y.A01(r1, r2, r0)
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment.A00(r4, r3, r0)
            return
        L_0x0145:
            r4.A2O(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.A2M(java.lang.String):void");
    }

    public void A2N(String str) {
        String str2;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            if (!indiaUpiPaymentSettingsFragment.A0T.A0F()) {
                IndiaUpiPaymentSettingsFragment.A0B(indiaUpiPaymentSettingsFragment, "settingsNewPayment", (String) null, 1, 4, true, false);
                return;
            }
            if (indiaUpiPaymentSettingsFragment.A0h != null) {
                int i = 38;
                if (TextUtils.equals("send_first_payment_banner", str)) {
                    i = 195;
                }
                indiaUpiPaymentSettingsFragment.A0h.A0Y(indiaUpiPaymentSettingsFragment.A0d, Integer.valueOf(i), str);
            }
            Intent A082 = AnonymousClass1LU.A08(indiaUpiPaymentSettingsFragment.A14());
            if (TextUtils.equals("send_first_payment_banner", str)) {
                str2 = C17890vO.A0Z("send_first_payment_banner", AnonymousClass000.A11("payment_home"), '.');
            } else {
                str2 = "new_payment";
            }
            AnonymousClass8BR.A1D(A082, str2);
            indiaUpiPaymentSettingsFragment.startActivityForResult(A082, 501);
            return;
        }
        AnonymousClass8GH r2 = this.A0h;
        if (r2 != null) {
            r2.A0Y(this.A0d, 38, str);
        }
        Intent A072 = AnonymousClass8BR.A07(A1D(), PaymentContactPicker.class);
        A072.putExtra("for_payments", true);
        A072.putExtra("referral_screen", "payment_home.new_payment");
        startActivityForResult(A072, 501);
    }

    public void A2O(String str, String str2) {
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            boolean A032 = brazilPaymentSettingsFragment.A0I.A03.A03();
            C17900vP.A0n("isPaymentAccountCreated = ", AnonymousClass000.A10(), A032);
            if (A032) {
                brazilPaymentSettingsFragment.A1k(AnonymousClass8BR.A07(brazilPaymentSettingsFragment.A1n(), BrazilFbPayHubActivity.class));
                AnonymousClass8GH r2 = brazilPaymentSettingsFragment.A0h;
                if (r2 != null) {
                    C20087A6p.A04(brazilPaymentSettingsFragment.A0d, r2, 37);
                    return;
                }
                return;
            }
            BrazilPaymentSettingsFragment.A00(brazilPaymentSettingsFragment, str2, A5Y.A01(brazilPaymentSettingsFragment.A0I, "generic_context", false));
            AnonymousClass8GH r22 = brazilPaymentSettingsFragment.A0h;
            if (r22 != null) {
                r22.A0Z(brazilPaymentSettingsFragment.A0d, 36, str);
            }
        }
    }

    public boolean A2P() {
        if (this instanceof P2mLitePaymentSettingsFragment) {
            return true;
        }
        if (!(this instanceof BrazilPaymentSettingsFragment)) {
            return false;
        }
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
        if (C18020vd.A05(C18040vf.A02, brazilPaymentSettingsFragment.A0Z.A02, 10896)) {
            return brazilPaymentSettingsFragment.A0I.A03.A03();
        }
        return true;
    }

    public boolean A2Q() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            return false;
        }
        AnonymousClass1QD r1 = this.A0W;
        return AnonymousClass000.A1R(((AnonymousClass11P.A01(r1.A01) - C17890vO.A05(r1.A03(), "payments_all_transactions_last_sync_time")) > TimeUnit.DAYS.toMillis(7) ? 1 : ((AnonymousClass11P.A01(r1.A01) - C17890vO.A05(r1.A03(), "payments_all_transactions_last_sync_time")) == TimeUnit.DAYS.toMillis(7) ? 0 : -1)));
    }

    public void C0N() {
        this.A0f.A01(false);
    }

    public /* synthetic */ boolean CMH() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            C20063A5m.A00(aEs, paymentMethodRow, ((IndiaUpiPaymentSettingsFragment) this).A0a);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626397);
    }

    public void A1r() {
        super.A1r();
        AXQ axq = this.A0f;
        if (axq != null) {
            axq.A00();
        }
        AnonymousClass6MW r1 = this.A0c;
        if (r1 != null) {
            r1.A0B(false);
        }
    }

    public void A1t() {
        super.A1t();
        if (this.A19 != null) {
            C17880vN.A0V(this.A0r).unregisterObserver(this.A19);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r4.A0T.A0D() == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1u() {
        /*
            r4 = this;
            super.A1u()
            X.1FL r1 = r4.A1D()
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0013
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131893912(0x7f121e98, float:1.9422614E38)
            r1.CNA(r0)
        L_0x0013:
            X.AXQ r1 = r4.A0f
            r0 = 1
            r1.A01(r0)
            android.view.View r3 = r4.A16
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0036
            X.1QO r0 = r4.A0Z
            X.0ve r2 = r0.A02
            r1 = 783(0x30f, float:1.097E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0036
            X.1QL r0 = r4.A0T
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            int r0 = X.C72453Mb.A07(r0)
            r3.setVisibility(r0)
            X.B5Q r0 = r4.A19
            if (r0 == 0) goto L_0x004d
            X.00H r0 = r4.A0r
            X.10T r1 = X.C17880vN.A0V(r0)
            X.B5Q r0 = r4.A19
            r1.registerObserver(r0)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.A1u():void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A1Z(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel} */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.A5V] */
    /* JADX WARNING: type inference failed for: r9v9, types: [java.lang.Object, X.9NN] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r8v35, types: [X.96A, X.8GH] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.94j] */
    /* JADX WARNING: type inference failed for: r15v9, types: [X.94i] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b2, code lost:
        if (X.C18020vd.A05(r6, r0.A0Z.A02, 10896) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0457  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r37, android.view.View r38) {
        /*
            r36 = this;
            r0 = 2131433236(0x7f0b1714, float:1.8488252E38)
            r1 = r38
            android.widget.LinearLayout r2 = X.AnonymousClass8BR.A0A(r1, r0)
            r0 = r36
            r0.A07 = r2
            r2 = 2131433607(0x7f0b1887, float:1.8489004E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.A00 = r2
            android.os.Bundle r4 = r0.A06
            if (r4 == 0) goto L_0x0020
            java.lang.String r2 = X.AnonymousClass8BR.A0y(r4)
            r0.A0v = r2
        L_0x0020:
            X.1QS r2 = r0.A0a
            X.9uQ r2 = X.AnonymousClass8BU.A0O(r2)
            if (r2 == 0) goto L_0x0594
            X.0ve r2 = r2.A07
            boolean r2 = X.AnonymousClass8BS.A1M(r2)
            if (r2 == 0) goto L_0x0594
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = X.AnonymousClass8BX.A0M(r0)
        L_0x0034:
            r0.A1A = r3
            r2 = 0
            if (r3 == 0) goto L_0x005e
            X.1DT r6 = r3.A01
            X.1q9 r5 = r0.A1G()
            r3 = 47
            X.C20337AGt.A01(r5, r6, r0, r3)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = r0.A1A
            X.1DT r6 = r3.A01
            X.1ig r3 = r3.A06
            X.A0v r5 = r3.A01()
            r3 = 0
            X.C198179xu.A00(r6, r5, r3, r2)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r0.A1A
            X.10I r5 = r6.A07
            X.3Cp r3 = new X.3Cp
            r3.<init>((com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r6, (boolean) r2)
            r5.CGF(r3)
        L_0x005e:
            boolean r3 = r0 instanceof com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment
            if (r3 == 0) goto L_0x0554
            r6 = r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r6 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r6
            X.96A r8 = r6.A07
            if (r8 != 0) goto L_0x0092
            X.00H r5 = r6.A0A
            if (r5 == 0) goto L_0x0597
            java.lang.Object r5 = r5.get()
            X.9iC r5 = (X.C188909iC) r5
            X.11P r9 = r5.A05
            X.0ve r12 = r5.A0E
            X.0vb r10 = r5.A07
            X.1i4 r11 = r5.A0D
            X.1QS r14 = r5.A0J
            X.1QD r13 = r5.A0H
            X.00H r5 = r5.A0W
            java.lang.Object r15 = X.C18070vi.A0E(r5)
            X.AZ4 r15 = (X.AZ4) r15
            r5 = 7
            X.C18070vi.A0d(r15, r5)
            X.96A r8 = new X.96A
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r6.A07 = r8
        L_0x0092:
            r0.A0h = r8
            if (r8 == 0) goto L_0x00bb
            X.1DT r7 = r8.A01
            X.1q9 r6 = r0.A1G()
            r5 = 48
            X.C20337AGt.A01(r6, r7, r0, r5)
            X.8GH r5 = r0.A0h
            X.1DT r7 = r5.A00
            X.1q9 r6 = r0.A1G()
            r5 = 49
            X.C20337AGt.A01(r6, r7, r0, r5)
            if (r4 == 0) goto L_0x00bb
            X.8GH r6 = r0.A0h
            java.lang.String r5 = "actual_deep_link"
            java.lang.String r5 = r4.getString(r5)
            r6.A0a(r5)
        L_0x00bb:
            r5 = 2131430820(0x7f0b0da4, float:1.8483352E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A11 = r5
            r5 = 2131430819(0x7f0b0da3, float:1.848335E38)
            android.view.View r6 = r1.findViewById(r5)
            r5 = 2131433471(0x7f0b17ff, float:1.8488729E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r6, r5)
            r0.A0z = r5
            r5 = 2131433475(0x7f0b1803, float:1.8488737E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r6, r5)
            r0.A15 = r5
            r5 = 2131433473(0x7f0b1801, float:1.8488733E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r6, r5)
            r0.A10 = r5
            r5 = 2131433655(0x7f0b18b7, float:1.8489102E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A12 = r5
            r5 = 2131434622(0x7f0b1c7e, float:1.8491063E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.A13 = r5
            X.1FL r12 = r0.A1D()
            X.1FY r12 = (X.AnonymousClass1FY) r12
            X.10I r5 = r0.A0n
            r17 = r5
            X.1QS r5 = r0.A0a
            r16 = r5
            X.9gq r23 = new X.9gq
            r23.<init>()
            X.1QD r15 = r0.A0W
            X.1QL r14 = r0.A0T
            X.1ex r13 = r0.A0X
            X.1jA r11 = r0.A0b
            X.1ew r10 = r0.A0U
            X.00H r5 = r0.A0q
            java.lang.Object r9 = r5.get()
            X.2Kz r9 = (X.C48052Kz) r9
            X.00H r5 = r0.A0u
            java.lang.Object r8 = r5.get()
            X.2L2 r8 = (X.AnonymousClass2L2) r8
            X.1ib r7 = r0.A0S
            X.1ic r6 = r0.A0V
            if (r3 == 0) goto L_0x0550
            java.lang.String r28 = "P2M_LITE"
        L_0x012d:
            X.AXQ r5 = new X.AXQ
            r29 = 1
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r17
            r21 = r16
            r22 = r11
            r19 = r8
            r20 = r13
            r17 = r6
            r18 = r15
            r15 = r14
            r16 = r10
            r13 = r7
            r14 = r9
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A0f = r5
            r6 = 0
            if (r4 == 0) goto L_0x0159
            java.lang.String r5 = "extra_force_get_methods"
            boolean r6 = r4.getBoolean(r5, r2)
        L_0x0159:
            X.AXQ r5 = r0.A0f
            boolean r4 = r0.A2Q()
            r5.A02(r4, r6)
            if (r3 == 0) goto L_0x0478
            r13 = 0
        L_0x0165:
            r0.A0g = r13
            if (r13 == 0) goto L_0x0175
            X.0ve r6 = r0.A02
            r5 = 1724(0x6bc, float:2.416E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r6, r5)
            r13.A01 = r4
        L_0x0175:
            r4 = 2131427619(0x7f0b0123, float:1.847686E38)
            android.view.View r4 = r1.findViewById(r4)
            r4.setOnClickListener(r0)
            r4 = 2131433673(0x7f0b18c9, float:1.8489138E38)
            android.view.View r4 = r1.findViewById(r4)
            r4.setOnClickListener(r0)
            r4 = 2131435190(0x7f0b1eb6, float:1.8492215E38)
            r7 = 2131435190(0x7f0b1eb6, float:1.8492215E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r1, r4)
            r0.A17 = r8
            boolean r4 = r0 instanceof com.whatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r4 == 0) goto L_0x01b4
            X.1QO r4 = r0.A0Z
            X.0ve r5 = r4.A02
            r4 = 10897(0x2a91, float:1.527E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r6, r5, r4)
            if (r4 != 0) goto L_0x01b4
            X.1QO r4 = r0.A0Z
            X.0ve r5 = r4.A02
            r4 = 10896(0x2a90, float:1.5269E-41)
            boolean r5 = X.C18020vd.A05(r6, r5, r4)
            r4 = 1
            if (r5 == 0) goto L_0x01b5
        L_0x01b4:
            r4 = 0
        L_0x01b5:
            r6 = 8
            int r4 = X.C72453Mb.A07(r4)
            r8.setVisibility(r4)
            android.view.View r4 = r0.A17
            r4.setOnClickListener(r0)
            boolean r4 = r0.A2P()
            if (r4 == 0) goto L_0x01d5
            r4 = 2131433596(0x7f0b187c, float:1.8488982E38)
            X.AnonymousClass3MY.A1B(r1, r4, r6)
            r4 = 2131433543(0x7f0b1847, float:1.8488875E38)
            X.AnonymousClass3MY.A1B(r1, r4, r6)
        L_0x01d5:
            X.1FL r8 = r0.A1D()
            X.00H r4 = r0.A0t
            X.A56 r5 = X.AnonymousClass8BR.A0c(r4)
            X.8DB r4 = new X.8DB
            r4.<init>(r8, r5, r0)
            r0.A0e = r4
            r4 = 2131432751(0x7f0b152f, float:1.8487268E38)
            android.view.View r5 = r1.findViewById(r4)
            android.widget.ListView r5 = (android.widget.ListView) r5
            r0.A14 = r5
            X.8DB r4 = r0.A0e
            r5.setAdapter(r4)
            android.widget.ListView r8 = r0.A14
            r5 = 3
            X.AFs r4 = new X.AFs
            r4.<init>(r0, r5)
            r8.setOnItemClickListener(r4)
            r4 = 2131435145(0x7f0b1e89, float:1.8492124E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r1, r4)
            r0.A03 = r4
            r4 = 2131435144(0x7f0b1e88, float:1.8492122E38)
            android.widget.LinearLayout r4 = X.AnonymousClass3MX.A0K(r1, r4)
            r0.A09 = r4
            r4 = 2131431017(0x7f0b0e69, float:1.8483751E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.C108945cZ.A0U(r1, r4)
            r0.A0A = r4
            boolean r5 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r5 == 0) goto L_0x046c
            X.0ve r9 = r0.A02
            r8 = 3623(0xe27, float:5.077E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r9, r8)
            if (r4 == 0) goto L_0x046c
            r0.A0D()
        L_0x022f:
            r4 = 2131434391(0x7f0b1b97, float:1.8490595E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r1, r4)
            r0.A02 = r4
            r4 = 2131434390(0x7f0b1b96, float:1.8490593E38)
            android.widget.LinearLayout r4 = X.AnonymousClass3MX.A0K(r1, r4)
            r0.A08 = r4
            r4 = 2131434389(0x7f0b1b95, float:1.849059E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.C108945cZ.A0U(r1, r4)
            r0.A18 = r4
            if (r5 == 0) goto L_0x0460
            X.0ve r9 = r0.A02
            r8 = 4291(0x10c3, float:6.013E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r9, r8)
            if (r4 == 0) goto L_0x0460
            r13 = r0
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r13 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r13
            X.10I r8 = r13.A0n
            X.1M9 r10 = r13.A0H
            X.1Qn r11 = r13.A0M
            X.9yE r14 = r13.A0W
            X.9YT r12 = new X.9YT
            r12.<init>(r13)
            X.9BB r9 = new X.9BB
            r9.<init>(r10, r11, r12, r13, r14)
            X.1F9[] r4 = new X.AnonymousClass1F9[r2]
            r8.CGD(r9, r4)
        L_0x0272:
            r4 = 2131433542(0x7f0b1846, float:1.8488873E38)
            android.view.View r8 = r1.findViewById(r4)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r8 = (com.whatsapp.payments.ui.widget.TransactionsExpandableView) r8
            r0.A1C = r8
            r4 = 2131894046(0x7f121f1e, float:1.9422886E38)
            java.lang.String r4 = r0.A1H(r4)
            r8.setTitle(r4)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r11 = r0.A1C
            r4 = 2131894054(0x7f121f26, float:1.9422902E38)
            java.lang.String r10 = r0.A1H(r4)
            r4 = 2131893924(0x7f121ea4, float:1.9422638E38)
            java.lang.String r9 = r0.A1H(r4)
            r8 = 20
            X.AFQ r4 = new X.AFQ
            r4.<init>(r0, r8)
            r11.setSeeMoreView(r10, r9, r4)
            android.view.LayoutInflater r9 = r0.A16()
            r8 = 2131626428(0x7f0e09bc, float:1.8880092E38)
            r4 = 0
            android.view.View r8 = r9.inflate(r8, r4, r2)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r4 = r0.A1C
            r4.setCustomEmptyView(r8)
            r4 = 2131433606(0x7f0b1886, float:1.8489002E38)
            android.widget.ImageView r11 = X.AnonymousClass3MW.A0H(r8, r4)
            android.content.res.Resources r10 = X.AnonymousClass3MZ.A09(r0)
            android.content.Context r9 = r0.A1n()
            r8 = 2130970094(0x7f0405ee, float:1.7548888E38)
            r4 = 2131101215(0x7f06061f, float:1.7814833E38)
            int r4 = X.AnonymousClass3Ma.A01(r9, r10, r8, r4)
            X.AnonymousClass4aX.A0D(r11, r4)
            r4 = 2131434427(0x7f0b1bbb, float:1.8490668E38)
            android.widget.FrameLayout r4 = X.C108945cZ.A0P(r1, r4)
            r0.A04 = r4
            r4 = 2131433519(0x7f0b182f, float:1.8488826E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.A06 = r4
            r4 = 2131429751(0x7f0b0977, float:1.8481184E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.A05 = r4
            r4 = 2131433520(0x7f0b1830, float:1.8488828E38)
            android.view.View r4 = r1.findViewById(r4)
            r0.A01 = r4
            r4 = 2131434621(0x7f0b1c7d, float:1.8491061E38)
            android.view.View r11 = r1.findViewById(r4)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r11 = (com.whatsapp.payments.ui.widget.TransactionsExpandableView) r11
            r0.A1B = r11
            r4 = 2131894049(0x7f121f21, float:1.9422892E38)
            java.lang.String r10 = r0.A1H(r4)
            java.lang.String r9 = r0.A1H(r4)
            r8 = 21
            X.AFQ r4 = new X.AFQ
            r4.<init>(r0, r8)
            r11.setSeeMoreView(r10, r9, r4)
            X.1FL r4 = r0.A1D()
            X.9NN r9 = new X.9NN
            r9.<init>()
            r9.A01 = r4
            r4 = 2
            r9.A00 = r4
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r8 = r0.A1C
            r8.A00 = r9
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r4 = r0.A1B
            r4.A00 = r9
            r8.setPaymentRequestActionCallback(r0)
            r4.setPaymentRequestActionCallback(r0)
            r4 = 2131431799(0x7f0b1177, float:1.8485337E38)
            android.view.View r9 = r1.findViewById(r4)
            r0.A16 = r9
            if (r5 == 0) goto L_0x0457
            r4 = 17
            X.AFP r8 = new X.AFP
            r8.<init>(r0, r4)
        L_0x0344:
            r9.setOnClickListener(r8)
            X.1R2 r11 = r0.A0l
            r10 = 2131101221(0x7f060625, float:1.7814846E38)
            r9 = 2131167015(0x7f070727, float:1.7948292E38)
            X.1FL r8 = r0.A1D()
            X.1QJ r4 = r0.A0Y
            X.2tK r4 = r4.A02()
            X.26n r8 = r11.A0N(r8, r4, r10, r9)
            r4 = 2131433694(0x7f0b18de, float:1.848918E38)
            android.widget.TextView r10 = X.C17880vN.A0E(r1, r4)
            r4 = 2131433693(0x7f0b18dd, float:1.8489179E38)
            android.widget.ImageView r9 = X.AnonymousClass3MW.A0H(r1, r4)
            if (r8 == 0) goto L_0x0421
            r9.setImageDrawable(r8)
            r10.setVisibility(r6)
            r9.setVisibility(r2)
        L_0x0376:
            r4 = 2131433697(0x7f0b18e1, float:1.8489187E38)
            android.view.View r8 = r1.findViewById(r4)
            android.view.ViewGroup r7 = X.AnonymousClass3MW.A0D(r1, r7)
            r4 = 2131433698(0x7f0b18e2, float:1.848919E38)
            android.view.View r6 = r1.findViewById(r4)
            android.animation.LayoutTransition r9 = r7.getLayoutTransition()
            X.1YX r4 = new X.1YX
            r4.<init>()
            r9.setInterpolator(r2, r4)
            X.1YX r5 = new X.1YX
            r5.<init>()
            r4 = 1
            r9.setInterpolator(r4, r5)
            r4 = 150(0x96, double:7.4E-322)
            r9.setDuration(r4)
            r4 = 2131433675(0x7f0b18cb, float:1.8489142E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r1, r4)
            r4 = 2131433676(0x7f0b18cc, float:1.8489144E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r4)
            if (r3 == 0) goto L_0x041f
            X.1QO r4 = r0.A0Z
            boolean r4 = r4.A0C()
        L_0x03b8:
            int r4 = X.C72453Mb.A07(r4)
            r9.setVisibility(r4)
            if (r3 == 0) goto L_0x03cb
            X.1QO r3 = r0.A0Z
            boolean r3 = r3.A0C()
            if (r3 != 0) goto L_0x03cb
            r2 = 8
        L_0x03cb:
            r5.setVisibility(r2)
            android.view.ViewTreeObserver r3 = r8.getViewTreeObserver()
            X.AFn r2 = new X.AFn
            r2.<init>(r8, r6, r7, r0)
            r3.addOnScrollChangedListener(r2)
            X.1FL r5 = r0.A1D()
            X.1FL r4 = r0.A1D()
            r3 = 2130971195(0x7f040a3b, float:1.7551122E38)
            r2 = 2131102531(0x7f060b43, float:1.7817503E38)
            int r3 = X.AnonymousClass3MZ.A02(r4, r5, r3, r2)
            r2 = 2131429005(0x7f0b068d, float:1.847967E38)
            X.AnonymousClass8BU.A15(r1, r2, r3)
            r2 = 2131427620(0x7f0b0124, float:1.8476861E38)
            X.AnonymousClass8BU.A15(r1, r2, r3)
            r2 = 2131433674(0x7f0b18ca, float:1.848914E38)
            X.AnonymousClass8BU.A15(r1, r2, r3)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r2 = r0.A1C
            android.widget.ImageView r2 = r2.A01
            X.AnonymousClass4aX.A0D(r2, r3)
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r0 = r0.A1B
            android.widget.ImageView r0 = r0.A01
            X.AnonymousClass4aX.A0D(r0, r3)
            r0 = 2131430874(0x7f0b0dda, float:1.8483461E38)
            X.AnonymousClass8BU.A15(r1, r0, r3)
            r0 = 2131431803(0x7f0b117b, float:1.8485346E38)
            X.AnonymousClass8BU.A15(r1, r0, r3)
            r0 = 2131433660(0x7f0b18bc, float:1.8489112E38)
            X.AnonymousClass8BU.A15(r1, r0, r3)
            return
        L_0x041f:
            r4 = 1
            goto L_0x03b8
        L_0x0421:
            if (r3 == 0) goto L_0x0438
            X.1QJ r4 = r0.A0Y
            X.1KJ r5 = r4.A01()
            if (r5 != 0) goto L_0x043c
            java.lang.String r4 = ""
        L_0x042d:
            r10.setText(r4)
            r10.setVisibility(r2)
            r9.setVisibility(r6)
            goto L_0x0376
        L_0x0438:
            if (r5 == 0) goto L_0x0447
            X.1KJ r5 = X.AnonymousClass1KL.A0B
        L_0x043c:
            android.content.Context r4 = r0.A14()
        L_0x0440:
            X.1KL r5 = (X.AnonymousClass1KL) r5
            android.text.SpannableStringBuilder r4 = r5.BPn(r4, r2)
            goto L_0x042d
        L_0x0447:
            r8 = r0
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r8 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r8
            X.1KI r5 = r8.A03
            java.lang.String r4 = "BRL"
            X.1KJ r5 = r5.A01(r4)
            android.content.Context r4 = r8.A14()
            goto L_0x0440
        L_0x0457:
            r4 = 22
            X.AFQ r8 = new X.AFQ
            r8.<init>(r0, r4)
            goto L_0x0344
        L_0x0460:
            android.view.View r4 = r0.A02
            r4.setVisibility(r6)
            android.widget.LinearLayout r4 = r0.A08
            r4.setVisibility(r6)
            goto L_0x0272
        L_0x046c:
            android.view.View r4 = r0.A03
            r4.setVisibility(r6)
            android.widget.LinearLayout r4 = r0.A09
            r4.setVisibility(r6)
            goto L_0x022f
        L_0x0478:
            boolean r4 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r4 == 0) goto L_0x04e3
            r14 = r0
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r14 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r14
            X.11P r4 = r14.A0K
            r22 = r4
            X.1KB r4 = r14.A0B
            r21 = r4
            X.11S r4 = r14.A0C
            r19 = r4
            X.10I r4 = r14.A0n
            r18 = r4
            X.1QG r4 = r14.A0P
            r20 = r4
            X.9mk r4 = r14.A0N
            r17 = r4
            X.1QS r4 = r14.A0a
            r16 = r4
            X.1QD r15 = r14.A0W
            X.1QL r12 = r14.A0T
            X.9uA r11 = r14.A0U
            X.1ex r10 = r14.A0X
            X.AZ6 r9 = r14.A0Q
            X.A7s r8 = r14.A0L
            X.00H r4 = r14.A0s
            X.1jG r23 = X.AnonymousClass8BR.A0a(r4)
            X.A5H r7 = r14.A0T
            X.A54 r6 = r14.A0P
            X.1ie r5 = r14.A0I
            X.1FL r4 = r14.A1D()
            X.1FY r4 = (X.AnonymousClass1FY) r4
            X.94i r13 = new X.94i
            r25 = r10
            r26 = r8
            r27 = r16
            r28 = r17
            r29 = r6
            r30 = r9
            r31 = r7
            r32 = r11
            r33 = r14
            r34 = r18
            r16 = r21
            r17 = r19
            r18 = r4
            r19 = r22
            r21 = r12
            r22 = r5
            r24 = r15
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0165
        L_0x04e3:
            r14 = r0
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r14 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r14
            X.11P r4 = r14.A0K
            r23 = r4
            X.1KB r4 = r14.A0B
            r22 = r4
            X.11S r4 = r14.A0C
            r21 = r4
            X.10I r4 = r14.A0n
            r19 = r4
            X.1QG r4 = r14.A0P
            r20 = r4
            X.9mk r4 = r14.A09
            r18 = r4
            X.1QS r4 = r14.A0a
            r17 = r4
            X.1QD r4 = r14.A0W
            r16 = r4
            X.AXR r15 = r14.A05
            X.1QL r12 = r14.A0T
            X.9uA r11 = r14.A0G
            X.1ex r10 = r14.A0X
            X.BD4 r9 = r14.A0D
            X.A7s r8 = r14.A07
            X.00H r4 = r14.A0s
            X.1jG r24 = X.AnonymousClass8BR.A0a(r4)
            X.A5H r7 = r14.A0F
            X.A54 r6 = r14.A0B
            X.1ie r5 = r14.A06
            X.1FL r4 = r14.A1D()
            X.1FY r4 = (X.AnonymousClass1FY) r4
            X.94j r13 = new X.94j
            r25 = r16
            r26 = r10
            r27 = r8
            r28 = r17
            r29 = r18
            r30 = r6
            r31 = r9
            r32 = r7
            r33 = r11
            r34 = r14
            r35 = r19
            r16 = r22
            r17 = r21
            r18 = r4
            r19 = r23
            r21 = r15
            r22 = r12
            r23 = r5
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0165
        L_0x0550:
            r28 = 0
            goto L_0x012d
        L_0x0554:
            boolean r5 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r5 == 0) goto L_0x056f
            r7 = r0
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r7 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r7
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r8 = r7.A0Y
            if (r8 != 0) goto L_0x0092
            X.1It r6 = X.AnonymousClass3MW.A0N(r7)
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel> r5 = com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.class
            X.1J2 r8 = r6.A00(r5)
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r8 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r8
            r7.A0Y = r8
            goto L_0x0092
        L_0x056f:
            r10 = r0
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r10 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r10
            X.96B r8 = r10.A0J
            if (r8 != 0) goto L_0x0092
            X.9iD r9 = r10.A0K
            X.1FL r8 = r10.A1D()
            X.BD4 r7 = r10.A0D
            r6 = 7
            X.AH2 r5 = new X.AH2
            r5.<init>(r7, r9, r6)
            X.1It r6 = X.AnonymousClass8BR.A0C(r5, r8)
            java.lang.Class<X.96B> r5 = X.AnonymousClass96B.class
            X.1J2 r8 = r6.A00(r5)
            X.96B r8 = (X.AnonymousClass96B) r8
            r10.A0J = r8
            goto L_0x0092
        L_0x0594:
            r3 = 0
            goto L_0x0034
        L_0x0597:
            java.lang.String r0 = "viewModelCreationDelegate"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass1FL A1D = A1D();
            if (A1D instanceof AnonymousClass921) {
                A1D.finish();
                if (A1D.isTaskRoot()) {
                    Intent A022 = AnonymousClass1LU.A02(A1D);
                    A1D.finishAndRemoveTask();
                    A1D.startActivity(A022);
                }
            }
            return true;
        } else if (menuItem.getItemId() != 2131432578) {
            return false;
        } else {
            String BWX = this.A0a.A06().BWX();
            if (TextUtils.isEmpty(BWX)) {
                return false;
            }
            A1k(C17880vN.A0A().setClassName(A1D(), BWX));
            return true;
        }
    }

    public void A2K(Intent intent) {
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("extra_force_get_methods", false);
        }
        this.A0f.A02(A2Q(), z);
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public String BUt(C20284AEs aEs) {
        if (A8e.A03(A1D(), aEs) != null) {
            return A8e.A03(A1D(), aEs);
        }
        return "";
    }

    public /* synthetic */ String BUu(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public void CR0(List list) {
        boolean z;
        int i;
        if (A1b() && A1B() != null) {
            this.A0w = list;
            this.A12.setVisibility(0);
            AnonymousClass8DB r0 = this.A0e;
            r0.A00 = list;
            r0.notifyDataSetChanged();
            View view = this.A0B;
            if (view != null) {
                int i2 = 0;
                if (A2P()) {
                    AnonymousClass3MY.A1B(view, 2131433666, 8);
                    AnonymousClass3MY.A1B(view, 2131433663, 0);
                    AnonymousClass3MY.A1B(view, 2131433665, 0);
                    if (this instanceof BrazilPaymentSettingsFragment) {
                        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
                        z = false;
                        if (!C18020vd.A05(C18040vf.A02, brazilPaymentSettingsFragment.A0Z.A02, 10896)) {
                            boolean A012 = brazilPaymentSettingsFragment.A0Z.A01();
                            A5Y a5y = brazilPaymentSettingsFragment.A0I;
                            if (!A012) {
                                z = !a5y.A03.A03();
                            } else if (!(A5Y.A01(a5y, "p2p_context", false) == null || A5Y.A00(brazilPaymentSettingsFragment.A0I) == null)) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        AnonymousClass3MY.A1B(view, 2131433662, 8);
                        View findViewById = view.findViewById(2131433661);
                        if (this instanceof P2mLitePaymentSettingsFragment) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        findViewById.setVisibility(C72453Mb.A01(i));
                        view.findViewById(2131433661).setOnClickListener(this);
                        View findViewById2 = view.findViewById(2131433664);
                        if (i == 0) {
                            i2 = 8;
                        }
                        findViewById2.setVisibility(i2);
                    } else {
                        AnonymousClass3MY.A1B(view, 2131433662, 0);
                        AnonymousClass3MY.A1B(view, 2131433661, 8);
                        view.findViewById(2131433662).setOnClickListener(this);
                    }
                }
            }
            AnonymousClass4HD.A00(this.A14);
            AnonymousClass8GH r2 = this.A0h;
            if (r2 != null) {
                r2.A02 = list;
                r2.A0X(this.A0d, this.A0i);
            }
        }
    }

    public void CRI(List list) {
        String quantityString;
        if (A1b() && A1B() != null) {
            this.A0x = list;
            this.A12.setVisibility(0);
            if (this.A0x.isEmpty()) {
                this.A13.setVisibility(8);
                this.A1B.setVisibility(8);
                return;
            }
            this.A1B.setVisibility(0);
            this.A13.setVisibility(0);
            this.A1B.A01(this.A0x);
            TransactionsExpandableView transactionsExpandableView = this.A1B;
            List list2 = this.A0x;
            if (this instanceof IndiaUpiPaymentSettingsFragment) {
                quantityString = A1H(2131897458);
            } else {
                quantityString = AnonymousClass3MZ.A09(this).getQuantityString(2131755327, list2.size());
            }
            transactionsExpandableView.setTitle(quantityString);
        }
    }

    public void CRV(List list) {
        if (A1b() && A1B() != null) {
            this.A0y = list;
            this.A12.setVisibility(0);
            this.A1C.A01(this.A0y);
            if (this instanceof IndiaUpiPaymentSettingsFragment) {
                if (C18020vd.A05(C18040vf.A02, this.A02, 3623)) {
                    A0D();
                    return;
                }
            }
            this.A03.setVisibility(8);
            this.A09.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (view.getId() == 2131433673) {
            AnonymousClass8GH r2 = this.A0h;
            if (r2 != null) {
                C20087A6p.A04(this.A0d, r2, 39);
            }
            A2I();
        } else if (view.getId() == 2131435190) {
            if (!C72463Mc.A1W(this.A0o)) {
                AnonymousClass74O.A0F(this, 2131894319, 2131894318);
            } else {
                A2N((String) null);
            }
        } else if (view.getId() == 2131427619 || view.getId() == 2131433662) {
            Bl5(AnonymousClass000.A1P(this.A0e.getCount()));
        } else if (view.getId() == 2131433661) {
            A2O((String) null, "payment_home.add_payment_method");
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
    }
}
