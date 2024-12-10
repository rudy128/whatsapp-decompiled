package X;

/* renamed from: X.9ql  reason: invalid class name and case insensitive filesystem */
public final class C193849ql {
    public final int A00;
    public final B87 A01;

    public C193849ql(B87 b87, int i) {
        C18070vi.A0d(b87, 2);
        this.A00 = i;
        this.A01 = b87;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193849ql) {
                C193849ql r5 = (C193849ql) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("E2eMessageParserInfo(messageType=");
        A10.append(this.A00);
        A10.append(", parser=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
