package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.DatePicker;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.91S  reason: invalid class name */
public abstract class AnonymousClass91S extends AnonymousClass92I implements BBD, C22458B8q {
    public C18000vb A00;
    public C20752AXh A01;
    public BCB A02 = new AX9(this);
    public C191789nB A03;
    public C196259ui A04;
    public C195859u1 A05;
    public C175758zE A06;
    public C175838zM A07;
    public A27 A08;
    public A0B A09;
    public C30931ek A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public String A0I;
    public String A0J;
    public final AnonymousClass1QE A0K = AnonymousClass1QE.A00("IndiaUpiPinHandlerActivity", "payment-settings", "IN");

    public void A5C(AnonymousClass8pS r9, String str, String str2, String str3, String str4, int i) {
        A5D(r9, str, str2, str3, str4, i, false);
    }

    public void C2e(int i, Bundle bundle) {
        if (i == 1) {
            if (bundle != null) {
                String string = bundle.getString("error");
                if (TextUtils.isEmpty(string)) {
                    HashMap hashMap = (HashMap) bundle.getSerializable("credBlocks");
                    if (hashMap == null || hashMap.isEmpty()) {
                        this.A03.A0G("india-upi-cl-result-empty-credblocks", (String) null, false);
                    } else {
                        A5E(hashMap);
                        return;
                    }
                } else if (!string.equals("USER_ABORTED")) {
                    if (string.equals("TECHNICAL_ERROR")) {
                        this.A03.A0G("india-upi-cl-result-technical-error", (String) null, false);
                    } else {
                        try {
                            JSONObject A16 = C17880vN.A16(string);
                            String A0J2 = C18070vi.A0J("errorText", A16);
                            String A0J3 = C18070vi.A0J("errorCode", A16);
                            AnonymousClass190 r3 = this.A03;
                            Locale locale = Locale.US;
                            Object[] A1b = AnonymousClass3MW.A1b();
                            AnonymousClass8BS.A1B(A0J3, A0J2, A1b);
                            r3.A0G("india-upi-cl-result-error", String.format(locale, "errorCode = %s errorMessage = %s", A1b), false);
                        } catch (JSONException e) {
                            Log.e("NpciCommonLibraryUtils/parseErrorResponse: ", e);
                        }
                    }
                }
                A54();
                return;
            }
            this.A0G = false;
            if (this.A0F) {
                this.A0F = false;
                CEx();
                return;
            }
            A4o();
            finish();
        } else if (i == 2) {
            A57.A00(this).A03(C108945cZ.A0G("TRIGGER_OTP"));
        }
    }

    public static C19967A1c A1D(AnonymousClass91S r3) {
        C19967A1c A022 = r3.A01.A02(r3.A04, 0);
        r3.A4p();
        if (A022.A00 == 0) {
            A022.A00 = 2131893867;
        }
        return A022;
    }

    public static void A1E(AnonymousClass91S r2) {
        if (((A0F) r2.A0B.get()).A00 == null) {
            ((A0F) r2.A0B.get()).A01(new C20799AZc(r2));
        } else {
            r2.A03.A00();
        }
    }

    public Dialog A50(AnonymousClass8pN r10, int i) {
        if (i == 11) {
            return A51(new C21432Ajz(this, r10, 24), getString(2131888268), 11, 2131890512, 2131899286);
        } else if (i != 28) {
            return super.onCreateDialog(i);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131893867);
            C20154A9q.A00(A002, this, 44, 2131899286);
            return A002.create();
        }
    }

    public C010105w A51(Runnable runnable, String str, int i, int i2, int i3) {
        AnonymousClass1QE r2 = this.A0K;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A10.append(i);
        A10.append(" message:");
        AnonymousClass8BV.A1E(r2, str, A10);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(str);
        A002.A0Z(new C20139A9a(this, i, 1, runnable), i2);
        A002.A0X(new A9V(this, i, 2), i3);
        A002.A0T(true);
        A002.A0G(new A9O(this, i, 0));
        return A002.create();
    }

    public C010105w A52(Runnable runnable, String str, String str2, int i, int i2, int i3) {
        AnonymousClass1QE r2 = this.A0K;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A10.append(i);
        A10.append(" message:");
        A10.append(str2);
        A10.append("title: ");
        AnonymousClass8BV.A1E(r2, str, A10);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(str2);
        A002.A0k(str);
        A002.A0Z(new C20139A9a(this, i, 2, runnable), i2);
        A002.A0X(new A9V(this, i, 3), i3);
        A002.A0T(true);
        A002.A0G(new A9O(this, i, 1));
        return A002.create();
    }

    public void A53() {
        if (this.A03 != null) {
            A1E(this);
            return;
        }
        C17890vO.A0u(new C177839Au(this, true), this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if ((r1 instanceof X.AnonymousClass91M) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A54() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiStepUpActivity
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1 instanceof X.AnonymousClass91R
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.A0F = r0
        L_0x0013:
            r1.CEx()
        L_0x0016:
            r0 = 19
            X.AnonymousClass4Yv.A01(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiChangePinActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof X.AnonymousClass91M
            if (r0 == 0) goto L_0x0013
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91S.A54():void");
    }

    public void A56() {
        if (this instanceof IndiaUpiInternationalDeactivationActivity) {
            throw AnonymousClass8BY.A0b();
        } else if (this instanceof IndiaUpiInternationalActivationActivity) {
            C73203Rj A0E2 = AnonymousClass8BW.A0E(this);
            A0E2.A0k(getString(2131894220));
            C108955ca.A1D(this, A0E2, 2131897646);
            C20155A9r.A00(A0E2, this, 25, 2131898783);
            AnonymousClass3MY.A1G(A0E2);
        } else if (this instanceof IndiaUpiStepUpActivity) {
            String A002 = A1D(this).A00(this);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment, this, (String) null);
        } else if (this instanceof AnonymousClass91R) {
            AnonymousClass91R r2 = (AnonymousClass91R) this;
            r2.A5W(new A7B(C20752AXh.A00(r2.A04, 0)));
        } else if (this instanceof IndiaUpiPauseMandateActivity) {
            C19967A1c A1D = A1D(this);
            overridePendingTransition(0, 0);
            String A003 = A1D.A00(this);
            LegacyMessageDialogFragment legacyMessageDialogFragment2 = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment2.A1R(AnonymousClass8BX.A0E(A003));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment2, this, (String) null);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            C19967A1c A022 = this.A01.A02(this.A04, 0);
            A4p();
            if (A022.A00 == 0) {
                A022.A00 = 2131893867;
            }
            overridePendingTransition(0, 0);
            String A004 = A022.A00(this);
            LegacyMessageDialogFragment legacyMessageDialogFragment3 = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment3.A1R(AnonymousClass8BX.A0E(A004));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment3, this, (String) null);
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
            String A005 = A1D(this).A00(this);
            LegacyMessageDialogFragment legacyMessageDialogFragment4 = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment4.A1R(AnonymousClass8BX.A0E(A005));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment4, this, (String) null);
        } else if (this instanceof IndiaUpiChangePinActivity) {
            C19967A1c A023 = this.A01.A02(this.A04, 0);
            A4p();
            if (A023.A00 == 0) {
                A023.A00 = 2131893827;
            }
            BhR(A023.A00(this));
        } else if (this instanceof AnonymousClass91M) {
            AnonymousClass91M r3 = (AnonymousClass91M) this;
            r3.A5H(r3.A01.A02(r3.A04, 0));
        } else {
            C19967A1c A1D2 = A1D(this);
            C73203Rj A006 = AnonymousClass4a6.A00(this);
            A006.A0S(A1D2.A00(this));
            C20336AGs.A01(this, A006, 20, 2131899286);
            A006.A0T(true);
            A9Q.A00(A006, this, 15);
            AnonymousClass3MY.A1G(A006);
        }
    }

    public void A57() {
        String str;
        UserJid userJid;
        AnonymousClass1E7 A012;
        UserJid userJid2;
        if (this instanceof IndiaUpiInternationalDeactivationActivity) {
            throw AnonymousClass8BY.A0b();
        } else if (this instanceof IndiaUpiInternationalActivationActivity) {
            throw new UnsupportedOperationException(((IndiaUpiInternationalActivationActivity) this).A0C.A03("showMainPaneAfterPayAppRegistered unsupported"));
        } else if (!(this instanceof IndiaUpiStepUpActivity) && !(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity)) {
            if (this instanceof IndiaUpiSendPaymentActivity) {
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
                AnonymousClass1BI r1 = indiaUpiSendPaymentActivity.A0G;
                if (C22971Dz.A0e(r1)) {
                    userJid = indiaUpiSendPaymentActivity.A0J;
                    if (userJid == null) {
                        indiaUpiSendPaymentActivity.A4f(AnonymousClass3MY.A09(indiaUpiSendPaymentActivity));
                        return;
                    }
                } else {
                    userJid = C22941Dw.A00(r1);
                }
                indiaUpiSendPaymentActivity.A0F = userJid;
                if (indiaUpiSendPaymentActivity.A4y()) {
                    A012 = null;
                } else {
                    A012 = indiaUpiSendPaymentActivity.A06.A01(indiaUpiSendPaymentActivity.A0F);
                }
                indiaUpiSendPaymentActivity.A08 = A012;
                boolean z = false;
                if (C20061A5k.A02(indiaUpiSendPaymentActivity.A0J) && (userJid2 = indiaUpiSendPaymentActivity.A0F) != null) {
                    C177939Be r12 = new C177939Be(userJid2, indiaUpiSendPaymentActivity, true);
                    indiaUpiSendPaymentActivity.A08 = r12;
                    AnonymousClass3MW.A1T(r12, indiaUpiSendPaymentActivity.A05, 0);
                    indiaUpiSendPaymentActivity.CNA(2131895077);
                } else if ((C20061A5k.A02(indiaUpiSendPaymentActivity.A0J) || !indiaUpiSendPaymentActivity.A02.A04(indiaUpiSendPaymentActivity.A0J)) && (indiaUpiSendPaymentActivity.A0F == null || !AnonymousClass3MW.A0V(indiaUpiSendPaymentActivity.A0E).A0P(C22941Dw.A00(indiaUpiSendPaymentActivity.A0F)))) {
                    IndiaUpiSendPaymentActivity.A0r(indiaUpiSendPaymentActivity);
                } else {
                    indiaUpiSendPaymentActivity.A04.A00(indiaUpiSendPaymentActivity, new AOG(indiaUpiSendPaymentActivity, 1), indiaUpiSendPaymentActivity.A0F, indiaUpiSendPaymentActivity.A0J, true, false);
                }
                if (indiaUpiSendPaymentActivity.A0F == null && AnonymousClass8BR.A1P(indiaUpiSendPaymentActivity)) {
                    boolean A4y = indiaUpiSendPaymentActivity.A4y();
                    if (indiaUpiSendPaymentActivity.A0Y != null) {
                        z = true;
                    }
                    if (A4y && !z) {
                        indiaUpiSendPaymentActivity.A05.CGN(new C21427Aju(indiaUpiSendPaymentActivity, 4));
                    }
                }
            } else if (!(this instanceof AnonymousClass92s) && !(this instanceof IndiaUpiInterOpHybridActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
                    if (!indiaUpiChangePinActivity.A04.A07.contains("pin-entry-ui")) {
                        if (!(indiaUpiChangePinActivity.getIntent() == null || AnonymousClass3MY.A09(indiaUpiChangePinActivity) == null)) {
                            indiaUpiChangePinActivity.A02 = (AnonymousClass8pN) AnonymousClass3MY.A09(indiaUpiChangePinActivity).get("extra_bank_account");
                        }
                        if (indiaUpiChangePinActivity.A02 == null) {
                            C17890vO.A0u(new C177729Ai(indiaUpiChangePinActivity), indiaUpiChangePinActivity.A05);
                            return;
                        }
                        indiaUpiChangePinActivity.A04.A00("pin-entry-ui");
                        AnonymousClass8pN r0 = indiaUpiChangePinActivity.A02;
                        if (r0 != null) {
                            indiaUpiChangePinActivity.A5A(r0.A08);
                            return;
                        }
                        indiaUpiChangePinActivity.A05.A06("could not find bank account; showErrorAndFinish");
                        indiaUpiChangePinActivity.A56();
                    }
                } else if (this instanceof AnonymousClass91M) {
                    AnonymousClass91M r3 = (AnonymousClass91M) this;
                    if (!r3.A04.A07.contains("pin-entry-ui")) {
                        AnonymousClass1QE r4 = r3.A03;
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("showMainPaneAfterPayAppRegistered: bankAccount: ");
                        A10.append(r3.A00);
                        A10.append(" inSetup: ");
                        AnonymousClass8BW.A1D(r4, A10, r3.A0l);
                        r3.A04.A00("pin-entry-ui");
                        AnonymousClass8pN r02 = r3.A00;
                        if (r02 != null) {
                            C170278pb r2 = r02.A08;
                            AnonymousClass8pS r13 = (AnonymousClass8pS) r2;
                            if (r13 == null) {
                                str = "could not find bank info to reset pin";
                            } else if (!r3.A0l || !C170278pb.A03(r13)) {
                                r3.A5B(r2);
                                return;
                            } else {
                                r4.A06("showOrCheckPin insetup and upi pin already set; showSuccessAndFinish");
                                r3.A0K.A0B("2fa");
                                r3.CEx();
                                r3.A4o();
                                Intent A0A2 = C17880vN.A0A();
                                A0A2.putExtra("extra_bank_account", r3.A00);
                                C72453Mb.A16(r3, A0A2);
                                return;
                            }
                        } else {
                            str = "could not find bank account";
                        }
                        r4.A06(str);
                        r3.A56();
                    }
                }
            }
        }
    }

    public void A58(AnonymousClass1KN r26, C1418477e r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        AnonymousClass190 r1;
        String str9;
        AnonymousClass1QE r5 = this.A0K;
        r5.A06("getCredentials for pin check called");
        Object obj = r27.A00;
        C17960vV.A07(obj);
        String BHG = ((AZF) this.A0D.get()).A00.BHG(AnonymousClass000.A0M(obj));
        C1418477e A0E2 = this.A0N.A0E();
        String str10 = str;
        if (TextUtils.isEmpty(str10) || TextUtils.isEmpty(BHG) || A0E2.A00 == null) {
            if (TextUtils.isEmpty(str10)) {
                r1 = this.A03;
                str9 = "india-upi-pay-empty-key-xml";
            } else {
                boolean isEmpty = TextUtils.isEmpty(BHG);
                r1 = this.A03;
                if (isEmpty) {
                    str9 = "india-upi-pay-empty-cred-block";
                } else {
                    str9 = "india-upi-pay-empty-token";
                }
            }
            r1.A0G(str9, (String) null, false);
            r5.A06("getCredentials for set got empty xml or controls or token");
            A54();
            return;
        }
        String str11 = str4;
        if (!TextUtils.isEmpty(str11)) {
            String str12 = str3;
            if (!TextUtils.isEmpty(str12)) {
                String str13 = str7;
                if (!TextUtils.isEmpty(str13)) {
                    WeakReference A0z = AnonymousClass3MW.A0z(this);
                    String str14 = this.A0J;
                    String str15 = this.A0h;
                    String str16 = this.A0e;
                    AnonymousClass1KN r6 = r26;
                    String str17 = str14;
                    String str18 = str15;
                    String str19 = str16;
                    ((AZF) this.A0D.get()).CO0(r6, A0E2, this.A06, new AZA(this), str10, str2, str12, str11, str5, str6, str13, str8, str17, BHG, str18, str19, A0z, i, this.A0z);
                    return;
                }
            }
        }
        r5.A06("getCredentials for set got empty for sender/receiver vpa or payee name");
        this.A03.A0G("india-upi-pay-empty-receiver-details", (String) null, false);
        A56();
    }

    public void A59(C20284AEs aEs) {
        C170278pb r0;
        if (aEs != null) {
            r0 = aEs.A08;
        } else {
            r0 = null;
        }
        A5A(r0);
    }

    public void A5A(C170278pb r3) {
        String str;
        if (r3 != null) {
            str = ((AnonymousClass8pS) r3).A09;
        } else {
            str = null;
        }
        this.A07.A02(str);
    }

    public void A5B(C170278pb r6) {
        int i = this.A0H;
        if (i >= 3) {
            AnonymousClass1QE r2 = this.A0K;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("startShowPinFlow at count: ");
            A10.append(i);
            A10.append(" max: ");
            A10.append(3);
            AnonymousClass8BV.A1E(r2, "; showErrorAndFinish", A10);
            A56();
        } else if (this.A07 != null) {
            A5A(r6);
        }
    }

    public void A5D(AnonymousClass8pS r15, String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        AnonymousClass1QE r1 = this.A0K;
        r1.A06("getCredentials for pin setup called.");
        int i2 = i;
        if (r15 != null) {
            str5 = ((AZF) this.A0D.get()).BPg(r15, i2, z);
        } else {
            str5 = null;
        }
        C1418477e A0E2 = this.A0N.A0E();
        String str6 = str;
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str5) || A0E2.A00 == null) {
            r1.A06("getCredentials for set got empty xml or controls or token");
            A54();
            return;
        }
        WeakReference A0z = AnonymousClass3MW.A0z(this);
        ((AZF) this.A0D.get()).CNz(A0E2, new AZA(this), str6, str2, str3, str4, str5, this.A0h, this.A0e, this.A0J, A0z, i2);
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [X.9NX, java.lang.Object] */
    public void A5E(HashMap hashMap) {
        String str;
        C178749Eh r10;
        C175838zM r8;
        C1418477e r6;
        String str2;
        C1418477e r7;
        String str3;
        String str4;
        C178749Eh r9;
        A1l a1l;
        HashMap hashMap2 = hashMap;
        if (this instanceof IndiaUpiInternationalDeactivationActivity) {
            IndiaUpiInternationalDeactivationActivity indiaUpiInternationalDeactivationActivity = (IndiaUpiInternationalDeactivationActivity) this;
            Intent putExtra = C72463Mc.A0G(hashMap2).putExtra("DEACTIVATION_MPIN_BLOB", AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, indiaUpiInternationalDeactivationActivity.A0M.A07("MPIN", hashMap2, 3), "pin"));
            C1418477e r2 = indiaUpiInternationalDeactivationActivity.A01;
            if (r2 != null) {
                C72453Mb.A16(indiaUpiInternationalDeactivationActivity, putExtra.putExtra("DEACTIVATION_SEQ_NUMBER", r2));
                return;
            }
            str = "seqNumber";
        } else if (this instanceof IndiaUpiInternationalActivationActivity) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = (IndiaUpiInternationalActivationActivity) this;
            C18070vi.A0d(hashMap2, 0);
            DatePicker datePicker = indiaUpiInternationalActivationActivity.A01;
            if (datePicker == null) {
                str = "endDatePicker";
            } else {
                long A032 = IndiaUpiInternationalActivationActivity.A03(datePicker);
                IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = (IndiaUpiInternationalActivationViewModel) indiaUpiInternationalActivationActivity.A0D.getValue();
                AnonymousClass8pN r72 = indiaUpiInternationalActivationActivity.A05;
                str = "paymentBankAccount";
                if (r72 != null) {
                    C1418477e r62 = indiaUpiInternationalActivationActivity.A06;
                    if (r62 != null) {
                        String str5 = r72.A0A;
                        C18070vi.A0X(str5);
                        C144717Ik A0Z = AnonymousClass8BR.A0Z();
                        Class cls = Long.TYPE;
                        C194519rr r0 = new C194519rr(AnonymousClass8BR.A0Y(A0Z, cls, Long.valueOf(indiaUpiInternationalActivationActivity.A00), "cardExpiryDate"), AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, Long.valueOf(A032), "cardExpiryDate"), str5);
                        String str6 = indiaUpiInternationalActivationActivity.A0f;
                        C170278pb r3 = r72.A08;
                        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                        AnonymousClass8pS r32 = (AnonymousClass8pS) r3;
                        String A072 = indiaUpiInternationalActivationViewModel.A02.A07("MPIN", hashMap2, 3);
                        if (r32.A08 != null) {
                            AnonymousClass1DT r92 = indiaUpiInternationalActivationViewModel.A00;
                            A1l a1l2 = (A1l) r92.A06();
                            if (a1l2 != null) {
                                a1l = new A1l(a1l2.A00, a1l2.A01, true);
                            } else {
                                a1l = null;
                            }
                            r92.A0F(a1l);
                            C20112A7u A033 = C20112A7u.A03(new C20112A7u[0]);
                            A033.A07("payments_request_name", "activate_international_payments");
                            C20087A6p.A02(A033, indiaUpiInternationalActivationViewModel.A03, (Integer) null, "international_payment_prompt", str6, 3);
                            C175608yz r5 = (C175608yz) indiaUpiInternationalActivationViewModel.A06.get();
                            C1418477e r73 = r32.A08;
                            C18070vi.A0b(r73);
                            String str7 = r32.A0E;
                            if (str7 == null) {
                                str7 = "";
                            }
                            C1418477e A0Y = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, A072, "pin");
                            C1418477e r4 = r32.A05;
                            if (r4 != null) {
                                C184929bk r33 = new C184929bk(r0, indiaUpiInternationalActivationViewModel);
                                C18070vi.A0d(r73, 0);
                                Log.i("PAY: activateInternationalPayments called");
                                AnonymousClass00H r82 = r5.A02;
                                String A0T = C17890vO.A0T(r82);
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                long seconds = timeUnit.toSeconds(C17880vN.A05(C20061A5k.A01(r0.A01)));
                                long seconds2 = timeUnit.toSeconds(C17880vN.A05(C20061A5k.A01(r0.A00)));
                                String A0h = AnonymousClass8BS.A0h(r73);
                                String str8 = r0.A02;
                                String A012 = r5.A00.A01();
                                C18070vi.A0X(A012);
                                AnonymousClass9F7 r102 = new AnonymousClass9F7(A0T, A0h, str7, str8, A012, AnonymousClass8BS.A0h(A0Y), AnonymousClass8BS.A0h(r62), AnonymousClass8BS.A0h(r4), seconds, seconds2);
                                C17880vN.A0U(r82).A0I(new C20996Aco(r102, r33, 16), (C29621ca) r102.A00, A0T, 204, 0);
                                return;
                            }
                            throw C17880vN.A0g();
                        }
                        return;
                    }
                    str = "seqNumber";
                }
            }
        } else if (this instanceof IndiaUpiStepUpActivity) {
            IndiaUpiStepUpActivity indiaUpiStepUpActivity = (IndiaUpiStepUpActivity) this;
            indiaUpiStepUpActivity.A08.A06("onGetCredentials called");
            AnonymousClass8Fe r52 = indiaUpiStepUpActivity.A05;
            AnonymousClass1DT r34 = r52.A00;
            A46.A00(r52.A04.A00, r34, 2131893787);
            AnonymousClass8pN r22 = r52.A05;
            AnonymousClass8pS r42 = (AnonymousClass8pS) r22.A08;
            if (r42 == null) {
                A46.A01(r34);
                ? obj = new Object();
                obj.A00 = 2;
                r52.A02.A0F(obj);
                return;
            }
            ArrayList A13 = AnonymousClass000.A13();
            C17890vO.A11("vpa", (String) C20061A5k.A01(r42.A08), A13);
            if (!TextUtils.isEmpty(r42.A0E)) {
                C17890vO.A11("vpa-id", r42.A0E, A13);
            }
            C17890vO.A11("seq-no", r52.A03, A13);
            C17890vO.A11("upi-bank-info", (String) AnonymousClass8BT.A0q(r42.A05), A13);
            C17890vO.A11("device-id", r52.A08.A01(), A13);
            C17890vO.A11("credential-id", r22.A0A, A13);
            C17890vO.A11("mpin", r52.A01.A07("MPIN", hashMap2, 3), A13);
            C29621ca A0k = AnonymousClass8BR.A0k("mpin", AnonymousClass8BT.A1b(A13, 0));
            r52.A07.A00(new C20780AYj(r52), r52.A06.A04(), A0k, (String) null);
            return;
        } else if (this instanceof AnonymousClass91R) {
            AnonymousClass91R r1 = (AnonymousClass91R) this;
            if (r1.A0B != null) {
                r1.A0M.A06 = hashMap2;
                r1.A05.A0J(C21447AkE.A00(r1, 33));
                if (AnonymousClass91R.A1C(r1)) {
                    r1.A0Y = true;
                    if (r1.A0a) {
                        if (r1.A0c) {
                            Intent A0A2 = C17880vN.A0A();
                            AnonymousClass91R.A15(A0A2, r1);
                            C72453Mb.A16(r1, A0A2);
                            return;
                        }
                        Intent A073 = AnonymousClass8BR.A07(r1, IndiaUpiPaymentSettingsActivity.class);
                        AnonymousClass91R.A15(A073, r1);
                        r1.finish();
                        r1.startActivity(A073);
                        return;
                    } else if (r1.A0b) {
                        return;
                    }
                }
                r1.A5Z(r1.A5G(r1.A09, r1.A01), false);
                return;
            }
            return;
        } else if (this instanceof IndiaUpiChangePinActivity) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
            AnonymousClass8pS A0N = AnonymousClass8BU.A0N(indiaUpiChangePinActivity.A05, indiaUpiChangePinActivity.A02.A08, "IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData");
            C175838zM r11 = indiaUpiChangePinActivity.A07;
            C1418477e r93 = A0N.A08;
            String str9 = A0N.A0E;
            C1418477e r103 = A0N.A05;
            String str10 = indiaUpiChangePinActivity.A02.A0A;
            String str11 = indiaUpiChangePinActivity.A03;
            if (C20061A5k.A02(r93)) {
                r11.A03.A02(r11.A01, (C196259ui) null, new AYD(r103, r11, str10, str11, hashMap2));
                return;
            } else {
                C175838zM.A01(r93, r103, r11, str9, str10, str11, hashMap2);
                return;
            }
        } else if (this instanceof AnonymousClass91M) {
            AnonymousClass91M r12 = (AnonymousClass91M) this;
            r12.CNA(2131894216);
            String str12 = r12.A02;
            if (r12 instanceof IndiaUpiDebitCardVerificationActivity) {
                IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) r12;
                C170278pb r53 = indiaUpiDebitCardVerificationActivity.A05.A08;
                C17960vV.A07(r53);
                AnonymousClass8pS r54 = (AnonymousClass8pS) r53;
                r9 = new C178749Eh(indiaUpiDebitCardVerificationActivity.A09, indiaUpiDebitCardVerificationActivity.A07, indiaUpiDebitCardVerificationActivity.A08, 16);
                r8 = indiaUpiDebitCardVerificationActivity.A07;
                r6 = r54.A08;
                str2 = r54.A0E;
                r7 = r54.A05;
                str3 = indiaUpiDebitCardVerificationActivity.A05.A0A;
                str4 = "BANK";
                r10 = null;
            } else {
                IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity = (IndiaUpiAadhaarCardVerificationActivity) r12;
                C18070vi.A0d(hashMap2, 1);
                AnonymousClass8pN r02 = indiaUpiAadhaarCardVerificationActivity.A02;
                if (r02 != null) {
                    C170278pb r35 = r02.A08;
                    C18070vi.A0z(r35, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                    C17960vV.A07(r35);
                    C18070vi.A0X(r35);
                    AnonymousClass8pS r36 = (AnonymousClass8pS) r35;
                    String str13 = indiaUpiAadhaarCardVerificationActivity.A06;
                    C17960vV.A07(str13);
                    C18070vi.A0X(str13);
                    String str14 = indiaUpiAadhaarCardVerificationActivity.A07;
                    C17960vV.A07(str14);
                    C18070vi.A0X(str14);
                    r10 = new C178749Eh(str13, str14);
                    r8 = indiaUpiAadhaarCardVerificationActivity.A07;
                    r6 = r36.A08;
                    str2 = r36.A0E;
                    r7 = r36.A05;
                    AnonymousClass8pN r03 = indiaUpiAadhaarCardVerificationActivity.A02;
                    if (r03 != null) {
                        str3 = r03.A0A;
                        str4 = "AADHAAR";
                        r9 = null;
                    }
                }
                C18070vi.A11("bankAccount");
                throw null;
            }
            if (C20061A5k.A02(r6)) {
                r8.A03.A02(r8.A01, r8.A00, new AYF(r7, r8, r9, r10, str3, str12, str4, hashMap2));
                return;
            } else {
                C175838zM.A00(r6, r7, r8, r9, r10, str2, str3, str12, str4, hashMap2);
                return;
            }
        } else if (this instanceof AnonymousClass933) {
            AnonymousClass933 r13 = (AnonymousClass933) this;
            r13.A0M.A06("onGetCredentials called");
            r13.A5G(r13.A03, hashMap2);
            return;
        } else {
            IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this;
            C18070vi.A0d(hashMap2, 0);
            String A074 = indiaUpiFcsPinHandlerActivity.A0M.A07("MPIN", hashMap2, IndiaUpiFcsPinHandlerActivity.A03(indiaUpiFcsPinHandlerActivity.A5F()));
            C1418477e r04 = indiaUpiFcsPinHandlerActivity.A03;
            String str15 = null;
            if (r04 == null) {
                C18070vi.A11("seqNumber");
                throw null;
            }
            Object obj2 = r04.A00;
            if (C18070vi.A18(indiaUpiFcsPinHandlerActivity.A5F(), "pay")) {
                str15 = AnonymousClass1PP.A00(indiaUpiFcsPinHandlerActivity.A02, indiaUpiFcsPinHandlerActivity.A05, false);
            }
            if (A074 != null && obj2 != null) {
                AnonymousClass1D6[] r23 = new AnonymousClass1D6[2];
                AnonymousClass1D6.A03("mpin", A074, r23, 0);
                C108985cd.A1G("npci_common_library_transaction_id", obj2, r23);
                LinkedHashMap A0C2 = AnonymousClass1D7.A0C(r23);
                if (str15 != null) {
                    A0C2.put("nonce", str15);
                }
                C22579BDz A0Q = IndiaUpiFcsPinHandlerActivity.A0Q(indiaUpiFcsPinHandlerActivity);
                if (A0Q != null) {
                    A0Q.BLG(A0C2);
                }
                if (indiaUpiFcsPinHandlerActivity.A08) {
                    indiaUpiFcsPinHandlerActivity.A4o();
                    indiaUpiFcsPinHandlerActivity.finish();
                    return;
                }
                return;
            }
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public Dialog onCreateDialog(int i) {
        if (i != 19) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131893943);
        C20154A9q.A00(A002, this, 45, 2131898593);
        C20154A9q.A01(A002, this, 46, 2131892908);
        A002.A0T(true);
        A9Q.A00(A002, this, 24);
        return A002.create();
    }

    public void A55() {
        CNA(2131895077);
        this.A0F = true;
        AnonymousClass4Yv.A00(this, 19);
        this.A0G = true;
        this.A0H++;
        this.A0K.A06("showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys");
        this.A0N.A0L();
        A53();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            boolean z = false;
            if (i2 == 250) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                this.A0K.A07(AnonymousClass001.A1E(hashMap, "onLibraryResult for credentials: ", AnonymousClass000.A10()));
                if (hashMap != null && !hashMap.isEmpty()) {
                    z = true;
                }
                C17960vV.A0D(z);
                A5E(hashMap);
            } else if (i2 == 251) {
                A54();
            } else if (i2 == 252) {
                this.A0K.A06("user canceled");
                this.A0G = false;
                if (this.A0F) {
                    this.A0F = false;
                    CEx();
                    return;
                }
                A4o();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        this.A0J = AnonymousClass11S.A01(this.A02).user;
        this.A0I = this.A0A.A01();
        this.A04 = this.A0M.A04;
        AnonymousClass3MW.A1T(new C177839Au(this, false), this.A05, 0);
        if (getIntent() != null) {
            getIntent().getStringExtra("extra_request_id");
        }
        if (bundle != null) {
            this.A0G = bundle.getBoolean("payAppShowPinErrorSavedInst");
            this.A0H = bundle.getInt("showPinConfirmCountSavedInst");
            this.A03 = bundle.getInt("setupModeSavedInst", 1);
        }
        this.A07 = AnonymousClass91U.A1K(this);
        this.A06 = new C175758zE(this.A05, this.A0E, AnonymousClass8BT.A0M(this), this.A0M, this.A0N);
    }

    public void onDestroy() {
        super.onDestroy();
        C175838zM r1 = this.A07;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A02 = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A0G);
        bundle.putInt("showPinConfirmCountSavedInst", this.A0H);
        bundle.putInt("setupModeSavedInst", this.A03);
    }
}
