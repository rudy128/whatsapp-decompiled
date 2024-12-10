package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9F3  reason: invalid class name */
public class AnonymousClass9F3 extends AnonymousClass9EV {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass9F3(C178749Eh r39, AnonymousClass4A4 r40, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, long j, long j2) {
        String str19 = str2;
        C18070vi.A0d(str19, 2);
        String str20 = str3;
        C18070vi.A0d(str20, 3);
        String str21 = str4;
        C18070vi.A0d(str21, 4);
        String str22 = str5;
        C18070vi.A0d(str22, 5);
        String str23 = str6;
        C18070vi.A0d(str23, 6);
        String str24 = str10;
        String str25 = str9;
        C108975cc.A10(str25, 11, str24);
        String str26 = str11;
        String str27 = str12;
        AnonymousClass8BW.A1I(str26, str27);
        String str28 = str15;
        C18070vi.A0d(str28, 17);
        String str29 = str18;
        String str30 = str17;
        AnonymousClass8BW.A1J(str30, str29);
        List A0N = C18070vi.A0N("0", "1", new String[2], 0, 1);
        this.A02 = A0N;
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, 1);
        this.A03 = A0o;
        String[] strArr = new String[3];
        strArr[0] = "EXACT";
        strArr[1] = "MAX";
        List A0O = C18070vi.A0O("UNKNOWN", strArr, 2);
        this.A00 = A0O;
        String[] strArr2 = new String[11];
        strArr2[0] = "ASPRESENTED";
        strArr2[1] = "BIMONTHLY";
        strArr2[2] = "DAILY";
        strArr2[3] = "FORTNIGHTLY";
        strArr2[4] = "HALFYEARLY";
        strArr2[5] = "MONTHLY";
        strArr2[6] = "ONETIME";
        strArr2[7] = "QUARTERLY";
        strArr2[8] = "UNKNOWN";
        strArr2[9] = "WEEKLY";
        List A0O2 = C18070vi.A0O("YEARLY", strArr2, 10);
        this.A01 = A0O2;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-create-mandate");
        AnonymousClass8BY.A1C(A0R, str19, false);
        if (AnonymousClass8BV.A1U(str20, 0)) {
            C29591cX.A01(A0R, "seq-no", str20);
        }
        if (C29601cY.A04(str21, 1, 100, false)) {
            C29591cX.A01(A0R, "sender-vpa", str21);
        }
        if (C29601cY.A04(str22, 1, 100, false)) {
            C29591cX.A01(A0R, "receiver-vpa", str22);
        }
        if (C29601cY.A04(str23, 0, 1000, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str23);
        }
        String str31 = str7;
        if (str7 != null && AnonymousClass8BU.A1Z(str31, 0, true)) {
            C29591cX.A01(A0R, "mandate-name", str31);
        }
        long j3 = j;
        if (C29601cY.A03(Long.valueOf(j3), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "start-ts", j3);
        }
        long j4 = j2;
        if (C29601cY.A03(Long.valueOf(j4), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "end-ts", j4);
        }
        String str32 = str8;
        if (str8 != null && C29601cY.A04(str32, 1, 2, true)) {
            C29591cX.A01(A0R, "recurrence-day", str32);
        }
        if (C29601cY.A04(str25, 0, 1000, false)) {
            C29591cX.A01(A0R, "mpin", str25);
        }
        if (C29601cY.A04(str24, 1, 100, false)) {
            C29591cX.A01(A0R, "receiver-name", str24);
        }
        if (C29601cY.A04(str26, 1, 100, false)) {
            C29591cX.A01(A0R, "purpose-code", str26);
        }
        if (C29601cY.A04(str27, 0, 4, false)) {
            C29591cX.A01(A0R, "mcc", str27);
        }
        String str33 = str13;
        if (str13 != null && AnonymousClass8BV.A1X(str33, 1, true)) {
            C29591cX.A01(A0R, "ref-id", str33);
        }
        String str34 = str14;
        if (str14 != null && C29601cY.A04(str34, 1, 2, true)) {
            C29591cX.A01(A0R, "initiation-mode", str34);
        }
        if (C29601cY.A04(str28, 1, 100, false)) {
            C29591cX.A01(A0R, "credential-id", str28);
        }
        A0R.A09(str16, "is-revocable", A0N);
        A0R.A09("1", "share-to-payee", A0o);
        A0R.A09(str30, "amount-rule", A0O);
        A0R.A09(str29, "frequency-rule", A0O2);
        C108955ca.A1P(C178749Eh.A00(r39, "amount"), A0R);
        AnonymousClass4A4 r1 = r40;
        if (r40 != null) {
            C20121A8g.A09(A0R, r1);
        }
        this.A04 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F3(UserJid userJid, String str, String str2, String str3, String str4, String str5) {
        List A0N = C18070vi.A0N("calls", "marketing_messages", new String[2], 0, 1);
        this.A01 = A0N;
        String[] strArr = new String[2];
        strArr[0] = "block";
        List A0O = C18070vi.A0O("unblock", strArr, 1);
        this.A00 = A0O;
        String[] strArr2 = new String[4];
        strArr2[0] = "no_longer_relevant";
        strArr2[1] = "no_sign_up";
        strArr2[2] = "spammy_messages";
        List A0O2 = C18070vi.A0O("too_many_messages", strArr2, 3);
        this.A03 = A0O2;
        String[] strArr3 = new String[7];
        strArr3[0] = "block_action_sheet";
        strArr3[1] = "chat_fmx_card";
        strArr3[2] = "chat_fmx_card_suspicious";
        strArr3[3] = "profile_view";
        strArr3[4] = "quick_action";
        strArr3[5] = "suspicious_chat_banner";
        List A0O3 = C18070vi.A0O("system_event_message", strArr3, 6);
        this.A02 = A0O3;
        C29591cX A0O4 = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O4, "optoutlist");
        AnonymousClass8BW.A1F(A0O4, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, AnonymousClass8BU.A1Z(str, 0, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("item");
        AnonymousClass8BT.A1E(userJid, A0t, "jid");
        String str6 = str2;
        if (str2 != null && AnonymousClass8BV.A1W(str6, 0, true)) {
            C29591cX.A01(A0t, "dhash", str6);
        }
        A0t.A09("marketing_messages", "category", A0N);
        A0t.A09(str3, "action", A0O);
        A0t.A08(str4, "reason", A0O2);
        A0t.A08(str5, "entry_point", A0O3);
        this.A04 = C29591cX.A00(A0t, A0O4);
    }

    public AnonymousClass9F3(String str) {
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "FBPAY";
        A1b[1] = "NOVI";
        List A0O = C18070vi.A0O("UPI", A1b, 2);
        this.A02 = A0O;
        List A0o = AnonymousClass8BX.A0o("1", "2", 2, 1);
        this.A03 = A0o;
        List A0N = C18070vi.A0N("0", "1", new String[2], 0, 1);
        this.A00 = A0N;
        this.A01 = AnonymousClass8BX.A0o("0", "1", 2, 1);
        C29591cX A0O2 = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O2, "urn:xmpp:whatsapp:account");
        AnonymousClass8BW.A1F(A0O2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, AnonymousClass8BU.A1Z(str, 0, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("accept_pay");
        C108965cb.A1I(A0t, "tos-version", 2);
        A0t.A08("UPI", "service", A0O);
        A0t.A09("2", "version", A0o);
        A0t.A08("1", "consumer", A0N);
        this.A04 = C29591cX.A00(A0t, A0O2);
    }
}
