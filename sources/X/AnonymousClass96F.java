package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.96F  reason: invalid class name */
public class AnonymousClass96F extends AnonymousClass9BY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass966 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass96F(AnonymousClass966 r2, String str, String str2, String str3, boolean z) {
        super(r2, (AnonymousClass205) null, str, z);
        this.A03 = r2;
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.9ue] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.9NU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.9O4, java.lang.Object] */
    public AnonymousClass9NU A0J() {
        long j;
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        C1418477e r4;
        C1418477e r42;
        C1418477e r43;
        if (this.A02 != null) {
            AnonymousClass9NU A0J = super.A0J();
            AnonymousClass8pG r5 = A0J.A01.A0A;
            if (r5 instanceof C170318pf) {
                C170318pf r52 = (C170318pf) r5;
                if (r52.A0H != null) {
                    String str = this.A00;
                    AnonymousClass1KJ r3 = AnonymousClass966.A0K;
                    AnonymousClass1KN A0H = AnonymousClass8BT.A0H(r3, str);
                    C17960vV.A07(A0H);
                    AnonymousClass966 r1 = this.A03;
                    ARR A012 = r1.A01.A01(r3, A0H);
                    C196219ue r53 = r52.A0H;
                    C1418477e A002 = C20061A5k.A00(str, "money");
                    long A06 = r1.A02.A06(this.A01, false);
                    ? obj = new Object();
                    obj.A03 = A002;
                    obj.A01 = A012;
                    obj.A00 = A06;
                    obj.A08 = "UNKNOWN";
                    obj.A09 = "INIT";
                    r53.A0C = obj;
                }
            }
            return A0J;
        }
        AnonymousClass966 r12 = this.A03;
        AnonymousClass1KJ r0 = AnonymousClass966.A0K;
        String str2 = r12.A0A;
        if (str2 != null) {
            j = ((long) Float.parseFloat(str2)) * 100;
        } else {
            j = 0;
        }
        AnonymousClass1KJ r54 = AnonymousClass966.A0K;
        C17960vV.A07(r54);
        C18070vi.A0X(r54);
        ARR A003 = C196669vR.A00(r54, 100, j);
        String A0j = AnonymousClass8BS.A0j(r54);
        AnonymousClass1KN r44 = A003.A02;
        AnonymousClass11P r2 = r12.A00;
        long A013 = AnonymousClass11P.A01(r2);
        long A014 = AnonymousClass11P.A01(r2);
        C63572tK r22 = C63572tK.A0E;
        AW0 aw0 = new AW0(r54, r44, (UserJid) null, (UserJid) null, A0j, (String) null, (String) null, (String) null, (String) null, (String) null, "IN", 40, 115, 1, 1, 0, A013, A014);
        C170318pf r10 = new C170318pf();
        r10.A0Y(r12.A09);
        r10.A0R = r12.A0J;
        A8C a8c = r12.A02;
        String str3 = r12.A0I;
        r10.A04 = a8c.A06(str3, false);
        r10.A0O = r12.A08;
        String str4 = r12.A0E;
        if (str4 == null) {
            equalsIgnoreCase = true;
        } else {
            equalsIgnoreCase = "Y".equalsIgnoreCase(str4);
        }
        String str5 = r12.A0F;
        if (str5 == null) {
            equalsIgnoreCase2 = true;
        } else {
            equalsIgnoreCase2 = "Y".equalsIgnoreCase(str5);
        }
        long A062 = a8c.A06(str3, true);
        long A063 = a8c.A06(r12.A0H, false);
        String str6 = r12.A03;
        if (str6 == null) {
            str6 = "MAX";
        }
        String str7 = r12.A0G;
        String str8 = r12.A07;
        String str9 = r12.A0B;
        String str10 = r12.A05;
        String str11 = r12.A0D;
        String str12 = r12.A0C;
        String str13 = r12.A0C;
        String str14 = r12.A06;
        ? obj2 = new Object();
        obj2.A0M = true;
        obj2.A0N = equalsIgnoreCase;
        obj2.A0O = equalsIgnoreCase2;
        obj2.A02 = A062;
        obj2.A01 = A063;
        obj2.A0G = str6;
        C1418477e r7 = null;
        if (str7 != null) {
            r4 = C20061A5k.A00(str7, "mandateNo");
        } else {
            r4 = null;
        }
        obj2.A08 = r4;
        if (str8 != null) {
            r42 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str8, "mandateName");
        } else {
            r42 = null;
        }
        obj2.A07 = r42;
        if (str9 != null) {
            r43 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str9, "upiPurposeCode");
        } else {
            r43 = null;
        }
        obj2.A0A = r43;
        if (str2 != null) {
            r7 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str2, "moneyStringValue");
        }
        obj2.A09 = r7;
        obj2.A0E = str10;
        obj2.A0K = str11;
        obj2.A0J = str12;
        obj2.A0L = str13;
        obj2.A0F = str14;
        r10.A0H = obj2;
        AW0 aw02 = aw0;
        aw02.A0A = r10;
        ? obj3 = new Object();
        obj3.A00 = null;
        obj3.A04 = false;
        obj3.A01 = aw02;
        obj3.A02 = null;
        obj3.A03 = null;
        return obj3;
    }
}
