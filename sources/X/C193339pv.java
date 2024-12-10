package X;

/* renamed from: X.9pv  reason: invalid class name and case insensitive filesystem */
public final class C193339pv {
    public final String A00;
    public final String A01;

    public C193339pv(String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193339pv) {
                C193339pv r5 = (C193339pv) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + C17900vP.A00(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelRequestMetadata(name=");
        A10.append(this.A00);
        A10.append(", version=");
        return C17900vP.A0B(this.A01, A10);
    }
}
