package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8zL  reason: invalid class name and case insensitive filesystem */
public class C175828zL extends C197889xR {
    public static final Long A08 = 2L;
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1OZ A02;
    public final C33711jG A03;
    public final A0B A04;
    public final C30931ek A05;
    public final C18030ve A06;
    public final A7U A07;

    public C175828zL(Context context, AnonymousClass1KB r3, C18030ve r4, AnonymousClass1OZ r5, A7U a7u, C33711jG r7, C31061ex r8, A0B a0b, C30931ek r10) {
        super(a7u.A04, r8);
        this.A00 = context;
        this.A06 = r4;
        this.A01 = r3;
        this.A02 = r5;
        this.A05 = r10;
        this.A04 = a0b;
        this.A07 = a7u;
        this.A03 = r7;
    }

    public void A01(AnonymousClass1KN r31, C1418477e r32, C22448B8g b8g, C175758zE r34, AZ6 az6, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap hashMap) {
        String str8;
        AnonymousClass1MD[] A0S;
        Log.i("PAY: acceptCollect called");
        AnonymousClass1OZ r29 = this.A02;
        String A0B = r29.A0B();
        Long l = null;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            str8 = this.A07.A07("MPIN", hashMap2, 5);
        } else {
            str8 = null;
        }
        C17960vV.A07(str8);
        if (C18020vd.A05(C18040vf.A02, this.A06, 747)) {
            l = A08;
        }
        String A012 = this.A05.A01();
        String str9 = (String) AnonymousClass8BT.A0q(r32);
        String A013 = this.A04.A01();
        C29621ca A032 = C178749Eh.A00(A00(this.A01.A01(AnonymousClass1KL.A0B, r31)), "amount").A03();
        String str10 = str6;
        C18070vi.A0p(str8, A012, str10);
        String str11 = str;
        C18070vi.A0d(str11, 5);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, AnonymousClass8BU.A1Z(A0B, 0, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-accept-collect");
        if (C29601cY.A04(str8, 0, 1000, false)) {
            C29591cX.A01(A0R, "mpin", str8);
        }
        AnonymousClass8BY.A1C(A0R, A012, false);
        AnonymousClass8BY.A1B(A0R, str10, false);
        AnonymousClass8BW.A1F(A0R, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str11, C29601cY.A04(str11, 1, 1000, false) ? 1 : 0);
        String str12 = str2;
        if (str2 != null && AnonymousClass8BV.A1W(str12, 0, true)) {
            C29591cX.A01(A0R, "sender-vpa", str12);
        }
        String str13 = str3;
        if (str3 != null && AnonymousClass8BV.A1W(str13, 0, true)) {
            C29591cX.A01(A0R, "sender-vpa-id", str13);
        }
        if (str9 != null && AnonymousClass8BU.A1Z(str9, 0, true)) {
            C29591cX.A01(A0R, "upi-bank-info", str9);
        }
        String str14 = str4;
        if (str4 != null && AnonymousClass8BV.A1W(str14, 0, true)) {
            C29591cX.A01(A0R, "receiver-vpa", str14);
        }
        String str15 = str5;
        if (str5 != null && AnonymousClass8BV.A1W(str15, 0, true)) {
            C29591cX.A01(A0R, "receiver-vpa-id", str15);
        }
        String str16 = str7;
        if (str7 != null && AnonymousClass8BV.A1W(str16, 0, true)) {
            C29591cX.A01(A0R, "mandate-no", str16);
        }
        if (l != null && C29601cY.A03(l, 1, 9007199254740991L, true)) {
            C108965cb.A1I(A0R, "version", l.longValue());
        }
        if (A013 != null) {
            AnonymousClass8BY.A14(A0R, A013);
        }
        A0R.A05(A032);
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        C196259ui A042 = C197889xR.A04(this, "upi-accept-collect");
        List A13 = AnonymousClass000.A13();
        C29621ca A0J = A002.A0J(0);
        if (!(A0J == null || (A0S = A0J.A0S()) == null)) {
            C17960vV.A07(A0S);
            A13 = Arrays.asList(A0S);
        }
        r34.A00("U66", A13);
        r29.A0I(new C175978za(this.A00, this.A01, this.A03, A042, b8g, this, az6), A002, A0B, 204, 0);
    }

    public static C178749Eh A00(C22565BDa bDa) {
        ARR arr = (ARR) bDa;
        return new C178749Eh(String.valueOf(bDa.getValue()), String.valueOf(arr.A00), AnonymousClass8BU.A0n(arr), 17);
    }
}
