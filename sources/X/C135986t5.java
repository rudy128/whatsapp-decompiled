package X;

/* renamed from: X.6t5  reason: invalid class name and case insensitive filesystem */
public final class C135986t5 {
    public final int A00;
    public final int A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135986t5) {
                C135986t5 r5 = (C135986t5) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C17900vP.A00(this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A02);
    }

    public C135986t5(Long l, String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str2;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TrustSignalsData(adderContactName=");
        A10.append(this.A03);
        A10.append(", numMembers=");
        A10.append(this.A01);
        A10.append(", numContactMembers=");
        A10.append(this.A00);
        A10.append(", creatorName=");
        A10.append(this.A04);
        A10.append(", createdDateMillis=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
