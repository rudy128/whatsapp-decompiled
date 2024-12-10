package X;

import org.json.JSONObject;

public class AZ5 implements BD4 {
    public String A00 = "BR";
    public final AnonymousClass11S A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass1QO A03;
    public final C20031A4a A04;
    public final AnonymousClass00H A05;

    public void BiI(Integer num, String str, String str2, int i, boolean z) {
        BiL(num, str, (String) null, 1);
    }

    public void BiJ(C20112A7u a7u, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        BiM(a7u, num, str, str2, i);
    }

    public void COK() {
    }

    public C171858sO BHN() {
        C171858sO r2 = new C171858sO();
        C20031A4a.A00(r2, this.A04);
        this.A05.get();
        String A06 = this.A03.A06(AnonymousClass11S.A00(this.A01));
        if (A06 != null) {
            this.A00 = A06;
        }
        r2.A0R = this.A00;
        return r2;
    }

    public void Bi2(C70513Bj r3, Integer num, String str, String str2, int i) {
        int i2;
        C171368rb r1 = new C171368rb();
        r1.A01 = Integer.valueOf(i);
        r1.A08 = str;
        if (num != null) {
            r1.A00 = num;
        }
        r1.A06 = str2;
        if (r3 != null) {
            r1.A05 = r3.A06;
            r1.A07 = r3.A08;
            r1.A04 = r3.A05;
            r1.A02 = Integer.valueOf(r3.A01);
            i2 = 1;
        } else {
            i2 = 2;
        }
        r1.A03 = Integer.valueOf(i2);
        this.A02.CC7(r1);
    }

    public void Bi4(A7B a7b, int i) {
        AnonymousClass18K r2 = this.A02;
        C171858sO BHN = BHN();
        BHN.A0C = Integer.valueOf(AnonymousClass8BY.A03(BHN, a7b, i));
        BHN.A08 = C17880vN.A0j();
        r2.CC7(BHN);
    }

    public void BiH(C171858sO r2) {
        C20031A4a.A00(r2, this.A04);
        r2.A0R = this.A00;
        this.A02.CC7(r2);
    }

    public void reset() {
        this.A05.get();
        C20031A4a.A01(this.A04);
    }

    public AZ5(AnonymousClass11S r2, AnonymousClass18K r3, AnonymousClass1QO r4, C20031A4a a4a, AnonymousClass00H r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = a4a;
        this.A05 = r6;
        this.A03 = r4;
        C63572tK r0 = C63572tK.A0E;
    }

    public void BiL(Integer num, String str, String str2, int i) {
        Integer valueOf = Integer.valueOf(i);
        C171858sO BHN = BHN();
        BHN.A0b = str;
        BHN.A08 = valueOf;
        if (num != null) {
            BHN.A07 = num;
        }
        if (str2 != null) {
            BHN.A0a = str2;
        }
        this.A02.CC7(BHN);
    }

    public void BiM(C20112A7u a7u, Integer num, String str, String str2, int i) {
        Integer valueOf = Integer.valueOf(i);
        C171858sO BHN = BHN();
        BHN.A0b = str;
        BHN.A08 = valueOf;
        if (num != null) {
            BHN.A07 = num;
        }
        if (str2 != null) {
            BHN.A0a = str2;
        }
        if (a7u != null) {
            JSONObject jSONObject = a7u.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                BHN.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            AnonymousClass8BX.A1A(BHN, a7u, jSONObject);
        }
        this.A02.CC7(BHN);
    }
}
