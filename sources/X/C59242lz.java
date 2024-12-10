package X;

/* renamed from: X.2lz  reason: invalid class name and case insensitive filesystem */
public final class C59242lz {
    public final long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59242lz) {
                C59242lz r8 = (C59242lz) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17890vO.A02(this.A02, C17900vP.A00(this.A01) * 31));
    }

    public C59242lz(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountLogoutRequestEventData(newDeviceName=");
        A10.append(this.A01);
        A10.append(", serverToken=");
        A10.append(this.A02);
        A10.append(", newAccountLoginAttemptTimestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
