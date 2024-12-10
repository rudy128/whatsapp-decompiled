package X;

/* renamed from: X.6rh  reason: invalid class name and case insensitive filesystem */
public final class C135126rh {
    public final String A00;
    public final C25411Oc A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135126rh) {
                C135126rh r5 = (C135126rh) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17880vN.A03(this.A00));
    }

    public C135126rh(String str, C25411Oc r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MatchGroup(value=");
        A10.append(this.A00);
        A10.append(", range=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
