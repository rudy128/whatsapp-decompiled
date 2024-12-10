package X;

/* renamed from: X.1Xw  reason: invalid class name and case insensitive filesystem */
public final class C27851Xw {
    public static final C27861Xx A04 = new Object();
    public final AnonymousClass1Y3 A00;
    public final CharSequence A01;
    public final Integer A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27851Xw) {
                C27851Xw r5 = (C27851Xw) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CharSequence charSequence = this.A03;
        int i = 0;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.A01;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        AnonymousClass1Y3 r0 = this.A00;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WDSToolbarViewState(title=");
        sb.append(this.A03);
        sb.append(", subtitle=");
        sb.append(this.A01);
        sb.append(", iconSet=");
        sb.append(this.A00);
        sb.append(", backgroundColor=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C27851Xw(AnonymousClass1Y3 r1, CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this.A03 = charSequence;
        this.A01 = charSequence2;
        this.A00 = r1;
        this.A02 = num;
    }

    public C27851Xw() {
        this((AnonymousClass1Y3) null, (CharSequence) null, (CharSequence) null, (Integer) null);
    }
}
