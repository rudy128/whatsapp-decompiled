package X;

/* renamed from: X.6Um  reason: invalid class name and case insensitive filesystem */
public final class C123446Um {
    public Integer A00;
    public Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123446Um) {
                C123446Um r5 = (C123446Um) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultiDestinationStateInfo(fbState=");
        A10.append(this.A00);
        A10.append(", igState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
