package X;

public final class AZ3 implements BD4 {
    public AnonymousClass18K A00;
    public AnonymousClass1QJ A01;
    public C20031A4a A02;

    public void Bi2(C70513Bj r1, Integer num, String str, String str2, int i) {
    }

    public void BiI(Integer num, String str, String str2, int i, boolean z) {
        C18070vi.A0d(str, 2);
        BiL(num, str, (String) null, 1);
    }

    public C171858sO BHN() {
        String str;
        C171858sO r1 = new C171858sO();
        C20031A4a.A00(r1, this.A02);
        C63572tK A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r1.A0R = str;
        return r1;
    }

    public void Bi4(A7B a7b, int i) {
        AnonymousClass18K r2 = this.A00;
        C171858sO BHN = BHN();
        BHN.A0C = Integer.valueOf(AnonymousClass8BY.A03(BHN, a7b, i));
        BHN.A08 = C17880vN.A0j();
        r2.CC7(BHN);
    }

    public void BiH(C171858sO r2) {
        String str;
        C20031A4a.A00(r2, this.A02);
        C63572tK A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r2.A0R = str;
        this.A00.CC7(r2);
    }

    public void COK() {
        this.A02.A02();
    }

    public void reset() {
        C20031A4a.A01(this.A02);
    }

    public AZ3(AnonymousClass18K r1, AnonymousClass1QJ r2, C20031A4a a4a) {
        C18070vi.A0o(r1, a4a, r2);
        this.A00 = r1;
        this.A02 = a4a;
        this.A01 = r2;
    }

    public void BiJ(C20112A7u a7u, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        C171858sO BHN = BHN();
        AnonymousClass8BX.A19(BHN, num, str, i);
        if (str2 != null) {
            BHN.A0a = str2;
        }
        if (a7u != null) {
            AnonymousClass8BX.A1A(BHN, a7u, a7u.A01);
        }
        BHN.A06 = Boolean.valueOf(z2);
        BHN.A0W = str3;
        BHN.A0X = str4;
        this.A00.CC7(BHN);
    }

    public void BiL(Integer num, String str, String str2, int i) {
        C171858sO BHN = BHN();
        AnonymousClass8BX.A19(BHN, num, str, i);
        if (str2 != null) {
            BHN.A0a = str2;
        }
        this.A00.CC7(BHN);
    }

    public void BiM(C20112A7u a7u, Integer num, String str, String str2, int i) {
        C171858sO BHN = BHN();
        AnonymousClass8BX.A19(BHN, num, str, i);
        if (str2 != null) {
            BHN.A0a = str2;
        }
        if (a7u != null) {
            AnonymousClass8BX.A1A(BHN, a7u, a7u.A01);
        }
        this.A00.CC7(BHN);
    }
}
