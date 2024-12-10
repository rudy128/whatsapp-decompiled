package X;

/* renamed from: X.4Ud  reason: invalid class name and case insensitive filesystem */
public final class C87064Ud {
    public final AnonymousClass206 A00;
    public final C34141jz A01;
    public final Integer A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87064Ud) {
                C87064Ud r5 = (C87064Ud) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0L = (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31;
        int intValue = this.A02.intValue();
        if (intValue != 0) {
            str = "DOWN";
        } else {
            str = "UP";
        }
        return C17880vN.A01((A0L + str.hashCode() + intValue) * 31, this.A03);
    }

    public C87064Ud(AnonymousClass206 r1, C34141jz r2, Integer num, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = num;
        this.A03 = z;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConversationSearchData(ftsQuery=");
        A10.append(this.A01);
        A10.append(", startSearchMessage=");
        A10.append(this.A00);
        A10.append(", searchDirection=");
        if (this.A02.intValue() != 0) {
            str = "DOWN";
        } else {
            str = "UP";
        }
        A10.append(str);
        A10.append(", isInclusiveOfStartSearchMessage=");
        return C17900vP.A0F(A10, this.A03);
    }
}
