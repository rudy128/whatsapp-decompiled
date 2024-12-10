package X;

/* renamed from: X.6sl  reason: invalid class name and case insensitive filesystem */
public final class C135786sl {
    public int A00 = 0;
    public long A01 = 0;
    public String A02 = "";
    public String A03 = "";

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135786sl) {
                C135786sl r8 = (C135786sl) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, C17890vO.A02(this.A02, C17890vO.A02(this.A03, this.A00 * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InteropNotificationData(integratorId=");
        A10.append(this.A00);
        A10.append(", integratorName=");
        A10.append(this.A03);
        A10.append(", fromUser=");
        A10.append(this.A02);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A01);
    }
}
