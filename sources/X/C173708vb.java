package X;

/* renamed from: X.8vb  reason: invalid class name and case insensitive filesystem */
public final class C173708vb extends C24489C6h {
    public final C122716Rq A00;
    public final AnonymousClass206 A01;
    public final String A02;
    public final String A03;

    public Object A02() {
        Object[] objArr = new Object[4];
        objArr[0] = AnonymousClass3MW.A15(getClass());
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return C18070vi.A0O(this.A03, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173708vb) {
                C173708vb r5 = (C173708vb) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass1BI A00() {
        return this.A01.A0v.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, C17890vO.A02(this.A03, C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A01)))) + 1237;
    }

    public C173708vb(C122716Rq r1, AnonymousClass206 r2, String str, String str2) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
    }

    public C122716Rq A01() {
        return this.A00;
    }

    public boolean A03() {
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Translate(message=");
        A10.append(this.A01);
        A10.append(", sourceLang=");
        A10.append(this.A02);
        A10.append(", targetLang=");
        A10.append(this.A03);
        A10.append(", mlModelFeature=");
        A10.append(this.A00);
        A10.append(", isExplicitUserRequest=");
        return C17900vP.A0F(A10, false);
    }
}
