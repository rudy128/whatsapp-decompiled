package X;

/* renamed from: X.6qh  reason: invalid class name and case insensitive filesystem */
public final class C134506qh {
    public final Object A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134506qh) {
                C134506qh r5 = (C134506qh) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + C108955ca.A06(this.A01);
    }

    public C134506qh(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiHomeResponse(data=");
        A10.append(this.A00);
        A10.append(", searchBoxHint=");
        return C17900vP.A0B(this.A01, A10);
    }
}
