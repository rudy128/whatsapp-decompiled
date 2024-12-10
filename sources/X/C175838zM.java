package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8zM  reason: invalid class name and case insensitive filesystem */
public class C175838zM extends C197889xR {
    public BBD A00;
    public final Context A01;
    public final AXS A02;
    public final C195859u1 A03;
    public final AnonymousClass90Z A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass1OZ A06;
    public final A7U A07;
    public final C33711jG A08;
    public final AZ6 A09;
    public final A0B A0A;
    public final C30931ek A0B;

    public C175838zM(Context context, AnonymousClass1KB r3, AnonymousClass1OZ r4, A7U a7u, AXS axs, C33711jG r7, C31061ex r8, C195859u1 r9, BBD bbd, AZ6 az6, A0B a0b, AnonymousClass90Z r13, C30931ek r14) {
        super(a7u.A04, r8);
        this.A01 = context;
        this.A05 = r3;
        this.A06 = r4;
        this.A0B = r14;
        this.A0A = a0b;
        this.A07 = a7u;
        this.A03 = r9;
        this.A09 = az6;
        this.A08 = r7;
        this.A02 = axs;
        this.A04 = r13;
        this.A00 = bbd;
    }

    public static void A00(C1418477e r31, C1418477e r32, C175838zM r33, C178749Eh r34, C178749Eh r35, String str, String str2, String str3, String str4, HashMap hashMap) {
        String str5;
        String str6;
        String str7;
        C175838zM r0 = r33;
        AZ6 az6 = r0.A09;
        az6.COK();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        C196259ui r1 = r0.A00;
        C196259ui r28 = r1;
        r1.A02("upi-set-mpin");
        String str8 = null;
        String str9 = str4;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            A7U a7u = r0.A07;
            str5 = a7u.A07("SMS", hashMap2, 1);
            if ("AADHAAR".equals(str9)) {
                str8 = a7u.A07("AADHAAR", hashMap2, 1);
            }
            String A072 = a7u.A07("MPIN", hashMap2, 1);
            str6 = a7u.A07("ATMPIN", hashMap2, 1);
            str7 = str8;
            str8 = A072;
        } else {
            str5 = null;
            str6 = null;
            str7 = null;
        }
        AnonymousClass1OZ r27 = r0.A06;
        String A0B2 = r27.A0B();
        String A0h = AnonymousClass8BS.A0h(r31);
        String str10 = (String) AnonymousClass8BT.A0q(r32);
        String A012 = r0.A0B.A01();
        String A013 = r0.A0A.A01();
        String str11 = str2;
        C18070vi.A0d(str11, 5);
        String str12 = str3;
        C18070vi.A0q(str12, A012, str5);
        C18070vi.A0d(str8, 9);
        String[] strArr = new String[2];
        strArr[0] = "AADHAAR";
        List A0O = C18070vi.A0O("BANK", strArr, 1);
        List A0N = C18070vi.A0N("0", "1", new String[2], 0, 1);
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, A0B2);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-set-mpin");
        if (A0h != null && AnonymousClass8BX.A1W(A0h, true)) {
            C29591cX.A01(A0R, "vpa", A0h);
        }
        String str13 = str;
        if (str != null && AnonymousClass8BX.A1W(str13, true)) {
            C29591cX.A01(A0R, "vpa-id", str13);
        }
        if (str10 != null && C29601cY.A04(str10, 1, 100000, true)) {
            C29591cX.A01(A0R, "upi-bank-info", str10);
        }
        if (AnonymousClass8BX.A1W(str11, false)) {
            C29591cX.A01(A0R, "credential-id", str11);
        }
        if (C29601cY.A04(str12, 35, 35, false)) {
            C29591cX.A01(A0R, "seq-no", str12);
        }
        AnonymousClass8BY.A1C(A0R, A012, false);
        if (C29601cY.A04(str5, 0, 10000, false)) {
            C29591cX.A01(A0R, "otp", str5);
        }
        if (C29601cY.A04(str8, 0, 10000, false)) {
            C29591cX.A01(A0R, "mpin", str8);
        }
        if (str6 != null && C29601cY.A04(str6, 0, 10000, true)) {
            C29591cX.A01(A0R, "atm-pin", str6);
        }
        if (str7 != null && C29601cY.A04(str7, 0, 10000, true)) {
            C29591cX.A01(A0R, "aadhaar-otp", str7);
        }
        if (A013 != null) {
            AnonymousClass8BY.A14(A0R, A013);
        }
        A0R.A08(str9, "otp-type", A0O);
        A0R.A09("1", "default-debit", A0N);
        A0R.A09("1", "default-credit", A0o);
        AnonymousClass8BV.A1G(A0R, r35);
        AnonymousClass8BV.A1G(A0R, r34);
        r27.A0I(new C175958zY(r0.A01, r0.A05, r0.A08, r28, r0, az6, 7), C29591cX.A00(A0R, A0Y), A0B2, 204, 0);
    }

    public static void A01(C1418477e r34, C1418477e r35, C175838zM r36, String str, String str2, String str3, HashMap hashMap) {
        String str4;
        String str5;
        C175838zM r0 = r36;
        AZ6 az6 = r0.A09;
        az6.COK();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        C196259ui r1 = r0.A00;
        C196259ui r32 = r1;
        r1.A02("upi-change-mpin");
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            A7U a7u = r0.A07;
            str4 = a7u.A07("MPIN", hashMap2, 2);
            str5 = a7u.A07("NMPIN", hashMap2, 2);
        } else {
            str4 = null;
            str5 = null;
        }
        AnonymousClass1OZ r31 = r0.A06;
        String A0B2 = r31.A0B();
        String A012 = r0.A0B.A01();
        String A0h = AnonymousClass8BS.A0h(r34);
        String str6 = (String) AnonymousClass8BT.A0q(r35);
        String A013 = r0.A0A.A01();
        String str7 = str2;
        String str8 = str3;
        C18070vi.A0p(str7, str8, str4);
        C72473Md.A1J(str5, A012);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, C29601cY.A04(A0B2, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-change-mpin");
        AnonymousClass8BY.A1B(A0R, str7, false);
        if (C29601cY.A04(str8, 35, 35, false)) {
            C29591cX.A01(A0R, "seq-no", str8);
        }
        if (C29601cY.A04(str4, 0, 1000, false)) {
            C29591cX.A01(A0R, "old-mpin", str4);
        }
        if (C29601cY.A04(str5, 0, 1000, false)) {
            C29591cX.A01(A0R, "new-mpin", str5);
        }
        AnonymousClass8BY.A1C(A0R, A012, false);
        if (A0h != null && AnonymousClass8BV.A1W(A0h, 0, true)) {
            C29591cX.A01(A0R, "vpa", A0h);
        }
        String str9 = str;
        if (str != null && AnonymousClass8BX.A1W(str9, true)) {
            C29591cX.A01(A0R, "vpa-id", str9);
        }
        if (str6 != null && C29601cY.A04(str6, 0, 9007199254740991L, true)) {
            C29591cX.A01(A0R, "upi-bank-info", str6);
        }
        if (A013 != null) {
            AnonymousClass8BY.A14(A0R, A013);
        }
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        az6.A0A((A7B) null, 7, 0);
        r31.A0I(new C175958zY(r0.A01, r0.A05, r0.A08, r32, r0, az6, 8), A002, A0B2, 204, 0);
    }

    public void A02(String str) {
        AZ6 az6 = this.A09;
        az6.COK();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A0I = this.A02.A0I();
        if (!TextUtils.isEmpty(A0I)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            C17900vP.A0b(this.A00, A10);
            BBD bbd = this.A00;
            if (bbd != null) {
                bbd.Bwk((A7B) null, A0I);
                return;
            }
            return;
        }
        C196259ui r8 = this.A00;
        r8.A02("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        Integer A002 = this.A04.A02.A00("upi-list-keys");
        AnonymousClass1OZ r1 = this.A06;
        String A0B2 = r1.A0B();
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A15(A0Y, A0B2);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-list-keys");
        String str2 = str;
        if (str != null && C29601cY.A04(str2, 1, 10, true)) {
            C29591cX.A01(A0R, "provider_type", str2);
        }
        C29621ca A003 = C29591cX.A00(A0R, A0Y);
        az6.A0A((A7B) null, 1, 0);
        AnonymousClass8BW.A1B(r1, new C175978za(this.A01, this.A05, this.A08, r8, this, az6, A002), A003, A0B2);
    }
}
