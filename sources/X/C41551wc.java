package X;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
public final class C41551wc extends C41531wa {
    public final int A00;
    public final C41761x1 A01;
    public final String A02;

    public C41551wc(C41761x1 r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = r2.A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41551wc) {
                C41551wc r5 = (C41551wc) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LabelFilter(labelInfo=");
        sb.append(this.A01);
        sb.append(", unreadCount=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
