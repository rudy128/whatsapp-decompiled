package X;

/* renamed from: X.6t0  reason: invalid class name and case insensitive filesystem */
public final class C135936t0 {
    public final int A00;
    public final long A01;
    public final AnonymousClass77S A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135936t0) {
                C135936t0 r8 = (C135936t0) obj;
                if (this.A01 != r8.A01 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass000.A0I(this.A01) * 31) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + this.A00) * 31) + C108955ca.A06(this.A04);
    }

    public C135936t0(AnonymousClass77S r1, String str, String str2, int i, long j) {
        this.A01 = j;
        this.A03 = str;
        this.A02 = r1;
        this.A00 = i;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyStatusCrosspostingInfo(messageRowId=");
        A10.append(this.A01);
        A10.append(", crosspostingSessionId=");
        A10.append(this.A03);
        A10.append(", crosspostingStatusEnforcedEncryptedUniqueId=");
        A10.append(this.A02);
        A10.append(", state=");
        A10.append(this.A00);
        A10.append(", mediaPath=");
        return C17900vP.A0B(this.A04, A10);
    }
}
