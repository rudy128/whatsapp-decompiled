package X;

/* renamed from: X.Bnn  reason: case insensitive filesystem */
public final class C23680Bnn extends C4D {
    public final Object A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23680Bnn) {
                C23680Bnn bnn = (C23680Bnn) obj;
                if (!C18070vi.A18(this.A01, bnn.A01) || !C18070vi.A18(this.A00, bnn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C23680Bnn(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SnapshotUpdate(dataModuleType=");
        A10.append(this.A01);
        A10.append(", snapshot=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
