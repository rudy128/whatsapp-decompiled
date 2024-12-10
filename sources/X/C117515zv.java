package X;

/* renamed from: X.5zv  reason: invalid class name and case insensitive filesystem */
public final class C117515zv extends C131546lH {
    public final int A00;
    public final C135736sg A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117515zv(C135736sg r2, String str, int i) {
        super(r2);
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117515zv) {
                C117515zv r5 = (C117515zv) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (C17880vN.A03(this.A02) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Section(id=");
        A10.append(this.A02);
        A10.append(", title=");
        A10.append(this.A00);
        A10.append(", section=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
