package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.IncentiveValuePropsActivity;
import com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.P2mLitePaymentSettingsActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public abstract class AZ9 implements BD1 {
    public AnonymousClass11P A00;
    public AnonymousClass1QL A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass1QS A05;
    public final AnonymousClass1R2 A06;
    public final String A07;
    public final AnonymousClass11C A08;
    public final C190659lJ A09;
    public final C189109iW A0A = new Object();

    public List A00(AW0 aw0, AnonymousClass205 r7) {
        String str;
        BD1 A002;
        C22555BCo BPe;
        AnonymousClass1MD BLu;
        AW0 A0J;
        String str2;
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "send", A13);
        if (aw0.A03 == 100) {
            str = "p2m";
        } else {
            str = "p2p";
        }
        C17890vO.A11("transaction-type", str, A13);
        if (C22971Dz.A0e(r7.A00)) {
            UserJid userJid = aw0.A0D;
            C17960vV.A07(userJid);
            C18070vi.A0X(userJid);
            C17890vO.A0n(userJid, "receiver", A13);
        }
        ArrayList arrayList = aw0.A0N;
        if (arrayList != null && arrayList.size() == 1) {
            String str3 = ((C185879dI) arrayList.get(0)).A01.A0A;
            C18070vi.A0X(str3);
            C17890vO.A11("credential-id", str3, A13);
        }
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 != null) {
            r0.A07(A13);
        }
        if (C20128A8n.A08(aw0.A0K)) {
            String str4 = aw0.A0K;
            C17960vV.A07(str4);
            C18070vi.A0X(str4);
            C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, A13);
        }
        if (!(aw0.A0M == null || (A0J = AnonymousClass8BU.A0J(AnonymousClass8BR.A0O(this.A05), aw0.A0M, (String) null)) == null || (str2 = A0J.A0K) == null)) {
            C17890vO.A11("request-id", str2, A13);
        }
        if (aw0.A00 == 1) {
            C17890vO.A11("payment_initiator", "buyer", A13);
        }
        String str5 = aw0.A0G;
        C18070vi.A0W(str5);
        if (str5.length() > 0) {
            String str6 = aw0.A0G;
            C18070vi.A0W(str6);
            C17890vO.A11("country", str6, A13);
            C17890vO.A11("version", String.valueOf(aw0.A04), A13);
        }
        C57312is A042 = this.A05.A04(aw0.A0G);
        if (!(A042 == null || (A002 = A042.A00(aw0.A0I)) == null || (BPe = A002.BPe()) == null || !BPe.Bgh() || (BLu = BPe.BLu(aw0.A0H)) == null)) {
            A13.add(BLu);
        }
        return A13;
    }

    public boolean BEG() {
        return true;
    }

    public int BPo(String str) {
        return 1000;
    }

    public C29621ca BV4(C22565BDa bDa) {
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[3];
        r3[0] = new AnonymousClass1MD("value", bDa.getValue());
        ARR arr = (ARR) bDa;
        r3[1] = new AnonymousClass1MD("offset", arr.A00);
        C17890vO.A12("currency", AnonymousClass8BU.A0n(arr), r3);
        return AnonymousClass8BR.A0k("money", r3);
    }

    public C22539BBw BWU(C18000vb r2, C18030ve r3, AnonymousClass72F r4, C189109iW r5) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0o(r2, r4, r5);
        return new AQ1(r2, r3, r4, r5);
    }

    public /* synthetic */ Intent BWv(Context context, String str) {
        C18070vi.A0d(context, 1);
        Intent A072 = AnonymousClass8BR.A07(context, BWu());
        AnonymousClass8BR.A1D(A072, str);
        return A072;
    }

    public AnonymousClass8pU BdM() {
        return null;
    }

    public boolean BEE() {
        if (this instanceof C176118zo) {
            return true;
        }
        return false;
    }

    public void BKJ(AW0 aw0, AW0 aw02) {
        C196219ue r0;
        String str;
        if ((this instanceof C176118zo) && aw02 != null) {
            C196219ue r1 = AnonymousClass8BS.A0C(aw0).A0H;
            C170318pf A0C = AnonymousClass8BS.A0C(aw02);
            if (r1 != null && (r0 = A0C.A0H) != null && (str = r0.A0D) != null) {
                r1.A0I = str;
            }
        }
    }

    public Class BMK() {
        if (this instanceof C176118zo) {
            return IndiaUpiBankAccountDetailsActivity.class;
        }
        if (this instanceof C176108zn) {
            return BrazilPaymentCardDetailsActivity.class;
        }
        return null;
    }

    public Intent BML(Context context) {
        if (this instanceof C176108zn) {
            return AnonymousClass8BR.A07(context, BrazilAccountRecoveryPinActivity.class);
        }
        return null;
    }

    public Class BMM() {
        if (this instanceof C176118zo) {
            return IndiaUpiPaymentsAccountSetupActivity.class;
        }
        if (this instanceof C176108zn) {
            return BrazilPayBloksActivity.class;
        }
        return null;
    }

    public Intent BMN(Context context) {
        if (!(this instanceof C176108zn)) {
            return null;
        }
        Intent A032 = AnonymousClass8BS.A03(context);
        A032.putExtra("screen_name", A5Y.A01(((C176108zn) this).A0P, "p2p_context", false));
        AnonymousClass8k7.A03(A032, "referral_screen", "payment_home");
        AnonymousClass8k7.A03(A032, "onboarding_context", "generic_context");
        return A032;
    }

    public Class BOX() {
        if (this instanceof C176118zo) {
            return IndiaUpiCheckBalanceActivity.class;
        }
        return null;
    }

    public String BOY() {
        if (this instanceof C176118zo) {
            return "upi_p2p_check_balance";
        }
        return "";
    }

    public C190659lJ BOu() {
        if (!(this instanceof C176118zo)) {
            return this.A09;
        }
        AnonymousClass118 r3 = this.A04;
        return new C190659lJ(this.A02, this.A03, r3);
    }

    public Class BPG() {
        if (this instanceof C176108zn) {
            return BrazilPaymentContactOmbudsmanActivity.class;
        }
        return null;
    }

    public Class BPH() {
        if (this instanceof C176118zo) {
            return DescribeProblemActivity.class;
        }
        if (this instanceof C176108zn) {
            return BrazilPaymentContactSupportActivity.class;
        }
        return null;
    }

    public Class BPI() {
        if (!(this instanceof C176108zn)) {
            return null;
        }
        if (C18020vd.A05(C18040vf.A02, ((C176108zn) this).A0L.A02, 1615)) {
            return BrazilPaymentContactSupportP2pActivity.class;
        }
        return null;
    }

    public AnonymousClass3M8 BPV() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0E;
        }
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0D;
        }
        return null;
    }

    public C196199uc BPW() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0B;
        }
        return null;
    }

    public BDG BPY() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0C;
        }
        if (!(this instanceof C176108zn)) {
            return null;
        }
        C176108zn r0 = (C176108zn) this;
        AnonymousClass118 r1 = r0.A04;
        C18030ve r3 = r0.A0B;
        AnonymousClass1LU r4 = r0.A0C;
        C18000vb r2 = r0.A0A;
        AnonymousClass1QO r8 = r0.A0L;
        BD4 bd4 = r0.A0M;
        return new C20751AXg(r1, r2, r3, r4, r0.A0F, r0.A0I, r0.A0K, r8, bd4);
    }

    public C22499BAg BPZ() {
        if (this instanceof C176118zo) {
            C176118zo r0 = (C176118zo) this;
            AnonymousClass118 r2 = r0.A04;
            AnonymousClass181 r1 = r0.A03;
            AnonymousClass1QS r6 = r0.A05;
            return new ARS(r1, r2, r0.A0E, r0.A0H, r0.A0I, r6);
        } else if (!(this instanceof C176108zn)) {
            return null;
        } else {
            C176108zn r12 = (C176108zn) this;
            AnonymousClass11P r4 = r12.A08;
            AnonymousClass1KB r22 = r12.A02;
            AnonymousClass181 r3 = r12.A05;
            AnonymousClass1QS r9 = r12.A05;
            AnonymousClass1QD r8 = r12.A0J;
            return new ART(r22, r3, r4, (C48052Kz) r12.A0T.get(), r12.A0H, r12.A0I, r8, r9, r12.A0N);
        }
    }

    public C22555BCo BPe() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0G;
        }
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0G;
        }
        return null;
    }

    public C192079nl BQ8() {
        if (!(this instanceof C176118zo)) {
            return null;
        }
        C176118zo r0 = (C176118zo) this;
        AnonymousClass11P r2 = r0.A06;
        C18030ve r4 = r0.A0A;
        AnonymousClass118 r3 = r0.A04;
        AnonymousClass18O r1 = r0.A02;
        AnonymousClass1R2 r10 = r0.A06;
        A8C a8c = r0.A0R;
        AnonymousClass1QL r6 = r0.A0H;
        AZ6 az6 = r0.A0M;
        return new C175368yb(r1, r2, r3, r4, r0.A0E, r6, r0.A0J, az6, a8c, r10);
    }

    public Intent BQO(Context context, Uri uri, boolean z) {
        if (this instanceof C176118zo) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP ");
            Class<IndiaUpiPaymentSettingsActivity> cls = IndiaUpiPaymentSettingsActivity.class;
            C17900vP.A0b(cls, A10);
            Intent A072 = AnonymousClass8BR.A07(context, cls);
            A072.putExtra("extra_is_invalid_deep_link_url", z);
            A072.putExtra("referral_screen", "deeplink");
            A072.putExtra("extra_deep_link_url", uri);
            return A072;
        }
        C18070vi.A0d(context, 0);
        return AnonymousClass8BR.A07(context, BWu());
    }

    public Intent BQP(Context context, Uri uri) {
        int length;
        if (this instanceof C176118zo) {
            C176118zo r3 = (C176118zo) this;
            boolean A002 = AnonymousClass9R4.A00(uri, r3.A0O);
            if (r3.A0H.A0D() || A002) {
                return r3.BQO(context, uri, A002);
            }
            Log.i("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Intent BQO = r3.BQO(context, uri, false);
            BQO.putExtra("actual_deep_link", uri.toString());
            C60442o2.A00(BQO, r3.A06, "deepLink");
            return BQO;
        } else if (this instanceof C176108zn) {
            C176108zn r2 = (C176108zn) this;
            if (AnonymousClass9R4.A00(uri, r2.A0O)) {
                return r2.BWv(context, "deeplink");
            }
            Intent BWz = r2.BWz(context, "generic_context", "deeplink");
            BWz.putExtra("extra_deep_link_url", uri);
            String stringExtra = BWz.getStringExtra("screen_name");
            if ("brpay_p_pin_nux_create".equals(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equals(stringExtra)) {
                AnonymousClass8k7.A03(BWz, "deep_link_continue_setup", "1");
            }
            if (r2.A0P.A07("p2p_context")) {
                return BWz;
            }
            String queryParameter = uri.getQueryParameter("c");
            if (queryParameter != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA"))) {
                return BWz;
            }
            AnonymousClass8k7.A03(BWz, "campaign_id", uri.getQueryParameter("c"));
            return BWz;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Class BMM = BMM();
            C17900vP.A0b(BMM, A10);
            Intent A072 = AnonymousClass8BR.A07(context, BMM);
            AnonymousClass11P r1 = this.A00;
            if (r1 != null) {
                C60442o2.A00(A072, r1, "deepLink");
                return A072;
            }
            C18070vi.A11("time");
            throw null;
        }
    }

    public int BQc() {
        if (this instanceof C176108zn) {
            return 2132083283;
        }
        return 0;
    }

    public Intent BR2(Context context, String str, String str2) {
        if (this instanceof C176088zl) {
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.P2mLiteDyiReportActivity");
            A0A2.putExtra("extra_paymentProvider", str2);
            A0A2.putExtra("extra_paymentAccountType", str);
            return A0A2;
        } else if (!(this instanceof C176108zn)) {
            return null;
        } else {
            Intent A072 = AnonymousClass8BR.A07(context, BrazilDyiReportActivity.class);
            A072.putExtra("extra_paymentProvider", str2);
            A072.putExtra("extra_paymentAccountType", str);
            return A072;
        }
    }

    public Intent BSq(Context context) {
        Intent A072;
        if (this instanceof C176118zo) {
            A072 = AnonymousClass8BR.A07(context, IndiaUpiIncentivesValuePropsActivity.class);
            A072.putExtra("extra_payments_entry_type", 1);
            A072.putExtra("extra_banner_type", 20);
        } else if (!(this instanceof C176108zn)) {
            return null;
        } else {
            A072 = AnonymousClass8BR.A07(context, IncentiveValuePropsActivity.class);
        }
        A072.putExtra("referral_screen", "in_app_banner");
        return A072;
    }

    public Intent BTA(Context context) {
        if (this instanceof C176108zn) {
            return AnonymousClass8BR.A07(context, BYz());
        }
        C18070vi.A0d(context, 0);
        AnonymousClass1QL r0 = this.A01;
        if (r0 != null) {
            if (!r0.A0E()) {
                AnonymousClass1QL r02 = this.A01;
                if (r02 != null) {
                    if (!r02.A0C()) {
                        Intent A072 = AnonymousClass8BR.A07(context, this.A05.A06().BMM());
                        A072.putExtra("extra_setup_mode", 1);
                        return A072;
                    }
                }
            }
            return AnonymousClass8BR.A07(context, this.A05.A06().BYz());
        }
        C18070vi.A11("paymentAccountSetup");
        throw null;
    }

    public String BUO(C20284AEs aEs) {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0F.A05(aEs);
        }
        return "";
    }

    public A5D BUf() {
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0E;
        }
        return null;
    }

    public Class BVG(Bundle bundle) {
        String A1H;
        if (!(this instanceof C176108zn)) {
            return null;
        }
        ((C176108zn) this).A0S.get();
        String string = bundle.getString("nfm_action");
        if (TextUtils.isEmpty(string)) {
            A1H = "[PAY]: BrazilPayNFMController -- NFM action not passed";
        } else {
            switch (string.hashCode()) {
                case -229223458:
                    if (string.equals("wa_payment_learn_more")) {
                        return WaInAppBrowsingActivity.class;
                    }
                    break;
                case 48886399:
                    if (string.equals("payments_care_csat")) {
                        return CsatSurveyBloksActivity.class;
                    }
                    break;
                case 127237947:
                    if (string.equals("wa_payment_fbpin_reset")) {
                        return BrazilPayBloksActivity.class;
                    }
                    break;
                case 540952115:
                    if (string.equals("wa_payment_transaction_details")) {
                        return BrazilPaymentTransactionDetailActivity.class;
                    }
                    break;
            }
            A1H = AnonymousClass001.A1H("[PAY]: BrazilPayNFMController -- Unsupported NFM action: ", string, AnonymousClass000.A10());
        }
        Log.e(A1H);
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.B8c] */
    public C22444B8c BWK() {
        if (this instanceof C176118zo) {
            return new C20762AXr(((C176118zo) this).A0K);
        }
        if (this instanceof C176108zn) {
            return new Object();
        }
        return null;
    }

    public List BWQ(AW0 aw0, AnonymousClass205 r6) {
        AnonymousClass8pG r2 = aw0.A0A;
        C22565BDa bDa = null;
        if (aw0.A0K()) {
            return null;
        }
        if (r2 != null) {
            bDa = r2.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (bDa != null) {
            AnonymousClass8BT.A1J(BV4(bDa), "amount", A13, new AnonymousClass1MD[0]);
        }
        return A13;
    }

    public C20008A2y BWS() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0P;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.BB4, java.lang.Object] */
    public BB4 BWW() {
        if (this instanceof C176118zo) {
            C176118zo r3 = (C176118zo) this;
            C18030ve r8 = r3.A0A;
            AnonymousClass1KB r4 = r3.A01;
            AnonymousClass118 r5 = r3.A04;
            AnonymousClass10I r2 = r3.A0T;
            AnonymousClass1OZ A0U = C17880vN.A0U(r3.A0U);
            C30931ek r1 = r3.A0S;
            AnonymousClass1QS r14 = r3.A05;
            A0B a0b = r3.A0N;
            A7U a7u = r3.A0D;
            C31061ex r13 = r3.A0L;
            AnonymousClass1KI r7 = r3.A09;
            C30931ek r17 = r1;
            return new C20746AXb(r4, r5, r3.A08, r7, r8, A0U, r3.A0B, a7u, AnonymousClass8BR.A0a(r3.A0V), r13, r14, a0b, r3.A0Q, r17, r2);
        } else if (this instanceof C176108zn) {
            return new Object();
        } else {
            return null;
        }
    }

    public BDQ BWY() {
        if (this instanceof C176118zo) {
            return ((C176118zo) this).A0O;
        }
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0O;
        }
        return null;
    }

    public C191109m2 BWZ(AnonymousClass118 r3, AnonymousClass1QD r4) {
        if (this instanceof C176118zo) {
            AnonymousClass11C r1 = ((C176118zo) this).A05;
            C18070vi.A0o(r3, r1, r4);
            return new C191109m2(r1, r3, r4);
        } else if (this instanceof C176108zn) {
            AnonymousClass11C r12 = ((C176108zn) this).A07;
            C18070vi.A0o(r3, r12, r4);
            return new C191109m2(r12, r3, r4);
        } else {
            C18070vi.A0h(r3, r4);
            return new C191109m2(this.A08, r3, r4);
        }
    }

    public int BWa() {
        if (this instanceof C176088zl) {
            return 2131899103;
        }
        if (this instanceof C176118zo) {
            return 2131891340;
        }
        if (this instanceof C176108zn) {
            return 2131887410;
        }
        return 0;
    }

    public Class BWb() {
        if (this instanceof C176108zn) {
            return BrazilFbPayHubActivity.class;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.6Ug] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.6Ug] */
    public C123386Ug BWd() {
        if (this instanceof C176118zo) {
            return new Object();
        }
        if (this instanceof C176108zn) {
            return new Object();
        }
        return null;
    }

    public Class BWe() {
        if (this instanceof C176118zo) {
            return IndiaPaymentTransactionHistoryActivity.class;
        }
        if (this instanceof C176108zn) {
            return PaymentTransactionHistoryActivity.class;
        }
        return null;
    }

    public int BWg() {
        if (this instanceof C176118zo) {
            return 2131891337;
        }
        return 0;
    }

    public Pattern BWh() {
        if (this instanceof C176118zo) {
            return AnonymousClass9U9.A00;
        }
        return null;
    }

    public C196079uQ BWi() {
        if (this instanceof C176118zo) {
            C176118zo r0 = (C176118zo) this;
            AnonymousClass11P r5 = r0.A06;
            C18030ve r7 = r0.A0A;
            C40751vD r2 = r0.A04;
            AnonymousClass1R2 r9 = r0.A06;
            return new C175398ye(r0.A00, r2, r0.A02, r0.A03, r5, r0.A07, r7, r0.A0H, r9);
        } else if (!(this instanceof C176108zn)) {
            return null;
        } else {
            C176108zn r02 = (C176108zn) this;
            AnonymousClass11P r52 = r02.A08;
            C18030ve r72 = r02.A0B;
            C40751vD r22 = r02.A06;
            AnonymousClass1R2 r92 = r02.A0Q;
            return new C175388yd(r02.A01, r22, r02.A02, r02.A03, r52, r02.A0A, r72, r02.A0P, r92);
        }
    }

    public C187339fe BWj() {
        if (!(this instanceof C176118zo)) {
            return null;
        }
        C176118zo r0 = (C176118zo) this;
        AnonymousClass11P r1 = r0.A06;
        C18030ve r3 = r0.A0A;
        return new C187339fe(r1, r0.A04, r3, r0.A0H, r0.A06);
    }

    public /* synthetic */ Pattern BWk() {
        if (this instanceof C176118zo) {
            return AnonymousClass9U9.A01;
        }
        return null;
    }

    public String BWl(BDG bdg, AnonymousClass206 r3) {
        return this.A06.A0b(bdg, r3);
    }

    public C191399mX BWn() {
        if (!(this instanceof C176108zn)) {
            return null;
        }
        C176108zn r1 = (C176108zn) this;
        return new C191399mX(r1.A04.A00, r1.A00, r1.A03, r1.A05);
    }

    public Class BWo() {
        if (this instanceof C176118zo) {
            return IndiaUpiVpaContactInfoActivity.class;
        }
        return null;
    }

    public int BWp() {
        if (this instanceof C176118zo) {
            return 2131891339;
        }
        return 0;
    }

    public Class BWq() {
        if (this instanceof C176118zo) {
            return IndiaUpiProfileDetailsActivity.class;
        }
        return null;
    }

    public Intent BWr(Context context, String str, int i) {
        if (!(this instanceof C176118zo)) {
            return null;
        }
        Intent A072 = AnonymousClass8BR.A07(context, IndiaUpiQrTabActivity.class);
        A072.putExtra("extra_payments_entry_type", i);
        AnonymousClass8BR.A1D(A072, str);
        return A072;
    }

    public C160818Aa BWs() {
        if (this instanceof C176118zo) {
            C176118zo r0 = (C176118zo) this;
            AXS axs = r0.A0E;
            return new C20756AXl(r0.A02, r0.A0A, axs, r0.A0M, r0.A0R);
        } else if (this instanceof C176108zn) {
            return new C145177Kg(((C176108zn) this).A0B);
        } else {
            return null;
        }
    }

    public Class BWt() {
        if (this instanceof C176088zl) {
            return P2mLiteOrderDetailsActivity.class;
        }
        if (this instanceof C176118zo) {
            return IndiaUpiQuickBuyActivity.class;
        }
        if (this instanceof C176108zn) {
            return BrazilOrderDetailsActivity.class;
        }
        return null;
    }

    public Class BWu() {
        if (this instanceof C176088zl) {
            return P2mLitePaymentSettingsActivity.class;
        }
        if (this instanceof C176118zo) {
            return IndiaUpiPaymentSettingsActivity.class;
        }
        if (this instanceof C176108zn) {
            return BrazilPaymentSettingsActivity.class;
        }
        return null;
    }

    public C55832gR BWw() {
        if (!(this instanceof C176108zn)) {
            return null;
        }
        C176108zn r0 = (C176108zn) this;
        return new C55832gR(r0.A02, r0.A03, r0.A08, r0.A0J, r0.A0Q, r0.A0R);
    }

    public Class BWy() {
        if (this instanceof C176108zn) {
            return BrazilViralityLinkVerifierActivity.class;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent BWz(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C176118zo
            if (r0 == 0) goto L_0x001f
            r3 = r5
            X.8zo r3 = (X.C176118zo) r3
            android.content.Intent r2 = X.AnonymousClass8BS.A04(r6)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r1 = "inAppBanner"
            X.11P r0 = r3.A06
            X.C60442o2.A00(r2, r0, r1)
            return r2
        L_0x001f:
            boolean r0 = r5 instanceof X.C176108zn
            if (r0 == 0) goto L_0x0077
            r4 = r5
            X.8zn r4 = (X.C176108zn) r4
            java.lang.String r0 = "in_app_banner"
            if (r8 != r0) goto L_0x0067
            X.0ve r2 = r4.A0B
            r1 = 567(0x237, float:7.95E-43)
        L_0x002e:
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r2, r1)
        L_0x0034:
            X.A5Y r2 = r4.A0P
            r1 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = X.A5Y.A00(r2)
        L_0x0043:
            if (r3 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x005d
            android.content.Intent r2 = X.AnonymousClass8BS.A03(r6)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "referral_screen"
            X.AnonymousClass8k7.A03(r2, r0, r8)
        L_0x0055:
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "generic_context"
            X.AnonymousClass8k7.A03(r2, r1, r0)
            return r2
        L_0x005d:
            android.content.Intent r2 = r4.BWv(r6, r8)
            goto L_0x0055
        L_0x0062:
            java.lang.String r1 = X.A5Y.A01(r2, r7, r1)
            goto L_0x0043
        L_0x0067:
            java.lang.String r0 = "alt_virality"
            if (r8 != r0) goto L_0x0070
            X.0ve r2 = r4.A0B
            r1 = 570(0x23a, float:7.99E-43)
            goto L_0x002e
        L_0x0070:
            java.lang.String r0 = "deeplink"
            boolean r3 = X.AnonymousClass000.A1Z(r8, r0)
            goto L_0x0034
        L_0x0077:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZ9.BWz(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }

    public Class BX8() {
        if (this instanceof C176118zo) {
            return IndiaUpiPinPrimerFullSheetActivity.class;
        }
        return null;
    }

    public Class BYA() {
        if (this instanceof C176108zn) {
            return BrazilPaymentReportPaymentActivity.class;
        }
        return null;
    }

    public int BYb(AW0 aw0) {
        C196219ue r0;
        if (!(this instanceof C176118zo) || (r0 = AnonymousClass8BS.A0C(aw0).A0H) == null) {
            return 2131894002;
        }
        int A002 = r0.A00();
        if (A002 == 1) {
            return 2131894119;
        }
        if (A002 == 2) {
            return 2131893991;
        }
        if (A002 == 4) {
            return 2131894119;
        }
        if (A002 != 6) {
            return 2131894002;
        }
        return 2131893991;
    }

    public Class BYz() {
        if (this instanceof C176118zo) {
            if (C87544Vz.A00(((C176118zo) this).A0A)) {
                return IndiaUpiSendPaymentActivityBottomSheet.class;
            }
            return IndiaUpiSendPaymentActivity.class;
        } else if (!(this instanceof C176108zn)) {
            return null;
        } else {
            C176108zn r2 = (C176108zn) this;
            boolean A012 = r2.A0L.A01();
            boolean A002 = C87544Vz.A00(r2.A0B);
            if (A012) {
                if (A002) {
                    return BrazilSmbPaymentActivityBottomSheet.class;
                }
                return BrazilSmbPaymentActivity.class;
            } else if (A002) {
                return BrazilPaymentActivityBottomSheet.class;
            } else {
                return BrazilPaymentActivity.class;
            }
        }
    }

    public int Bah(AW0 aw0) {
        if ((this instanceof C176118zo) || (this instanceof C176108zn)) {
            return AnonymousClass1R2.A01(aw0);
        }
        return 2131102145;
    }

    public int Baj(AW0 aw0) {
        AnonymousClass1R2 r0;
        if (this instanceof C176118zo) {
            r0 = this.A06;
        } else if (!(this instanceof C176108zn)) {
            return 0;
        } else {
            r0 = ((C176108zn) this).A0Q;
        }
        return r0.A0G(aw0);
    }

    public boolean Bcl() {
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0P.A03.A03();
        }
        return false;
    }

    public AnonymousClass8pW BdG() {
        if (this instanceof C176118zo) {
            return new AnonymousClass8pS();
        }
        if (this instanceof C176108zn) {
            return new AnonymousClass8pR();
        }
        return null;
    }

    public AnonymousClass8pY BdH() {
        if (this instanceof C176108zn) {
            return new AnonymousClass8pT();
        }
        return null;
    }

    public AnonymousClass8pI BdI() {
        if (this instanceof C176118zo) {
            return new AnonymousClass8pF();
        }
        if (this instanceof C176108zn) {
            return new AnonymousClass8pE();
        }
        return null;
    }

    public AnonymousClass8pV BdJ() {
        if (this instanceof C176108zn) {
            return new AnonymousClass8pJ();
        }
        return null;
    }

    public AnonymousClass8pX BdK() {
        if (this instanceof C176108zn) {
            return new AnonymousClass8pZ();
        }
        return null;
    }

    public boolean Bfk() {
        if (this instanceof C176118zo) {
            return true;
        }
        return false;
    }

    public boolean Bfq(Uri uri) {
        BDQ bdq;
        if (this instanceof C176118zo) {
            bdq = ((C176118zo) this).A0O;
        } else if (!(this instanceof C176108zn)) {
            return false;
        } else {
            bdq = ((C176108zn) this).A0O;
        }
        return AnonymousClass9R4.A00(uri, bdq);
    }

    public void BiD(Uri uri) {
        String queryParameter;
        int length;
        String str;
        if (this instanceof C176118zo) {
            C20750AXf aXf = ((C176118zo) this).A0O;
            if (!uri.getQueryParameterNames().isEmpty()) {
                String queryParameter2 = uri.getQueryParameter("campaignID");
                String str2 = null;
                if (queryParameter2 == null) {
                    str = "Unknown signup url";
                } else {
                    if (AnonymousClass9R4.A00(uri, aXf)) {
                        str = "Blocked signup url";
                    } else {
                        str = null;
                    }
                    try {
                        JSONObject A15 = C17880vN.A15();
                        A15.put("campaign_id", queryParameter2);
                        str2 = A15.toString();
                    } catch (Exception e) {
                        Log.e("IN PAY: error logging campaign id", e);
                    }
                }
                C171858sO r1 = new C171858sO();
                r1.A0b = "deeplink";
                r1.A08 = AnonymousClass3MY.A0f();
                r1.A0Z = str2;
                r1.A0T = str;
                aXf.A00.BiH(r1);
            }
        } else if (this instanceof C176108zn) {
            C176108zn r0 = (C176108zn) this;
            C20749AXe aXe = r0.A0O;
            boolean A072 = r0.A0P.A07("generic_context");
            String queryParameter3 = uri.getQueryParameter("c");
            if ("br".equals(aXe.A00.A0F(uri)) && queryParameter3 != null) {
                if (A072 || ((queryParameter = uri.getQueryParameter("c")) != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA")))) {
                    C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
                    A032.A07("campaign_id", queryParameter3);
                    aXe.A01.BiM(A032, (Integer) null, "deeplink", (String) null, 0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r5 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bkm(android.content.Context r7, X.AnonymousClass1FR r8, X.AW0 r9) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C176108zn
            if (r0 == 0) goto L_0x0055
            r3 = r6
            X.8zn r3 = (X.C176108zn) r3
            X.A5Y r2 = r3.A0P
            X.9uA r0 = r2.A03
            boolean r5 = r0.A03()
            X.0ve r4 = r3.A0B
            r1 = 7242(0x1c4a, float:1.0148E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "p2p_context"
            boolean r0 = r2.A07(r0)
            if (r0 == 0) goto L_0x0026
            r2 = 1
            if (r5 != 0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "isPaymentAccountCreated = "
            X.C17900vP.A0n(r0, r1, r5)
            if (r2 == 0) goto L_0x0051
            X.0z4 r1 = r3.A09
            X.1QD r0 = r3.A0J
            boolean r0 = X.C196809vg.A01(r1, r4, r0)
            if (r0 == 0) goto L_0x0051
            java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
            X.AaY r2 = new X.AaY
            r2.<init>(r7, r8, r9, r3)
            X.BD4 r1 = r3.A0M
            java.lang.String r0 = "receive_flow"
            com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r1 = X.AnonymousClass6X5.A00(r1, r2, r0)
            java.lang.String r0 = "BrazilPaymentIncomeCollectionBottomSheet"
            r8.CMm(r1, r0)
            return
        L_0x0051:
            r3.A01(r7, r8)
            return
        L_0x0055:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r1 = 2
            X.C17960vV.A07(r9)
            java.lang.Class r0 = r6.BMM()
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r7, r0)
            java.lang.String r0 = "extra_setup_mode"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_receive_nux"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "acceptPayment"
            X.11P r0 = r6.A00
            if (r0 == 0) goto L_0x007d
            X.C60442o2.A00(r2, r0, r1)
            r7.startActivity(r2)
            return
        L_0x007d:
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZ9.Bkm(android.content.Context, X.1FR, X.AW0):void");
    }

    public void CBq(C63522tF r6, List list) {
        C196219ue r0;
        if (this instanceof C176118zo) {
            r6.A02 = 0;
            r6.A03 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C170318pf r02 = (C170318pf) ((AW0) it.next()).A0A;
                if (!(r02 == null || (r0 = r02.A0H) == null)) {
                    if (A8C.A05(r0.A0E)) {
                        r6.A03++;
                    } else {
                        r6.A02++;
                    }
                }
            }
        }
    }

    public void CLa(AnonymousClass1QJ r5) {
        if (this instanceof C176118zo) {
            C176118zo r3 = (C176118zo) this;
            C63572tK A022 = r5.A02();
            if (A022 == C63572tK.A0F) {
                AnonymousClass1KJ r2 = A022.A02;
                ((AnonymousClass1KL) r2).A00 = AnonymousClass8BU.A0H(r2, new BigDecimal(r3.A02.A04(AnonymousClass18O.A1G)));
            }
        } else if (this instanceof C176108zn) {
            C176108zn r32 = (C176108zn) this;
            C63572tK A023 = r5.A02();
            if (A023 == C63572tK.A0E) {
                AnonymousClass1KJ r22 = A023.A02;
                ((AnonymousClass1KL) r22).A00 = AnonymousClass8BU.A0H(r22, new BigDecimal(r32.A04.A04(AnonymousClass18O.A1B)));
            }
        }
    }

    public boolean CLt() {
        if (this instanceof C176108zn) {
            return true;
        }
        return false;
    }

    public boolean CME() {
        if (this instanceof C176108zn) {
            return ((C176108zn) this).A0P.A05();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9iW] */
    public AZ9(AnonymousClass1M9 r2, C24921Me r3, AnonymousClass11C r4, AnonymousClass118 r5, AnonymousClass1QS r6, AnonymousClass1R2 r7, String str) {
        C18070vi.A0p(r5, r7, r3);
        C18070vi.A0d(r2, 5);
        C18070vi.A0l(r4, r6);
        this.A07 = str;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A08 = r4;
        this.A05 = r6;
        this.A09 = new C190659lJ(r2, r3, r5);
    }

    public /* synthetic */ String BQ9() {
        return null;
    }

    public List BWR(AW0 aw0, AnonymousClass205 r5) {
        if (!aw0.A0K()) {
            return A00(aw0, r5);
        }
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "request", A13);
        if (C22971Dz.A0e(r5.A00)) {
            UserJid userJid = aw0.A0E;
            C17960vV.A07(userJid);
            C18070vi.A0X(userJid);
            C17890vO.A0n(userJid, "sender", A13);
        }
        String str = aw0.A0K;
        if (str != null) {
            C17890vO.A11("request-id", str, A13);
        }
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 != null) {
            C17890vO.A11("expiry-ts", String.valueOf(C17880vN.A04(r0.A0A())), A13);
        }
        String str2 = aw0.A0G;
        C18070vi.A0W(str2);
        if (str2.length() > 0) {
            String str3 = aw0.A0G;
            C18070vi.A0W(str3);
            C17890vO.A11("country", str3, A13);
            AnonymousClass8BT.A1T("version", A13, aw0.A04);
        }
        return A13;
    }

    public C189109iW BWT() {
        return this.A0A;
    }

    public String BWX() {
        return null;
    }

    public String getName() {
        return this.A07;
    }
}
