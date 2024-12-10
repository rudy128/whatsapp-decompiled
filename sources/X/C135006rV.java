package X;

/* renamed from: X.6rV  reason: invalid class name and case insensitive filesystem */
public final class C135006rV {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135006rV) {
                C135006rV r5 = (C135006rV) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + this.A00;
    }

    public C135006rV(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeStateInfo(id=");
        A10.append(this.A01);
        A10.append(", state=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
