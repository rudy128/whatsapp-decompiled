package X;

/* renamed from: X.0Jn  reason: invalid class name and case insensitive filesystem */
public final class C03690Jn {
    public float A00 = 0.0f;
    public C03410Hz A01 = null;
    public boolean A02 = true;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C03690Jn) {
                C03690Jn r5 = (C03690Jn) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A05(this.A00), this.A02) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RowColumnParentData(weight=");
        A10.append(this.A00);
        A10.append(", fill=");
        A10.append(this.A02);
        A10.append(", crossAxisAlignment=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
