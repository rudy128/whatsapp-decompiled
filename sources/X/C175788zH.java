package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8zH  reason: invalid class name and case insensitive filesystem */
public class C175788zH extends C197889xR {
    public final AnonymousClass1KI A00;
    public final C196199uc A01;
    public final AnonymousClass90Z A02;
    public final Context A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass1OZ A05;
    public final A7U A06;
    public final C33711jG A07;
    public final C30931ek A08;

    public C175788zH(Context context, AnonymousClass1KB r3, AnonymousClass1KI r4, AnonymousClass1OZ r5, C196199uc r6, A7U a7u, C33711jG r8, C31061ex r9, AnonymousClass90Z r10, C30931ek r11) {
        super(a7u.A04, r9);
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r5;
        this.A08 = r11;
        this.A06 = a7u;
        this.A00 = r4;
        this.A01 = r6;
        this.A07 = r8;
        this.A02 = r10;
    }

    public void A01(C1418477e r26, C1418477e r27, B8a b8a) {
        String str;
        String str2;
        String str3;
        String str4;
        Log.i("PAY: verifyPaymentVpa called");
        String A012 = this.A08.A01();
        C1418477e r17 = r27;
        boolean z = !C20061A5k.A02(r17);
        String str5 = null;
        if (z) {
            str = (String) AnonymousClass8BT.A0q(r17);
            if (((String) r17.A00).length() == 10) {
                str4 = "mobile_number";
            } else {
                str4 = "numeric_id";
            }
            str3 = "mobile_number";
            if (str4 != str3) {
                str3 = "numeric_id";
            }
            str2 = "2";
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str5 = (String) AnonymousClass8BT.A0q(r26);
        }
        AnonymousClass1OZ r24 = this.A05;
        String A0B = r24.A0B();
        boolean A1K = C108975cc.A1K(A012);
        String[] strArr = new String[2];
        strArr[0] = "1";
        List A0O = C18070vi.A0O("2", strArr, A1K ? 1 : 0);
        String[] strArr2 = new String[2];
        strArr2[0] = "mobile_number";
        List A0O2 = C18070vi.A0O("numeric_id", strArr2, A1K);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, AnonymousClass8BU.A1Z(A0B, 0, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-get-vpa-name");
        if (str5 != null && AnonymousClass8BV.A1Y(str5, 1, A1K)) {
            C29591cX.A01(A0R, "vpa", str5);
        }
        AnonymousClass8BY.A1C(A0R, A012, false);
        if (str != null && AnonymousClass8BV.A1V(str, 8, A1K)) {
            C29591cX.A01(A0R, "value", str);
        }
        A0R.A08(str2, "version", A0O);
        A0R.A08(str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O2);
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        Integer A003 = this.A02.A02.A00("upi-get-vpa-name");
        r24.A0N(new C175938zW(this.A03, this.A04, r17, b8a, this.A07, this.A00, this, A003, z), A002, A0B, 204, C20113A7w.A0L);
    }

    public void A00(AnonymousClass1KN r37, C18030ve r38, C1418477e r39, C1418477e r40, C1418477e r41, C170318pf r42, C175758zE r43, C22452B8k b8k, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, HashMap hashMap, boolean z) {
        String str12;
        String str13;
        AnonymousClass1MD[] A0S;
        Log.i("PAY: IndiaUpiPaymentSetup sendPaymentToNonWaVpa called");
        C170318pf r14 = r42;
        Boolean bool = r14.A0J;
        AnonymousClass1KN r2 = r37;
        ARR A012 = this.A01.A01(AnonymousClass1KL.A0B, r2);
        AnonymousClass1OZ r35 = this.A05;
        String A0B = r35.A0B();
        String A013 = this.A08.A01();
        String A072 = this.A06.A07("MPIN", hashMap, 6);
        String str14 = r14.A0T;
        String str15 = r14.A0R;
        String str16 = r14.A0V;
        String str17 = r14.A0M;
        String str18 = (String) AnonymousClass8BT.A0q(r40);
        String str19 = (String) AnonymousClass8BT.A0q(r39);
        String str20 = r14.A0U;
        String str21 = r14.A0S;
        String str22 = (String) AnonymousClass8BT.A0q(r41);
        String obj = r2.toString();
        String str23 = null;
        if (C18020vd.A05(C18040vf.A02, r38, 11160)) {
            str12 = null;
        } else {
            str12 = r14.A0X;
        }
        if (z) {
            str13 = "p2m";
        } else {
            str13 = "p2p";
        }
        if (bool != null) {
            str23 = AnonymousClass8BS.A0b(bool.booleanValue() ? 1 : 0);
        }
        C178749Eh r0 = new C178749Eh(String.valueOf(A012.getValue()), String.valueOf(A012.A00), AnonymousClass8BU.A0n(A012), 17);
        String str24 = str;
        C18070vi.A0d(str24, 2);
        C72473Md.A1M(A013, A072, str14, 3);
        C18070vi.A0q(str15, str16, str17);
        String[] strArr = new String[2];
        strArr[0] = "p2m";
        List A0O = C18070vi.A0O("p2p", strArr, 1);
        String[] strArr2 = new String[3];
        strArr2[0] = "1";
        strArr2[1] = "2";
        List A0O2 = C18070vi.A0O("3", strArr2, 2);
        List A0N = C18070vi.A0N("0", "1", new String[2], 0, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, A0B);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-send-to-vpa");
        AnonymousClass8BY.A1B(A0R, str24, false);
        AnonymousClass8BY.A1C(A0R, A013, false);
        if (AnonymousClass8BV.A1Y(A072, 0, false)) {
            C29591cX.A01(A0R, "mpin", A072);
        }
        if (C29601cY.A04(str14, 0, 100, false)) {
            C29591cX.A01(A0R, "sender-vpa", str14);
        }
        if (C29601cY.A04(str15, 0, 100, false)) {
            C29591cX.A01(A0R, "receiver-vpa", str15);
        }
        if (AnonymousClass8BV.A1U(str16, 0)) {
            C29591cX.A01(A0R, "seq-no", str16);
        }
        if (AnonymousClass8BU.A1Z(str17, 0, false)) {
            C29591cX.A01(A0R, "message-id", str17);
        }
        String str25 = str4;
        if (str4 != null && C29601cY.A04(str25, 0, 4, true)) {
            C29591cX.A01(A0R, "mcc", str25);
        }
        String str26 = str3;
        if (str3 != null && AnonymousClass8BV.A1X(str26, 0, true)) {
            C29591cX.A01(A0R, "ref-id", str26);
        }
        String str27 = str5;
        if (str5 != null && C29601cY.A04(str27, 0, 2048, true)) {
            C29591cX.A01(A0R, "ref-url", str27);
        }
        String str28 = str9;
        if (str9 != null && AnonymousClass8BU.A1Z(str28, 0, true)) {
            C29591cX.A01(A0R, "note", str28);
        }
        if (str18 != null && AnonymousClass8BV.A1Y(str18, 1, true)) {
            C29591cX.A01(A0R, "payee-name", str18);
        }
        String str29 = str7;
        if (str7 != null && C29601cY.A04(str29, 0, 4, true)) {
            C29591cX.A01(A0R, "mode", str29);
        }
        String str30 = str6;
        if (str6 != null && C29601cY.A04(str30, 1, 4, true)) {
            C29591cX.A01(A0R, "purpose-code", str30);
        }
        if (str19 != null && AnonymousClass8BU.A1Z(str19, 0, true)) {
            C29591cX.A01(A0R, "upi-bank-info", str19);
        }
        if (str20 != null && AnonymousClass8BX.A1W(str20, true)) {
            C29591cX.A01(A0R, "sender-vpa-id", str20);
        }
        if (str21 != null && AnonymousClass8BX.A1W(str21, true)) {
            C29591cX.A01(A0R, "receiver-vpa-id", str21);
        }
        if (str22 != null && C29601cY.A04(str22, 8, 15, true)) {
            C29591cX.A01(A0R, "receiver-upi-number", str22);
        }
        AnonymousClass8BW.A1F(A0R, "amount", obj, C29601cY.A04(obj, 1, 100, true) ? 1 : 0);
        String str31 = str2;
        if (C29601cY.A04(str31, 1, 100, true)) {
            C29591cX.A01(A0R, "currency", str31);
        }
        if (str12 != null && AnonymousClass8BV.A1Y(str12, 1, true)) {
            C29591cX.A01(A0R, "token", str12);
        }
        String str32 = str8;
        if (str8 != null) {
            AnonymousClass8BW.A1F(A0R, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str32, AnonymousClass8BV.A1Y(str32, 1, true) ? 1 : 0);
        }
        String str33 = str10;
        if (str10 != null && AnonymousClass8BU.A1Z(str33, 1, true)) {
            C29591cX.A01(A0R, "international-pay-detail", str33);
        }
        String str34 = str11;
        if (str11 != null) {
            AnonymousClass8BY.A14(A0R, str34);
        }
        A0R.A08(str13, "transaction-type", A0O);
        A0R.A08("2", "version", A0O2);
        A0R.A08(str23, "is_first_send", A0N);
        AnonymousClass8BX.A1I(C178749Eh.A00(r0, "amount"), A0R, A0Y);
        C29621ca A032 = A0Y.A03();
        C196259ui A042 = C197889xR.A04(this, "upi-send-to-vpa");
        List A13 = AnonymousClass000.A13();
        C29621ca A0J = A032.A0J(0);
        if (!(A0J == null || (A0S = A0J.A0S()) == null)) {
            C17960vV.A07(A0S);
            A13 = Arrays.asList(A0S);
        }
        r43.A00("U66", A13);
        r35.A0I(new C175968zZ(this.A03, this.A04, this.A07, A042, b8k, this, this.A02.A02.A00("upi-send-to-vpa")), A032, A0B, 204, C20113A7w.A0L);
    }
}
