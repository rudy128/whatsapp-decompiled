package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.Ajm  reason: case insensitive filesystem */
public final /* synthetic */ class C21419Ajm implements Runnable {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ AES A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ BBC A03;
    public final /* synthetic */ C175688z7 A04;
    public final /* synthetic */ C20266ADy A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ JSONObject A0D;

    public final void run() {
        String str;
        C178719Ee r19;
        AEV A002;
        C175688z7 r2 = this.A04;
        String str2 = this.A07;
        String str3 = this.A09;
        UserJid userJid = this.A02;
        ARR arr = this.A00;
        String str4 = this.A0A;
        String str5 = this.A0B;
        Long l = null;
        Long l2 = this.A06;
        String str6 = this.A0C;
        String str7 = this.A08;
        JSONObject jSONObject = this.A0D;
        AES aes = this.A01;
        C20266ADy aDy = this.A05;
        BBC bbc = this.A03;
        AnonymousClass00H r43 = r2.A06;
        String A0T = C17890vO.A0T(r43);
        C18030ve r7 = r2.A04;
        UserJid A012 = C60432o1.A01(r2.A00, r2.A03, r7, userJid, "upi-get-p2m-checkout-session");
        C18070vi.A0X(A012);
        String str8 = "1";
        if (C18020vd.A05(C18040vf.A02, r7, 11893)) {
            str8 = "2";
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        if (aes == null || (A002 = aes.A00()) == null) {
            r19 = null;
        } else {
            String str9 = aes.A03;
            String str10 = A002.A07.A00;
            String str11 = A002.A08.A00;
            String str12 = A002.A05.A00;
            String str13 = A002.A04.A00;
            if (str13.length() == 0) {
                str13 = null;
            }
            String str14 = A002.A03.A00;
            if (str14.length() == 0) {
                str14 = null;
            }
            String str15 = A002.A0A.A00;
            if (str15.length() == 0) {
                str15 = null;
            }
            String str16 = A002.A01.A00;
            if (str16.length() == 0) {
                str16 = null;
            }
            r19 = new C178719Ee(str9, str10, str11, str12, str13, str14, str15, str16, A002.A00.A00, A002.A06.A00, A002.A02.A00, A002.A09.A00);
        }
        AnonymousClass1KJ r3 = arr.A01;
        Integer num = null;
        if (aDy != null) {
            String str17 = aDy.A02;
            String str18 = aDy.A01;
            AE1 ae1 = aDy.A00;
            if (ae1 != null) {
                l = Long.valueOf(ae1.A01);
            }
            String valueOf = String.valueOf(l);
            if (ae1 != null) {
                num = Integer.valueOf(ae1.A00);
            }
            num = new C178719Ee(new C178749Eh(valueOf, String.valueOf(num), AnonymousClass8BS.A0j(r3), 17), str17, str18);
        }
        AnonymousClass9F5 r16 = new AnonymousClass9F5(A012, new C178749Eh(String.valueOf(arr.getValue()), String.valueOf(arr.A00), AnonymousClass8BS.A0j(r3), 17), r19, num, l2, A0T, str4, str2, str3, str6, str7, str, str8, str5);
        C196259ui A042 = C197889xR.A04(r2, "upi-get-p2m-checkout-session");
        Integer A003 = AnonymousClass8BR.A0b(r2.A08).A00("upi-get-p2m-checkout-session");
        C17880vN.A0U(r43).A0I(new C175948zX(r2.A02.A00, r2.A01, AnonymousClass8BR.A0a(r2.A07), A042, bbc, r2, r16, A003), r16.BVP(), A0T, 204, 0);
    }

    public /* synthetic */ C21419Ajm(ARR arr, AES aes, UserJid userJid, BBC bbc, C175688z7 r5, C20266ADy aDy, Long l, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        this.A04 = r5;
        this.A07 = str;
        this.A09 = str2;
        this.A02 = userJid;
        this.A00 = arr;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = l;
        this.A0C = str5;
        this.A08 = str6;
        this.A0D = jSONObject;
        this.A01 = aes;
        this.A05 = aDy;
        this.A03 = bbc;
    }
}
