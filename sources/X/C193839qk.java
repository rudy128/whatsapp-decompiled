package X;

/* renamed from: X.9qk  reason: invalid class name and case insensitive filesystem */
public final class C193839qk {
    public final int A00;
    public final AUJ A01;

    public C193839qk(AUJ auj, int i) {
        C18070vi.A0d(auj, 2);
        this.A00 = i;
        this.A01 = auj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193839qk) {
                C193839qk r5 = (C193839qk) obj;
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
        A10.append("CustomMessageParserInfo(messageType=");
        A10.append(this.A00);
        A10.append(", parser=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
